package Xercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		int var = 50;

		try {
			
			System.out.println("정수 입력 : ");
			int data = new Scanner(System.in).nextInt();
			
			System.out.println(var/data);
		} catch (InputMismatchException e) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 순 없죠?");
		} catch (Exception e) { //얘는 예외 중 가장 상위 클래스
			System.out.println("Exception!");
		}
		
		System.out.println("프로그램 종료!");
		
	}
}