package com.corejava.jdk8.lambda;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateRandomNumbersusingSupplier {

    public static void main(String[] args) {
        Random ran = new Random();
        Supplier<Integer> random = ()-> ran.nextInt(100)+1;
        List<Integer> randumNumber = Stream.generate(random).limit(5).collect(Collectors.toList());
        System.out.println(randumNumber);
    }
}
