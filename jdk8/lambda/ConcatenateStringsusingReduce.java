package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConcatenateStringsusingReduce {

    public static void main(String[] args) {
        List<String> words =  Arrays.asList("I","Love","You");

        Optional<String> val = words.stream().reduce((a,b)->a.concat(" "+b));
        System.out.println(val.orElse("error"));

    }
}
