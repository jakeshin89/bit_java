package day21;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;

import javax.swing.JFrame;

public class Test06 {

	public static void main(String[] args) {
		
		new DrawImg();

	}

}

class DrawImg extends Frame{
	
	Image im;
	
	DrawImg(){
		super.setTitle("DrawImg");
		im = Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\pikachu.png");

		String[] fontlist = Toolkit.getDefaultToolkit().getFontList();
		Stream.of(fontlist).forEach(i -> System.out.println(i));
		
		setSize(500, 500);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false); 
				dispose(); 
				System.exit(0);
			}
		});
			
		repaint();//내부적으로 paint 메소드가 호ㅜㄹ 
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(im, 20, 20, this);
	}
	
}