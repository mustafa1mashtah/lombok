package controller;

import lombok.experimental.UtilityClass;
import model.Bean;
import model.Beans;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.stream.IntStream;

@UtilityClass


public class CanMaker {
    private Random random = new Random();

    public Queue<Bean> makeCan(Beans beans, Integer repetition) {
        List<Bean> startBeansList = beans.getBeans();
        List<Bean> beansCan = new LinkedList<>();
        IntStream.generate(() -> 0)
                .takeWhile(n -> beansCan.size() < repetition)
                .boxed()
                .forEach(e -> addOneRandomBean(startBeansList, beansCan));
        return (Queue<Bean>) beansCan;


    }

    private List<Bean> addOneRandomBean(List<Bean> startBeansList, List<Bean> beansCan) {
        Bean RandomBean = startBeansList.get(random.nextInt(startBeansList.size()));
        beansCan.add(RandomBean);

        return beansCan;
    }
}
