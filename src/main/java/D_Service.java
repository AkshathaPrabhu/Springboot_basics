package main.java;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @Service - this annotation tells Springboot that this class is a business service
 * This is a singleton  - so springboot will always give the same instance where it is asked for (through dependency injection)
 * @Autowired will help to inject this instance to a controller
 */

@Service
public class D_Service {

    private List<Topic> topics = new ArrayList<>(
        Arrays.asList(
            new Topic(1, "A_SpringbootApp", "explains the starting point for springboot app."),
            new Topic(2, "B_Controllers", "basics of @RestController."),
            new Topic(3, "D_Service", "basics of @Service")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }


}
