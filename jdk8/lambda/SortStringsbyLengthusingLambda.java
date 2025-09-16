package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsbyLengthusingLambda {

    public static void main(String[] args) {

        List fruits = Arrays.asList("apple","mango","banana","kiwi");

        Collections.sort(fruits,(a,b)->a.toString().length() - b.toString().length());
        System.out.println(fruits);
    }
}
