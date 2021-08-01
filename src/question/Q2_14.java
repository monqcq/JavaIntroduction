package question;
import java.util.Scanner;
public class Q2_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("姓："); String lastName = stdIn.next();
		System.out.print("名："); String firstName = stdIn.next();
		System.out.println("こんにちは" + lastName + firstName + "さん。");
	}
}
