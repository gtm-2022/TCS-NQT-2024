
/*** Write a Java program that prompts
 *  the user to enter a number, performs
 *  a series of operations on it until 
 * the number becomes 1, and then prints
 *  each intermediate result. If the number
 *  is even, it should be divided by 2; if 
 * it's odd, it should be multiplied by 3 
 * and increased by 1. Ensure the program
 *  adheres to the specified logic and 
 * prints the output accordingly. 
 * Input1: 5 
 * Output: 16 8 4 2 1
 * Input2: 4 
 * Output: 2 1
 * 
 * Explanation :
 * Input: 5The program starts with the
 *  input number 5.Since 5 is odd, the
 *  program multiplies it by 3 and adds 1, 
 * resulting in 16.16 is even, so it's divided by 2, 
 * resulting in 8.8 is even, so it's divided by 2, 
 * resulting in 4.4 is even, so it's divided by 2,
 *  resulting in 2.2 is even, so it's divided by 2, 
 * resulting in 1.The process ends with the number
 *  becoming 1.Output: 16 8 4 2 1
 * Input: 4The program starts with the input number
 *  4.Since 4 is even, it's divided by 2, resulting 
 * in 2.2 is even, so it's divided by 2, resulting 
 * in 1.The process ends with the number becoming 
 * 1.Output: 2 1
 * 

 * ***/

import java.util.Scanner;

public class CollatzSeris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int num = scanner.nextInt();
        System.out.print("Output: ");
        f(num);
    }

    public static void f(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
}