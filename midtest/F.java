package midtest;

import java.util.Arrays;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = cin.nextInt();
        a[1] = cin.nextInt();
        a[2] = cin.nextInt();
        Arrays.sort(a);
        System.out.println(a[1]);
        cin.close();
    }

}
