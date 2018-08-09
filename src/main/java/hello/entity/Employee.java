package hello.entity;


import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    Integer emp_id;

    String firstname;

    String lastname;

    public Employee(){

    }
    public Employee(Integer emp_id, String firstname, String lastname) {
        this.emp_id = emp_id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
