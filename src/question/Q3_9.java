package question;

import java.util.Scanner;

public class Q3_9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n > 0) {
			if (n % 10 == 0) {
				System.out.println("その値は１０の倍数です");
			} else {
				System.out.println("その値は１０の倍数ではありません");
			}
		} else {
			System.out.println("正でない値が入力されました");
		}
	}
}
