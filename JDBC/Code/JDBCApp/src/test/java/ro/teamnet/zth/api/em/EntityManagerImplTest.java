package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public class EntityManagerImplTest {

    EntityManagerImpl<Department> entityManager = new EntityManagerImpl();
    @Test
    public void findByIdTest() {
        Department entity = entityManager.findById(Department.class, 40);
        assertNotNull(entity);
    }

    @Test
    public void getNextIdValTest() {

        assertEquals(new Long(273), entityManager.getNextIdVal("departments", "department_id"));
    }

    @Test
    public void insertTest() {
        Department department = new Department();
        department.setDepartmentName("IT PROGR");
        department.setId((long)290);
        department.setLocation((long)1700);
        assertNotNull(entityManager.insert(department));
    }

    @Test
    public void findAllTest() {
        List<Department> departmentArrayList = new ArrayList<>();
        departmentArrayList = entityManager.findAll(Department.class);
        assertEquals(29, departmentArrayList.size());
    }

    @Test
    public void updateTest() {
        Department department = new Department();
        department.setDepartmentName("OperationsNew");
        department.setId((long)200);
        department.setLocation((long)1700);
        Department department1 = entityManager.update(department);

        assertEquals(department, department1);
    }

    @Test
    public void deleteTest() {
        Department department = new Department();
        department.setDepartmentName("IT PROGR");
        department.setId((long)entityManager.getNextIdVal("departments", "department_id") - 1);
        department.setLocation((long)1700);
        entityManager.delete(department);

        assertEquals(29, entityManager.findAll(Department.class).size());
    }

    @Test
    public void findByParamsTest() {
        Map<String, Object> hashMap = new HashMap<>();

        hashMap.put("location_id", 1700);

        assertEquals(23, entityManager.findByParams(Department.class, hashMap).size());
    }
}
