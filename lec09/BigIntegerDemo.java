package lec09;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        System.out.println(111111 * 111111);
        System.out.println(111111L * 111111L);
        System.out.println(111111111111L * 111111111111L);
        BigInteger a = new BigInteger("11111111111111111111111111111111");
        System.out.println(a.multiply(a));

    }
}
