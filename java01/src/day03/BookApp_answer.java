package day03;

import java.util.Scanner;

public class BookApp_answer {
	public static void main(String[] args) {		

		Scanner scan = new Scanner(System.in);

		String cmd;
		
		while(true) {
			
		System.out.println("****** 명령 선택 ******");
		System.out.println("1. Insert (등록)");
		System.out.println("2. Delete (삭제)");
		System.out.println("3. Update (수정)");	
		System.out.println("4. Quit (종료)");	
		System.out.println("********************");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요..");
				
		cmd = scan.nextLine().trim();
		
		switch (cmd.trim()) {	//여기도 trim 해주는군
		case "1":				// cmd에도 입력 받으니 여기에다가도 trim기능 추가할 수 있음
			System.out.println("등록 작업을 수행하는 기능을 호출합니다.");
			break;
		case "2":
			System.out.println("삭제 작업을 수행하는 기능을 호출합니다.");
			break;
		case "3":
			System.out.println("수정 작업을 수행하는 기능을 호출합니다.");
			break;
		case "4":
			System.out.println("이 애플리케이션을 종료하려면 Q/q를 입력하세요.");
			String quit = scan.nextLine().trim();	//여기에서 입력 한 번 더 받아야 행. blank 자유로운 문자 입력시 trim 강추.
			
			if (quit.equals("q") || quit.equals("Q")) {		//스트링은 참조형으로 
				System.out.println("이 애플리케이션을 종료합니다.");

				scan.close(); // scan 연결 끊고
				scan = null;	 // 연결 끊겨서 데이터 못받아. 
				//return;	//메인 메소드 안에 있기 때문에 앱 종료가 됨

				System.exit(0); // 프로세스 죽는 App 자체 종료
				//break;					
			}
			break;			
		default:
			System.out.println("다시 입력하세요.");
			break;
		}
		//메인함수 내에서 return은 앱 종료
		System.out.println("=============================================");

		}
		
	}

}	