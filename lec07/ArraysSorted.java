package lec07;

import java.util.Arrays;

public class ArraysSorted {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
