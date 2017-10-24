package week07;

import java.util.Arrays;//常规算法

public class Array1Demo {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };// C-style
		int[] b = { 3, 4, 5, };// Better
		int[] c = new int[10];
		
		// 索引访问
		for (int i = 0; i < a.length; i++) {		
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// foreach 迭代器模式	
		for (int ele : b) {			
			System.out.print(ele + " ");
		}
		System.out.println();
		//使用Arrays.toString(arrName)
		System.out.println(Arrays.toString(c));

	}
}
