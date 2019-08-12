package day14;

public interface Command{
	public void exec();	 //메모리 못올라가서 exec 이 작업을 자식들이 수행해줄거야
	default public void check() {	//그냥 넣어버리면 오버라이딩 안해서 에러. 앞에 
	//인터페이스 안에는 (abstract)추상 메소드+디폴트 메소드 추가할 수 있으며, 
	// 얘는 인스턴스메소드도 아니며, 마치 static처럼 내부적으로 분류된다
	System.out.println("Command check() 함수");	
	}	//위 메소드를 필요한 애들에게만 오버라이딩(이라 하지만 그냥 메소드 복붙) 한당
}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Delete(삭제) 수행");		
	}
/*	public void check() {
		System.out.println("Command check() 함수");	
	}
*/	
}

class InsertCommand implements Command{
		@Override
		public void exec() {
			System.out.println("Insert(등록) 수행");		
		}
}

class UpdateCommand implements Command{
		@Override
		public void exec() {
			System.out.println("Update(수정) 수행");		
		}
}
	
class ListCommand implements Command{
		@Override
		public void exec() {
			System.out.println("List(목록) 수행");		
		}
}