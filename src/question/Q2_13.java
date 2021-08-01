package question;

import java.util.Random;

public class Q2_13 {
	public static void main(String[] args) {
		Random rand = new Random();
		double x1 = rand.nextDouble();
		double x2 = rand.nextDouble() * 10.0;
		double x3 = -1.0 + rand.nextDouble() * 2;

		System.out.println("3個の整数を生成しました");
		System.out.println("0.0以上1.0未満：" + x1);
		System.out.println("0.0以上10.0未満：" + x2);
		System.out.println("-1.0以上1.0未満：" + x3);
	}
}
