package com.example.tuarai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping("/data")
    String getPeople(Model model) {
        model.addAttribute("something", "Game !!!");
        model.addAttribute("people", Arrays.asList(
                new Person("John", 20),
                new Person("pantheon",18),
                new Person("Simon",30)));
        return "people";
    }
}
