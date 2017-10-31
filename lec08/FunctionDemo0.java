package lec08;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
public class FunctionDemo0 {
    //function without return-value
    public static void main(String[] args) {
        greeting();
        chat("tom");
    }

    private static void chat(String name) {
        System.out.println("hello, "+name);
    }


    private static void greeting() {
        System.out.println("hello");
        System.out.println("worlds");
    }


}
