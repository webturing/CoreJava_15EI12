import java.util.Arrays;


public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String API
		String s="12345abcd��";
		System.out.println(s.length());//10 Unicode���� ���ֳ���Ϊ1
		System.out.println("hello "+"world"); //��������
		System.out.println(s.charAt(4));//'5'
		System.out.println(s.indexOf('a'));//return char c' index if s contains c else -1
		System.out.println(s.indexOf("bcd"));//return sbstr s' index if s contains sbstr else -1
		System.out.println(s.contains("5b"));//startWith/endWith
		System.out.println(s.substring(5));//abcd��
		System.out.println(s.substring(5,7));
		
		//covert nonString Type to String
		int n=1234;
		System.out.println((n+"").length());
		System.out.println(Integer.toString(n).length());
		System.out.println(Integer.toString(n,2).length());
		System.out.println(Integer.toBinaryString(n).length());
		
		//parse String to Numeric(int,float,double)
		
		System.out.println(Integer.parseInt("1234"));
		System.out.println(Integer.parseInt("1234",16));
		System.out.println(Double.parseDouble("12.34"));
		
		//String split
		String clause="to know everything is to know nothing";
		String[] words=clause.split(" ");
		System.out.println(Arrays.toString(words));
		
		//nextInt()/nextInt(radix);
		//next() //���һ���������ո�ĵ���
		//nextLine();//���һ����(���԰����ո�)

	}

}
