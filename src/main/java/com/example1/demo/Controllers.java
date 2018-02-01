package com.example1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controllers {

    @RequestMapping (name = "/home", method = RequestMethod.GET)
    public String model(){
        return "index";
    }

}
