                           /*Demo input and type casting */


import java.util.Scanner;

public class inputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,b;
        float y,a,sum;
        String z;
        System.out.printf("input string: ");
        z = input.nextLine();
        

        System.out.printf("input two integer: ");
        x = input.nextInt();
        b = input.nextInt();

        System.out.printf("input two float number: ");
        y = input.nextFloat();
        a = input.nextFloat();

        System.out.println("X= " + x);
        System.out.println("Y= " + y);
        System.out.println("Z= " + z);
        sum=(float)x/b;
        System.out.println("Total sum= "+sum);

    }
}