package hello.controller;

import hello.entity.Topic;
import hello.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @GetMapping("/topic")
    public Topic getTopic(@RequestParam Integer id){
        return topicService.getTopic(id);
    }

    @PostMapping("/createTopic")
    public void createTopic(@RequestParam Integer emp_Id,@RequestParam Integer id,@RequestParam String topicName, @RequestParam String topicDescription){

        topicService.createTopic(emp_Id,id,topicName,topicDescription);
    }

    @DeleteMapping("/deleteTopic")
    public void deleteTopic(@RequestParam Integer id){
        topicService.deleteTopic(id);
    }

}
