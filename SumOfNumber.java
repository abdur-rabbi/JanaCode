/* This program calculates the sum of all integers from 1 to a given number. */

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int sum = 0, x = input.nextInt();
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.println("Total is: " + sum);
    }
}
