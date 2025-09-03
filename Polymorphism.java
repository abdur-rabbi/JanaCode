/* This program demonstrates method overloading for summation using return type function. */

import java.util.Scanner;
public class Polymorphism {
        public int sum(int a, int b){
            return a+b;
        }
        public double sum(double a, double b){
            return a+b;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Polymorphism obj = new Polymorphism();
            System.out.print("Input first integer: ");
            int a=input.nextInt();
            System.out.print("Input second integer: ");
            int b=input.nextInt();
            System.out.println("Sum of integers: "+obj.sum(a,b));

            System.out.print("Input first dubble: ");
            int c=input.nextInt();
            System.out.print("Input second dubble: ");
            int d=input.nextInt();
            System.out.println("Sum of doubles: "+obj.sum(c,d));

        }
}
