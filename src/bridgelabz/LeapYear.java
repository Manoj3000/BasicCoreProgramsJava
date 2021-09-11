package bridgelabz;

import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = scan.nextInt();

		int len = Integer.toString(year).length();

		if (len == 4) {
			double res = (year % 4);
			if (res == 0) {
				System.out.println(year + " is leap year");
			} else {
				System.out.println(year + " is not leap year");
			}
		} else {
			System.out.println("Enter only 4 digit value");
		}
	}
}
