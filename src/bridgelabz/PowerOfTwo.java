package bridgelabz;

public class PowerOfTwo {
	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]);
		int i = 0, total;

		if (0 <= num) {
			while (i <= num && i < 31) {
				total = (int) Math.pow(2, i);
				System.out.println("2^" + i + " : " + total);
				i++;
			}
		}else {
			System.out.println("You passed wrong value");
		}
	}
}
