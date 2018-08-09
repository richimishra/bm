package hello.service;

import hello.entity.Employee;
import hello.entity.Topic;
import hello.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        return (List<Topic>) topicRepository.findAll();

    }

    public Topic getTopic(Integer id) {
        return topicRepository.findById(id).get();
    }

    public void createTopic(Integer emp_Id,Integer id,String topicName, String topicDescription) {
        Employee temp = new Employee();
        temp.setEmp_id(emp_Id);
        topicRepository.save(new Topic(id,temp,topicName,topicDescription));
    }

    public void deleteTopic(Integer id) {

        topicRepository.deleteById(id);
    }
}
