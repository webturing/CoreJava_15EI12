import java.util.Scanner;

public class LeapYear {
	/**
	 * 闰年算法:四年一闰，百年不闰，四百年再闰 2016 is leap year 1900 is not leap year 2000 is leap
	 * year 1998 is not leap year
	 */
	public static void main(String[] args) {
		int year;
		Scanner cin = new Scanner(System.in);
		year = cin.nextInt();
		cin.close();
		boolean leap;
		if (year % 4 == 0) {
			if (year % 100 != 0)
				leap = true;// bugs here
			else {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			}
		} else {
			leap = false;
		}

		System.out.println(leap);

	}
}