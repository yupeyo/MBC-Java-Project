package ch4;

import java.util.Scanner;

public class ForDiamond {

	public static void main(String[] args) {
		// 
		/*흰트 : 공백, 별, 단(줄)
		 * 1. 홀수 줄수로 만들어야 완성됨.
		 * 2. 줄간 별의 갯수는 +2 또는 -2
		 * 3. 줄간 공백의 갯수의 차이는 +1, -1
		 * 4. 전체 줄 수의 반에 해당하는 위치까지 별이 +2씩 증가하고, 공백은 -1씩 감소합니다.
		 * 5. 전체 줄 수의 반 이상인 경우에는 별이 -2 씩 감소하고, 공백은 +1 씩 증가합니다. 
		 * 
		 */
		//  줄 수를 입력받아서 다이아몬드 별찍기...
		// 1. 객체 생성 (Scanner 객체 생성)
		Scanner scan = new Scanner(System.in);
		
		
		// 2. 입력 값 처리...
		System.out.print("줄 수를 입력해 주세요(홀수로 입력하세요) :");
		int dan = scan.nextInt();
		
		// 입력 값을 토대로 다이아몬드 별찍기 처리...
		// * 변수 선언 : sp(여백), st(별), dan(줄)
		// flag(boolean) - true(피라미드), false(역피라미드)
		int sp = dan/2;
		int st = 1;
		boolean flag = true;
		
		// 다이아몬드 그리기 위한 for문...
		for(int i = 0; i < dan ; i ++) {
			// 공백 찍기...
			for (int j = 0; j < sp; j++)
				System.out.print(" ");
			// 별 찍기
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			System.out.println();
			// 값의 변화
			// 피라미드인 경우... st += 2, sp -= 1
			// 역 피라미드인 경우 .. st -= 2, space += 1
			// 어떤 때까지 피라미드로? 아니면 역피라미드로 변환 할 것인지...
			if (i == dan/2) flag = false; 
			// st 와 sp 증감 변화... 
			if (flag) {
				sp -= 1; st += 2;
			}else {
				sp +=1; st -= 2;
			}
		}
		
		
		//3/ 객체 삭제
		scan.close();

	}

}
