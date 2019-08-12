package day10;

public class D_caPhone extends CellPhone {

	String pixel;

	public D_caPhone(String model, String num, int chord, String pixel) {
		super(model, num, chord); //타입 상관없이 넣기
		//super.model = model;
		//super.number = num;
		//super.chord = chord;
		this.pixel = pixel;
		
	}
	
}
