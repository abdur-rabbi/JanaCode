/* This program prints all numbers from 1 to a given number, skipping those divisible by 3 */

import java.util.Scanner;

public class NumberPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = input.nextInt();

        System.out.print("Number(s) found: ");
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
             continue;
            }
             System.out.print(i + " ");
        } 
    }
}
  