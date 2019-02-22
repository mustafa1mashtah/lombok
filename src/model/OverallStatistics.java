package model;

import controller.Statistics;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass

public class OverallStatistics {


    public List<String> getOverallStatistics(Integer tries) {

        return IntStream.range(0, tries)
                .mapToObj(e -> Statistics.getStatistics())
                .collect(Collectors.toList());

    }
}
