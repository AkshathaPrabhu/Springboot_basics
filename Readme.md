This project consists of all the basics of springboot that I have learnt from this tutorial:

https://www.youtube.com/watch?v=msXL2oDexqw&list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO[https://www.youtube.com/watch?v=msXL2oDexqw&list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO]

For theory check videos: 1 to 9, 13-14, 15,


#Endpoints that are built in this project:
    - GET /topics - get all the topics
    - GET /topics/id - get just one topic with the corresponding `id`
    - POST /topics  - add a new topic
    - PUT: /topics/id  -  update a topic
    - DELETE /topics/id  - deletes the particular topic


#Springboot annotations:

@SpringBootApplication
@RestController 
    - @RequestMapping(value = "/path/{var}?param=123", method ="RequestMethod.GET")
    - @GetMapping(value = "/path")
    - @PathVariable("var")
    - @RequestBody - used for request bodies in PUT, POST
    - @RequestParam("param")  
@Service
@Autowired



