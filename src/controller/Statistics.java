package controller;

import lombok.experimental.UtilityClass;
import model.Bean;
import model.Beans;

import java.util.Queue;


@UtilityClass

public class Statistics {
    Beans beans = new Beans();


    public String getStatistics() {
        Queue<Bean> beanQueue = CanMaker.makeCan(Statistics.beans, 90);

        return getWhiteRatio(beanQueue).toString() + "%" + " "
                + getBlackRatio(beanQueue).toString() + "%" + " "
                + getRemainingBean(beanQueue);

    }

    public Double getWhiteRatio(Queue<Bean> beanQueue) {


        return (Double.valueOf(ModifyCan.getWhiteBeans(beanQueue).size()) * 100) / beanQueue.size();


    }

    private Double getBlackRatio(Queue<Bean> beanQueue) {
        return (Double.valueOf(ModifyCan.getBlackBeans(beanQueue).size()) * 100) / beanQueue.size();

    }

    private String getRemainingBean(Queue<Bean> beanQueue) {
        return ModifyCan.reduceBeans(beanQueue).element().getColor();

    }


}
