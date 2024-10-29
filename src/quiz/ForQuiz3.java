package quiz;

import java.util.Scanner;

public class ForQuiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		
		
		// 2. 입력 값 처리...
		System.out.print("줄 수를 입력해 주세요(홀수로 입력하세요) :");
		int dan = scan.nextInt();
		int sp = dan/2;
		int st = 1;
		boolean flag = true;
		
		// 다이아몬드 그리기 위한 for문...
		for(int i = 0; i < dan ; i ++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
				
			
				
		
		}scan.close();

	}

}
