package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import static org.junit.Assert.*;

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
        assertEquals(271, entityManager.getNextIdVal("departments", "department_id"));
    }


    }
