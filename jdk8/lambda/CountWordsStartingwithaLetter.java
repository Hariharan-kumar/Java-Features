package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;

public class CountWordsStartingwithaLetter {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hari","Somasundaram","Harini","Suriya","Madhava");
        names.stream().filter(val -> val.startsWith("S")).forEach(System.out::println);
    }
}
