package cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = in.nextInt();
        System.out.print("Input n: ");
        int n = in.nextInt();

        for ( ; m <= n; m++) {
            System.out.print("Делители " + m + ": ");
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
