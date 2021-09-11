package bridgelabz;

import java.util.*;

public class HeadTailsPercentage {

	public static void main(String[] args) {

		int heads = 0, tails = 0;
		double headPer, tailPer;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter flips : ");
		int flips = scan.nextInt();

		int ans = Integer.signum(flips);

		if (ans == 1) {
			for (int i = 1; i <= flips; i++) {
				if (Math.random() > 0.5) {
					heads++;
				} else {
					tails++;
				}
			}
			headPer = (float) ((heads * 100) / flips);
			tailPer = (float) ((tails * 100) / flips);
			System.out.println("Heads :" + headPer + " \nTails: " + tailPer);
		}else if (ans == -1) {
			System.out.println("Dont Enter Negative Number");
		}else{
			System.out.println("You Entered 0");
		}

	}
}
