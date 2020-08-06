package lenear;

import java.util.Scanner;

/*
* */

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();

        System.out.print("Input c: ");
        double c = in.nextDouble();

        double result = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) + Math.pow(b, -2);
        System.out.println(result);
    }
}
