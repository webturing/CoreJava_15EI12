package lec09;

import java.math.BigInteger;

public class FermatDemo {
    //f(n)=2^2^n+1
    static BigInteger f(int n) {
        BigInteger two = new BigInteger("2");
        return two.pow(1 << n).add(BigInteger.ONE);

    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            System.out.println(f(i).isProbablePrime(100));
        System.out.println(1 - Math.pow(2, -100));
    }
}
