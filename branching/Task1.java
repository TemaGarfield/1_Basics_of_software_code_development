package branching;

import java.util.Scanner;



public class Task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st angle: ");
        float x = in.nextFloat();
        System.out.print("Enter 2nd angle: ");
        float y = in.nextFloat();
        if (x + y < 180) {
             if (x + y == 90) {
                 System.out.print("Right triangle!");
             } else {
                 System.out.println("Triangle!");
             }
        } else {
            System.out.println("Not triangle :(");
        }
    }
}
