package day15;

@FunctionalInterface
public interface Command {
	void exec(); //얘는 오버라이딩 강제야
	default public void check() { //default는 안해도 돼
		System.out.println("췍! Check!");
	}
}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");	
	}
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");	
	}
}