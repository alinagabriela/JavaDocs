package exercise3;

/**
 * Created by Alina.Petrescu on 7/7/2017.
 */
public class StudentB extends Student {

    public StudentB(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        if (this.getFirstName().equals(student.getFirstName()) &&
                this.getLastName().equals(student.getLastName()))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + super.getFirstName().hashCode();

        return result;
    }
}
