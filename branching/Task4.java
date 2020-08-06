package branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A: ");
        float A = in.nextFloat();
        System.out.print("Enter B: ");
        float B = in.nextFloat();

        System.out.print("Enter x: ");
        float x = in.nextFloat();
        System.out.print("Enter y: ");
        float y = in.nextFloat();
        System.out.print("Enter z: ");
        float z = in.nextFloat();

        if (((A >= x) && (B >= y)) || ((A >= y) && (B >= x))
        || ((A >= x) && (B >= z)) || ((A >= z) && (B >= x))
        || ((A >= z) && (B >= y)) || ((A >= y) && (B >= z))) {
            System.out.println("Fit!");
        } else {
            System.out.println("Will not fit :(");
        }
    }
}
