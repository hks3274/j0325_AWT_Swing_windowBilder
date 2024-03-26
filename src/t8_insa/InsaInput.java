package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class InsaInput extends JFrame {
	private JTextField txtName;
	private JTextField txtAge;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	JRadioButton rdGenderMale, rdGenderFemale;
	JButton btnInput, btnReset, btnClose;
	JComboBox cbYY, cbMM, cbDD;
	
	InsaDAO dao = new InsaDAO();
	InsaVO vo =  null;
	int res = 0;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public InsaInput() {
		super("회원가입");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 9, 760, 77);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입 Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("경기천년제목V Bold", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 0, 760, 77);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 95, 760, 371);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblName = new JLabel("성   명");
		lblName.setFont(new Font("경기천년제목 Medium", Font.BOLD, 18));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(140, 40, 152, 41);
		pn2.add(lblName);
		
		JLabel lblAge = new JLabel("나   이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("경기천년제목 Medium", Font.BOLD, 18));
		lblAge.setBounds(140, 122, 152, 41);
		pn2.add(lblAge);
		
		JLabel lblGender = new JLabel("성   별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("경기천년제목 Medium", Font.BOLD, 18));
		lblGender.setBounds(140, 204, 152, 41);
		pn2.add(lblGender);
		
		JLabel lblIpsail = new JLabel("입사일");
		lblIpsail.setHorizontalAlignment(SwingConstants.CENTER);
		lblIpsail.setFont(new Font("경기천년제목 Medium", Font.BOLD, 18));
		lblIpsail.setBounds(140, 286, 152, 41);
		pn2.add(lblIpsail);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		txtName.setBounds(281, 50, 230, 28);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		txtAge.setColumns(10);
		txtAge.setBounds(281, 129, 230, 28);
		pn2.add(txtAge);
		
		rdGenderMale = new JRadioButton("남자");
		btnGroupGender.add(rdGenderMale);
		rdGenderMale.setFont(new Font("경기천년제목V Bold", Font.BOLD, 18));
		rdGenderMale.setBounds(281, 214, 85, 23);
		pn2.add(rdGenderMale);
		
		rdGenderFemale = new JRadioButton("여자");
		btnGroupGender.add(rdGenderFemale);
		rdGenderFemale.setSelected(true);
		rdGenderFemale.setFont(new Font("경기천년제목V Bold", Font.BOLD, 18));
		rdGenderFemale.setBounds(370, 214, 85, 23);
		pn2.add(rdGenderFemale);
		
		//년도/월/일 초기값 생성하기
		String[] yy = new String[25];
		String[] mm = new String[12];
		String[] dd = new String[31];

		int imsi = 0;
		for(int i = 0; i<yy.length; i++) {
			imsi = 2024 - i;
			yy[i] = imsi +"";
		}
		for(int i = 0; i<mm.length; i++) {
			mm[i] = (i+1)+"" ;
		}
		for(int i = 0; i<dd.length; i++) {
			dd[i] = (i+1)+"" ;
		}
		
		cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 20));
		cbYY.setBounds(257, 286, 97, 28);
		pn2.add(cbYY);
		
		cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 20));
		cbMM.setBounds(379, 286, 73, 28);
		pn2.add(cbMM);
		
		cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 20));
		cbDD.setBounds(474, 286, 73, 28);
		pn2.add(cbDD);
		
		JLabel lblNewLabel_1 = new JLabel("년");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(339, 286, 48, 28);
		pn2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("월");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(436, 286, 48, 28);
		pn2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("일");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(533, 286, 48, 28);
		pn2.add(lblNewLabel_1_1_1);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(22, 474, 760, 77);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("가입하기");
		btnInput.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		btnInput.setBounds(80, 25, 146, 42);
		pn3.add(btnInput);
		
		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		btnReset.setBounds(306, 25, 146, 42);
		pn3.add(btnReset);
		
		btnClose = new JButton("창 닫기");
		btnClose.setFont(new Font("경기천년제목 Medium", Font.PLAIN, 18));
		btnClose.setBounds(532, 25, 146, 42);
		pn3.add(btnClose);
		
		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// --------------------------아래쪽은 메소드-----------------------------------
		
		//가입하기
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText().trim();
				String age =  txtAge.getText().trim();
				String gender;
				String ipsail = cbYY.getSelectedItem()+"-"+cbMM.getSelectedItem()+"-"+cbDD.getSelectedItem();
				
				//유효성검사 해야한다.
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "성명을 입력하세요");
					txtName.requestFocus();
				}
				else if(!Pattern.matches("^[0-9]+$", age)) {
					JOptionPane.showMessageDialog(null, "나이는 숫자를 입력하세요");
					txtAge.requestFocus();
				}
				else {
					if(rdGenderMale.isSelected()) gender = "남자";
					else gender = "여자";
				//모든체크가 끝나면 DB에 새로운 사람을 등록한다.
					//회원 중복체크
					vo = dao.getNameSerch(name);
					if(vo.getName() != null) {
						JOptionPane.showMessageDialog(null, "이미 가입된 회원입니다. 다시 성명을 입력해 주세요");
						txtName.requestFocus();
					}
					else {
						//정상적으로 자료가 입력되었다면 vo에 값을담아서 DB에 저장한다.
						vo.setName(name);
						vo.setAge(Integer.parseInt(age));
						vo.setGender(gender);
						vo.setIpsail(ipsail);
						
						res = dao.setInsaInput(vo);
						
						if(res != 0) {
							JOptionPane.showMessageDialog(null, "회원에 가입되셨습니다");
							dispose();
							new InsaMain();
						}
						else {
							JOptionPane.showMessageDialog(null, "회원 가입 실패~~  다시 가입해 주세요");
							txtName.requestFocus();
						}
				}
				
				
					
					
				}
			}
		});
		
		//다시입력
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//종료
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaMain();
			}
		});
	}
	
//	public static void main(String[] args) {
//		new InsaInput();
//	}
}
