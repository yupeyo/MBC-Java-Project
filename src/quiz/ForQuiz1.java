package quiz;

public class ForQuiz1 {

	public static void main(String[] args) {
		// quiz1. 1 ~ 200 사이의 숫자 중에서 (2 또는 3의 배수)가 아닌 수 들의 총 합을 구하세요.
		//
		int sum = 0;
		for (int i = 1; i <= 200; i++) { //i ++ 2 (2씩 증가)
			if (i % 2 != 
					0  && i % 3 != 0) sum += i;
			
	        
		}
		System.out.println( "1~ 200 까지 숫자중 2,3의 배수를 제외한 수들의합: "+ sum );
	    
	    //quiz2. 랜덤 알파벳 대문자 50개를 생성해서 출력하는 프로그램을 만들어 보세요. 
		// 10줄 마다 줄바꿈도 실행해야 합니다.
		//    출력 예>  DFDQWAZCXV
		//            SADFSGWQVC
		//            ...
	    // 1. 사용하는 함수 (메서드) Math.random()을 활용해서 작업합니다.
		// 2. char 자료의 특징을 생각해서 작업을 진행합니다.
		//    - 정수 자료
		//    - 1글자 출력. (ASCII 코드 참조)
		
		char a = 'a';
		int b = 66;
		int z = 90;
		System.out.printf("a의 코드 값 : %d \n", (int)a);
		System.out.printf("b의 코드 값 : %c \n", (char)b);
		System.out.printf("b의 코드 값 : %c \n", (char)z);
		
		int ran = (int)(Math.random()* 10);
		ran = (int)(Math.random()* 26);
		ran = (int)(Math.random()* 26) +65;
		// 영문자(대) -> 50개 생성...
		// 영문자 개수를 모를 경우 ... 
		int symbol_size = 'Z' - 'A' + 1; // 1을 넣는 이유는 첫수자는 없음으로 계산을 해서 +1을 해 준다.
		for(int i = 0; i < 50; i++) {
			int ch = 'A'+((int)(Math.random()*26));
			System.out.printf("%c", (char)ch);
			if (i % 10 == 9) System.out.println();
		}
			
		
		
	        
	    

	}

}
