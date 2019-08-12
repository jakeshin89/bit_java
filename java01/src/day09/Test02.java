package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test02 {

	public static void main(String[] args) {
		String msg = "JAVA Programinning/23000";
		//슬래시(/) 기준으로 잘라내고 싶은데... 밑에처럼 위치 확인하고 뒤에값 뽑으면 돼
		System.out.println(msg.indexOf("/"));	//msg에서(.) "/"의 위치(자리)는? n째 자리인지
		
		String d1 = msg.substring(0, msg.indexOf("/"));	//파라미터값은 인덱스, 인덱스는 주소. 이건 0째 자리부터 18째 자리까지이지만 마지막 end는 반영 않네 
		String d2 = msg.substring(msg.indexOf("/")+1); // begin, 시작위치는 포함
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println();
		
		String url = "http://192.168.0.124:8080/web1/list.do";
		System.out.println(url.indexOf("/"));
		System.out.println(url.lastIndexOf("/"));	//맨 마지막 슬래시 위치
		System.out.println(url.substring(url.lastIndexOf("/")));

		System.out.println(url.contains("web1"));	//문자열 포함하고 있는지, boolean 타입
		System.out.println();
		
		//String data = "20190001/홍길동/100/90/95"; // 이 데이터 기반으로 배열로 쪼개보기
		String data = "2019001_ 홍길동/ 90_ 70/100";
		System.out.println(data);	//구분자 지맘대로네 ㅇㅅㅇ 일관되게 바꿔야지
		System.out.println(data.replace('_', '/')); //헤헿 바꿨따
		System.out.println(data);	//헐 바뀐거 적용 안됐네? ㅇㅅㅇ immutable!
		System.out.println(data = data.replace('_', '/')); //이식
		System.out.println(); //성공
		
		String[] sdata = data.split("/"); // 슬래시(/) 
		System.out.println(Arrays.toString(sdata));
		
		data = "2019001 _ 홍길동 / 90_ 70/100 ";
		StringTokenizer st = new StringTokenizer(data, " _/"); //(data 값을 /_ 기준으로 쪼개줭 ""여기 안에 2개 이상도 가능! blank 살려서 쪼개네 ㅇㅅㅇ
		System.out.println(st.countTokens()); //구분자 안줬을 때 결과값 3. 변수 타입 st니까 쩜 직으면 자동으로 관련 매소드 호출
		System.out.println();
		
		while (st.hasMoreElements()) {	//원소가 잇는동안(갯수만큼) 루프돌거야
				System.out.print(st.nextToken()+", ");	//구분자 안주면 지맘대로임, 그냥 추출하는 함수네
		}
		
	}

}
