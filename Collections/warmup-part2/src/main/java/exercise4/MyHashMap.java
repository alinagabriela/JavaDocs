package exercise4;

import java.util.*;

/**
 * Exercise 3. Implement a HashMap from scratch. In order to pass all the tests
 * you need to implement all the methods defined below. The key-value pair will
 * be encapsulated in the MyHashMap.MyEntry object defined below.
 *
 * The buckets list in which each MyEntry object will be stored is stored in "buckets" object.
 * The hash function that you will use in order to store a pair in a specific bucket will be
 * the one presented earlier: (hashcode value) modulo (bucket array size)
 */
public class MyHashMap {

    private ArrayList<LinkedList<MyEntry>> buckets;

    private final int BUCKET_ARRAY_SIZE = 16;

    private int size;

    public MyHashMap() {

        // TODO Initialize buckets list
        buckets = new ArrayList<LinkedList<MyEntry>>(BUCKET_ARRAY_SIZE);
        for (int i = 0; i < BUCKET_ARRAY_SIZE; i++) {
            buckets.add(i, new LinkedList<MyEntry>());
        }
        this.size = 0;
    }

    public String get(String key) {
        // TODO
        LinkedList<MyEntry> bucket = buckets.get(Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE));
        if (key == null)
            return null;

        for (MyEntry myEntry : bucket) {
            if (myEntry.getKey().equals(key)) {
                return myEntry.getValue();
            }
        }

        return null;
    }

    public void put(String key, String value) {
        // TODO
        int index = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
        System.out.println("index: " + index);
        Iterator<MyEntry> it = buckets.get(index).iterator();
        int ok = 0;
        while (it.hasNext()) {
            MyEntry myEntry = it.next();
            if (myEntry.getKey().equals(key)) {
                myEntry.setValue(value);
                ok = 1;
            }
        }
        if (ok == 0) {
            buckets.get(index).add(new MyEntry(key, value));
            this.size++;
        }
    }

    public Set<String> keySet() {
        // TODO
        Set<String> keySet = new HashSet<String>();
        for (int i = 0; i < BUCKET_ARRAY_SIZE; i++) {
            Iterator<MyEntry> it = buckets.get(i).iterator();
            while (it.hasNext()) {
                MyEntry myEntry = it.next();
                keySet.add(myEntry.getKey());
            }
        }
            /*if(buckets.get(i) != null) {
                keySet.add(buckets.);
            }*/

        return null;
    }

    public Collection<String> values() {
        // TODO
        return null;
    }

    public String remove(String key) {
        // TODO Returns the value associated with the key removed from the map or null if the key wasn't found
        return null;
    }

    public boolean containsKey(String key) {
        // TODO
        return false;
    }

    public boolean containsValue(String value) {
        // TODO
        return false;
    }

    public int size() {
        // TODO Return the number of the Entry objects stored in all the buckets
        return this.size;
    }

    public void clear() {
        // TODO Remove all the Entry objects from the bucket list
    }

    public Set<MyEntry> entrySet() {
        // TODO Return a Set containing all the Entry objects
        return null;
    }

    public boolean isEmpty() {
        // TODO
        return false;
    }

    public static class MyEntry {
        private String key;
        private String value;

        public MyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
