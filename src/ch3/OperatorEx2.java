package ch3;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 3항 연산자...
		// 3개의 피연산자 항을 통ㅇ해서 결과를 출력하는 연산자
		// (조건식) ? (참인경우 동작 연산시) : (거짓인 경우 동작 연산식);
		
		int x = 10;
		// 3항 연산식
		boolean result = (x == 10) ?  true : false;
		System.out.println("x는 10인가요? " + result);
		
		// 정수를 입력 받아... 짝수이면 짝수를 출력, 홀수이면 홀수를 출력
		// 하는 코드를 작성해 보세요... 
		// 입력은 Scanner를 사용해서 nextInt()를 통해서 값을 전달 받습니다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력");
		int num1 = sc.nextInt();
		//String str = "짝수" : "홀수"
		String str = (num1 % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("입력 값은 : "+ str);
		
		// 정수 입력 값이 3의 배수 이면서 짝수이면 그 값을 출력해 주세요 
		// ( num1 %3 == 0 && num1 % 2 ==0 )
		// ( num1 % 6 == 0 )
		int result2 = ( num1 % 3 == 0 && num1 % 2 == 0 ) ? num1 : 0;
		System.out.println("입력값이 3의 배수이면서 2의 배수인 경우의 값 : " +result2);
		
		
		
	}

}
