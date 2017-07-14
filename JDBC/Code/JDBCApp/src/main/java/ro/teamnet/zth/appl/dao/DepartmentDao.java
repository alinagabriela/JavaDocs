package ro.teamnet.zth.appl.dao;


import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.appl.domain.Department;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Alina.Petrescu on 7/14/2017.
 */
public class DepartmentDao {
    private EntityManager<Department> entityManager = new EntityManagerImpl();

    public Department findById(Long id) {
        return entityManager.findById(Department.class, id);
    }

    public Long getNextIdVal(String tableName, String columnIdName) {
        try {
            return entityManager.getNextIdVal(tableName, columnIdName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Long(0);
    }

    public Department insert(Department entity) {
        return entityManager.insert(entity);
    }

    public List<Department> findAll() {
        return entityManager.findAll(Department.class);
    }

    public Department update(Department entity) {
        return entityManager.update(entity);
    }

    public void delete(Object entity) {
        entityManager.delete(entity);
    }

    public List<Department> findByParams(Map<String, Object> params) {
        return entityManager.findByParams(Department.class, params);
    }

}
