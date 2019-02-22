package controller;

import lombok.experimental.UtilityClass;
import model.Bean;

import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass

public class ModifyCan {

    public Queue<Bean> reduceBeans(Queue<Bean> beansCan) {
        IntStream.generate(() -> 0)
                .takeWhile(e -> beansCan.size() > 1)
                .forEach(e -> removeTwoAndAddOneBean(beansCan));
        return beansCan;


    }

    private void removeTwoAndAddOneBean(Queue<Bean> beansCan) {
        Bean firstBean = beansCan.poll();
        Bean secondBean = beansCan.poll();
        if (firstBean.equals(secondBean)) {
            beansCan.add(Bean.builder().color("black").build());
        } else {
            beansCan.add(Bean.builder().color("white").build());
        }


    }

    public List<Bean> getWhiteBeans(Queue<Bean> beansCan) {
        return beansCan.stream().filter(e -> e.getColor().equals("white"))
                .collect(Collectors.toList());
    }

    public List<Bean> getBlackBeans(Queue<Bean> beansCan) {
        return beansCan.stream().filter(e -> e.getColor().equals("black"))
                .collect(Collectors.toList());
    }


}
