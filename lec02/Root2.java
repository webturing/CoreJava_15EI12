package lec02;

import java.util.Scanner;

public class Root2 {
    public static void main(String[] args) {
        // System.out.println(4 ^ 4);
        Scanner cin = new Scanner(System.in);
        double a = cin.nextInt();
        double b = cin.nextInt();
        double c = cin.nextInt();
        cin.close();

        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(String.format("%.2f %.2f\n", x1, x2));

    }
}
