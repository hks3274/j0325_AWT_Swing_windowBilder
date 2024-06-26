package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InsaMain extends JFrame {
	JButton btnInput,btnSearch,btnList,btnExit;
	
	public InsaMain() {
		super("인사관리메뉴");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 8, 760, 87);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("인사관리프로그램 (v1.0)");
		lblNewLabel.setFont(new Font("경기천년제목V Bold", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 760, 87);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 103, 760, 352);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(InsaMain.class.getResource("/t8_insa/images/16.jpg")));
		lblNewLabel_1.setBounds(0, 0, 760, 352);
		pn2.add(lblNewLabel_1);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 463, 760, 87);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("사원등록");
		btnInput.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		btnInput.setBounds(6, 24, 182, 53);
		pn3.add(btnInput);
		
		btnSearch = new JButton("개별조회");
		btnSearch.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		btnSearch.setBounds(194, 24, 182, 53);
		pn3.add(btnSearch);
		
		btnList = new JButton("전체조회");
		btnList.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		btnList.setBounds(382, 24, 182, 53);
		pn3.add(btnList);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("경기천년제목V Bold", Font.BOLD, 20));
		btnExit.setBounds(570, 24, 182, 53);
		pn3.add(btnExit);
	
		
		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// --------------------------아래쪽은 메소드-----------------------------------
		
	//사원등록 버튼을 키보드엔터키로 등록시 수행
			btnInput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					dispose();
					new InsaInput();
				}
			});
		
		
		//사원등록버튼을 마우스로 클릭시 수행
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaInput();
			}
		});
		
		//사원개별조회 키보드
			btnSearch.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					String name = JOptionPane.showInputDialog("검색할 성명을 입려하세요");
					InsaDAO dao =  new InsaDAO();
					InsaVO vo = dao.getNameSerch(name);
					
					if(vo.getName() == null) {
						JOptionPane.showConfirmDialog(null, "검색한 회원이 없습니다.");
					}else {
						dispose();
						new InsaSearch(vo);
					}
				}
			});
		
		
		//사원개별조회 마우스
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("검색할 성명을 입려하세요");
				InsaDAO dao =  new InsaDAO();
				InsaVO vo = dao.getNameSerch(name);
				
				if(vo.getName() == null) {
					JOptionPane.showConfirmDialog(null, "검색한 회원이 없습니다.");
				}else {
					dispose();
					new InsaSearch(vo);
				}
			}
		});
		
		//전체조회
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaList();
			}
		});
		
		
		//종료 키보드 엔터키 처리시 수행
			btnExit.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.exit(0);
				}
			});
		
		
		//종료 마우스 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		
	}
	
	public static void main(String[] args) {
		new InsaMain();
	}
}
