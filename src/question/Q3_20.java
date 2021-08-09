package question;

import java.util.Random;

public class Q3_20 {
	public static void main(String[] args) {
		Random rand = new Random();

		System.out.print("コンピューターが生成した手：");
		int hand = rand.nextInt(3);

		switch (hand) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		}
	}
}
