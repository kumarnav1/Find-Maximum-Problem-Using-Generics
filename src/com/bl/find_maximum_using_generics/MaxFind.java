package com.bl.find_maximum_using_generics;

import java.util.Scanner;

public class MaxFind {

    void inputInteger() {

        Integer firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer values only.");
        System.out.print("Enter the first number : ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the Second number : ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter the Third number : ");
        thirdNumber = scanner.nextInt();

        testMaxGeneric(firstNumber, secondNumber, thirdNumber);
    }

    void inputFloat() {

        Float firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the float values only.");
        System.out.print("Enter the first number : ");
        firstNumber = scanner.nextFloat();

        System.out.print("Enter the Second number : ");
        secondNumber = scanner.nextFloat();

        System.out.print("Enter the Third number : ");
        thirdNumber = scanner.nextFloat();

        testMaxGeneric(firstNumber, secondNumber, thirdNumber);
    }

    void inputString() {

        String firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string values only.");
        System.out.print("Enter the first string : ");
        firstNumber = scanner.nextLine();

        System.out.print("Enter the Second string : ");
        secondNumber = scanner.nextLine();

        System.out.print("Enter the Third string : ");
        thirdNumber = scanner.nextLine();

        testMaxGeneric(firstNumber, secondNumber, thirdNumber);
    }

    private <E extends Comparable> void testMaxGeneric(E firstValue, E secondValue, E thirdValue) {

        if ((firstValue.compareTo(secondValue) > 0)) {
            if ((firstValue.compareTo(thirdValue) > 0)) {
                System.out.println("First value is maximum");
            } else
                System.out.println("Third string is maximum");
        } else if ((secondValue.compareTo(thirdValue)) > 0)
            System.out.println("Second value is maximum");
        else
            System.out.println("Third value is maximum");
    }
}