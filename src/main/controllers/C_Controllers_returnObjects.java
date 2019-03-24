package main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import sun.plugin.javascript.navig.Array;

@RestController
public class C_Controllers_returnObjects {

    @RequestMapping("/topics")
    public List<C_Topics> getAllTopics() {

        return Arrays.asList(
          new C_Topics(1,"Aksha","youngest daughter"),
          new C_Topics(2,"Archu","eldest daughter"),
          new C_Topics(3,"Rashmi","mother India"),
          new C_Topics(4,"Ramesh","Mogambo - father of the nation")
        );
    }

}
