package com.phaete;

import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {
        // What are the advantages and disadvantages of using for loops compared to for-each loops in Java?
        // Give examples of situations where you would prefer one loop over the other.

        // Advantage for: Index for array manipulation
        // Disadvantage for: Possibly IndexOutOfBounds Exception

        // Advantage for-each: No IndexOutOfBounds, as for-each automatically stops after the last element; easier to use
        // Disadvantage for-each: Can't easily get index for array manipulation

        // For over for-each:
        // - If we need the index, e.g. access only every other element, so i % 2 == 0
        // For-each over for:
        // - If we just need to access the elements one by one to e.g. feed them into another method

        // Research how to create and access a multidimensional array in Java. Give an example with a 2x2 matrix.

        // int[][] multidimArray = new int[2][2];
        // Or:
        // int[][] multidimArray = {{1, 1}, {1, 1}};

        // To access an element:
        // multidimArray[1][1] = 1;

        // Why are arrays in Java impractical?
        // Arraysize is fixed at initialization


        // Coding: Array Basics
        // Step 1: Create an array with numbers from 1 to 10 and print it to the console.

        int[] numberArray = new int[10];
        // int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i+1;
        }

        for (int number : numberArray) {
            System.out.println(number);
        }

        // Step 2: Calculate the sum of all numbers in the array and print the result to the console.
        int sum = 0;
        for (int number : numberArray) {
            sum = sum + number;
        }
        System.out.println("Sum: " + sum);

        // Step 3: Find the largest number in the array and print it to the console.
        int largestNumber = numberArray[0];
        for (int number : numberArray) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        System.out.println("Largest Number: " + largestNumber);

        // Step 4: Create a second array with numbers from 11 to 20.
        int[] numberArray2 = new int[10];
        // int[] numberArray2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < numberArray2.length; i++) {
            numberArray2[i] = i+11;
        }

        // Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
        int[] sumArray = new int[10];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = numberArray[i] + numberArray2[i];
        }

        for (int number : sumArray) {
            System.out.println(number);
        }

        // Bonus: Implement a program that reads a text from the console and then outputs the letters individually. Tip: Learn about the Scanner class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text:");

        if (scanner.hasNext()) {
            String text = scanner.nextLine();

            // Using for:
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i)); // Usage of String method charAt(index)
            }

            // Using for-each:
            for (char letter : text.toCharArray()) { // Usage of String method toCharArray()
                System.out.println(letter);
            }
        }
    }
}
