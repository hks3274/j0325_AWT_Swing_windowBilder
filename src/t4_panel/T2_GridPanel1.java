package t4_panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T2_GridPanel1 extends Frame implements WindowListener, ActionListener{
	Button btnExit;
	Panel pn1, pn2, pn3;
	Label lbl1, lbl2, lbl3;
	
	public T2_GridPanel1() {
		super("GridPanel 연습");
		setLayout(new GridLayout(1,3));
		setBounds(400, 350, 400, 350);
		
		
		//첫번째 패널
		pn1 = new Panel();
		pn1.setBackground(Color.BLUE);
		pn1.setForeground(Color.WHITE);
		lbl1 = new Label("첫번째 패널"); 
		pn1.add(lbl1);
		add(pn1);
		
	//두번째 패널
		pn2 = new Panel();
		pn2.setBackground(Color.yellow);
		lbl2 = new Label("두번째 패널"); 
		pn2.add(lbl2);
		add(pn2);
		
	//세번째 패널
		pn3 = new Panel();
		pn3.setBackground(Color.MAGENTA);
		pn3.setLayout(new GridLayout(2,1));
		lbl3 = new Label("세번째 패널"); 
		btnExit = new Button("종료");
		pn3.add(lbl3);
		pn3.add(btnExit);
		add(pn3);
		
		
		
		setVisible(true);
		
		addWindowListener(this);
		btnExit.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new T2_GridPanel1(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) { System.exit(0);}
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
}
