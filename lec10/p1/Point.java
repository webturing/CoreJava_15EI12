package week10.p1;

public class Point {
	int x,y;//member field ��Ա����
	static double z=0;//static field ��̬���� 
	public static void main(String[] args) {
		Point p =new Point();
		p.x=3;
		p.y=4;
		
		
		System.out.println(p.x);
		
		Point q=new Point();
		q.x=4;
		System.out.println(p.x);//
		System.out.println(q.x);//
		
		p.z=3;
		System.out.println(q.z);
	}
}
