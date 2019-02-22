package reflection.controller;

import lombok.experimental.UtilityClass;
import reflection.model.Fruit;

import java.util.List;
import java.util.stream.Collectors;
@UtilityClass

public class Assistant {
    public List<Fruit>getFruitsList(String path){
       return FileReader.lines(path)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .map(e->  Fruit.builder().name(e.getKey()).amount(e.getValue()).build())
                .collect(Collectors.toList());
    }

}
