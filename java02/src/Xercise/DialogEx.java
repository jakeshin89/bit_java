package Xercise;

import java.awt.Dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class DialogEx extends JFrame {

	public DialogEx() {
		super("Dialog Test");
		
		JDialog d = new JDialog(this, "사용자 다이얼로그");
		//this는 frame owner는 dialog가 소속되는 frame
		
		setSize(200, 200);
		setVisible(true);
		
		d.setSize(200, 100);
		d.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		new DialogEx();

	}

}
