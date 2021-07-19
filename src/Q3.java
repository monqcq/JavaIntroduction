
public class Q3 {
	public static void main(String[] args) {
		int[] array01 = new int[20];
		int num = 0;
		String num1 = "";
		String num2 = "";
		for (int i = 0; i < array01.length; i++) {
			array01[i] = num;
			num += 5;
		}
		System.out.print("奇数：");
		for (int e : array01) {
			if (e % 2 != 0) {
				num1 += (e + ",");
			}
		}
		System.out.print(num1.replaceAll(",$", ""));
		System.out.println("");
		System.out.print("偶数：");
		for (int e : array01) {
			if (e % 2 == 0 && e != 0) {
				num2 += (e + ",");
			}
		}
		System.out.print(num2.replaceAll(",$", ""));
	}
}
