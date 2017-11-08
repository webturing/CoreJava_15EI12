package lec09;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        System.out.println(111111 * 111111);//fail
        System.out.println(111111L * 111111L);//ok
        System.out.println(111111111111L * 111111111111L);//fail
        BigInteger a = new BigInteger("11111111111111111111111111111111");//用字符串生成一个大整数
        BigInteger b = new BigInteger("99999999999999999999999");
        System.out.println(a.add(b));//a+b
        System.out.println(a.subtract(b));//a-b
        System.out.println(a.multiply(b));//a*b
        System.out.println(a.divide(b));//a/b
        System.out.println(a.pow(2));//a^2
        System.out.println(a.isProbablePrime(20));//按概率(1-2^(-certainty))断定a是否是质数

    }
}
