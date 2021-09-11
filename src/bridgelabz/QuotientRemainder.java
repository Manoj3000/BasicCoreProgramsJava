package bridgelabz;

import java.util.*;

public class QuotientRemainder {
	public static void main(String[] args) {

		int dividend, divisor, quotient, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend value : ");
		dividend = sc.nextInt();
		System.out.print("Enter divisor value : ");
		divisor = sc.nextInt();
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;

		System.out.println("Quotient is = " + quotient);
		System.out.println("Remainder is = " + remainder);
	}
}
