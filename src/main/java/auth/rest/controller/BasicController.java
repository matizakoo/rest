package auth.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/admin/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/user/user")
    public String user(){
        return "user";
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

    @GetMapping("/home")
    public String home(){ return "home"; };
}
