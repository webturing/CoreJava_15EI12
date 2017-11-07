package week09;

import java.math.BigInteger;

public class P1039 {
	public static void main(String[] args) {
		//int s = 1;
		BigInteger s=new BigInteger("1");
		
		int n = 1977;
		for (int i = 2; i <= n; i++) {
			s=s.multiply(new BigInteger(Integer.toString(i)));
			System.out.println(s);
		}
		
	}
}
