import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Addition addition = new Addition();

        System.out.print("Enter first integer: ");
        int A = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int B = scanner.nextInt();
        System.out.println("Sum of integers: " + addition.add(A, B));

        System.out.print("Enter first double: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double b = scanner.nextDouble();
        System.out.println("Sum of doubles: " + addition.add(a, b));
        
        scanner.close();
    }
    //connet to Addition file(file sharing) 
}
