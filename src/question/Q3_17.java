package question;

import java.util.Scanner;

public class Q3_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数a:");
		int a = stdIn.nextInt();
		System.out.print("整数b:");
		int b = stdIn.nextInt();

		if (a == b) {
			System.out.println("二つの値は同じです");
		} else {
			int min, max;
			if (a > b) {
				min = b;
				max = a;

			} else {
				min = a;
				max = b;
			}
			System.out.println("小さいほうの値は" + min + "です");
			System.out.println("大きいほうの値は" + max + "です");
		}
	}
}
