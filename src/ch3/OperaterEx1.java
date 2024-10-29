package ch3;

public class OperaterEx1 {

	public static void main(String[] args) {
		// 부호 연산자
		// 변수의 부호를 유지하거나 변경...  +(부호 변경X, -(부호 변경)
		int a = 10;
		System.out.println("+ 부호 연산자 사용 결과 : "+(+a));
		System.out.println("+ 부호 연산자 사용 결과 : "+(-a));
		
		// ++(1씩 증가), --(1씩 감소)
		// 전치(증가/감소를 먼저 한 후에 변수처리) ex) ++a, --a
		
		
		
		
		System.out.println("++ 부호 연산자 사용 결과 : "+(++a));  //11
		System.out.println("-- 부호 연산자 사용 결과 : "+(--a));  //10
		System.out.println(a);
		// 후치 처리 결과
		System.out.println("++ 부호 연산자 사용 결과 : "+ a++);  //10출력, a값 1증가
		System.out.println("-- 부호 연산자 사용 결과 : "+ a--);  // 11출력, a값 1감소
		System.out.println(a);
		
		// 산술 연산자 
		// +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)
		int x = 10, y = 20;
		System.out.println("****산술 연산****");
		System.out.println(x + y);              //30
		System.out.println(x - y);              //-10
		System.out.println(x * y);              // 200
		System.out.println(x / y);              // 0 
		System.out.println(x / (double)y);      // 0.5
		System.out.println(x % y);              // 10
		// %(mod) 연산의 특징 ... 계산 결과는 우측 피연산자의 값의 범위에 있음.
		// x % 10 => 0,1,2,3,4,5,6,7,8,9
		// x % 3 => 0,1,2
		// 사용되는 곳이 배수관계, 난수 계산
		// 제곱 
		System.out.println(Math.pow(x, 3));  // x위치에 값, 3은 3승
		System.out.println();
		
		// 오버플로우 : 타입의 허용하는 최대값을 벗어나는 것 
		// 언더플로우 : 타입의 허용하는 최소값을 벗어나는 것 
		byte over = (byte)(127+1);
		System.out.println("오버플로우 결과 : " + over);
		byte under = (byte)(-128 - 1);
		System.out.println("언더플로우 결과 : "+ under);
		
		// 정확한 계산은 정수 연산을 통해서 작업...
		// 산술 연산을 정확하게 계산하기 위해서는 실수 타입으로 계산하지 안는게 좋음.
		int apple = 1; // 사과 개수
		double pieceUnit = 0.1; // 조각의 크기
		int number = 7; // 조각의 갯수
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		int result2 = apple * 10 -number * (int)(pieceUnit * 10);
		System.out.println("정수로 변환후 계산 : " + (double)result2/10);
		
		
		// 나눗셈 연산에서 예외
		// infinity(무한대), NaN(Not a Number)
		// 좌측은 정수이고, 우측 피연산자가 0인 경우. ArithmeticException 발생
		// 5 / 0.0 => 무한대
		// 5 % 0.0 => NaN
		// 이 두 가지의 경우에 연산은 수행하면 안됨. 
		// 무한대 혹은 NaN인지 확인하는 메서드...
		// Double.isInfinit()와 Double.isNaN() 메서드(함수)를 통해서 무한대 혹은 NaN인지
		// 확인이 가능함.
		System.out.println(Double.isInfinite((5/0.0))); // 무한대인지 여부 확인
		System.out.println(Double.isNaN(5%0.0));
		
		
		//비교 연산자
		// (동등비교) ==(같다), !=(다르다)
		// (크기비교) : <, <=, >, >=
		// 비교 결과는 boolean 타입으로 변환 -> true/false
		// 흐름 제어문인 조건문 if,반복문 for, while에서 실행의 흐름을 제어할 때 주로 사용
		
		x = 5; 
		y = 10;
		System.out.println("**** 비교 연산자 ****");
		System.out.println("x == y 결과 :" + (x == y));
		System.out.println("x != y 결과 :" + (x != y));
		System.out.println("x < y 결과 :" + (x < y));
		System.out.println("x <= y 결과 :" + (x <= y));
		System.out.println("x > y 결과 :" + (x > y));
		System.out.println("x >= y 결과 :" + (x >= y));
		
		// 문자열 비교시.... equals() 또는 !equals()를 ==, != 연산자 대신 사용
		System.out.println("문자열 비교-> test 와 test의 비교");
		System.out.println("test".equals("test"));
		System.out.println(!"test".equals("test"));
		
		// 논리 연산자 
		// 논리곱(&&)-and, 논리합(||)-or, 배타적 논리합(^), 논리 부정(!)
		// 비교 연산자와 같이 흐름제어를 위한 if, for, while에서 주로 사용함.
		System.out.println("**** 논리 연산자****");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false&& true); // shortcut 연산 (앞에가 false면 뒤에 수를 보지않음 = false = 0)
		System.out.println(false && false);
		System.out.println("결과"+ (x > y && ++x == 10));
		System.out.println(x);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println(10>>2);
		
		// 대입 연산자 
		// =-> 왼쪽변수에 오른쪽 연산자를 대임 
		// 복합 대입 연산자
		// +=,-=,/=,%=...
		// 왼쪽 피연사자 항에 두 피연산자의 연산결과를 저장!
		// a += 10 => a = a + 10
		
		// 삼항 연사자는 월요일에 
		
		
		
		
		
		
		
		
		
		
	}

}
