package t7_windowBilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Test2_textField extends JFrame {
	private JTextField txtMid, txtName, txtAge;
	private JButton btnSubmit, btnReset, btnExit;
	
	String regAge = "^[0-9]+&";
	private JPasswordField passwordField;
	
	public Test2_textField() {
		super("회원가입");
		setSize(600,480);
		getContentPane().setLayout(null);
		
		
		setBounds(100, 100, 500, 600);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(33, 10, 416, 61);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 392, 41);
		pn1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
//		lblNewLabel_1.setIcon(new ImageIcon("D:\\javaclass\\java\\works\\j0325_AWT_Swing_windowBilder\\myimages\\16.jpg"));
//		lblNewLabel_1.setIcon(new ImageIcon(Test2.class.getResource(".../myimages/15.jpg")));
		lblNewLabel_1.setIcon(new ImageIcon("./myimages/15.jpg"));
		lblNewLabel_1.setBounds(0, 0, 416, 61);
		pn1.add(lblNewLabel_1);

		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(33, 88, 416, 355);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		JLabel lblMid = new JLabel("아이디");
		lblMid.setForeground(new Color(0, 0, 0));
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		lblMid.setBounds(61, 51, 61, 25);
		pn2.add(lblMid);

		txtMid = new JTextField();
		txtMid.setBounds(166, 46, 209, 31);
		pn2.add(txtMid);
		txtMid.setColumns(10);

		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setForeground(new Color(0, 0, 0));
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		lblPwd.setBounds(42, 127, 80, 25);
		pn2.add(lblPwd);
		

		JLabel lblName = new JLabel("성명");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		lblName.setBounds(42, 203, 98, 25);
		pn2.add(lblName);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(166, 200, 209, 31);
		pn2.add(txtName);

		JLabel lblAge = new JLabel("나이");
		lblAge.setForeground(new Color(0, 0, 0));
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 20));
		lblAge.setBounds(42, 279, 98, 25);
		pn2.add(lblAge);

		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(166, 277, 209, 31);
		pn2.add(txtAge);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 110, 209, 44);
		pn2.add(passwordField);
		
		JLabel lblimge = new JLabel("");
		lblimge.setIcon(new ImageIcon(Test2_textField.class.getResource("/t7_windowBilder/images/16.jpg")));
		lblimge.setBounds(0, 0, 416, 355);
		pn2.add(lblimge);

		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(255, 255, 255));
		pn3.setBounds(33, 469, 416, 61);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		btnSubmit = new JButton("회원가입");
		btnSubmit.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		btnSubmit.setBounds(31, 19, 97, 23);
		pn3.add(btnSubmit);

		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		btnReset.setBounds(159, 19, 97, 23);
		pn3.add(btnReset);

		btnExit = new JButton("종료");
		btnExit.setIcon(new ImageIcon(Test2_textField.class.getResource("/t7_windowBilder/images/exit-button-icon.jpg")));
		btnExit.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 12));
		btnExit.setBounds(292, 19, 97, 23);
		pn3.add(btnExit);

		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// --------------------------아래쪽은 메소드-----------------------------------

		// 회원가입버튼
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMid.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
					txtMid.requestFocus();
				}

				else if (!passwordField.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요");
					txtMid.requestFocus();
				} 
				else if (txtName.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명를 입력하세요");
					txtMid.requestFocus();
				}
//				else if(txtAge.getText().trim().equals("")) {
//					JOptionPane.showMessageDialog(null, "나이를 입력하세요");
//					txtMid.requestFocus();
//					
//				}

				else if (!Pattern.matches(regAge, txtAge.getText().trim())) {
					JOptionPane.showMessageDialog(null, "나이를 입력하세요");
					txtMid.requestFocus();
				}
				else System.out.println("회원가입 완료");
			}
			
		});

		// 다시입력버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtName.setText("");
				txtAge.setText("");
				passwordField.setText("");
			}
		});

		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Test2_textField();
	}
}
