package t6_Swing;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Test7_BorderLayout2 extends Frame {
	Panel pn1;
	CheckboxGroup gender;
	Checkbox gender1, gender2;
	
	public Test7_BorderLayout2() {
		super("라디오 버튼 연습");
		
		setSize(300,300);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		
		pn1 = new Panel();
		gender = new CheckboxGroup();
		gender1 = new Checkbox("남자", gender, true); //( 레이블, 그룹명 ,선택유무)
		gender2 = new Checkbox("여자", gender, false);
		
		pn1.add(gender1);
		pn1.add(gender2);
		
		add(pn1);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Test7_BorderLayout2();
	}
}
