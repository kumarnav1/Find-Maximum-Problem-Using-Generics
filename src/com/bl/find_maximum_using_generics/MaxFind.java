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

        testMaxInteger(firstNumber, secondNumber, thirdNumber);
    }

    private void testMaxInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First number is grater");
            } else
                System.out.println("Third number is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second number is greater");
        else
            System.out.println("Third number is greater");
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

        testMaxFloat(firstNumber, secondNumber, thirdNumber);
    }

    private void testMaxFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {

        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First number is grater");
            } else
                System.out.println("Third number is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second number is greater");
        else
            System.out.println("Third number is greater");
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

        testMaxString(firstNumber, secondNumber, thirdNumber);
    }

    private void testMaxString(String firstNumber, String secondNumber, String thirdNumber) {

        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First string is greater");
            } else
                System.out.println("Third string is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second string is greater");
        else
            System.out.println("Third string is greater");
    }
}