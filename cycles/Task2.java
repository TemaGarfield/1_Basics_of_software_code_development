package cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.println("Enter h: ");
        int h = in.nextInt();
        for ( ; a < b; a += h) {
            if (a <= 2) {
                System.out.println("y= " + -a);
            } else {
                System.out.println("y= " + a);
            }
        }

    }
}
