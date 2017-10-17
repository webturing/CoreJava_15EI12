package lec06;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key = 13;
        int pos = Arrays.binarySearch(arr, key);
        if (pos == -1)
            System.out.printf("NOT FOUND!");
        else
            System.out.println(String.format("%d appeared at pos %d.", key, pos));
    }
}
