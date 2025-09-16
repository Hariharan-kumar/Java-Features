package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNon_EmptyString {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("","lambda","","java");
        Optional<String> findFirst = values.stream().filter(v -> !v.isEmpty()).findFirst();
        findFirst.ifPresent(System.out::println);
    }
}
