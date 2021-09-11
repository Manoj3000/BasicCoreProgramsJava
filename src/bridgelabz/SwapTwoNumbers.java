package bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int num1, num2, hold;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		num2 = sc.nextInt();

		System.out.println("Before swapping : " + num1 + "  " + num2);
		hold = num1;
		num1 = num2;
		num2 = hold;
		System.out.println("After swapping: " + num1 + "   " + num2);

	}

}
