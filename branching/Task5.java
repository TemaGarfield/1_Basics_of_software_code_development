package branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextFloat();

        double result;
        if (x <= 3){
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);
    }
}
