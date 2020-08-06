package lenear;

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        System.out.print("Input time in seconds: ");
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int hours = T / 3600;
        T -= hours * 3600;
        int min = T / 60;
        T -= min * 60;
        System.out.println(hours + "ч " + min + "мин " + T + "с");
    }
}
