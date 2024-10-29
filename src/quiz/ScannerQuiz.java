package quiz;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.print("이름");
		String name = scan.next();
		System.out.print("나이");
	    int age = scan.nextInt();
	    scan.nextLine();
	    System.out.print("전화번호");
	    String tel = scan.nextLine();
		System.out.print("키");
	    double hight = scan.nextDouble();
	    System.out.print("몸무게");
	    int weight = scan.nextInt();
	    System.out.print("========== 출력 결과 ==========\n");
	    System.out.println("이름 : " +name);
	    System.out.println("나이 : "+age);
	    System.out.println("Tel : "+tel);
	    System.out.println("키 : " + hight);
	    System.out.println("몸무게 : " +weight);
	    
	    
	    
	    
	   
	    
	    
	    
	    
		
		
		
	}

}
