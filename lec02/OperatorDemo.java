package lec02;

public class OperatorDemo {// Oper

    public static void main(String[] args) {
        //+ numeric operator 數值計算+
        System.out.println(3 + 4);
        System.out.println(3 + 4.0);
        //+ string join 串連接
        System.out.println("3" + "4");//"34"
        System.out.println(3 + "4");//"34"
        System.out.println("3" + 4);//"34"
        //
        System.out.println(3 + 4 + "");//"7"
        System.out.println("" + 3 + 4);//"34"

        System.out.println('3' + 4);
    }
}
