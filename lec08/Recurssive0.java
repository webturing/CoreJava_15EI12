package lec08;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class Recurssive0 {
    static int factorial(int n){
        if(n<=1)
            return 1;
        return factorial(n-1)*n;
    }
    static int cnr(int n,int r){
        if(n==r||r==0)
            return 1;
        return cnr(n-1,r)+cnr(n-1,r-1);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++)
            System.out.println(String.format("%d!=%d",i,factorial(i)));
        for(int i=0;i<=5;i++)
            System.out.println(String.format("cnr(5,%d)=%d",i,cnr(5,i)));
    }
}
