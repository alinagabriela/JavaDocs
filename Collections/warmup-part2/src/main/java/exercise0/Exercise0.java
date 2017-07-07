package exercise0;

import java.util.*;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys) and
 *          print all its elements.
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughMap(){

        // TODO Exercise #0 a) Create a Map (HashMap) and add elements to it (using put() method)
        // TODO Exercise #0 a) Hint: Don't forget to specify the types of the key and value when creating the Map
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "unu1");
        hashMap.put(1, "unu2");
        hashMap.put(1, "unu3");
        hashMap.put(1, "unu4");
        hashMap.put(2, "doi");
        hashMap.put(3, "trei");
        hashMap.put(4, "patru");
        hashMap.put(5, "cinci");

        // TODO Exercise #0 b) Iterate over the Map using keySet() method and print all its elements
        // TODO Exercise #0 b) The elements could be printed like this: [key1=value1, key2=value2, ...]
        Set<Integer> set = hashMap.keySet();

        System.out.println("Keys: " + set);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("[" + key + " = " + hashMap.get(key) + "]");
        }
    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();
    }
}
