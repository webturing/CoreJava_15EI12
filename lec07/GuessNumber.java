package lec07;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int start = 1, end = 100;
        Scanner cin = new Scanner(System.in);
        int key = (int) (Math.random() * (end - start + 1)) + start;// [start,end]
        boolean flag = false;
        for (int i = 0; i < 7; i++) {
            System.out.println("Please Enter your guessed number~");
            int user = cin.nextInt();
            if (user == key) {
                flag = true;
                break;
            } else if (user > key) {
                System.out.println("Too bigger~");
            } else {
                System.out.println("Too smaller~");
            }
        }
        if (flag) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Sorry~");
        }
        cin.close();
    }
}
