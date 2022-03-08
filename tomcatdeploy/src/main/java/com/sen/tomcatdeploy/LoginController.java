package com.sen.tomcatdeploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/msg")
    public String getMessage() {
        return "welcome to india";
    }
}
