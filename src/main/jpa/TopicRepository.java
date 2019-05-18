package main.jpa;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

    /**
     * This class will have following methods:
     *
     * getAllTopics()
     * getTopic(String id)
     * updateTopic(Topic t)
     * deleteTopic(String id)
     *
     */





}
