package quiz.obj;

public class Warrior extends Player {
	
	public Warrior() {}
	public Warrior(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		
	}
	public Warrior(String name) {
		this(name, 1000, 500);
	}
	
	void bash() {
		System.out.println("때리기 스킬 사용");
	}
	
	@Override
	void action() {
		System.out.println("전사는 멋진 동작을 합니다.");
	}
}
