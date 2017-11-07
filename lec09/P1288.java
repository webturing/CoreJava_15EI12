package lec09;

public class P1288 {
    public static void main(String[] args) {
        int n = 1000;
        if (n > 25)
            n = 25;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + factorial(i);
            s = s % 1000000;
        }
        System.out.println(s);
    }

    private static int factorial(int n) {
        int s = 1;
        for (int i = 2; i <= n; i++)
            s = (s * i) % 1000000;
        return s;
    }
}
