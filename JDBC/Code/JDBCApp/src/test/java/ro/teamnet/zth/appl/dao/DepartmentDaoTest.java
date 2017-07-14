package ro.teamnet.zth.appl.dao;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Alina.Petrescu on 7/14/2017.
 */
public class DepartmentDaoTest {
    DepartmentDao departmentDao = new DepartmentDao();
    Department department = new Department();

    @Test
    public void findByIdTest() {
        department = departmentDao.findById(new Long(40));
        assertNotNull(department);
    }

    @Test
    public void getNextIdValTest() {
        assertEquals(new Long(273), departmentDao.getNextIdVal("departments", "department_id"));
    }

    @Test
    public void insertTest() {
        department.setDepartmentName("IT PROGR");
        department.setId((long)290);
        department.setLocation((long)1700);
        assertNotNull(departmentDao.insert(department));
    }

    @Test
    public void findAllTest() {
        List<Department> departmentArrayList = new ArrayList<>();
        departmentArrayList = departmentDao.findAll();
        assertEquals(29, departmentArrayList.size());
    }

    @Test
    public void updateTest() {
        department.setDepartmentName("OperationsNew");
        department.setId((long)200);
        department.setLocation((long)1700);
        Department department1 = departmentDao.update(department);

        assertEquals(department, department1);
    }

    @Test
    public void deleteTest() {
        department.setDepartmentName("IT PROGR");
        department.setId((long)departmentDao.getNextIdVal("departments", "department_id") - 1);
        department.setLocation((long)1700);
        departmentDao.delete(department);

        assertEquals(29, departmentDao.findAll().size());
    }

    @Test
    public void findByParamsTest() {
        Map<String, Object> hashMap = new HashMap<>();

        hashMap.put("location_id", 1700);

        assertEquals(23, departmentDao.findByParams(hashMap).size());
    }
}
