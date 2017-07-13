package ro.teamnet.zth.api.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public class DBManager {

    private static final String CONNECTION_STRING = "jdbc:oracle:thin:@" + DBProperties.IP + ":" + DBProperties.PORT;

    private DBManager () throws UnsupportedOperationException {

    }

    private static void registerDriver() {
        try {
            Class.forName(DBProperties.DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: unable to load driver class!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, DBProperties.USER, DBProperties.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static boolean checkConnection(Connection connection) {
        try {
            Statement st = connection.createStatement();
            String string = "SELECT 1 FROM DUAL";

            return st.execute(string);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
