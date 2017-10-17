package lec06;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class Array1Demo {
    public static void main(String[] args) {
        int[] a = {1, 3, 4};
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++)//indexing
            System.out.println(a[i]);
        for (int i : a)//foreach
            System.out.println(i);
        System.out.println(Arrays.toString(a));//neat
        System.out.println(Arrays.toString(b));
    }
}
