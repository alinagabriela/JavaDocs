package ro.teamnet.zth.api.em;

import java.util.List;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public interface EntityManager<T> {
    T findById(Class<T> entityClass, long id);
    long getNextIdVal(String tableName, String columnIdName);
    <T> T insert(T entity);
    <T> List<T> findAll(Class<T> entityClass);
}
