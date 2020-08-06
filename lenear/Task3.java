package lenear;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
        System.out.print("Input y: ");
        double y = in.nextDouble();

        double result = ((Math.sin(x) + Math.cos(x)) / (Math.cos(x) - Math.sin(x))) * Math.tan(x * y);
        System.out.println(result);
    }
}
