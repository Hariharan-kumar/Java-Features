package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEachNumberusingStream_Lambda {

    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5);

        value=value.stream().map(val->(val*val)).collect(Collectors.toList());
        System.out.println(value);

    }
}
