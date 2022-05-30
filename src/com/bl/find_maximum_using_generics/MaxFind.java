package com.bl.find_maximum_using_generics;

import java.util.Scanner;

public class MaxFind {

    void inputString() {

        String firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

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