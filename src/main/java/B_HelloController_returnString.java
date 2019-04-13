package java;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @RestController - this directs springboot to map a URL to this class
 * @RequestMapping - maps the url to it's corresponding piece of code
 * */

@RestController
public class B_HelloController_returnString {

    //by default @RequestMapping maps to a GET method
    @RequestMapping("/hello")
    public String displayHi()
    {
        return "Hi";
    }


}
