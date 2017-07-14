package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.database.DBManager;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Employee;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alina.Petrescu on 7/14/2017.
 */
public class ExSup {
    public List<Employee> searchEmployees(Class<Employee> entityClass, String name) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Connection connection = DBManager.getConnection();

        String query = "select ";

        String tableName = EntityUtils.getTableName(entityClass);
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entityClass);

        for (int i = 0; i < listColumns.size() - 1; i++) {
            query += listColumns.get(i).getDbColumnName() + ", ";
        }
        query += listColumns.get(listColumns.size() - 1).getDbColumnName();

        query += " from employees natural join departments where department_name  like '%" + name + "%'";

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        queryBuilder.setQueryType(QueryType.SELECT);

        String query1 = queryBuilder.createQuery();

        Statement statement = null;
        ResultSet resultSet = null;
        Employee instance = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query1);

            while(resultSet.next()) {
                instance = new Employee();

                for (ColumnInfo column : listColumns) {
                    Field field = instance.getClass().getDeclaredField(column.getColumnName());
                    field.setAccessible(true);
                    field.set(instance , (EntityUtils.castFromSqlType(resultSet.getObject(column.getDbColumnName()), field.getType())));
                }

                employeeArrayList.add(instance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return employeeArrayList;
    }
}
