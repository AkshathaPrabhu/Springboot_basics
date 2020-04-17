package main.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/jpaTopics")
    public List<Topic_JPA_Class> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/jpaTopics/{topic_id}")
    public Topic_JPA_Class getTopic(@PathVariable("topic_id") int id) {
        return topicService.getAllTopics().stream().filter(it -> it.id == id).findFirst().get();
    }

    @PostMapping(value = "/jpaTopics")
    public void addTopic(@RequestBody Topic_JPA_Class topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/jpaTopics/{id}")
    public void updateTopic(@PathVariable int id, @RequestBody Topic_JPA_Class topic) {
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping(value = "/jpaTopics/{topic_id}")
    public void deleteTopic(@PathVariable("topicid") int id) {
        topicService.deleteTopic(id);
    }
}
