package ch8;

public class MultiInterfaceImplEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new SmartTV();
		// RemoteControl 인터페이스에 선언된 추상 메서드만 호출 가능 
		rc.turnOn();
		rc.turnOff();
		
		// Searchable 인터페이스 변수 선언 및 구현 객체 대임
		Searchable searchable = new SmartTV();
		// Searchable 인터페이스에 선언된 추상 메서드만 호출가능 
		searchable.search("https://www.naver.com");
		

	}

}
