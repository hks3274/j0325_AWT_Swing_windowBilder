package t1_awt_Basic;

import java.awt.Frame;

//Frame객체를 상속받아서 작업처리
public class Test2 extends Frame {
	
	//객체를 생성 시에 UI설계처리릃 한다.
	public Test2() { //기본생성자
//		setTitle("AWT 프레임"); //부모가 Frame이므로 상속받아서 메소드를 그냥 쓸 수 있음
		super("AWT 프레임"); //부모가 Frame이므로 상속받아서 메소드를 그냥 쓸 수 있음
		setSize(300, 250); 
		
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new Test2();
	}
}
