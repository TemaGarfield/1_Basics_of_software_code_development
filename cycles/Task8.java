package cycles;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();

        System.out.print("Numbers: ");
        for (int i = 0; i < 10; i++) {
            int firstNumber1 = firstNumber;
            int secondNumber1 = secondNumber;
            while (secondNumber1 > 0) {
                if (secondNumber1 % 10 == i) {
                    while (firstNumber1 > 0) {
                        if (firstNumber1 % 10 == i) {
                            System.out.print(i + " ");

                        }
                        firstNumber1 /= 10;
                    }
                }
                secondNumber1 /= 10;
            }
        }
    }
}

