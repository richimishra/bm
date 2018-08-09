package hello.entity;

import javax.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {


    @Id
    Integer c_id;


    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private Topic topic;

    String cmnt;

    public Comment(){

    }

    public Comment(Employee employee, Topic topic,Integer c_id, String cmnt) {
        this.c_id = c_id;
        this.employee = employee;
        this.topic = topic;
        this.cmnt = cmnt;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getCmnt() {
        return cmnt;
    }

    public void setCmnt(String cmnt) {
        this.cmnt = cmnt;
    }
}
