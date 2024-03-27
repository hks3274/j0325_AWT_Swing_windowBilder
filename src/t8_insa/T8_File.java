package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class T8_File extends JFrame {
	private JFileChooser chooser;
	private JButton btnUpload, btnExit, btnDelete;
	private JLabel lblImg;
	private JScrollPane scrollPane;
	private JTable table;
	private Vector title, vData;
	private DefaultTableModel dtm;
	
	public T8_File() {
		super("파일처리 연습");
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 9, 560, 48);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		btnUpload = new JButton("그림업로드");

		btnUpload.setBounds(12, 10, 108, 28);
		pn1.add(btnUpload);

		btnDelete = new JButton("그림 삭제");
		btnDelete.setBounds(132, 10, 108, 28);
		pn1.add(btnDelete);

		btnExit = new JButton("종료");
		btnExit.setBounds(440, 10, 108, 28);
		pn1.add(btnExit);

		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 66, 560, 309);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		lblImg = new JLabel("사진이 출력됩니다.");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setBounds(253, 0, 307, 299);
		pn2.add(lblImg);
		
//		scrollPane = new JScrollPane();
//		scrollPane.setBounds(0, 0, 251, 309);
//		pn2.add(scrollPane);
//		
//		table = new JTable();
//		scrollPane.setViewportView(table);

		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 384, 560, 48);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		//JTable설계
		title = new Vector<>();
		title.add("경로/파일명");
		
		//폴더 안의 정보를 가져오기
		getForderInfor();
		
		dtm = new DefaultTableModel(vData, title);
		table = new JTable(dtm);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 251, 309);
		pn2.add(scrollPane);
		
		// ---------------------------------------------------

		setVisible(true);
		// ------------------------------------------------------
		
		
		
		// 그림 업로드
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//파일 다이얼로그 생성
				chooser = new JFileChooser();
				
				//파일 확장자 선별 출력처리....
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"JPG & GIF & PNG Images", "jpg", "gif","png");
				chooser.setFileFilter(filter);
				
				//파일 다이얼로그 박스 출력처리
				int res = chooser.showOpenDialog(null);
				
				if(res != chooser.APPROVE_OPTION) { //파일을 선택하지않고 닫거나 취소한 경우...
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않겠습니다","경고", JOptionPane.WARNING_MESSAGE);
				}
				else {
					//사용자가 파일을 선택하고 열기버튼을 누른경우 또는 선택한 파일명을 더블클릭한 경우
					String filePath = chooser.getSelectedFile().getPath(); //파일 경로명을 읽어온다.
					lblImg.setIcon(new ImageIcon(filePath));
					
					//파일을 업로드하기
					try {
						File imgFile = new File(filePath); //업로드 되는 파일의 위치정보+파일명
						String fileName = filePath.substring(filePath.lastIndexOf("\\")+1); //파일명 + 확장자
						String extension = filePath.substring(filePath.lastIndexOf(".")+1); //확장자
						
						BufferedImage image = ImageIO.read(imgFile);
						File file = new File("myImages/"+fileName); //서버에 저장되는 폴더+파일명
						if(!file.exists()) file.mkdir(); //폴더가 존재하지 않으면 폴더를 만들어준다.
						
						ImageIO.write(image, extension, file); //images를 file로 업로드시켜준다.
						System.out.println("파일명 : "+fileName);
						JOptionPane.showConfirmDialog(null, "image 업로드 완료!");
						
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});

		// 그림 삭제
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// 종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	//폴더 안의 파일 목록(정보)을 가져오는 메소드
	private void getForderInfor() {
		File forder =  new File("myImages");
		File[] files = forder.listFiles();
		
//		for (File f : files) {
//			System.err.println(f.getName());
//		}
		vData =  new Vector<>();
		if(files.length != 0) {
			for (int i = 0; i < files.length; i++) {
				System.out.println("파일("+(i+1)+") : "+files[i]);
				Vector vo = new Vector<>();
				vo.add(files[i]);
				
				vData.add(vo);
			}
		}
	}

	public static void main(String[] args) {
		new T8_File();
	}
}
