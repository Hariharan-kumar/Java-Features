package com.corejava.jdk8.lambda;

import java.util.Scanner;

public class CalcImplementations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        Calculations add = (option,v1,v2)->option=='+'?v1+v2:option=='-'?v1-v2:option=='*'?v1*v2:option=='/'?v1/v2:0;
        System.out.println("--------Basic Arithmetic Calculation Using Lambda Expression--------");
        add.startPoint();
        System.out.print("Enter first value : ");
        int a = userInput.nextInt();
        System.out.print("Enter second value : ");
        int b = userInput.nextInt();
        System.out.println("Addition of two Values : " +add.mathCalc('+',a,b));
        System.out.println("Subtraction of two Values : " +add.mathCalc('-',a,b));
        System.out.println("Multiplication of two Values : " +add.mathCalc('*',a,b));
        System.out.println("Division of two Values : " +add.mathCalc('/',a,b));
        Calculations.endPoint();
    }
}
