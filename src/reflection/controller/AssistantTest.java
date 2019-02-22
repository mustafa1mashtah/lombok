package reflection.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reflection.model.Fruit;

import java.util.Arrays;
import java.util.List;

class AssistantTest {

    @Test
    void getFruitsList() {
        List<Fruit> fruitsList = Assistant.getFruitsList("reflection/model/textFileTesting.txt");

        List<Fruit> expected = Arrays.asList(Fruit.builder().name("Apple").amount(1L).build(),
                Fruit.builder().name("Orange").amount(2L).build()
                , Fruit.builder().name("Banana").amount(1L).build());
        Assertions.assertEquals(expected, fruitsList);
    }
}