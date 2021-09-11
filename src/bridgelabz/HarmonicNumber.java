package bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		int num;
		double harmonic = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			harmonic = harmonic + (1.0/i);
			System.out.println("Harmonic value = " + harmonic);
		}
	}

}
