package week10.p3;

public class Point {

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public Point() {
		this(0);
	}

	public Point(int x) {
		this(x, 0);
	}

	public static void main(String[] args) {
		Point p = new Point();// p.x=0,p.y=0;
		Point q = new Point(3, 4);// q.x=3,q.y=4;
		Point r = new Point(3);// r.x=3,r.y=0;
		p.disp();
		q.disp();
		r.disp();
		double pq = Point.distance(p, q);// fair
		System.out.println(pq);
		double pq2 = p.distance(q);// better
		System.out.println(Point.area3(p, q, r));//
		
		Point t;//
		t=Point.getMidPoint(p,q);//
	
		

	}

	private static Point getMidPoint(Point p, Point q) {
		Point ret=new Point();
		ret.x=(p.x+q.x)/2;
		ret.y=(p.y+q.y)/2;		
		return ret;
	}

	private static double area3(Point p, Point q, Point r) {
		double a = p.distance(q);
		double b = p.distance(r);
		double c = q.distance(r);
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	private double distance(Point q) {
		// double dx = this.x - q.x;
		// double dy = this.y - q.y;
		// return Math.hypot(dx, dy);
		return Point.distance(this, q);
	}

	static double distance(Point p, Point q) {
		double dx = p.x - q.x;
		double dy = p.y - q.y;
		return Math.hypot(dx, dy);
	}

	private void disp() {
		System.out.println(x + " " + y);

	}

	int x, y;

}
