package week10.p2;

public class Point {// 构造函数的重载
	int x, y;

	// double z;
	// String s;//null

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public Point() {
		x = 0;
		y = 0;
	}

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
		Point q = new Point(3, 4);
		System.out.println(q.x + " " + q.y);
		Point r = new Point(2, 0);
		Point.disp(r);
		r.showInfo();

	}

	static void disp(Point p) {//static methods
		System.out.println(p.x + " " + p.y);
	}

	void showInfo() {//member method
		System.out.println(this.x + " " + this.y);
	}

}
