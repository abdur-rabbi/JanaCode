/* This program inputs subject marks and calculates percentage */

import java.util.*;

public class MarkParcentance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a number how many subjects marks you want to enter:  ");
        int i, n = input.nextInt();
        int[] marks = new int[n];
        System.out.print("Enter the marks for " + n + " subjects:");
        for (i = 0; i < n; i++) {
            marks[i] = input.nextInt();
            try {
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 to 100.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                i--; // Decrement i to re-enter the mark for this subject
            }

        }
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += marks[i];
        }
        float average = (float) sum / n;
        System.out.println("The percentage marks is: " + average + "%");
    }
}
