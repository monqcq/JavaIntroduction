package question;

import java.util.Scanner;

public class Q4_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("何個＊を表示しますか：");
		int n = stdIn.nextInt();

		if (n > 0) {
			int i = 0;
			while (i < n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}
	}
}
