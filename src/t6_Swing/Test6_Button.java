package t6_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//화면 중앙에 윈도우 정렬 /윈도우 크기 고정
public class Test6_Button extends JFrame {
	JButton btnExit;
	
	public Test6_Button() {
		super("컴포넌트 연습");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setResizable(false);
		
		btnExit = new JButton("종료");
		add(btnExit);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new Test6_Button();
	}
}
