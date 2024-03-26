package t7_windowBilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Test1_Basic extends JFrame {
	private JTextField textName, textKor, textEng, textMat;
	private JButton btnInput, btnReset, btnExit;

	public Test1_Basic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("그린중학교 성적표");
		lblTitle.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(151, 62, 455, 42);
		getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("성명");
		lblName.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(177, 140, 125, 42);
		getContentPane().add(lblName);
		
		JLabel lblKor = new JLabel("국어점수");
		lblKor.setHorizontalAlignment(SwingConstants.CENTER);
		lblKor.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		lblKor.setBounds(177, 220, 125, 42);
		getContentPane().add(lblKor);
		
		JLabel lblMat = new JLabel("수학점수");
		lblMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMat.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		lblMat.setBounds(177, 380, 125, 42);
		getContentPane().add(lblMat);
		
		JLabel lblEng = new JLabel("영어점수");
		lblEng.setHorizontalAlignment(SwingConstants.CENTER);
		lblEng.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		lblEng.setBounds(177, 300, 125, 42);
		getContentPane().add(lblEng);
		
		textName = new JTextField();
		textName.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textName.setBounds(307, 140, 225, 29);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		textKor = new JTextField();
		textKor.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textKor.setColumns(10);
		textKor.setBounds(307, 220, 225, 29);
		getContentPane().add(textKor);
		
		textEng = new JTextField();
		textEng.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textEng.setColumns(10);
		textEng.setBounds(307, 300, 225, 29);
		getContentPane().add(textEng);
		
		textMat = new JTextField();
		textMat.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textMat.setColumns(10);
		textMat.setBounds(307, 380, 225, 29);
		getContentPane().add(textMat);
		
		btnInput = new JButton("입력");
		btnInput.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		btnInput.setBounds(149, 465, 125, 42);
		getContentPane().add(btnInput);
		
		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		btnReset.setBounds(343, 465, 125, 42);
		getContentPane().add(btnReset);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		btnExit.setBounds(530, 465, 125, 42);
		getContentPane().add(btnExit);
		
		//위쪽은 디자인
		setVisible(true);
		//아래쪽은 메소드
		
		//입력 버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//다시입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textKor.setText("");
				textEng.setText("");
				textMat.setText("");
				textName.requestFocus();
			}
		});
		
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "작업을 종료하시겠습니까? ","종료창", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new Test1_Basic();
	}
}
