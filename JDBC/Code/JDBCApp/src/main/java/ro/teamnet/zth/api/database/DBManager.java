package ro.teamnet.zth.api.database;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public class DBManager {

    private static final String CONNECTION_STRING = "jdbc:oracle:thin:@" + DBProperties.IP + ":" + DBProperties.PORT;

    private DBManager () throws UnsupportedOperationException {

    }

    //private Connection static registerDriver() {}

}
