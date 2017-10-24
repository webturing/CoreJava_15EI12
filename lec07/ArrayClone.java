package week07;

import java.util.Arrays;

public class ArrayClone {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};		
		int[] b=a;//浅克隆
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		a[0]++;
		System.out.println(Arrays.toString(b));
		//克隆1
		int []c=new int[a.length];
		for(int i=0;i<c.length;i++)
			c[i]=a[i];
		//克隆2
		int []d=a.clone();
		//克隆3
		int []e=new int[]{1,3,4,5,6};
		
		e=a;//改变数组的引用
		
		
	}
}
