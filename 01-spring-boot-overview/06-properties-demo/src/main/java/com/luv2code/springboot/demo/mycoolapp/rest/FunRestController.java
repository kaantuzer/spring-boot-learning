package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "get it it";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "This is your lucky day!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() { return "Coach: " + coachName + " Team: " + teamName ;}

}
