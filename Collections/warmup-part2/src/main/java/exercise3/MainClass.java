package exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Alina.Petrescu on 7/7/2017.
 */
public class MainClass {

    static HashMap<Student, Integer> mapA = new HashMap<Student, Integer>();
    static HashMap<Student, Integer> mapB = new HashMap<Student, Integer>();
    static HashMap<Student, Integer> mapC = new HashMap<Student, Integer>();
    static HashMap<Student, Integer> mapD = new HashMap<Student, Integer>();

    public static void main (String[] args) {

        mapA.put(new StudentC("Maria", "Popescu", 30), 30);
        mapA.put(new StudentC("Maria", "Popescu", 34), 34);
        mapA.put(new StudentC("Mircea", "Panaite", 54), 53);
        mapA.put(new StudentC("Razvan", "Tudose", 54), 24);
        mapA.put(new StudentC("Maria", "Munteanu", 65), 13);

        StudentC studentC1 = new StudentC("Maria", "Popescu", 30);
        StudentC studentC2 = new StudentC("Maria", "Popescu", 45);
        System.out.println(studentC1.hashCode() + " - " + studentC2.hashCode());
        System.out.println(studentC1.equals(studentC2));

        String s = "";

        Set<Map.Entry<Student, Integer>> entrySet = mapA.entrySet();

        for (Map.Entry<Student, Integer> entry : entrySet) {
            s += entry.getKey().toString();
            s += entry.getValue() + "\n";
        }

        System.out.println(s);
    }
}
