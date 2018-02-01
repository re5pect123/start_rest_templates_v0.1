package com.example1.demo;

import com.example1.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class RestControllers {
    private static final Logger LOGGER = Logger.getLogger( RestControllers.class.getName() );

    @GetMapping("/try")
    public String proba(){
        return "try";
    }

    @PostMapping("/post")
    public String proba2(@RequestBody Person p){
        LOGGER.log(Level.INFO, "Print name: " +p.getName());
        LOGGER.log(Level.ALL, "Print name: "+p.getName());
        LOGGER.log(Level.FINE, "Print name: "+p.getName());
        LOGGER.log(Level.FINEST, "Print name: "+p.getName());
        LOGGER.log(Level.SEVERE, "Print name: "+p.getName());
        LOGGER.log(Level.WARNING, "Print name: "+p.getName());
        LOGGER.log(Level.CONFIG, "Print name: "+p.getName());

        return p.getName();
    }

}
