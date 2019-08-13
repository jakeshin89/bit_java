package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
			map.put("java01", "1234"); // id, pw
			map.put("java02", "1234");
			map.put("admin", "admin");
			map.put("test01", "test");
		
		for(int i=0 ; i<30 ; i++) {
			map.put("test"+i, (int)(Math.random()*3)+"aa");
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("로그인처리");
			System.out.println("아이디와 패스워드를 [아이디/패스워드] 형태로 입력하세요.");
			String data = sc.nextLine();
			// 슬래쉬(/) 기준으로 좌측 아이디, 우측 비밀번호
			String[] idpw = data.split("/");
			String id = idpw[0];
			String pw = idpw[1];
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break; //로그인 성공했으니 break
				} else {
					System.out.println("패스워드 불일치");
					System.out.println("다시 로그인하세요.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
				System.out.println("회원가입 후 이용하세요.");
			}
		}
		System.out.println("이제부터 서비스를 이용할 수 있습니다.");
	}

}
