package exercise3;

/**
 * Created by Alina.Petrescu on 7/7/2017.
 */
public class StudentC extends Student {

    private int age;

    public StudentC(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        if (this.getFirstName().equals(student.getFirstName()))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + super.getFirstName().hashCode();
        result = 31 * result + super.getLastName().hashCode();

        return result;
    }
}
