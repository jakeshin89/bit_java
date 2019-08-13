package day16;

public class Test02 {

	public static void main(String[] args) {
		
		System.out.println("  Main Start  ");
		
		String msg = null; //null일때와 data 넣었을 때 비교
		msg = "asfzcx"; // 헐 또 발생. 한 라인에서 여러개 발생할 수 있음
		
		try {
			System.out.println(msg.charAt(3));
			int num = Integer.parseInt(msg); //msg에서 숫자를 적었따면 숫자->문자 치환 이 이상의 뭐는 없음
		} catch (NullPointerException e) {
			System.out.println("예외가 발생했다 : "+e.getMessage());		//null
		} catch (StringIndexOutOfBoundsException e ) {
			System.out.println("예외가 또 발생했다 : "+e.getMessage());	//index
		} catch (NumberFormatException e) {		//exception은 모두의 아버지
			System.out.println("예외발생 : 정수로 입력해주세요");
		} finally {
			System.out.println("finally {자원 반납 코드}");
		}
		
		System.out.println("  Main End  ");
		

	}

}
