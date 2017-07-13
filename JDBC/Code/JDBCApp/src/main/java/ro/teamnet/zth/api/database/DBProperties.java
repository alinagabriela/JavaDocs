package ro.teamnet.zth.api.database;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public interface DBProperties {
    String IP = "localhost";
    String PORT = "1521";
    String USER = "sys as sysdba"; // user from SQL workshop
    String PASS = "oracle"; // pass from SQL workshop
    String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
}
