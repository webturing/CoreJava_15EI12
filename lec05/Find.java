package lec05;

public class Find {

    public static void main(String[] args) {
        int n = 100;
        boolean find = false;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                find = true;
                break;
            }

        }
        System.out.println(find);
    }

}