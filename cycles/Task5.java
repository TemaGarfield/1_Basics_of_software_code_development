package cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input e: ");
        double e = in.nextDouble();
        System.out.print("Input n: ");
        int n = in.nextInt();

        double sum = 0;
        double a;

        for (int i = 1; i <= n; i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            System.out.println(Math.abs(a));
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println(sum);
    }
}
