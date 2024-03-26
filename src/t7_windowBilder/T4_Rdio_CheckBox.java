package t7_windowBilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class T4_Rdio_CheckBox extends JFrame {
	JCheckBox chHobby1, chHobby2, chHobby3, chHobby4;
	JRadioButton rdMale, rdFemale;
	JButton btnGender, btnExit, btnHobby;
	JLabel lblMsg;
	private final ButtonGroup btnGroupGender = new ButtonGroup();

	
	public T4_Rdio_CheckBox() {
		super("라디오/체크박스 연습");
		setSize(600, 480);
		
		
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 560, 50);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("라디오버튼/체크박스연습");
		lblNewLabel.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 560, 50);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 66, 560, 309);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblGender = new JLabel("성별");
		lblGender.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBounds(41, 58, 77, 34);
		pn2.add(lblGender);
		
		rdMale = new JRadioButton("남자");
		btnGroupGender.add(rdMale);
		rdMale.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		rdMale.setBounds(160, 66, 83, 23);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		btnGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		rdFemale.setBounds(247, 64, 92, 23);
		pn2.add(rdFemale);
		
		JLabel lblHobby = new JLabel("취미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		lblHobby.setBounds(41, 116, 77, 34);
		pn2.add(lblHobby);
		
		chHobby1 = new JCheckBox("등산");
		chHobby1.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		chHobby1.setBounds(160, 124, 77, 23);
		pn2.add(chHobby1);
		
		chHobby2 = new JCheckBox("낚시");
		chHobby2.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		chHobby2.setBounds(247, 124, 92, 23);
		pn2.add(chHobby2);
		
		chHobby3 = new JCheckBox("수영");
		chHobby3.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		chHobby3.setBounds(335, 124, 92, 23);
		pn2.add(chHobby3);
		
		chHobby4 = new JCheckBox("바둑");
		chHobby4.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		chHobby4.setBounds(431, 124, 92, 23);
		pn2.add(chHobby4);
		
		lblMsg = new JLabel("메세지출력");
		lblMsg.setBackground(new Color(255, 255, 255));
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 20));
		lblMsg.setBounds(41, 179, 482, 102);
		pn2.add(lblMsg);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 381, 560, 50);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		btnGender.setBounds(24, 10, 141, 30);
		pn3.add(btnGender);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		btnExit.setBounds(422, 10, 126, 30);
		pn3.add(btnExit);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		btnHobby.setBounds(177, 10, 148, 30);
		pn3.add(btnHobby);
		
		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// --------------------------아래쪽은 메소드-----------------------------------
		
		//성별출력
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMsg.setText("선택하신 성별은 "+ gender+ "입니다.");
			}
		});
		
		//취미출력
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hobby ="";
				
				if(chHobby1.isSelected()) Hobby += chHobby1.getText() +"/";
				if(chHobby2.isSelected()) Hobby += chHobby2.getText()+"/";
				if(chHobby3.isSelected()) Hobby += chHobby3.getText()+"/";
				if(chHobby4.isSelected()) Hobby += chHobby4.getText()+"/";
				
				Hobby = Hobby.substring(0,Hobby.length()-1);
				
				lblMsg.setText("선택하신 취미는? " + Hobby +" 입니다");
				JOptionPane.showMessageDialog(null, "선택된 취미는 "+Hobby+" 입니다");
				
			}
		});
		
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T4_Rdio_CheckBox();
	}
}
