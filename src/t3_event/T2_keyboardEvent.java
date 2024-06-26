package t3_event;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T2_keyboardEvent extends Frame implements WindowListener, KeyListener {
	
	
	public T2_keyboardEvent() {
		super("키보드 이벤트 연습!");
		setBounds(300, 300, 300, 300);
		
		
		setVisible(true);
		
		addWindowListener(this);
		addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new T2_keyboardEvent();
	}
	
	
	//위도우 리스너를 위한 7개의 메소드(핸들러)	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}
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

	
	
	//키보드 리스너를 위한 3개의 메소드(핸들러)	
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("키보드 입력 중 : ");
	}

	//키보드를 눌렀을때
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드를 누르고 있습니다");
		System.out.println("입력된 키는? "+ e.getKeyChar());
	}
	
	//키보드를 눌렀다가 떼는 순간
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드를 눌렀다가 뗐습니다.");
	}
}
