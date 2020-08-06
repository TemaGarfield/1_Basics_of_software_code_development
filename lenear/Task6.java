package lenear;

import java.util.Scanner;

public class Task6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        System.out.println((x > -5 && x < 5 && y > -4 && y < 0) || (y > 0 && y < 4 && x > -2 && x < 2));
    }
}
