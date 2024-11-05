package quiz.obj;

public class Quiz102 {

	public static void main(String[] args) {
		// 10-2
		Warrior w1 = new Warrior("강하친구");
		Wizzard W2 = new Wizzard("구르미");
		Warrior me = new Warrior("나의 캐릭터");
		
		Player[] target = new Player[2];
		target[0] = w1;
		target[1] = me;
		
		//w2의 블리자드를 5번 실행시키시오.
		for(int i = 0; i < 5; i++) {
//			W2.Blizzard(target);
			W2.Blizzard(new Player[] {w1,me});
			
		}

	}

}
