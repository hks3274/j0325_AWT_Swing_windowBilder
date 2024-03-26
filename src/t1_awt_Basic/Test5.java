package t1_awt_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//버튼만들기
@SuppressWarnings("serial")
public class Test5 extends Frame implements WindowListener, ActionListener {
	
	public Test5() { 
		super("AWT 프레임"); 
		setBounds(300,200,350,250); //윈도우창 크기와 위치를 조정할 수 있음 (x축, y축, 폭,높이) :픽셀단위
		
		//레이블 컨포넌트
		Label lbl1 = new Label("레이블 테스트입니다");
//		this.add(lbl1); //this 생략가능
		add(lbl1);
		
		Button btnExit =  new Button("종료");	
		add(btnExit);
	
		setVisible(true);	
		
		//리스너(윈도우 감지부분 처리)
		addWindowListener(this);
		
		//버튼 액션 리스너
		btnExit.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		new Test5();
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


	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); //실행종료 (윈도우창 닫기)
	}
	
}
