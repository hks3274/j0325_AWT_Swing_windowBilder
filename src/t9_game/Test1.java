package t9_game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Test1 extends JFrame {
	private JLabel lblImg1, lblImg2,lblImg3, lblImg4,lblCount;
	private JButton btnTotal, btn1, btn2, btn3, btn4, btnClose,btnRandom, btnExit;
	
	int img1Cnt,img2Cnt ,img3Cnt,img4Cnt;
	
	public Test1() {
		super("카드 횟수 맞추기");
		setSize(800, 480);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 59);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		btnTotal = new JButton("모두보기");

		btnTotal.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnTotal.setBounds(8, 10, 85, 39);
		pn1.add(btnTotal);

		btn1 = new JButton("1번보기");
		btn1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btn1.setBounds(101, 10, 85, 39);
		pn1.add(btn1);

		btn2 = new JButton("2번보기");
	
		btn2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btn2.setBounds(194, 10, 85, 39);
		pn1.add(btn2);

		btn3 = new JButton("3번보기");
		
		btn3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btn3.setBounds(287, 10, 85, 39);
		pn1.add(btn3);

		btn4 = new JButton("4번보기");
		
		btn4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btn4.setBounds(380, 10, 85, 39);
		pn1.add(btn4);

		btnExit = new JButton("종료");
		
		btnExit.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnExit.setBounds(683, 10, 65, 39);
		pn1.add(btnExit);

		btnRandom = new JButton("랜덤보기");
		
		btnRandom.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnRandom.setBounds(473, 10, 85, 39);
		pn1.add(btnRandom);

		btnClose = new JButton("모두닫기");
		
		btnClose.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnClose.setBounds(566, 10, 85, 39);
		pn1.add(btnClose);

		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 67, 760, 305);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(Test1.class.getResource("/t7_windowBilder/images/11.jpg")));
		lblImg1.setBounds(13, 10, 173, 285);
		pn2.add(lblImg1);
		lblImg1.setVisible(false);
		

		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(Test1.class.getResource("/t7_windowBilder/images/12.jpg")));
		lblImg2.setBounds(199, 10, 173, 285);
		pn2.add(lblImg2);
		lblImg2.setVisible(false);

		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(Test1.class.getResource("/t7_windowBilder/images/13.jpg")));
		lblImg3.setBounds(385, 10, 173, 285);
		pn2.add(lblImg3);
		lblImg3.setVisible(false);

		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(Test1.class.getResource("/t7_windowBilder/images/14.jpg")));
		lblImg4.setBounds(571, 10, 173, 285);
		pn2.add(lblImg4);
		lblImg4.setVisible(false);

		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 372, 760, 59);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		lblCount = new JLabel("1번 : 0         2번 : 0         3번 : 0         4번 : 0");
		lblCount.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setBounds(12, 10, 736, 39);
		pn3.add(lblCount);

		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// --------------------------아래쪽은 메소드-----------------------------------
		
		//모두보기
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDisplay();
				img1Cnt++; img2Cnt++; img3Cnt++; img4Cnt++; 
				displayCount();
			}
		});

		//1번보기
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				displayCount();
			}
		});
		//2번보기
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				displayCount();
			}
		});
		//3번보기
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				displayCount();
			}
		});
		//4번보기
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				displayCount();
			}
		});
		//모두닫기
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
			}
		});
		//랜덤보기
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randomNum = (int)(Math.random()*4)+1;
			
				if(randomNum == 1) {
					lblImg1.setVisible(true);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img1Cnt++;
				}
				else if(randomNum == 2) { 
					lblImg1.setVisible(false);
					lblImg2.setVisible(true);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img2Cnt++;
				}
				else if(randomNum == 3) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img3Cnt++;
				}
				else if(randomNum == 4) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(true);
					img4Cnt++;
				}
				
				displayCount();
			}
		});
		//종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	
	
	//카운트 레이블에 표시
	protected void displayCount() {
		lblCount.setText("1번 : "+img1Cnt+"              2번 : "+img2Cnt+"               3번 : "+img3Cnt+"               4번 : "+img4Cnt);
	}

	//모두 닫기 처리
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);
	}
	//모두 보기 처리
	protected void allDisplay() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}

	public static void main(String[] args) {
		new Test1();
	}
}
