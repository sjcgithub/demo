package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/aa")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
