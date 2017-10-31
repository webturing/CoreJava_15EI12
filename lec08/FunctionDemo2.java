package lec08;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class FunctionDemo2 {
    //function with  a boolean return-value
    public static void main(String[] args) {
        boolean prime = isPrime(10);
        System.out.println(prime);

    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
