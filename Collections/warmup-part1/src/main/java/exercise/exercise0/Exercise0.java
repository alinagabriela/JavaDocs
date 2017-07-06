package exercise.exercise0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 * <p>
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 * for loop and foreach loop.
 */
public class Exercise0 {

    public Exercise0() {

    }

    public void iterateThroughList() {

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it
        // TODO Exercise #0 a) Don't forget to specify the type of the list (Integer, String etc.)
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(44);
        arrayList.add(23);
        arrayList.add(114);

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements
        ListIterator<Integer> lit = arrayList.listIterator();

        System.out.println("b) Iterate through the list using ListIterator and print all its elements");
        while (lit.hasNext()) {
            System.out.println(lit.next() + " ");
        }

        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements
        System.out.println("c) Iterate through the list using classic for loop and print all its elements");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements
        System.out.println("d) Iterate through the list using foreach loop and print all its elements");
        for (Integer arrayListElem : arrayList) {
            System.out.println(arrayListElem);
        }

    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        System.out.println("e) Create a new instance of Exercise0 class and call the iterateThroughList() method");
        Exercise0 ex0 = new Exercise0();
        ex0.iterateThroughList();

    }
}
