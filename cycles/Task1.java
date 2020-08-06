package cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number: ");
            number = in.nextInt();
            if (number <= 1) {
                System.out.println("Invalid number :(");
                System.out.println();
            } else {
                break;
            }
        } while (true);

        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
