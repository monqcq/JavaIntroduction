package question;
import java.util.Scanner;
public class Q2_15 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("住所：");
		String address = stdIn.nextLine();
		System.out.println("お住まいは" + address + "ですね。");
	}
}
