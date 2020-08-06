package branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = in.nextFloat();
        System.out.print("Input b: ");
        float b = in.nextFloat();
        System.out.print("Input c: ");
        float c = in.nextFloat();
        System.out.print("Input d: ");
        float d = in.nextFloat();

        float minAB = a > b ? b : a;
        float minCD = c > d ? d : c;

        float max = minAB > minCD ? minAB : minCD;

        System.out.println(max);
        //System.out.println(minAB);
    }
}
