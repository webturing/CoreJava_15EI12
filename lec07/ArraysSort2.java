package lec07;

import java.util.Arrays;

public class ArraysSort2 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, 0, a.length / 2);
        System.out.println(Arrays.toString(a));
    }
}
