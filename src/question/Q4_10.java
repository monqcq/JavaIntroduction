package question;

import java.util.Scanner;

public class Q4_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;
		do {
			System.out.print("正の整数値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int factorial = 1;
		int i = 1;

		while (i <= n) {
			factorial *= i;
			i++;
		}

		System.out.println("iから" + n + "までの積は" + factorial + "です");
	}
}
