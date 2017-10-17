package lec02;

import java.util.Scanner;


public class CircleDemo {
public static void main(String[] args) {

	Scanner cin=new Scanner(System.in);
	double radius=cin.nextDouble();
	
	double area= Math.PI*radius*radius;
	double perimeter=2*Math.PI*radius;
	
	System.out.println(String.format("%.3f %.3f", perimeter,area));
	
	cin.close();
	
	
}
}
