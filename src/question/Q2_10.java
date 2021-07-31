package question;

import java.util.Scanner;

public class Q2_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final double PI = 3.1416;
		System.out.println("球の表面積と体積を求めます");
		System.out.print("半径：");
		double r = stdIn.nextDouble();

		System.out.println("表面積は" + (4 * PI * r * r) + "です");
		System.out.println("体積は" + (4 / 3.0 * PI * r * r * r) + "です");
	}
}
