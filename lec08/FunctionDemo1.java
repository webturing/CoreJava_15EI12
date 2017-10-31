package lec08;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class FunctionDemo1 {
    //function without return-value overload
    public static void main(String[] args) {
        greeting();
        greeting("tom");

    }

    private static void greeting(String tom) {
        System.out.println("hello "+tom);
    }


    private static void greeting() {
        System.out.println("hello worlds");
    }


}
