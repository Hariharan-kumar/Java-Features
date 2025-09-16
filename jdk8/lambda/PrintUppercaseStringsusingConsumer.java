package com.corejava.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class PrintUppercaseStringsusingConsumer {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hari","Gokul","Vijay","Mohan");
        Consumer<String> toUpperWords = val -> System.out.println(val +" - "+val.toUpperCase());
        words.forEach(toUpperWords);
    }
}
