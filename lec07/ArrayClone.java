package lec07;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int[] b = a;//ǳ��¡
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0]++;
        System.out.println(Arrays.toString(b));
        //��¡1
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++)
            c[i] = a[i];
        //��¡2
        int[] d = a.clone();
        //��¡3
        int[] e = new int[]{1, 3, 4, 5, 6};

        e = a;//�ı����������


    }
}
