package lenear;

public class Task4 {
    public static void main (String[] args) {
        float R = 111.222f;
        R = (int)(R * 1000) % 1000 + (float)((int)(R * 1000) / 1000) / 1000;
        System.out.println(R);
    }

}
