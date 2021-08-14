package question;

import java.util.Scanner;

public class Q4_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数A:");
		int a = stdIn.nextInt();
		System.out.println("整数B:");
		int b = stdIn.nextInt();

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		do {
			System.out.print(a + "");
			a++;
		} while (a <= b);
	}
}
