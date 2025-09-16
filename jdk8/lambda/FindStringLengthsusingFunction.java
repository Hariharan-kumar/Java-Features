package com.corejava.jdk8.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FindStringLengthsusingFunction {
    public static void main(String[] args) {
        List names = Arrays.asList("Hari","Kumar","Manigandan","Mohan","Bharath");
        Function<String,Integer> lengthOfNames = String::length;
        names.stream().map(val->val +" - "+ lengthOfNames.apply(val.toString())).forEach(System.out::println);

    }
}
