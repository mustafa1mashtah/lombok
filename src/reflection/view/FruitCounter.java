package reflection.view;

import lombok.experimental.UtilityClass;
import reflection.controller.Assistant;
@UtilityClass

public class FruitCounter {

    public void displayFruits(){
        Assistant.getFruitsList("reflection/model/delivery.txt")
                .stream()
                .map(e->e.getName()+"  "+e.getAmount())
                .forEach(System.out::println);

    }
}
