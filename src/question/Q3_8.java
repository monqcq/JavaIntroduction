package question;

import java.util.Scanner;

public class Q3_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n > 0) {
			if (n % 5 == 0) {
				System.out.println("その値は５で割り切れます");
			} else {
				System.out.println("その値は５で割り切れません");
			}
		} else {
			System.out.println("正でない値が入力されました");
		}
	}
}
