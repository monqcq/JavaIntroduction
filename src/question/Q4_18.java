package question;

import java.util.Scanner;

public class Q4_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値:");
		int n = stdIn.nextInt();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n約数は" + count + "個です");
	}
}
