package io.pivotal.pal.tracker;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class WelcomeController {

    Integer counter = 1;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String sayHello() {
        String msg = System.getenv("MESSAGE");
        return msg;
    }

}