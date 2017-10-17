package lec06;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
