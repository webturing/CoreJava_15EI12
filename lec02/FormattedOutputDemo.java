package lec02;

public class FormattedOutputDemo {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.2f\n", pi);
        System.out.printf("%8.3f\n", pi);//method1:printf

        System.out.println(String.format("%8.3f", pi));//method2: better


    }
}
