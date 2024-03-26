package t5_Adapter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {
	Button btnPlayStop, btnExit;

	public Test2() {
		super("Adapter 연습..."); // 프레임의 제목 설정
		setLayout(new FlowLayout()); // 레이아웃 매니저 설정
		setBounds(300, 350, 300, 380); // 프레임의 위치와 크기 설정

		btnExit = new Button("종료"); // 종료 버튼 생성
		btnPlayStop = new Button("Play"); // 재생/정지 버튼 생성

		add(btnExit); // 종료 버튼을 프레임에 추가
		add(btnPlayStop); // 재생/정지 버튼을 프레임에 추가

		setVisible(true); // 프레임을 보이도록 설정

		// 재생/정지 버튼에 대한 액션 리스너
		btnPlayStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Button btnLabel = (Button) e.getSource();
				if (btnLabel.getLabel().equals("Play")) {
					btnLabel.setLabel("Stop");
					System.out.println("출발~");
				} else if (btnLabel.getLabel().equals("Stop")) {
					btnLabel.setLabel("Start");
					System.out.println("정지~");
				}
			}
		});

		// 윈도우 종료 이벤트를 처리하기 위한 윈도우 어댑터
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 창이 닫힐 때 애플리케이션 종료
			}
		});

		// 종료 버튼에 대한 액션 리스너
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0); // 종료 버튼을 클릭하면 애플리케이션 종료
			}
		});
	}

	public static void main(String[] args) {
		new Test2();
	}
}
