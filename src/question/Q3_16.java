package question;

import java.util.Scanner;

public class Q3_16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		System.out.print("整数値b:");
		int b = stdIn.nextInt();
		System.out.print("整数値c:");
		int c = stdIn.nextInt();
		int med;

		if (a >= b) {
			if (b >= c) {
				med = b;
			} else if (a <= c) {
				med = a;
			} else {
				med = c;
			}
		} else if (a > c) {
			med = a;
		} else if (b < c) {
			med = b;
		} else {
			med = c;
		}
		System.out.println("中央値は" + med + "です。");
	}
}
