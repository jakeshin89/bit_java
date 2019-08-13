package day18.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		
		Vector<Student> list = new Vector<Student>(5, 10); //()안에 사이즈 넣을 수 잇음(처음, 증가수)
		System.out.println(list.capacity()); //배열 저장공간
		System.out.println("size : "+list.size()); //자료 몇 개 들어왔니?
		//내부에 Student[] 만들어서 관리
		//ArrayList 부모가 List?
			list.add(new Student("최순실", 88, 99));
			//list에 Student 객체를 생성해야 하니 안에다가 생성
			list.add(new Student("박근해", 78, 59));
			list.add(new Student("정우라", 58, 69));			

		System.out.println("---------------");
		System.out.println(list.capacity());
		System.out.println("size : "+list.size());
			
			
		//System.out.println(list);	확인차 sysout 쓴거, 성적관리 어떻게 함? iterator로 하자
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			//이미 next해서 썼기 때문에 다시 처음부터 읽으려고 
			Student data = it.next();
			if(data.getAvg() >= 90) System.out.println(data);
		}
		
		System.out.println(list.contains(new Student("박근해", 78, 59)));
		//내부적으로 equals 메소드 없어서 비교 못함
		//equals()가 @Override 되어있어야 제대로 비교할 수 있음
		
		//C Update Read(search) Delete 기반으로 해야
		//홍길동 90 90 등록
		//list.add(new Student("홍길동", 90, 90));
		Student s1 = new Student("홍길동", 90, 90);
		boolean flag = list.add(s1);
		
		if(flag) System.out.println(s1+" 등록되었습니다.");
		else System.out.println(s1+" 등록되었습니다.");
		
		//홍길동 100 100으로 수정
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
				if(data.name.equals("홍길동")) {
				data.kor = 100;
				data.math = 100;
				data.setAvg();
				System.out.println(data+"수정되었습니다.");
				}
		}
		//근데 학생 이름이 같은 경우는 어떡함? 서로 구분할 key값(primary key) 있어야
		
		//삭제처리
		System.out.println("**** 학생 "+s1+" 정보삭제 ****");
		it = list.iterator();
		while(it.hasNext()) {
			Student data = it.next();
			if(data.equals(s1)) {
				it.remove();
				System.out.println(s1+" 삭제되었습니다.");
			}
		}
	
		//Sort
		
		Collections.sort(list);
		//목록 출력
		System.out.println("**** 학생 List 정보 출력****");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}
		
	}
}

