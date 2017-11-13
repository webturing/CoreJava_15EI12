package midtest;

import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a = n % 1000 / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        if (n == a * a * a + b * b * b + c * c * c)
            System.out.println(1);
        else
            System.out.println(0);
        cin.close();

    }
}
