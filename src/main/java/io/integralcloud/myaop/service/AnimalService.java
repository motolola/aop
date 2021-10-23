package io.integralcloud.myaop.service;

import io.integralcloud.myaop.annotation.MyLoggerAnnotation;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @MyLoggerAnnotation
    public String dog(int number) {

        return number + " Dogs";
    }


    public String cat(int number) {

        return number + " Cats";
    }

    @MyLoggerAnnotation
    public String goat(int number) {

        return number + " Goats";
    }

    public String monkey(int number) {

        return number + " Monkeys";
    }
}
