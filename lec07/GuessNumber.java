package lec07;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int key = (int) (Math.random() * 100);// [0,99]
        for (int i = 0; i < 7; i++) {
            System.out.println("Please Enter your guessed number~");
            int user = cin.nextInt();
            if (user == key) {
                System.out.println("Congratulations!");
            } else if (user > key) {
                System.out.println("Too bigger~");
            } else {
                System.out.println("Too smaller~");
            }
        }
        cin.close();
    }
}
