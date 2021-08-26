package question;

import java.util.Scanner;

public class Q4_19_ver2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("nの値：");
		int n = stdIn.nextInt();

		for (int i = 1, j = 1; i <= n; i++, j = i * i) {
			System.out.println(i + "の２乗は" + j);
		}
	}
}
