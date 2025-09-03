import java.util.Scanner;

public class LabWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }

        System.out.print("Input a number form 1 to 100: ");
        int n = input.nextInt();
        if (n < 0 || n > 100) {
            System.out.println("Input number out of range.");
        } else if (n >= 90) {
            System.out.println("Obtain mark "+n+", Grade A");
        } else if (n >= 80) {
            System.out.println("Obtain mark "+n+", Grade B");
        } else if (n >= 70) {
            System.out.println("Obtain mark "+n+", Grade C");
        } else if (n >= 60) {
            System.out.println("Obtain mark "+n+", Grade D");
        } else {
            System.out.println("Obtain mark "+n+", Grade F");
        }

        System.out.print("Input a year: ");
        int year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        String accNum = "Rabbi021";
        String pass = "242311046";
        System.out.println("Account number\t: " + accNum + "\nPassword\t: " + pass);
        System.out.print("Enter your account number: ");
        input.nextLine();
        String accNumInput = input.nextLine();
        System.out.print("Enter your password: ");
        String passwordInput = input.nextLine();
        if (accNum.equals(accNumInput) && pass.equals(passwordInput)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid credentials.");
        }

        System.out.print("Input A= ");
        int a = input.nextInt();
        System.out.print("Input B= ");
        int b = input.nextInt();
        System.out.print("Input C= ");
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println("A is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println("B is the largest number.");
        } else if (c >= a && c >= b) {
            System.out.println("C is the largest number.");
        } else {
            System.out.println("All numbers are equal.");
        }
    }
}
