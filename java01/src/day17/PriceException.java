package day17;

public class PriceException extends Exception {	//ioexception runtimeexception

	public PriceException() {
		super("Price Exception Occured : 음수 허용 안됨");
	}
	public PriceException(String msg) {
		super(msg);
	} //PriceException은 상속받는거잖아

}
