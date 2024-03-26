package t1_awt_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//종료버튼 처리...(인터페이스 이용~~)
@SuppressWarnings("serial")
public class Test3 extends Frame implements WindowListener {
	
	public Test3() { 
		super("AWT 프레임"); 
		setSize(300, 250); 
		
		setVisible(true);	
		
		addWindowListener(this);
	}
	
	
	public static void main(String[] args) {
		new Test3();
	}

//======================================================================
	@Override
	public void windowOpened(WindowEvent e) {}


	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //실행종료 (윈도우창 닫기)
	}


	@Override
	public void windowClosed(WindowEvent e) {}


	@Override
	public void windowIconified(WindowEvent e) {}


	@Override
	public void windowDeiconified(WindowEvent e) {}


	@Override
	public void windowActivated(WindowEvent e) {}


	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
