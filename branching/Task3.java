package branching;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x1: ");
        float x1 = in.nextFloat();
        System.out.print("Input y1: ");
        float y1 = in.nextFloat();

        System.out.print("Input x2: ");
        float x2 = in.nextFloat();
        System.out.print("Input y2: ");
        float y2 = in.nextFloat();

        System.out.print("Input x3: ");
        float x3 = in.nextFloat();
        System.out.print("Input y3: ");
        float y3 = in.nextFloat();

        if (((x3 - x1) / (x2 - x1)) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No :(");
        }
    }
}
