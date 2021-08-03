package question;

import java.util.Scanner;

public class Q3_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		System.out.print("整数値b：");
		int b = stdIn.nextInt();

		int diff = a >= b ? a - b : b - a;
		System.out.println("それらの差は" + (diff <= 10 ? "10以下" : "11以上") + "です");
	}

}
