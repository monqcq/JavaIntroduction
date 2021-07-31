package question;
import java.util.Scanner;

public class Q2_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		
		System.out.println("合計は" + (x + y) + "です");
		System.out.println("平均は" + (x + y) / 2 + "です");
		
	}
}
