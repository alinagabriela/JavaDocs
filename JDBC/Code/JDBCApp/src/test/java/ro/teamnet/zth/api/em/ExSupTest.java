package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Employee;

import java.util.List;

/**
 * Created by Alina.Petrescu on 7/14/2017.
 */

import static org.junit.Assert.*;

public class ExSupTest {

    ExSup exSup = new ExSup();


    @Test
    public void searchEmployees() {
        List<Employee> employees = exSup.searchEmployees(Employee.class, "ion");
        assertEquals(2, employees.size());
    }
}