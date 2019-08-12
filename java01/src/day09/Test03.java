package day09;

import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		String msg = "";		
		msg = msg+"Hello "+new Date()+" Java" +" Test."+'A'+89;
		System.out.println(msg);
		// 성능떨어져
		
		String msg2; //뭐라 정의 안함
		//String ms2 = ""; 위랑 동일함
		
		//StringBuffer sb = new StringBuffer(); //String과 SB는 다름
		StringBuilder sb = new StringBuilder(); // 버퍼와 똑같이 작동
			sb.append("Hello ");
			sb.append(new Date());
			sb.append(" Java");
			sb.append(" Test.");
			sb.append('A');
			sb.append(89);
			
		//msg2 = sb.toString(); //스트링으로 형변환
		msg2 = new String(sb); // 아까 API에서 본 생성자 함수 이용해서 메모리에 띄우고 정의하기
		System.out.println(msg2);
		
		
		
	}

}
