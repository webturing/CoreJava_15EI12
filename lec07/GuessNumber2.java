package week07;

import java.util.Scanner;

public class GuessNumber2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int start=0,end=999;
		int key = (int) (Math.random() * 1000);// [0,99]		
		for (int i = 0; i < 10; i++) {
			System.out.print("Computer guess the number is:");
			int user =(start+end)/2;
			System.out.println(user);
			if (user == key) {
				System.out.println("Congratulations!");
				break;
			} else if (user > key) {
				end=user-1;
				System.out.println("Too bigger~");
			} else {
				start=user+1;
				System.out.println("Too smaller~");
			}
		}
		cin.close();
	}
}
