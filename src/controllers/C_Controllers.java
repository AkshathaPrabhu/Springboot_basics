package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C_Controllers {

    @RequestMapping("/topics")
    public String getAllTopics()
    {
        return "All Topics";
    }

}
