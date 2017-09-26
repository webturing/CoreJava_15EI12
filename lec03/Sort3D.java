import java.util.Scanner;

/**
 * 3个数排序，冒泡算法 比较a ,b if(a>b) a<->b 比较 b,c 比较 a,b //此时c已经是最大值了
 * 
 * @author Administrator
 * 
 */
public class Sort3D {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			
			if (a > b) {
				int t = a;
				a = b;
				b = t;
			}
			if (b > c) {
				int t = b;
				b = c;
				c = t;
			}
			if (a > b) {
				int t = a;
				a = b;
				b = t;
			}
			System.out.println(String.format("%d %d %d", a, b, c));
		}
		cin.close();
	}
}
