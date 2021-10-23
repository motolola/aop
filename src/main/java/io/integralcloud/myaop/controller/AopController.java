package io.integralcloud.myaop.controller;

import io.integralcloud.myaop.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/aop/{number}")
    public String testMe(@PathVariable Integer number) {
        animalService.cat(number);
        animalService.goat(number);
        animalService.monkey(number);
        return animalService.dog(number);
    }
}
