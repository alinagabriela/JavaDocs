package ro.teamnet.zth.appl.domain;

        import ro.teamnet.zth.api.annotations.Column;
        import ro.teamnet.zth.api.annotations.Id;
        import ro.teamnet.zth.api.annotations.Table;

        import java.util.Date;

/**
 * Created by Alina.Petrescu on 7/12/2017.
 */
@Table(name = "EMPLOYEES")
public class Employee {
    @Id(name = "EMPLOYEE_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private Date hireDate;

    @Column(name = "JOB_ID")
    private Job jobId;

    @Column(name = "SALARY")
    private Float salary;

    @Column(name = "COMMISSION_PCT")
    private Float commissionPct;

    @Column(name = "MANAGER_ID")
    private Employee managerId;

    @Column(name = "DEPARTMENT_ID")
    private Department departmentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Job getJobId() {
        return jobId;
    }

    public void setJobId(Job jobId) {
        this.jobId = jobId;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Employee getManagerId() {
        return managerId;
    }

    public void setManagerId(Employee managerId) {
        this.managerId = managerId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(employee.phoneNumber) : employee.phoneNumber != null)
            return false;
        if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
        if (jobId != null ? !jobId.equals(employee.jobId) : employee.jobId != null) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        if (commissionPct != null ? !commissionPct.equals(employee.commissionPct) : employee.commissionPct != null)
            return false;
        if (managerId != null ? !managerId.equals(employee.managerId) : employee.managerId != null) return false;
        return departmentId != null ? departmentId.equals(employee.departmentId) : employee.departmentId == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", jobId=" + jobId +
                ", salary=" + salary +
                ", commissionPct=" + commissionPct +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }
}

