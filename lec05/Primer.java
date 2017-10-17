package lec05;

public class Primer {

    public static void main(String[] args) {
        int n = 1000000007;
        boolean find = false;
        for (int i = 2; i <= 40000; i++) {
            if (n % i == 0) {
                find = true;
                break;
            }
        }
        if (find == false)
            System.out.println("It is a primer");
        else
            System.out.println("It is a compositor");
    }

}