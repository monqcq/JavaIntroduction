package question;

import java.util.Scanner;

public class Q4_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("何個表示しますか：");
		int n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

		System.out.println();
	}
}
