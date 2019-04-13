package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class C_TopicController {

    // with @Autowired we don't need to specify D_Service topicService = new D_Service();
    @Autowired
    D_Service topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topic_id}")
    public Topic getTopic(@PathVariable("topic_id") int id) {
        return topicService.getAllTopics().stream().filter(it -> it.id == id).findFirst().get();
    }
}
