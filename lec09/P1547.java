package lec09;

import java.math.BigInteger;
import java.util.Scanner;

public class P1547 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String sa = cin.next();
            String sb = cin.next();
            BigInteger ba = new BigInteger(sa);
            BigInteger bb = new BigInteger(sb);
            System.out.println(ba.add(bb));
        }

        cin.close();
    }
}
