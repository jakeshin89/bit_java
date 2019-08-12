package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test05_Command {

	public static void main(String[] args) {
		// is a 관계 활용
		//Command delete = new DeleteCommand();
		//Command update = new UpdateCommand();
		//Command select = new SelectCommand();
		//Command insert = new InsertCommand();
		// 변수는 중복되면 안되니.. 마치 Map구조의 Key 느낌이 난다
		//String cmd = args[0]; //delete, update, select, insert 중 하나가 들어온다 생각하자
		
		//Map 구조로 설계하자
		Map<String, Command> map = new HashMap<String, Command>();
			map.put("delete", new DeleteCommand()); //이거는 콜렉션 위에 Command delete = new DeleteCommand(); 지워버리고 왼쪽처럼 쓰면 돼
			//put 하면, Key와 Value가 서로 binding되어서 저장됨.
			map.put("update", new UpdateCommand());
			map.put("select", new SelectCommand());
			map.put("insert", new InsertCommand());
			map.put("new", new Command() { //익명성?

				@Override
				public void exec() {
					System.out.println("기능 추가");
					
				}
				
			});
		
		//위 data들을 Map구조가 관리
			
		Scanner sc = new Scanner(System.in);
		System.out.println("insert, update, delete, select 중 하나만 입력하세요.");
		String cmd = sc.nextLine();

		Command command = map.get(cmd); // cmd에 넣은 key값에 해당하는 value 값을 불러오는 메소드
		if(command != null) command.exec();
		
/*		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("insert, update, delete, select 중 하나만 입력하세요.");
			String cmd = sc.nextLine();
		
		if(map.containsKey(cmd)) {
			System.out.println(cmd+"를 수행합니다.");
			break;
		} else {
			System.out.println("잘 못 입력했습니다.");
		}
		
		}
*/		
	}

}

