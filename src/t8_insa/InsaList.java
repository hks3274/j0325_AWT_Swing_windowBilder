package t8_insa;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

@SuppressWarnings({"serial","rawtypes","unused"})
public class InsaList extends JFrame{
	private JTextField txtCondition;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JComboBox cbCondition;
	JButton btnExit,btnLIst,btnCondition,btnIpsailAsc,btnIpsailDesc;
	private JRadioButton rdFemale, rdMale;
	private JTable table;
	private Vector title, vData;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	InsaDAO dao = new InsaDAO();
	
	@SuppressWarnings("unchecked")
	public InsaList() {
		super("전체 조회");
		setSize(800,600);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// --------------------------------------------------------------
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 69);
		panel.add(pn1);
		pn1.setLayout(null);
		
		cbCondition = new JComboBox();
		cbCondition.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 18));
		cbCondition.setModel(new DefaultComboBoxModel(new String[] {"성명", "나이", "성별", "입사일"}));
		cbCondition.setBounds(17, 10, 122, 49);
		pn1.add(cbCondition);
		
		txtCondition = new JTextField();
		txtCondition.setBounds(146, 10, 213, 49);
		pn1.add(txtCondition);
		txtCondition.setColumns(10);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 18));
		btnExit.setBounds(632, 10, 116, 49);
		pn1.add(btnExit);
		
		btnLIst = new JButton("전체검색");
		btnLIst.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 18));
		btnLIst.setBounds(504, 10, 116, 49);
		pn1.add(btnLIst);
		
		btnCondition = new JButton("조건검색");
		btnCondition.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 18));
		btnCondition.setBounds(376, 10, 116, 49);
		pn1.add(btnCondition);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 89, 760, 373);
		panel.add(pn2);
		pn2.setLayout(null);
		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(0, 0, 760, 373);
//		pn2.add(scrollPane);
//		
//		table = new JTable();
//		scrollPane.setViewportView(table);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 472, 760, 69);
		panel.add(pn3);
		pn3.setLayout(null);
		
		rdFemale = new JRadioButton("여자");
		buttonGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 20));
		rdFemale.setBounds(19, 23, 71, 23);
		pn3.add(rdFemale);
		
		rdMale = new JRadioButton("남자");
		buttonGroupGender.add(rdMale);
		rdMale.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 20));
		rdMale.setBounds(107, 23, 71, 25);
		pn3.add(rdMale);
		
		btnIpsailAsc = new JButton("입사일 오름차순");
		btnIpsailAsc.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 18));
		btnIpsailAsc.setBounds(378, 16, 176, 38);
		pn3.add(btnIpsailAsc);
		
		btnIpsailDesc = new JButton("입사일 내림차순");
		btnIpsailDesc.setFont(new Font("경기천년제목V Bold", Font.PLAIN, 18));
		btnIpsailDesc.setBounds(566, 17, 182, 38);
		pn3.add(btnIpsailDesc);
		
		
		//JTable설계 
		title = new Vector<>();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		
		vData = dao.getInsaList("","");
		dtm =  new DefaultTableModel(vData, title);
		
		table = new JTable(dtm);
		table.setRowSorter(new TableRowSorter(dtm));
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 760, 373);
		
		pn2.add(scrollPane);
		//위쪽은 UI영역
	// ------------------------------------------------------------------------
		//아래쪽은 메소드 영역
		
		//전체검색(키보드 엔터)
			btnLIst.addKeyListener( new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					totalSearch();
				}
			});
		
		//전체검색(마우스 클릭)
		btnLIst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalSearch();
			}
		});
		
		//조건검색(키보드)
		btnCondition.addKeyListener( new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				conditionSearch();
			}
		});
		
		//조건검색처리(마우스)
		btnCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conditionSearch();
			}
		});
		
		//입사일 오름차순
		btnIpsailAsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("ipsail", "a");
				dtm.setDataVector(vData, title);
			}
		});
		
		//입사일 내림차순
		btnIpsailDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("ipsail", "d");
				dtm.setDataVector(vData, title);
			}
		});
		
		//종료 버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaMain();
			}
		});
		
	//------------------------------------------------------------------------
		setVisible(true);
	}
//	
//	public static void main(String[] args) {
//		new InsaList();
//	}
	
	//조건검색시 처리할 메소드...
	protected void conditionSearch() {
		String cbCondi = cbCondition.getSelectedItem().toString();
		String txtCondi = txtCondition.getText();
		
		if(txtCondi.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요");
			txtCondition.requestFocus();
			return;
		}
		if(cbCondi.equals("성명")) vData = dao.getConditionSearch("name", txtCondi);
		else if(cbCondi.equals("나이")) {
			if(!Pattern.matches("^[0-9]+$", txtCondi)) {
				JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요.");
			}else {
				vData = dao.getConditionSearch("age", txtCondi);						
			}
		}
		else if(cbCondi.equals("성별")) vData = dao.getConditionSearch("gender", txtCondi);
		else if(cbCondi.equals("입사일")) vData = dao.getConditionSearch("ipsail", txtCondi);
		
		dtm.setDataVector(vData, title);
		
	}
	
	//전체 검색 시 처리할 메소드
	protected void totalSearch() {
		vData = dao.getInsaList("", "");
		dtm.setDataVector(vData, title);
	}
	
}
