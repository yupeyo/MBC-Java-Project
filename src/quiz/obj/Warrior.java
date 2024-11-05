package quiz.obj;

public class Warrior extends Player {
	
	
	public Warrior() {}
	public Warrior(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Warrior(String name) {
		this (name, 1000, 500);
		
	}
	
	// 매개값 추가 ... Warrior, Wizzard 
	void bash(Player player) {
		if(mp < 100) {
			System.out.println("mp가 부족합니다.");
			return;
		}
		mp-= 100;
		
		if (player instanceof Warrior) {
			player.hp -= 100;
		}else if (player instanceof Wizzard) {
			player.hp -= 200;
		}
		player.hp -= 100; // hp -100 감소
		this.mp -= 50;
		System.out.println(player.name + "님 배쉬 스킬 적중");
		
	
	

	}
	
	@Override
	void action() {
		System.out.println("전사는 멋진 동작을 합니다.");
	}
	
}
