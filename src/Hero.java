
public class Hero {
	String name; //名前の宣言
	int hp = 10; //HPの宣言
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
}
