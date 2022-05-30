package com.bl.find_maximum_using_generics;

import java.util.Scanner;

public class MaxFind {

    void inputFloat() {

        Float firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

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
}