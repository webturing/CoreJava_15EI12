package lec06;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class Array2D {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
