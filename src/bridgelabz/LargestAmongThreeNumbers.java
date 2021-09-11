package bridgelabz;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		num2 = sc.nextInt();
		System.out.print("Enter Number 3 : ");
		num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is the largest number");
		}else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " is the largest number");
		}else {
			System.out.println(num3 + " is the largest number");
		}
	}

}
