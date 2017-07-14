package ro.teamnet.zth.api.em;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Alina.Petrescu on 7/13/2017.
 */
public interface EntityManager<T> {
    /*
    --- WORKSHOP 1 ---
     */
    <T> T findById(Class<T> entityClass, long id);
    Long getNextIdVal(String tableName, String columnIdName) throws SQLException;
    <T> T insert(T entity);
    <T> List<T> findAll(Class<T> entityClass);

    <T> T update(T entity);
	void delete(Object entity);
	List<T> findByParams(Class<T> entityClass, Map<String, Object> params);
}
