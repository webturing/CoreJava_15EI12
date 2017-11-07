package lec09;

public class DossPI {
    public static void main(String[] args) {
        int N = 100000000;
        int M = 0;// 落在扇形内部的点的数目
        for (int i = 0; i < N; i++) {
            // 产生一个随机点P
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(x * x + y * y) <= 1)/* P落在扇形内 */
                ++M;
        }
        double pi = 4.0 * M / N;
        System.out.println(pi);

    }
}
