import java.util.Scanner;

/**
 * IO：多組輸入以EOF结束(Ctrl+Z/D)
 * 
 * Sample Input 
 * 3 4 
 * 1 2 
 * Sample Output 
 * 7 
 * 3
 * 
 * @author Administrator
 * 
 */
public class IO2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(a + b);
		}

		cin.close();
	}
}
