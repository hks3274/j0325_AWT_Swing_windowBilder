package t1_awt_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//버튼만들기
@SuppressWarnings("serial")
public class Test4 extends Frame implements WindowListener {
	
	public Test4() { 
		super("AWT 프레임"); 
		setBounds(300,200,350,250); //윈도우창 크기와 위치를 조정할 수 있음 (x축, y축, 폭,높이) :픽셀단위
		
		setVisible(true);	
		
		addWindowListener(this);
	}
	
	
	public static void main(String[] args) {
		new Test4();
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
