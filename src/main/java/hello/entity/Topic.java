package hello.entity;

import javax.persistence.*;

@Entity
@Table(name="Topic")
public class Topic {


    @Id
    Integer t_id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    String topic_name;
    String topic_desc;

    public Topic(){

    }

    public Topic(Employee employee, String topic_name, String topic_desc) {

        this.employee = employee;
        this.topic_name = topic_name;
        this.topic_desc = topic_desc;
    }

    public Topic(Integer id, Employee employee, String topic_name, String topic_desc) {
        this.t_id = id;
        this.employee = employee;
        this.topic_name = topic_name;
        this.topic_desc = topic_desc;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer id) {
        this.t_id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
    }

    public String getTopic_desc() {
        return topic_desc;
    }

    public void setTopic_desc(String topic_desc) {
        this.topic_desc = topic_desc;
    }
}
