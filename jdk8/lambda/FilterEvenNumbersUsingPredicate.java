package com.corejava.jdk8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbersUsingPredicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Predicate<Integer> isEven =  val->val %2==0;
        list.stream().filter(isEven).forEach(System.out::print);

    }
}
