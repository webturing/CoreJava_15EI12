package lec09;

public class DollDemo {
    public static void main(String[] args) {
        int N = 10000;
        int first, second, third, no;
        first = second = third = no = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            if (x <= 0.05) {
                System.out.println("First Prize: Iphone 7 plus~");
                ++first;
            } else if (x <= 0.05 + 0.10) {
                System.out.println("Second Prize: Iphone 4S~");
                ++second;
            } else if (x <= 0.05 + 0.10 + 0.15) {
                System.out.println("Third Prize: Logitch Mouse~");
                ++third;
            } else {
                System.out.println("NO PRIZE: Thank you~");
                ++no;
            }
        }
        System.out.println(String.format("%d %d %d %d\n", first, second, third, no));
    }
}
