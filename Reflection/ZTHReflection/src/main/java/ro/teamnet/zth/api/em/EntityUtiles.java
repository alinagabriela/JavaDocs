package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.logging.FileHandler;

/**
 * Created by Alina.Petrescu on 7/12/2017.
 */
public class EntityUtiles {

    private EntityUtiles() throws UnsupportedOperationException {

    }

    public static String getTableName(Class entity) {
         //verific daca annotation Table

        if(entity.isAnnotationPresent(Table.class))
            return ((Table) entity.getAnnotation(entity.getClass())).name();
        return entity.getName();
    }

    public static ColumnInfo[] getColumns(Class entity) {
        Field[] fields = entity.getDeclaredFields();

        ColumnInfo[] columnInfos = new ColumnInfo[fields.length];

        int i = 0;
        for (Field field : fields) {
            if (field.isAnnotationPresent(Column.class) || field.isAnnotationPresent(Id.class)) {
                columnInfos[i].setColumnName(field.getName());
                columnInfos[i].setColumnType(field.getType());
                columnInfos[i].setDbColumnName(field.isAnnotationPresent(Column.class) ? field.getAnnotation(Column.class).name() : field.getAnnotation(Id.class).name());
                if (field.isAnnotationPresent(Id.class))
                    columnInfos[i].setId(true);
                else
                    columnInfos[i].setId(false);
                i++;
            }
        }
        return columnInfos;
    }

    public static Object castFromSqlType(Object value, Class wantedType) {
        if (value instanceof BigDecimal) {
            if (wantedType.equals(Integer.class)) return (Integer) value;
            if (wantedType.equals(Long.class)) return (Long) value;
            if (wantedType.equals(Float.class)) return (Float) value;
            if (wantedType.equals(Double.class)) return (Double) value;
        }
        return value;
    }

    public static Field[] getFieldsByAnnotations(Class clazz, Class annotation) {

        Field[] fields = clazz.getDeclaredFields();
        Field[] fieldsR = new Field[fields.length];
        int i = 0;

        for (Field field : fields) {
            if (field.isAnnotationPresent(annotation)) {
                fieldsR[i] = field;
                i++;
            }
        }

        return fieldsR;
    }

    public static Object getSqlValue(Object object) throws IllegalAccessException {

        if (object.getClass().isAnnotationPresent(Table.class)) {
            Field[] fields = object.getClass().getFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Id.class)) {
                    field.setAccessible(true);
                    return field.getLong(object);
                }
            }
        }

        return object;
    }
}
