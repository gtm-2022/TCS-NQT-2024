
/*** 
 * Write a  program that prompts the user to enter four numbers and stores them in
 *  an array. The program should then print each number. If a number is divisible 
 * by 3, it should print 'three'. If a number is divisible by both 3 and 5, it should 
 * print 'threefive'. Provide an example to demonstrate the functionality of the program.
 * "Example:
 *  Input:Enter four numbers:
 * 
 2
 4
 3
 5
 Output:
 2
 4
 three
 5
 This program takes user input for four numbers, stores them in an array, and then iterates
  through the array to check each number. If a number is divisible by 3, it prints 'three'. 
  If a number is divisible by both 3 and 5, it prints 'threefive'. Otherwise, it prints the
   number itself."
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class digtow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        // Taking input for array elements
        System.out.println("Enter four numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Iterate through the array and print accordingly
        for (int num : numbers) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("threefive");
            } else if (num % 3 == 0) {
                System.out.println("three");
            } else {
                System.out.println(num);
            }
        }
    }
}