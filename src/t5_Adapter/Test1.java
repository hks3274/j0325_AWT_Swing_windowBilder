package t5_Adapter;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Test1 extends Frame {
	Button btnExit;
	
	public Test1() {
		super("Adapter을 활용한 종료...");
		setBounds(300, 350, 300, 380);
		
		btnExit = new Button("종료");
		
		this.add(btnExit);
		setVisible(true);
		
		//Adqpter을 이용한 윈도우 종료 (익명이너 클래스)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//버튼 클릭시 익명클래스를 이용한 종료...
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		

	}
	
	public static void main(String[] args) {
		new Test1();
	}
}
