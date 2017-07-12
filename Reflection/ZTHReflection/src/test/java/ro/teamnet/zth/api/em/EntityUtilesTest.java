package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Alina.Petrescu on 7/12/2017.
 */
public class EntityUtilesTest {
    @Test
    public void testGetTableNameMethod() {
        String tableName = EntityUtiles.getTableName(Department.class);
        System.out.println(tableName);
        assertEquals("Table name should be departments!", "departments", tableName);
    }

}
