package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CheckifAllNumbersarePositive {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5);

        Predicate<Integer>  isNegative = val->val<0;
        boolean isPos=value.stream().allMatch(isNegative);
        System.out.println(isPos);
    }
}
