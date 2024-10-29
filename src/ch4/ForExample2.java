package ch4;

public class ForExample2 {

	public static void main(String[] args) {
		// 다중 for 
		// 2중 for문
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}for (int i = 0; i < 10; i++) {
			System.out.println("==================바깥쪽 반복문" +i);
			for (int j = 0; j < 10; j++) {
				System.out.println("------------안쪽 반복문"+i+"-"+j);
				for (int k = 0; k < 10; k++ ) {
					System.out.println("+++ 제일 안쪽 반복문"+i+"-"+j+"-"+k);
				}
			}
		}
		// 예제1. 구구단 출력해보자!!!
		// 2단 - 9단까지...
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("====="+dan+"====");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan+ "x" +gop+" = "+(dan*gop));
				//System.out.println("%d x %d = %d\n", dan, gop, dan*gop);
				
			
			    
			}
		}
		
		
		// 예제2. 구구단 출력하기 
		for(int dan = 2; dan <= 4; dan++) {
			System.out.println(dan+ "X" +dan+ " = " +(dan));
			for (int gop = 1; gop <= 4; gop++) {
				System.out.println(dan+ "X" +gop+ " = " +(dan*gop));
			}
		}
		
		//초기화 식에서 부동 소수점을 쓰는 float타입을 사용하지 않도록 주의
		for(float x = 0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
		}
			 

	}
	
	

}
