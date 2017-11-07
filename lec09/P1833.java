package lec09;

import java.math.BigInteger;
import java.util.Scanner;

public class P1833 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        BigInteger s = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            s = s.multiply(new BigInteger(Integer.toString(i)));
        System.out.println(s);
        String str = s.toString();
        int len = str.length();
        for (int j = len - 1; j >= 0; j--) {
            if (str.charAt(j) != '0') {
                System.out.println(str.charAt(j));
                break;
            }
        }

        cin.close();
    }
}
