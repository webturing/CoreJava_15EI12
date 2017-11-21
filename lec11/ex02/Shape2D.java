package lec11.ex02;

public abstract class Shape2D {
	abstract double area();//Ðé·½·¨ abstract method
	void foo(){
		System.out.println(area());
		System.out.println(perimeter());
	}
	abstract double perimeter();
}
