import java.util.Scanner;

public class LeapYear2 {
    /**
     * �����㷨:����һ�򣬰��겻���İ������� 2016 is leap year 1900 is not leap year 2000 is leap
     * year 1998 is not leap year
     */
    public static void main(String[] args) {
        int year;
        Scanner cin = new Scanner(System.in);
        year = cin.nextInt();
        cin.close();
        boolean leap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        System.out.println(leap);

    }
}