package ch6.obj;

public class Calculator {
	
	// 필드 (멤버 변수)
	int firstNumber;
	int secondNumber;
	
	// 생성자 (객체 생성시 멤버 변수의 초기화)
	public Calculator() {}  //기본 생성자... 
	
	// 멤버 초기화 생성자... 
	public Calculator(int firstNumber, int num2) {
		// this 는 해당 클래스(객체) 그 자체를 의미함.
		this.firstNumber = firstNumber;
		secondNumber = num2;
	}
	
	// Overload : 매개변수의 값을 가지고 메서드를 구분(타입, 갯수, 순서)
	public Calculator(int[] nums) {
		this.firstNumber = nums[0];
		this.secondNumber = nums[1];
	}
	
	// 메서드
	public void numsInfo() { // console화면에 필드값 출력... 
		System.out.println("firstNumber의 값 : " + firstNumber);
		System.out.println("secondNumber의 값 : "+ secondNumber);
	}
	

}
