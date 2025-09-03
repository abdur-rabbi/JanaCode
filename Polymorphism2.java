
import java.util.Scanner;
public class Polymorphism2 {
    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum of integers: " + c);
    }
    public void sum(double a, double b) {
        double c = a + b;
        System.out.println("Sum of doubles: " + c);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Polymorphism2 obj = new Polymorphism2();
        System.out.print("Input first integer: ");
        int a = scanner.nextInt();
        System.out.print("Input second integer: ");
        int b = scanner.nextInt();
        obj.sum(a, b);
        
        System.out.print("Input first double: ");
        double c = scanner.nextDouble();
        System.out.print("Input second double: ");
        double d = scanner.nextDouble();
        obj.sum(c, d);
    }
}
