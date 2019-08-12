package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp_Test {

	public static void main(String[] args) {		

		new Gui();

	}
}

class Gui extends JFrame{

	static int num = 0;
	
	BookMgr_a mgr;
	JButton add, list, delete, search, load, save, exit;
	TextField title, price, isbn;
	TextArea output;
	
	Gui(){
		
		mgr = new BookMgr_a(); 
		
		Panel p1 = new Panel();
			p1.add(add = new JButton("Add"));
			p1.add(list = new JButton("List"));
			p1.add(delete = new JButton("Delete"));
			p1.add(search = new JButton("Search"));
			p1.add(load = new JButton("Load"));
			p1.add(save = new JButton("Save"));
			p1.add(exit = new JButton("Exit"));
		add(p1, BorderLayout.SOUTH);
		
		Panel p2 = new Panel();
			p2.setLayout(new GridLayout(3, 2));	
			p2.add(new JLabel("ISBN"));
			p2.add(isbn = new TextField(20));		
			p2.add(new JLabel("제 목"));
			p2.add(title = new TextField(20));
			p2.add(new JLabel("가 격"));
			p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);
			
		add(output = new TextArea(15, 40));
		output.setFont(new Font(null, 1, 20));
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		list.addActionListener(e -> {
			output.setText(" * * * * Book List * * * * \n");
			mgr.booklist().forEach(i -> output.append(i+"\n"));
		});	
		
		add.addActionListener(e -> {
			int p = 0;
			try {
				p = Integer.parseInt(price.getText());
			} catch (Exception ea){
				output.setText("Book 등록 실패\n");
				output.append("가격에 문자를 포함할 수 없습니다.");
				output.append(ea.getMessage());
				return;
			}		
			boolean b = mgr.addBook(new Book(++num, title.getText(), Integer.parseInt(price.getText())));
			if(b) {
				output.setText("등록 성공");
			} else {
				output.setText("등록 실패");				
			}	
		});	
		
		delete.addActionListener((e) -> {
			//boolean r = mgr.deleteBook(title.getText());
			mgr.deleteBook(getTitle());
			
		});	
		
		search.addActionListener((e) -> {
			
		});	
		
		load.addActionListener((e) -> {
			
		});
		
		save.addActionListener((e) -> {
			mgr.saveBook();
			output.setText("저장 성공");
		});
		
		exit.addActionListener(e -> System.exit(0));	
		
	}
}	