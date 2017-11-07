package lec09;

public class MathRandomDemo {
    public static void main(String[] args) {
        int N = 1000000;
        int tot = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            if (x < 0.5)
                ++tot;
        }
        System.out.println(tot);
    }
}
