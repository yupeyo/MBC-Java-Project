package ch4;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("A등급 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("B등급 회원입니다.");
			break;
		default:
			System.out.println("일반 회원입니다.");
			break;
			
		}
		
		switch (grade) {
		case 'A','a': {
			System.out.println("A등급 회원입니다.");
		}
		case 'B','b' : {
			System.out.println("B등급 회원입니다.");
		}
		default:
			System.out.println("일반 회원입니다.");
		}

	}

}
