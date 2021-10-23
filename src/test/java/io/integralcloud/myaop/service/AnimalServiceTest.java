package io.integralcloud.myaop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AnimalServiceTest {

    @Autowired
    private AnimalService animalService;

    @Test
    void testDog() {
        String msg = animalService.dog(3);
        assertThat(msg).isNotNull();
    }



}
