package day18.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		String[] name1 = {"이순신", "김순신" ,"최순실", "강순신"};
		//System.out.println(name1); 이건 주소찍힘. 그림으로 이해
		System.out.println(Arrays.toString(name1)); //기본 배열 나열
		Arrays.sort(name1); 						
		
		//배열 sort
		System.out.println(Arrays.toString(name1)); //sort된 배열 나열
		System.out.println();

		//String[] name1 = new String[100];
		//int index = 0;
		//name1[0] = "홍길동";
		//count++;
		//오 이렇게 하면 빡세;;; 어떻게 일일이 다 쳐서 관리해
		
		//name[100] = "~~"; 이러면 죽기 때문에 자동적으로 사이즈 관리해줄 List!
		
		List<String> list = new ArrayList<String>();
			list.add("김길동");
			list.add("이길동");
			list.add("한길동");
			list.add("박길동");
			list.add("홍길동");
			list.add("나길동");
			list.add("홍길동");
		//List는 중복 허용
			
		System.out.println("순서대로 넣은 list "+list);
		Collections.sort(list);		//collect sort
		System.out.println("정렬처리한 list "+list);
	
		List<String> list2 = new ArrayList<String>(list.subList(1, 4)); //4는 포함 안하는 1-3까지 3개
		System.out.println(list2);
		
		//Object[] Type
		Object[] obj = list.toArray();
		System.out.println("obj => "+Arrays.toString(obj));
		
		//String[] Type 내가 원하는 타입으로 api 적용해서 함
		String[] obj2 = new String[list.size()];
		list.toArray(obj2);
		System.out.println("obj2 => "+Arrays.toString(obj2));
		
		//배열이 arraylist로 형변환
		String[] sss = {"111", "999", "777", "333"};
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss));
		System.out.println(sslist);
		
		System.out.println(" ==== list 다루기 ==== ");
		System.out.println(list);
		System.out.println(list.contains("홍길동"));
		System.out.println(list.contains("김길동"));
		System.out.println(list.contains("아길동"));
		
		//배열기반이기때문에 위치인덱스 가지고 있음
		
		//전통적 방식
		for (int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		//새로 나온 enhanced for roof
		for (String data: list) {
			System.out.println(data+"  ");
		}
		System.out.println();
		
		Iterator<String> it = list.iterator();
		//list 순회하려면 앞으로 얘 써!
		while(it.hasNext()) { //데이터가 있는 동안 계속 돌릴거야
			String data = it.next();
			if(data.equals("홍길동")) {
				System.out.println("(홍길동)이 삭제되었습니다."); //홍길동이 2명이었어;;
				it.remove();
			}
		}
		System.out.println(list);
	}
	
}
