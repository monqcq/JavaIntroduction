package capsule;

public class Hero {
	private int hp;
	String name;
	Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
	}
}
