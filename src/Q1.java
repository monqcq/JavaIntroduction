
public class Q1 {
	public static void main(String[] args) {
		int num = 10;
		int count = 0;
		int add = 0;
		while (num >= 0) {
			if (num % 2 == 0) {
				System.out.println(num);
				add += num;
				if (num != 0) {
					count++;
				}
			}
			num--;
		}
		System.out.println("偶数の個数は" + count);
		System.out.println("偶数の合計値は" + add);
	}
}
