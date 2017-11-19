package midtest;

import java.util.Scanner;

public class E {
    public
    static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        if (a + b > c && Math.abs(a - b) < c) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(String.format("%.2f", area));
        } else
            System.out.println("Input error!");
        cin.close();
    }
}