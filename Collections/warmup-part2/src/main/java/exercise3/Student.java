package exercise3;

import java.util.Map;
import java.util.Set;

/**
 * Created by Alina.Petrescu on 7/7/2017.
 */
public class Student {
    private String firstName;
    private String lastName;

    public Student() {
        this("" , "");
    }
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        String s = "";
        s = s + "Key: " + this.getFirstName() + " " + this.getLastName() + " -> Value: ";
        return s;
    }
}
