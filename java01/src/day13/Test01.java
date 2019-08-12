package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception{

		Calendar c = Calendar.getInstance(); //안돼; 막혀져있덩 그래서 .getinstance해야함.캘린더는 new가 안되네
		System.out.println(c);
		//System.out.println("2019년 "+Calendar.DAY_OF_YEAR+" 일쨰"); 상수화된 정보가 있다.
		String date = String.format("현재시간은 %tk시 : %tm분 : %ts초%n", c, c, c);
		System.out.println(date);
		
		System.out.printf("%f", Math.PI);
		String f = String.format("%f", Math.PI);
		System.out.println("----------------------------------");
		StringBuffer sb = new StringBuffer();
		//Formatter fm = new Formatter(sb);
		Formatter fm = new Formatter("sss.txt");	//내용을 저 파일에 넣을거야 근데 에러쓰?

		fm.format("현재시간은 %tk시 : %tm분 : %ts초%n", c, c, c);
		fm.format("%f %n", Math.PI);
		System.out.println(sb);
		fm.flush(); //버퍼에 있는 파일들을 저 파일로 내려줘
		
		System.out.println("Main End");
		
	}
}
