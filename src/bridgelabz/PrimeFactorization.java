package bridgelabz;

import java.util.*;

public class PrimeFactorization {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
		}

		if (num > 2) {
			System.out.print(num);
		}

	}

}
