package t6_Swing;

import javax.swing.JFrame;


//스윙의 종료를 인터페이스를 이용.
public class Test1_Basic extends JFrame{
	
	public Test1_Basic() {
		super("스윙 연습");
		
		setBounds(300, 250, 300, 250);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test1_Basic();
	}

}
