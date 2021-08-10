package question;

import java.util.Scanner;

public class Q3_21 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何月ですか：");
		int month = stdIn.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		default:
			System.out.println("そんな月はありません");
			break;
		}
	}
}
