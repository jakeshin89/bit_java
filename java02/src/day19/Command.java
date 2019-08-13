package day19;

@FunctionalInterface
public interface Command {

	void exec();
	default public void print() {
		System.out.println("= = = = = = = = = = = = = =");
	}
}

//interface에는 추상메소드만, 추상메소드가 1개만 있으면 functional이고, 람다할 수 있음

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
	
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
	
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
	
}

class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("SelectCommand 수행");
	}
	
}