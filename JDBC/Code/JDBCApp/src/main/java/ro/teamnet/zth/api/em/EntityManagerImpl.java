package ro.teamnet.zth.api.em;

import javafx.util.Pair;
import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.database.DBManager;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Connection;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public class EntityManagerImpl<T> implements EntityManager<T> {

    public Condition createCondition(List<ColumnInfo> listColumns, long id) {
        Condition condition = new Condition();
        for (ColumnInfo columnInfo : listColumns) {
            if (columnInfo.isId()) {
                condition.setColumnName(columnInfo.getDbColumnName());
                condition.setValue(id);
            }
        }

        return condition;
    }

    /*public Field setFieldValue(T entity, ColumnInfo columnInfo, Object value) {
        Field field = null;
        try {
            field = entity.getClass().getDeclaredField(columnInfo.getColumnName());
            field.setAccessible(true);
            columnInfo.setValue(value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return field;
    }*/

    @Override
    public T findById(Class entityClass, long id) {
        Connection connection = DBManager.getConnection();

        String tableName = EntityUtils.getTableName(entityClass);
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entityClass);
        //List<Field> fieldList = EntityUtils.getFieldsByAnnotations(entityClass, Column.class);

        Condition condition = createCondition(listColumns, id);

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        queryBuilder.setQueryType(QueryType.SELECT);
        queryBuilder.addCondition(condition);

        Statement statement;
        ResultSet resultSet;
        T instance = null;

        String query = queryBuilder.createQuery();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                instance = (T) entityClass.newInstance();

                for (ColumnInfo column : listColumns) {
                    Field field = instance.getClass().getDeclaredField(column.getColumnName());
                    field.setAccessible(true);
                    field.set(instance , (EntityUtils.castFromSqlType(resultSet.getObject(column.getDbColumnName()), field.getType())));
                }
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        return instance;
    }

    @Override
    public Long getNextIdVal(String tableName, String columnIdName) {

        Connection connection = DBManager.getConnection();

        String myQuery = "select max(" + columnIdName + ") from " + tableName;
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(myQuery);
            resultSet.next();

            return new Long(resultSet.getInt("max(" + columnIdName + ")") + 1);

        } catch (SQLException e) {
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


        return new Long(-1);
    }

    @Override
    public <T> T insert(T entity) {

        Connection connection = DBManager.getConnection();
        long index = 0;

        String tableName = EntityUtils.getTableName(entity.getClass());
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entity.getClass());
       //List<Field> fieldList = EntityUtils.getFieldsByAnnotations((Class) entity, Column.class);

        for (ColumnInfo columnInfo : listColumns) {
            if (columnInfo.isId()) {
                index = getNextIdVal(tableName, columnInfo.getDbColumnName());
                columnInfo.setValue(index);
            }
            else {
                try {
                    Field field = entity.getClass().getDeclaredField(columnInfo.getColumnName());
                    field.setAccessible(true);
                    columnInfo.setValue(field.get(entity));
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        queryBuilder.setQueryType(QueryType.INSERT);


        String query = queryBuilder.createQuery();
        Statement statement = null;
        int result = 0;
        try {
            statement = connection.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException e) {
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


        return (T) findById(entity.getClass(), index);
    }

    @Override
    public <T> List<T> findAll(Class<T> entityClass) {

        Connection connection = DBManager.getConnection();
        List<T> tArrayList = new ArrayList<>();
        T instance = null;

        String tableName = EntityUtils.getTableName(entityClass);
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entityClass);

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        queryBuilder.setQueryType(QueryType.SELECT);

        String query = queryBuilder.createQuery();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                instance = entityClass.newInstance();

                for (ColumnInfo column : listColumns) {
                    Field field = instance.getClass().getDeclaredField(column.getColumnName());
                    field.setAccessible(true);
                    field.set(instance , (EntityUtils.castFromSqlType(resultSet.getObject(column.getDbColumnName()), field.getType())));
                }

                tArrayList.add(instance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return tArrayList;
    }

    @Override
    public <T> T update(T entity) {
        Object objectId = null;
        Connection connection = DBManager.getConnection();

        String tableName = EntityUtils.getTableName(entity.getClass());
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entity.getClass());

        for (ColumnInfo columnInfo : listColumns) {
            try {
                Field field = entity.getClass().getDeclaredField(columnInfo.getColumnName());
                field.setAccessible(true);
                columnInfo.setValue(field.get(entity));
                if (columnInfo.isId()) {
                    objectId = columnInfo.getValue();
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Condition condition = createCondition(listColumns, (long) objectId);

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setQueryType(QueryType.UPDATE);
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        queryBuilder.addCondition(condition);

        String query = queryBuilder.createQuery();

        Statement statement;
        int result = 0;

        try {
            statement = connection.createStatement();
            result = statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return (T) findById(entity.getClass(), (long) objectId);
    }

    @Override
    public void delete(Object entity) {
        Connection connection = DBManager.getConnection();
        long objectId = 0;

        String tableName = EntityUtils.getTableName(entity.getClass());
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entity.getClass());

        for (ColumnInfo columnInfo : listColumns) {
            try {
                Field field = entity.getClass().getDeclaredField(columnInfo.getColumnName());
                field.setAccessible(true);
                columnInfo.setValue(field.get(entity));
                if (columnInfo.isId()) {
                    objectId = (long) columnInfo.getValue();
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Condition condition = createCondition(listColumns, objectId);

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setQueryType(QueryType.DELETE);
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        queryBuilder.addCondition(condition);

        String query = queryBuilder.createQuery();

        Statement statement;
        int result = 0;

        try {
            statement = connection.createStatement();
            result = statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<T> findByParams(Class<T> entityClass, Map<String, Object> params) {

        ArrayList<T> arrayList = new ArrayList<>();

        Connection connection = DBManager.getConnection();

        String tableName = EntityUtils.getTableName(entityClass);
        List<ColumnInfo> listColumns = EntityUtils.getColumns(entityClass);

        ArrayList<Condition> conditionArrayList = new ArrayList<>();
        for (Map.Entry<String, Object> pair : params.entrySet()) {
            Condition condition = new Condition();
            condition.setColumnName(pair.getKey());
            condition.setValue(pair.getValue());
            conditionArrayList.add(condition);
        }

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setQueryType(QueryType.SELECT);
        queryBuilder.setTableName(tableName);
        queryBuilder.addQueryColumns(listColumns);
        for (Condition condition : conditionArrayList) {
            queryBuilder.addCondition(condition);
        }

        String query = queryBuilder.createQuery();

        Statement statement = null;
        ResultSet resultSet = null;
        T instance = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                instance = entityClass.newInstance();

                for (ColumnInfo columnInfo : listColumns) {
                    Field field = instance.getClass().getDeclaredField(columnInfo.getColumnName());
                    field.setAccessible(true);
                    field.set(instance, EntityUtils.castFromSqlType(resultSet.getObject(columnInfo.getDbColumnName()), field.getType()));

                    Class tClass;
                    if (columnInfo.isId())
                        tClass = Long.class;
                    else
                        tClass = String.class;
                    if (field.get(instance).equals(EntityUtils.castFromSqlType(params.get(columnInfo.getDbColumnName()), tClass))) {
                        field = instance.getClass().getDeclaredField(columnInfo.getColumnName());
                        field.setAccessible(true);
                        field.set(instance, columnInfo.getValue());
                    }
                }

                arrayList.add(instance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
