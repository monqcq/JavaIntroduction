package question;
import java.util.Scanner;

public class Q2_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値は：");
		int x = stdIn.nextInt();
		
		System.out.println("10を加えた値は" + (x + 10) + "です");
		System.out.println("10を減じた値は" + (x - 10) + "です");
	}
}
