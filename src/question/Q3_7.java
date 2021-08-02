package question;

import java.util.Scanner;

public class Q3_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("変数a:");
		int a = stdIn.nextInt();
		System.out.print("変数b:");
		int b = stdIn.nextInt();

		if (a > b) {
			System.out.println("aの方が大きいです");
		} else if (a < b) {
			System.out.println("bの方が大きいです");
		} else {
			System.out.println("aとbは同じ値です");
		}
	}
}
