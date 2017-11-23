package lec11.ex01;

public class Rectangle extends Shape2D {
	public Rectangle(int len, int wid) {
		this.len=len;
		this.wid=wid;
	}

	int len,wid;
	public double area(){
		return this.len*this.wid;
	}
}
