package question;

import java.util.Scanner;

public class Q4_13 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントアップします");

		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);

		for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}
	}
}
