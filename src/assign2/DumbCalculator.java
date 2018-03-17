package assign2;

import java.util.Scanner;

public class DumbCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, d, e, Result;
        System.out.print("Enter first number;  ");
        a = scan.nextFloat();
        System.out.print("Enter second number;  ");
        b = scan.nextFloat();
        System.out.print("Enter third number;  ");
        c = scan.nextFloat();
        System.out.print("Enter fourth number;  ");
        d = scan.nextFloat();
        System.out.print("Enter first number;  ");
        e = scan.nextFloat();
        {
            Result = a + b * c / d - e;
        }
        System.out.println(a + "+" + b + "*" + c + "/" + d + "-" + e + "  =" + Result);

    }
}
