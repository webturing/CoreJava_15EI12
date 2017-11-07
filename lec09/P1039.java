package week09;

import java.math.BigInteger;

public class P1039 {
	public static void main(String[] args) {
		BigInteger s=BigInteger.ONE;		
		int n = 25;
		for (int i = 2; i <= n; i++) {
			s=s.multiply(new BigInteger(Integer.toString(i)));
			System.out.println(s);
		}
		
	}
}
