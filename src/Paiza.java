import java.util.Scanner;
public class Paiza {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("表示させたい文字：");
		String str = stdIn.nextLine();
		
		for(int j = 1; j <= 3; j++) {
			if(j == 2) {
				System.out.print('+' + str + '+');
			}else {
				for(int i = 1; i <= str.length() + 2; i++) {
					System.out.print('+');
				}							
			}
			System.out.println();
		}
//		System.out.println("\n+" + str + '+');
//		for(int i = 1; i <= str.length() + 2; i++) {
//			System.out.print('+');
//		}
	}
}
