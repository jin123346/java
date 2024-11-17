package ch13.sub2;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUID;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtplusResult;
	private JTextField txtMinusResult;
	private JTextField txtMinus2;
	private JTextField txtminus1;
	private JTextField txtMultiResult;
	private JTextField txtMulti2;
	private JTextField txtMulti1;
	private JTextField txtDivResult;
	private JTextField txtDiv2;
	private JTextField txtDiv1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 82, 16);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("버튼 실습");
		label.setBounds(12, 41, 57, 15);
		contentPane.add(label);

		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 확인1 버튼 누르면 실행되는 부분
				System.out.println("확인 1 버튼 클릭...");
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);

		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		contentPane.add(btn2);

		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭", "확인대화상자", JOptionPane.YES_NO_OPTION);
				// yes = 0; no=1;
				if (answer == 0) {
					System.out.println("Yes 클릭!");
				} else {
					System.out.println("No 클릭!");
				}
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		contentPane.add(btn3);

		JLabel label_1 = new JLabel("텍스트필드 실습");
		label_1.setBounds(12, 103, 97, 15);
		contentPane.add(label_1);

		JLabel lbId = new JLabel("아이디");
		lbId.setBounds(12, 128, 57, 15);
		contentPane.add(lbId);

		txtUID = new JTextField();
		txtUID.setBounds(82, 124, 116, 21);
		contentPane.add(txtUID);
		txtUID.setColumns(10);

		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(274, 128, 135, 15);
		contentPane.add(lbResultUid);

		Button btnUID = new Button("확인");
		btnUID.setFont(new Font("굴림체", Font.PLAIN, 12));
		btnUID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUID.getText();
				lbResultUid.setText("결과 : " + uid);
			}
		});
		btnUID.setBounds(204, 123, 64, 23);
		contentPane.add(btnUID);

		JLabel lbName = new JLabel("이름");
		lbName.setBounds(12, 157, 57, 15);
		contentPane.add(lbName);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(82, 153, 116, 21);
		contentPane.add(txtName);

		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(274, 157, 135, 15);
		contentPane.add(lbResultName);

		Button btnName = new Button("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과 : " + name);

			}
		});
		btnName.setFont(new Font("굴림", Font.PLAIN, 12));
		btnName.setBounds(204, 152, 64, 23);
		contentPane.add(btnName);

		JLabel lbHp = new JLabel("휴대폰");
		lbHp.setBounds(12, 189, 57, 15);
		contentPane.add(lbHp);

		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(82, 185, 116, 21);
		contentPane.add(txtHp);

		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(274, 189, 135, 15);
		contentPane.add(lbResultHp);

		Button btnHp = new Button("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : " + hp);

			}
		});

		btnHp.setFont(new Font("굴림", Font.PLAIN, 12));
		btnHp.setBounds(204, 184, 64, 23);
		contentPane.add(btnHp);

		JLabel lbHp_1 = new JLabel("덧셈");
		lbHp_1.setBounds(12, 229, 57, 15);
		contentPane.add(lbHp_1);

		txtPlus1 = new JTextField();
		txtPlus1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlus1.setColumns(10);
		txtPlus1.setBounds(82, 226, 57, 21);
		contentPane.add(txtPlus1);

		txtPlus2 = new JTextField();
		txtPlus2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlus2.setColumns(10);
		txtPlus2.setBounds(169, 226, 57, 21);
		contentPane.add(txtPlus2);

		JLabel lbHp_1_1 = new JLabel("+");
		lbHp_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1.setBounds(141, 229, 25, 15);
		contentPane.add(lbHp_1_1);

		JLabel lbHp_1_1_1 = new JLabel("=");
		lbHp_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_1.setBounds(230, 229, 25, 15);
		contentPane.add(lbHp_1_1_1);

		txtplusResult = new JTextField();
		txtplusResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtplusResult.setColumns(10);
		txtplusResult.setBounds(256, 226, 57, 21);
		contentPane.add(txtplusResult);

		txtMinusResult = new JTextField();
		txtMinusResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinusResult.setColumns(10);
		txtMinusResult.setBounds(256, 261, 57, 21);
		contentPane.add(txtMinusResult);

		JLabel lbHp_1_1_1_1 = new JLabel("=");
		lbHp_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_1_1.setBounds(230, 264, 25, 15);
		contentPane.add(lbHp_1_1_1_1);

		txtMinus2 = new JTextField();
		txtMinus2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinus2.setColumns(10);
		txtMinus2.setBounds(169, 261, 57, 21);
		contentPane.add(txtMinus2);

		JLabel lbHp_1_1_2 = new JLabel("+");
		lbHp_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_2.setBounds(141, 264, 25, 15);
		contentPane.add(lbHp_1_1_2);

		txtminus1 = new JTextField();
		txtminus1.setHorizontalAlignment(SwingConstants.CENTER);
		txtminus1.setColumns(10);
		txtminus1.setBounds(82, 261, 57, 21);
		contentPane.add(txtminus1);

		JLabel lbHp_1_2 = new JLabel("뺄셈");
		lbHp_1_2.setBounds(12, 264, 57, 15);
		contentPane.add(lbHp_1_2);

		txtMultiResult = new JTextField();
		txtMultiResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtMultiResult.setColumns(10);
		txtMultiResult.setBounds(256, 294, 57, 21);
		contentPane.add(txtMultiResult);

		JLabel lbHp_1_1_1_2 = new JLabel("=");
		lbHp_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_1_2.setBounds(230, 297, 25, 15);
		contentPane.add(lbHp_1_1_1_2);

		txtMulti2 = new JTextField();
		txtMulti2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMulti2.setColumns(10);
		txtMulti2.setBounds(169, 294, 57, 21);
		contentPane.add(txtMulti2);

		JLabel lbHp_1_1_3 = new JLabel("+");
		lbHp_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_3.setBounds(141, 297, 25, 15);
		contentPane.add(lbHp_1_1_3);

		txtMulti1 = new JTextField();
		txtMulti1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMulti1.setColumns(10);
		txtMulti1.setBounds(82, 294, 57, 21);
		contentPane.add(txtMulti1);

		JLabel lbHp_1_3 = new JLabel("곱셈");
		lbHp_1_3.setBounds(12, 297, 57, 15);
		contentPane.add(lbHp_1_3);

		txtDivResult = new JTextField();
		txtDivResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtDivResult.setColumns(10);
		txtDivResult.setBounds(256, 327, 57, 21);
		contentPane.add(txtDivResult);

		JLabel lbHp_1_1_1_3 = new JLabel("=");
		lbHp_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_1_3.setBounds(230, 330, 25, 15);
		contentPane.add(lbHp_1_1_1_3);

		txtDiv2 = new JTextField();
		txtDiv2.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiv2.setColumns(10);
		txtDiv2.setBounds(169, 327, 57, 21);
		contentPane.add(txtDiv2);

		JLabel lbHp_1_1_4 = new JLabel("+");
		lbHp_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbHp_1_1_4.setBounds(141, 330, 25, 15);
		contentPane.add(lbHp_1_1_4);

		txtDiv1 = new JTextField();
		txtDiv1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiv1.setColumns(10);
		txtDiv1.setBounds(82, 327, 57, 21);
		contentPane.add(txtDiv1);

		JLabel lbHp_1_4 = new JLabel("나눗셈");
		lbHp_1_4.setBounds(12, 330, 57, 15);
		contentPane.add(lbHp_1_4);

		JLabel label_1_1 = new JLabel("체크박스 실습");
		label_1_1.setBounds(12, 372, 97, 15);
		contentPane.add(label_1_1);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 393, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(72, 393, 67, 23);
		contentPane.add(chk2);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(191, 393, 64, 23);
		contentPane.add(chk4);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(131, 393, 67, 23);
		contentPane.add(chk3);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(256, 393, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultcheck = new JLabel("결과 : ");
		lbResultcheck.setBounds(12, 429, 256, 15);
		contentPane.add(lbResultcheck);
		
		JButton btncheck = new JButton("확인");
		btncheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<String>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultcheck.setText("결과 : "+cities);
			}
		});
		btncheck.setBounds(313, 393, 97, 23);
		contentPane.add(btncheck);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int A = Integer.parseInt(txtPlus1.getText());
				int B = Integer.parseInt(txtPlus2.getText());
				String result = Integer.toString(A+B);
				txtplusResult.setText(result);
			}
		});
		btnPlus.setBounds(325, 225, 97, 23);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A = Integer.parseInt(txtminus1.getText());
				int B = Integer.parseInt(txtMinus2.getText());
				String result = Integer.toString(A-B);
				txtMinusResult.setText(result);
			
			}
		});
		btnMinus.setBounds(325, 260, 97, 23);
		contentPane.add(btnMinus);
		
		JButton btnMuti = new JButton("확인");
		btnMuti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A = Integer.parseInt(txtMulti1.getText());
				int B = Integer.parseInt(txtMulti2.getText());
				String result = Integer.toString(A*B);
				txtMultiResult.setText(result);
				
			}
		});
		btnMuti.setBounds(325, 293, 97, 23);
		contentPane.add(btnMuti);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double A = Double.parseDouble(txtDiv1.getText());
				double B = Double.parseDouble(txtDiv2.getText());
				String result = Double.toString(Math.floor(A/B));
				txtDivResult.setText(result);
			}
		});
		btnDiv.setBounds(325, 326, 97, 23);
		contentPane.add(btnDiv);
		
		//테이블 설정
		String[] columnName= {"아이디","이름","나이","휴대폰"};
						
		DefaultTableModel model = new DefaultTableModel(columnName,0);
		model.setColumnIdentifiers(columnName);
		model.setRowCount(0);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Table 실습");
		lblNewLabel_1.setBounds(12, 454, 108, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<Person>();
				persons.add(new Person("a101", "김유신", "010-1234-1001",23));
				persons.add(new Person("a102", "김춘추", "010-1234-1002",21));
				persons.add(new Person("a103", "장보고", "010-1234-1003",33));
				persons.add(new Person("a104", "강감찬", "010-1234-1004",43));
				persons.add(new Person("a105", "이순신", "010-1234-1005",53));
				
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(),person.getName(),person.getHp(),person.getAge()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(12, 610, 97, 23);
		contentPane.add(btnTable);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(390, 484, 17, 114);
		contentPane.add(scrollBar);
		

		table = new JTable();
		table.setBounds(29, 483, 380, 115);
		contentPane.add(table);
		table.setModel(model);
		
		
		
		
		
	
		
		
		
		
		
		

	}
}
