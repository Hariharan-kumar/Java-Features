package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumNumberusingReduce {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(3,5,9,1,7);
        Optional<Integer> max=value.stream().reduce((a, b)->a>b?a:b);
        System.out.println(max.orElse(0));
    }
}
