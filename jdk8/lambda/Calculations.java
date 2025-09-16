package com.corejava.jdk8.lambda;

@FunctionalInterface
public interface Calculations {
    default void startPoint(){
        System.out.println("The Functional Interface Was Called");

    }
    int mathCalc(char operation ,int value1,int value2);

    static void endPoint(){
        System.out.println("The Functional Interface Was Closed");
    }
}
