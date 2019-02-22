package view;

import model.OverallStatistics;


public class main {
    public static void main(String[] args) {
        OverallStatistics.getOverallStatistics(4).stream().forEach(System.out::println);

    }
}
