package day09;

import java.util.Scanner;

public class BookApp_answer {
	public static void main(String[] args) {		

		BookMgr_a mgr = new BookMgr_a(10);
		
		Scanner scan = new Scanner(System.in);	//입력받을 준비. while 안에 있는거랑 밖에 있는거랑 다름
		String cmd;	//이렇게 빼서 변수선언 해도 좋아
		
		while(true) {
		System.out.println("\n****** 명령 선택 ******\n");
		System.out.println("1. Book Insert (도서등록)\n");
		System.out.println("2. Book Delete (도서삭제)\n");
		System.out.println("3. Book List (도서목록)\n");	
		System.out.println("4. Book Search (도서검색)\n");		//추가
		System.out.println("q. Quit (종료)\n");	
		System.out.println("********************\n\n");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요..");
				
		cmd = scan.nextLine().trim();

		switch (cmd.trim()) {	// 트림 한 번 더
		case "1":						// cmd에도 입력 받으니 여기에다가도 trim기능 추가할 수 있음
			System.out.println("도서등록 작업을 수행하는 기능을 호출합니다.");
			System.out.println("Book Title을 입력하세요.");
			String title = scan.nextLine();
			System.out.println("Book 가격을 입력하세요.");
			int price = scan.nextInt();
			scan.nextLine();	//남아있는 엔터코드 없애줘?
			mgr.addBook(new Book(title, price));
			break;

		case "2":
			System.out.println("도서삭제 작업을 수행하는 기능을 호출합니다.");
			System.out.println("삭제할 Book Title을 입력하세요.");
			title = scan.nextLine();
			mgr.deleteBook(title);
			break;

		case "3":
			System.out.println("도서목록 작업을 수행하는 기능을 호출합니다.");
			mgr.printBooklist();
			break;

		case "4":
			System.out.println("도서검색 작업을 수행하는 기능을 호출합니다.");
			System.out.println("검색할 title을 입력하세요.");
			title = scan.nextLine();
			mgr.searchTitleBook(title);
			//mgr.printBooklist();
			break;

		case "q":
			System.out.println("이 애플리케이션을 종료하려면 Q/q를 입력하세요.");
			String quit = scan.nextLine().trim();	//여기에서 입력 한 번 더 받아야 행
			
				if (quit.equals("q") || quit.equals("Q")) {		//스트링은 참조형으로 
					System.out.println("이 애플리케이션을 종료합니다.");
	
					scan.close();
					scan = null;	
					//return;
	
					System.exit(0); //프로세스 및 app 완전 종료
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