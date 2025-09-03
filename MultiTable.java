/* This program prints the multiplication table of a given number. */

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number(Byte): ");
        int x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int a = i * x;
            System.out.println(i + " * " + x + " = " + a);
        }
    }
}
