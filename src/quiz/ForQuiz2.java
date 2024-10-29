package quiz;

import java.util.Scanner;

public class ForQuiz2 {

	public static void main(String[] args) {
		// 

		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * quiz... 다음과 같이 별찍기 하세요...
		 */
		
		//1)
		
		for (int i = 0; i < 5; i++) {
			//공백 찍기
			for (int j = 0; j < 5 - i - 1; j++) {
				
				System.out.print(" ");
			}
			// 별 찍기
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();			
			
		}// 2)
		System.out.println("====2========");
		for (int i = 0; i < 5; i++) { //0,1,2,3,4
			for(int j = 0; j < 5 - i; j++) { //회차 기대 값은 5,4,3,2,1  // i에 숫자를 넣었을때 
				System.out.print("*");
				
			}
			System.out.println();
		}//3) 
		System.out.println("===== 3 =====");
	      for (int i = 0; i < 5; i++) {  // 0, 1, 2, 3, 4
	         // 공백 찍기
	         // 반복 회차 : 0, 1, 2, 3, 4
	         for (int j = 0; j < i; j++ ) {  // 반복회차 : 0, 1, 2, 3, 4 
	            System.out.print(" ");
	         }
	         
	         // 별 찍기
	         for (int j = 0; j < 5 - i; j++) {  // 회차 기대 값은 5, 4, 3, 2, 1
	            System.out.print("*");
	         }
	         System.out.println();
	      }

	      
	      // # 4
	      System.out.println("==== 4 ====");
	      for (int i = 0; i < 5; i++) {
	         // 공백 찍기
	         for (int j = 0; j < 5 - i - 1; j++) {
	            System.out.print(" ");
	         }
	         // 별 찍기
	         for (int j = 0; j <= i*2; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      
	      // # 5
	      System.out.println("==== 4 ====");
	      for (int i = 0; i < 5; i++) {
	         // 공백 찍기
	         for (int j = 0; j < i ; j++) {
	            System.out.print(" ");
	         }
	         // 별 찍기
	         for (int j = 0; j < 2*5- (i*2)- 1; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	   }

	}

