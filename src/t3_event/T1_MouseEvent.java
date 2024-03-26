package t3_event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T1_MouseEvent extends Frame implements WindowListener, MouseListener {
	
	
	public T1_MouseEvent() {
		super("마우스 이벤트 연습!");
		setBounds(300, 300, 300, 300);
		
		
		setVisible(true);
		
		addWindowListener(this);
		addMouseListener(this);
	}
	
	public static void main(String[] args) { 
		new T1_MouseEvent();
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

	
	//마우스 리스너를 위한 5개의 메소드(핸들러)
	//마우스 클릭했을때(이게 먼저 일어남)
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭했을때(이게 먼저 일어남)...");
	}
	//마우스를 클릭하는 순간
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스를 클릭하는 순간...");
	}
	//마우스가 클릭하고 놓는 순간
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스가 클릭하고 놓는 순간...");
	}
	//마우스가 객체안으로 들어갈때(진입할때)
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 객체안으로 들어갈때(진입할때)...");
	}
	//마우스가 객체밖으로 나갈때
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 객체밖으로 나갈때...");
	}
	
}
