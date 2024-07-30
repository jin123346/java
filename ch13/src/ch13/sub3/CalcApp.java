package ch13.sub3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		String[] nums = {"","",""};
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seven= "7";
				if(nums[1].isEmpty()) {
					nums[0]+=seven;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=seven;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
				
			}
		});
		btn7.setBounds(12, 143, 61, 52);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eight="8";
				if(nums[1].isEmpty()) {
					nums[0]+=eight;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=eight;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
				
			}
		});
		btn8.setBounds(85, 143, 61, 52);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nine="9";
				if(nums[1].isEmpty()) {
					nums[0]+=nine;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=nine;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn9.setBounds(158, 143, 61, 52);
		contentPane.add(btn9);
		
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String six="6";
				if(nums[1].isEmpty()) {
					nums[0]+=six;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=six;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn6.setBounds(158, 205, 61, 52);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String five = "5";
				if(nums[1].isEmpty()) {
					nums[0]+=five;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=five;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn5.setBounds(85, 205, 61, 52);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String four = "4";
				if(nums[1].isEmpty()) {
					nums[0]+=four;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=four;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn4.setBounds(12, 205, 61, 52);
		contentPane.add(btn4);
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Three = "3";
				if(nums[1].isEmpty()) {
					nums[0]+=Three;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=Three;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn3.setBounds(158, 268, 61, 52);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String second="2";
				if(nums[1].isEmpty()) {
					nums[0]+=second;
					txtResult.setText(nums[0]);
				}else {
					nums[2] += second;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn2.setBounds(85, 268, 61, 52);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first="1";
				if(nums[1].isEmpty()) {
					nums[0]+=first;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=first;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn1.setBounds(12, 268, 61, 52);
		contentPane.add(btn1);
		
		
		
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nums[0] = "";
				nums[1] = "";
				nums[2] = "";
				txtResult.setText("0");
				
			}
		});
		btnC.setBounds(12, 330, 61, 52);
		contentPane.add(btnC);
		
		JButton btnresult = new JButton("=");
		btnresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(nums[0]);
					double b = Double.parseDouble(nums[2]);
					double result = a;
					
					switch (nums[1]) {
					case "+" : 
						result= a+b;
						break;
					case "-" : 
						result = a-b;
						break;
					case "X" : 
						result = a*b;
						break;
					case "/" :
						if(b!=0) {
							result=a/b;
						}else {
							txtResult.setText("error");
							btnC.doClick();
							return;
						}
						break;
					default:
						break;
					}
					
					String res = Double.toString(result);
					nums[0] = res;
					nums[1] = "";
					nums[2]="";
					txtResult.setText(res);
				} catch (NumberFormatException e2) {
					txtResult.setText("Error");
					btnC.doClick();
				}
				
			}
		});
		btnresult.setBounds(158, 330, 61, 52);
		contentPane.add(btnresult);
		
		

		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String add = txtResult.getText();
				String plus = "+";
				if(nums[1].isEmpty()) {
					nums[1] = plus;
					txtResult.setText(add+" "+nums[1]+" ");
				}else {
					btnresult.doClick();
					nums[1] = plus;
					txtResult.setText(add+" "+nums[1]+" ");
				}
			}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String minus = "-";
				if(nums[1].isEmpty()) {
					nums[1] = minus;
					txtResult.setText(nums[0]+" "+nums[1]+" ");
					}else {
						String add = txtResult.getText();
						btnresult.doClick();
						nums[1] = minus;
						txtResult.setText(add+" "+nums[1]+" ");
					}
				}
		});
		btnMinus.setBounds(231, 268, 61, 52);
		contentPane.add(btnMinus);
		
		btnplus.setBounds(231, 330, 61, 52);
		contentPane.add(btnplus);
		
		
		JButton btnMultiple = new JButton("X");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String multi = "X";
				if(nums[1].isEmpty()) {
					nums[1] = multi;
					txtResult.setText(nums[0]+" "+nums[1]+" ");
					}else {
						String add = txtResult.getText();
						btnresult.doClick();
						nums[1] = multi;
						txtResult.setText(add+" "+nums[1]+" ");
					}
				}
			
		});
		btnMultiple.setBounds(231, 205, 61, 52);
		contentPane.add(btnMultiple);
		
		
		JButton btndivision = new JButton("/");
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String division = "/";
				if(nums[1].isEmpty()) {
					nums[1] = division;
					txtResult.setText(nums[0]+" "+nums[1]+" ");
					}else {
						String add = txtResult.getText();
						btnresult.doClick();
						nums[1] = division;
						txtResult.setText(add+" "+nums[1]+" ");
					}
			}
		});
		btndivision.setBounds(231, 143, 61, 52);
		contentPane.add(btndivision);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String zero="0";
				if(nums[1].isEmpty()) {
					nums[0]+=zero;
					txtResult.setText(nums[0]);
				}else {
					nums[2] +=zero;
					txtResult.setText(nums[0]+" "+nums[1]+" "+nums[2]);
				}
			}
		});
		btn0.setBounds(85, 330, 61, 52);
		contentPane.add(btn0);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(32, 21, 247, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		txtResult.setText("0");
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBounds(12, 10, 279, 116);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
	}
}
