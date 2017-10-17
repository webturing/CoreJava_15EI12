package lec03;

/**
 * 理解块语句
 * 1. 一个；是一个块语句
 * 2. 一个if ifelse while for都是一个块语句
 * 3. 用{}括起来的所有语句构成一个块语句
 */
public class IfDemo {
    public static void main(String[] args) {
        int x = 3;
        if (x > 4) {
            ;
            System.out.println("Bingo");
            System.out.println("haha");
            System.out.println("haha");
            System.out.println("haha");
        } else {

        }

    }
}
