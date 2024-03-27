package t9_game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Test2_cardGame extends JFrame {
	JButton btnStart;
	JLabel lblCard1, lblCard2, lblCard3, lblCard4, lblCard5, lblCard6, lblCard7, lblCard8, lblCard9, lblCard10, lblCard11,
			lblCard12;
	JLabel lblChance1, lblChance2, lblChance3;
	String imgs[] = { "/t9_game/images/card2.jpg", "/t9_game/images/card2.jpg", "/t9_game/images/card3.jpg",
			"/t9_game/images/card3.jpg", "/t9_game/images/card4.jpg", "/t9_game/images/card4.jpg",
			"/t9_game/images/card5.jpg", "/t9_game/images/card5.jpg", "/t9_game/images/card6.jpg",
			"/t9_game/images/card6.jpg", "/t9_game/images/card7.jpg", "/t9_game/images/card7.jpg" };
	ArrayList<String> imgNum = new ArrayList<String>();
	ArrayList<JLabel> cardLabels = new ArrayList<JLabel>();
	int chance = 3, check = 0;

	public Test2_cardGame() {
		super("카드맞추기 게임");
		setSize(800, 600);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(12, 10, 760, 63);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JButton btnStart = new JButton("게임시작");
		btnStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		btnStart.setBounds(12, 10, 152, 43);
		pn1.add(btnStart);

		lblChance1 = new JLabel("");
		lblChance1.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/Chance.jpg")));
		lblChance1.setBounds(585, 10, 48, 43);
		pn1.add(lblChance1);

		lblChance2 = new JLabel("");
		lblChance2.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/Chance.jpg")));
		lblChance2.setBounds(634, 10, 48, 43);
		pn1.add(lblChance2);

		lblChance3 = new JLabel("");
		lblChance3.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/Chance.jpg")));
		lblChance3.setBounds(682, 10, 48, 43);
		pn1.add(lblChance3);

		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(12, 83, 760, 468);
		getContentPane().add(pn2);
		pn2.setLayout(new GridLayout(3, 6));

		lblCard1 = new JLabel("");
		lblCard1.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard1);

		lblCard2 = new JLabel("");
		lblCard2.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard2);

		lblCard3 = new JLabel("");
		lblCard3.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard3);

		lblCard4 = new JLabel("");
		lblCard4.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard4);

		lblCard5 = new JLabel("");
		lblCard5.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard5);

		lblCard6 = new JLabel("");
		lblCard6.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard6);

		lblCard7 = new JLabel("");
		lblCard7.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard7);

		lblCard8 = new JLabel("");
		lblCard8.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard8);

		lblCard9 = new JLabel("");
		lblCard9.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard9);

		lblCard10 = new JLabel("");
		lblCard10.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard10);

		lblCard11 = new JLabel("");
		lblCard11.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard11);

		lblCard12 = new JLabel("");
		lblCard12.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblCard12);

		imgReset();

		// --------------------------위쪽은 UI------------------------------------
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// --------------------------아래쪽은 메소드-----------------------------------

		int[] nums = new int[12];

		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardReset();

				for (int i = 0; i < nums.length; i++) {
					nums[i] = (int) (Math.random() * 12);
					for (int j = 0; j < i; j++) {
						if (nums[i] == nums[j])
							i--;
					}
				}

				lblCard1.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[0]])));
				lblCard2.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[1]])));
				lblCard3.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[2]])));
				lblCard4.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[3]])));
				lblCard5.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[4]])));
				lblCard6.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[5]])));
				lblCard7.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[6]])));
				lblCard8.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[7]])));
				lblCard9.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[8]])));
				lblCard10.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[9]])));
				lblCard11.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[10]])));
				lblCard12.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[11]])));

				Timer timer = new Timer(1000, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						imgReset();
					}
				});
				timer.setRepeats(false);
				timer.start();

				chance();
				check = 0;
			}
		});

		lblCard1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard1.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[0]])));
				imgNum.add(imgs[nums[0]]);
				cardLabels.add(lblCard1);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard2.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[1]])));
				imgNum.add(imgs[nums[1]]);
				cardLabels.add(lblCard2);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard3.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[2]])));
				imgNum.add(imgs[nums[2]]);
				cardLabels.add(lblCard3);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard4.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[3]])));
				imgNum.add(imgs[nums[3]]);
				cardLabels.add(lblCard4);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard5.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[4]])));
				imgNum.add(imgs[nums[4]]);
				cardLabels.add(lblCard5);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard6.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[5]])));
				imgNum.add(imgs[nums[5]]);
				cardLabels.add(lblCard6);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard7.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[6]])));
				imgNum.add(imgs[nums[6]]);
				cardLabels.add(lblCard7);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard8.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[7]])));
				imgNum.add(imgs[nums[7]]);
				cardLabels.add(lblCard8);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard9.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[8]])));
				imgNum.add(imgs[nums[8]]);
				cardLabels.add(lblCard9);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard10.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[9]])));
				imgNum.add(imgs[nums[9]]);
				cardLabels.add(lblCard10);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard11.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[10]])));
				imgNum.add(imgs[nums[10]]);
				cardLabels.add(lblCard11);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		lblCard12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblCard12.setIcon(new ImageIcon(Test2_cardGame.class.getResource(imgs[nums[11]])));
				imgNum.add(imgs[nums[11]]);
				cardLabels.add(lblCard12);
				if (imgNum.size() == 2)
					comfareCards();

			}
		});

		setVisible(true);
	}

	void comfareCards() {
		Timer timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (imgNum.get(0).equals(imgNum.get(1))) {
					cardLabels.get(0).setVisible(false);
					cardLabels.get(1).setVisible(false);
					check++;
					if (check == 6) {
						JOptionPane.showMessageDialog(null, "성공!");
						chance = 3;
						check = 0;
					}

				} else {
					cardLabels.get(0).setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
					cardLabels.get(1).setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
					chance--;
					chance();
				}
				imgNum.clear();
				cardLabels.clear();

			}
		});
		timer.setRepeats(false);
		timer.start();
	}

	public void imgReset() {
		lblCard1.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard2.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard3.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard4.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard5.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard6.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard7.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard8.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard9.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard10.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard11.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
		lblCard12.setIcon(new ImageIcon(Test2_cardGame.class.getResource("/t9_game/images/card0.jpg")));
	}

	public void cardReset() {
		lblCard1.setVisible(true);
		lblCard2.setVisible(true);
		lblCard3.setVisible(true);
		lblCard4.setVisible(true);
		lblCard5.setVisible(true);
		lblCard6.setVisible(true);
		lblCard7.setVisible(true);
		lblCard8.setVisible(true);
		lblCard9.setVisible(true);
		lblCard10.setVisible(true);
		lblCard11.setVisible(true);
		lblCard12.setVisible(true);
	}

	void chance() {
		if (chance == 3) {
			lblChance1.setVisible(true);
			lblChance2.setVisible(true);
			lblChance3.setVisible(true);
		} else if (chance == 2) {
			lblChance1.setVisible(true);
			lblChance2.setVisible(true);
			lblChance3.setVisible(false);
		} else if (chance == 1) {
			lblChance1.setVisible(true);
			lblChance2.setVisible(false);
			lblChance3.setVisible(false);
		} else if (chance == 0) {
			lblChance1.setVisible(false);
			lblChance2.setVisible(false);
			lblChance3.setVisible(false);
			JOptionPane.showMessageDialog(null, "실패!");
			chance = 3;
		}

	}

	public static void main(String[] args) {
		new Test2_cardGame();
	}
}
