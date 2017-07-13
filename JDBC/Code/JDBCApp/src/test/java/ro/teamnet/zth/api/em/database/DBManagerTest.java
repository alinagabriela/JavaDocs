package ro.teamnet.zth.api.em.database;

import org.junit.Test;
import ro.teamnet.zth.api.database.DBManager;

import static org.junit.Assert.*;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public class DBManagerTest {
    @Test
    public void getConnectionTest() {
        assertNotNull(DBManager.getConnection());
    }

    @Test
    public void checkConnectionTest() {
        assertEquals(DBManager.checkConnection(DBManager.getConnection()), true);
    }
}
