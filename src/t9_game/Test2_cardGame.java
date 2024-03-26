package t9_game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;

public class Test2_cardGame extends JFrame {
	
	public Test2_cardGame() {
		super("카드맞추기 게임");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(12, 10, 760, 63);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JButton btnStart = new JButton("게임시작");
		btnStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		btnStart.setBounds(12, 10, 152, 43);
		pn1.add(btnStart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/Chance.jpg")));
		lblNewLabel.setBounds(585, 10, 48, 43);
		pn1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/Chance.jpg")));
		lblNewLabel_1.setBounds(634, 10, 48, 43);
		pn1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/Chance.jpg")));
		lblNewLabel_1_1.setBounds(682, 10, 48, 43);
		pn1.add(lblNewLabel_1_1);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(12, 83, 760, 468);
		getContentPane().add(pn2);
		pn2.setLayout(new GridLayout(3, 6));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card2.jpg")));
		pn2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card2.jpg")));
		pn2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card3.jpg")));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card3.jpg")));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card4.jpg")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card4.jpg")));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_2);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test2_cardGame();
	}
}
