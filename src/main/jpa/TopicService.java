package main.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Service - this annotation tells Springboot that this class is a business service
 * This is a singleton  - so springboot will always give the same instance where it is asked for (through dependency injection)
 * @Autowired will help to inject this instance to a controller
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic_JPA_Class> getAllTopics() {
        List<Topic_JPA_Class> topics = new ArrayList<>();
        topicRepository.findAll().forEach(it -> topics.add(it));

        return topics;
    }

    public void addTopic(Topic_JPA_Class topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(int id, Topic_JPA_Class topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.delete(id);
    }
}
