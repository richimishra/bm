package hello.repository;

import hello.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository  extends CrudRepository<Topic,Integer> {

}
