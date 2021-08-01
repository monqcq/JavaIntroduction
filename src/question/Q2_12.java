package question;
import java.util.Random;
import java.util.Scanner;
public class Q2_12 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		
		System.out.println("その値±5の乱数を生成しました");
		System.out.println("値は" + (x - 5 + rand.nextInt(11)) + "です");
	}
}
