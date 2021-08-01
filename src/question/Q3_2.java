package question;

import java.util.Scanner;

public class Q3_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値：");
		int x = stdIn.nextInt();

		if (x >= 0) {
			System.out.println("その絶対値は" + x + "です");
		} else {
			System.out.println("その絶対値は" + -x + "です");
		}
	}
}
