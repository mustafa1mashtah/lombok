package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
//@Builder

public class Beans {

    public List<Bean> Beans = new ArrayList<>(Arrays.asList(Bean.builder().color("white").build()
            , Bean.builder().color("black").build()));

}
