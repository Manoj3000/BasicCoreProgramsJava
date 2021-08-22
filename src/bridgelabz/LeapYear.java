package bridgelabz;

import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		System.out.print("Enter year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int length = (int) (Math.log10(year) + 1);
		if(length == 4) {
			double res = (year % 4);
			if (res == 0)
				System.out.println(year + " is leap year");
			else
				System.out.println(year + " is not leap year");			
		}else {
			System.out.println("Please enter 4 digit number");
		}
	}
}
