package bridgelabz;

import java.util.*;

public class HeadTailsPercentage {

	public static void main(String[] args) {
		int heads = 0, tails = 0;
		double  headsPercent, tailsPercent;
		System.out.print("Enter number of times coin should flip : ");
		Scanner sc = new Scanner(System.in);
		int flips = sc.nextInt();
		int result = Integer.signum(flips);
		if (result == 1) {
			for (int i = 1; i <= flips; i++) {
				if (Math.random() < 0.5) {
					tails++;
				} else {
					heads++;
				}
			}
			headsPercent=(heads*100)/flips;
			tailsPercent=(tails*100)/flips;
			System.out.println("Heads : " +headsPercent);
			System.out.println("Tails : " +tailsPercent);
		} else if (result == -1) {
			System.out.println("Please enter positive number.");
		} else {
			System.out.println("You enter 0");
		}
	}
}
