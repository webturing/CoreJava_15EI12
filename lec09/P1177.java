package lec09;

import java.math.BigInteger;
import java.util.Scanner;

public class P1177 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            BigInteger s = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                s = s.multiply(new BigInteger(Integer.toString(i)));
            }
            System.out.println(s);
        }
        cin.close();
    }
}
