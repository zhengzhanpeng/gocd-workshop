package com.otr.gocd.workshorp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "You finished pipeline config. Congratulations!";
    }

}
