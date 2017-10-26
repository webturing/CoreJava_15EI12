package lec07;


import java.util.Random;

public class GuessNumber2 {
    static Random rand = new Random();
    public static void main(String[] args) {
        int start = 1, end = 100;
        int key = rand.nextInt(end - start + 1) + start;// [start,end]
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            System.out.print("Computer guessed the number is:");
            int user = (start + end) / 2;
            System.out.println(user);
            if (user == key) {
                flag = true;
                break;
            } else if (user > key) {
                end = user - 1;
                System.out.println("Too bigger~");
            } else {
                start = user + 1;
                System.out.println("Too smaller~");
            }
        }
        if (flag) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Sorry~");
        }
    }
}
