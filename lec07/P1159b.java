package week07;

import java.util.Arrays;
import java.util.Scanner;

public class P1159b {// BUGS
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = cin.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = cin.nextInt();
		}
		Arrays.sort(arr);
		
		int sum = 0;
		for (int i = 1; i <= arr.length - 2; i++)
			sum += arr[i];
		System.out.println(sum / (arr.length - 2));

		cin.close();
	}
}
