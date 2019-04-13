package main.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class B_Controllers_returningListOfObject {

    @RequestMapping("/members")
    public List<Topic> getAllTopics() {

        return Arrays.asList(
          new Topic(1,"Aksha","youngest daughter"),
          new Topic(2,"Archu","eldest daughter"),
          new Topic(3,"Rashmi","mother India"),
          new Topic(4,"Ramesh","Mogambo - father of the nation")
        );
    }




}
