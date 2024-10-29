package ch2;

public class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 캐스팅...
		// 어떤 변수 혹은 값을 다른 타입으로 변환하는 것을 의미함.
		// byte < short, char < int < long < float < double
		// 단, char는 자동으로 타입 변환이 안됨...
		byte a = 10;
		short b = a;     // byte a의 값을 b에 대입...
//		byte c = b;      // 에러 발생 -> type mismatch: cannot convert from short to byte
//		char d = a;      // 에러 발생 동일 char는 음의 정수가 없어서 바이트롤 가져 올 수 없음 
		int e = b;
		long l = e;
		float f = l;
//		long l2 = f      // 에러 발생: 정수에 실수 값을 대입 X
//		float f2 = 10.1  // 10.1은 double 데이터 형식의 상수 값 
		System.out.println(b);
		System.out.println(e);
		System.out.println(l);
		System.out.println(f);
		
		// 타입 캐스팅을 통해서 값을 억지로 넣을 수 있음....
		// 연산자 : (타입)
		byte c = (byte)b;       // 0000_0000_0000_1010 -> 0000_0000(X)0000_1010
		System.out.println(c);
		int i = 10000000;
		byte c1 = (byte)i;
		System.out.println(c1);
		
		float f1 = 1.234f;
		int i1 = (int)f1;
		System.out.println(i1);   //int는 소수점을 가져올수 없으니 float의 소수점은 int로 오면 소수점이 모두 사라진다. 
		                          //(int)정수는 소수점을 무시함 (float, double (실수)은 소수점 있음)
		
		// 연산식에서 타입 자동 변환 
		// 연산은 같은 타입으로 변환 후 계산...
		byte x = 10;
		byte y = 20;
		int result = x + y;
		byte result2 = (byte) (x + y);   // 연산 후 int가 아닌 경우에 캐스팅을 해야 합니다. 
		
		
		
		
		
		
		
		
		
		
		

	}

}
