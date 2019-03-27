package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class WelcomeController {

    @GetMapping("hi")
    public String sayHello(){
        return "Hello...";
    }
}
