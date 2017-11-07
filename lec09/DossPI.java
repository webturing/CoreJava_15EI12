package lec09;

/**
 * Created by Administrator on 2017/11/7 0007.
 */
public class DossPI {
    public static void main(String[] args) {
        final int N = 10000;
        int M = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(x * x + y * y) <= 1)
                ++M;
        }
        double pi = M * 4.0 / N;
        System.out.println(String.format("%.3f", pi));
    }
}
