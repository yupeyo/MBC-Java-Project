package program;

import java.util.Scanner;

    public class CustomerManager2 {
	// Customer라는 
	
	// 기존에 사용했던 
    //count는 사용... 저장한 데이터의 크기 
    static int count;

	public static void main(String[] args) {
	static Scanner scan = new Scanner(System.in);
	while (true) {
	         System.out.printf("\n[Info] 고객 수 : %d, \n", count,);
	         System.out.println("메뉴를 선택해 주세요 : ");
	         System.out.println("(I)nsert, (S)elect,(U)pdate, (D)elete, (Q)uit");
	         System.out.print("메뉴 입력 : ");
	         String menu = scan.next();
	         mene = menu.toLowerCase();
	         
	         
	         
	         
		switch(menu.charAt(0)) {
		        case 'i':
		        case 'ㅑ':
		        	System.out.println("고객 정보 입력을 시작합니다.");
		           }               
		           break;
		        case 's':
		        case 'ㄴ':
		           System.out.println("고객 정보를 출력합니다.");
		           }
		           break;
		        case 'u':
		        case 'ㅕ':
		           System.out.println("다음 데이터를 수정합니다.");
		           
		           }
		           break;
		        case 'c':
		           System.out.println("현재 데이터를 출력합니다.");
		           
		           }
		           break;
		        case 'u':
		           System.out.println("데이터를 수정합니다.");
		           
		           }
		           break;
		        case 'd':
		           System.out.println("데이터를 삭제합니다.");
		           
		           }
		           
		           
		           break;
		        case 'q':
		           System.out.println("프로그램을 종료합니다.");
		           
		        default:
		        System.out.println("메뉴를 잘 못 선택했습니다.");
     }  
     }




}
