package t7_windowBilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class T5_comboBox_LIstBox extends JFrame {
	JButton btnCombo, btnExit, btnList1,btnList2 ;
	JComboBox comboJob;
	JLabel lblMsg;
	JTextArea txtMemo;
	
	public T5_comboBox_LIstBox() {
		super("콤보상자 연습");
		setSize(600, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel pn4 = new JPanel();
		pn4.setBounds(12, 379, 560, 72);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		lblMsg = new JLabel("메세지출력");
		lblMsg.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setBounds(0, 0, 560, 72);
		pn4.add(lblMsg);

		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 297, 560, 72);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		btnCombo = new JButton("콤보출력");
		btnCombo.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnCombo.setBounds(22, 10, 105, 52);
		pn3.add(btnCombo);
		
		btnExit = new JButton("종료");
		btnExit.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnExit.setBounds(443, 10, 105, 52);
		pn3.add(btnExit);
		
		btnList1 = new JButton("리스트\r\n상자출력1");
		btnList1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnList1.setBounds(139, 10, 126, 52);
		pn3.add(btnList1);
		
		btnList2 = new JButton("리스트\r\n상자출력2");
		btnList2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnList2.setBounds(277, 10, 126, 52);
		pn3.add(btnList2);

		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 273, 277);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("직업을 선택하세요");
		lblNewLabel.setFont(new Font("경기천년제목 Light", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 249, 26);
		pn1.add(lblNewLabel);

		comboJob = new JComboBox();
		comboJob.setModel(new DefaultComboBoxModel(new String[] { "학   생", "회사원", "군   인", "변호사", "의   사", "공무원", "기   타" }));
		comboJob.setBounds(12, 46, 249, 26);
		pn1.add(comboJob);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 82, 249, 185);
		pn1.add(scrollPane_1);
		
		txtMemo = new JTextArea();
		scrollPane_1.setViewportView(txtMemo);

		JPanel pn2 = new JPanel();
		pn2.setBounds(297, 10, 275, 277);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JList listJob = new JList();
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "군인", "공무원", "간호사", "역무원", "회계사", "판사", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob.setBounds(12, 10, 251, 103);
		pn2.add(listJob);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 138, 251, 129);
		pn2.add(scrollPane);
		
		JList listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "군인", "공무원", "간호사", "역무원", "회계사", "판사", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listJob2);

		
		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// --------------------------아래쪽은 메소드-----------------------------------
		
		//리스트상자출력1
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
//				Object[] job = listJob.getSelectedValues(); 
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				
				for(Object job : jobs) {
					msg += job +"/";
				}
				
				msg = msg.substring(0, msg.length()-1);
				
				lblMsg.setText(msg);
			}
		});
		
//		//리스트상자출력버튼2
//		btnList2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String msg = "";
//				Object[] jobs = listJob2.getSelectedValuesList().toArray();
//				
//				for(Object job : jobs) {
////					msg += job +"\n";
//				}
////				msg = msg.substring(0, msg.length()-1);
//				txtMemo.setText(msg);
//			}
//		});
		
		//리스트상자출력버튼2
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMemo.append(listJob2.getSelectedValue()+"\n");
			}
		});
		
		
		//콤보상자의 내용을 출력하는 버튼
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";
				lblMsg.setText(msg);
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
		new T5_comboBox_LIstBox();
	}
}
