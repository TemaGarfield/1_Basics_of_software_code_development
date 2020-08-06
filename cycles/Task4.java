package cycles;

public class Task4 {
    public static void main(String[] args) {
        double product = 1;
        for (int i = 1; i <= 200; i++) {
            product *= Math.pow(i, 2);
        }
        System.out.println(product);
    }
}
