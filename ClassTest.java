import java.util.Scanner;

public class ClassTest {
    public void number_Check(byte n) {
        Scanner input = new Scanner(System.in);
        if (n < 0) {
            System.out.print("Your input number is negative, after converting positive number is: ");
            n = (byte) (n * -1);
            System.out.println(n);
        } else if (n == 0) {
            System.out.print("Now enter a number 1< x <128: ");
            byte m = input.nextByte();
            n += m;
            System.out.println("Now n is: " + n);
        }
        if (n > 40 && n <= 80) {
            System.out.println("Approved.");
        } else {
            System.out.println("Not approved.");
        }
        boolean f = false;
        if (n % 2 == 0 && n % 3 == 0) {
            f = true;
        }
        System.out.println(f);
        if (f == false) {
            System.out.println("This number cat'n dividen by both(2&3).");
        } else {
            System.out.println("TThis number can dividen by both(2&3).");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number < 128: ");
        byte x = input.nextByte();
        ClassTest ct = new ClassTest();
        ct.number_Check(x);
    }
}
