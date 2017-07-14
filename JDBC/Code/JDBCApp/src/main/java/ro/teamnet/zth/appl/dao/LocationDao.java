package ro.teamnet.zth.appl.dao;

import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.appl.domain.Location;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Alina.Petrescu on 7/14/2017.
 */
public class LocationDao {
    EntityManager<Location> entityManager = new EntityManagerImpl();

    public Location findById(Long id) {
        return entityManager.findById(Location.class, id);
    }

    public Long getNextIdVal(String tableName, String columnIdName) {
        try {
            return entityManager.getNextIdVal(tableName, columnIdName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Long(0);
    }

    public Location insert(Location entity) {
        return entityManager.insert(entity);
    }

    public List<Location> findAll() {
        return entityManager.findAll(Location.class);
    }

    public Location update(Location entity) {
        return entityManager.update(entity);
    }

    public void delete(Object entity) {
        entityManager.delete(entity);
    }

    public List<Location> findByParams(Map<String, Object> params) {
        return entityManager.findByParams(Location.class, params);
    }
}
