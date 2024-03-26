package t1_awt_Basic;

import java.awt.Frame;

//직접 Frame객체를 생성해서 작업처리
public class Test1 {
	public static void main(String[] args) {
		Frame frame =  new Frame();
		
		frame.setTitle("AWT 프레임"); //윈도우창제목
		frame.setSize(300, 250); //윈도우 창 크기 (가로, 세로) => 픽셀단위
		
		frame.setVisible(true); //화면에 보여달라 (true => 보여짐 , false => 안보여짐)
	}
}
