package lec07;

import java.util.Scanner;

public class P1159 {//BUGS

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        int max, min, sum;
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        double score = (sum - max - min) / (arr.length - 2);
        System.out.println(String.format("%.2f\n", score));


        cin.close();
    }
}
