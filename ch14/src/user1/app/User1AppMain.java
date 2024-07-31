package user1.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import user1.User1VO;
import user1.UserDAO;

import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class User1AppMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblList;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtBirth;
	private JTextField txtHp;
	private JTextField txtAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User1AppMain frame = new User1AppMain();
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
	public User1AppMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("전환shown");
			}
		});
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel listPanel = new JPanel();
		listPanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				System.out.println("전환4");
			}
		});
		contentPane.add(listPanel, "listPanel");
		listPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel registerPanel = new JPanel();
		contentPane.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User1 목록");
		listPanel.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		listPanel.add(scrollPane, BorderLayout.CENTER);
		
		//테이블 설정
		tblList = new JTable();
		scrollPane.setViewportView(tblList);
		
		String[] columNames = {"아이디","이름","생년월일","휴대폰","나이"};
		DefaultTableModel model = new DefaultTableModel(columNames,0);
		model.setRowCount(0);
		tblList.setModel(model);
		
		
		//데이터 출력
		UserDAO dao = UserDAO.getinstance();
		List<User1VO> users = dao.selectUsers();
		
		for(User1VO user : users) {
			Object[] rowDate = {user.getUid(),user.getName(),user.getBirth(),user.getHp(),user.getAge()};
			model.addRow(rowDate);
		}
		
		////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		listPanel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnRegister = new JButton("등록");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//등록화면으로 전환
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "registerPanel");
				
			}
	
		});
		
		JButton btnRegister_2 = new JButton("수정");
		btnRegister_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(btnRegister_2);
		
		JButton btnRegister_1 = new JButton("삭제");
		btnRegister_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister_1.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(btnRegister_1);
		btnRegister.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(btnRegister);
		
		
		
		JLabel lbRegister = new JLabel(" User1 등록");
		lbRegister.setFont(new Font("굴림", Font.PLAIN, 15));
		lbRegister.setHorizontalAlignment(SwingConstants.LEFT);
		lbRegister.setBounds(0, 0, 452, 24);
		registerPanel.add(lbRegister);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 36, 70, 24);
		registerPanel.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(92, 36, 116, 21);
		registerPanel.add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(92, 64, 116, 21);
		registerPanel.add(txtName);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 64, 70, 24);
		registerPanel.add(lblNewLabel_2_1);
		
		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		txtBirth.setBounds(92, 93, 116, 21);
		registerPanel.add(txtBirth);
		
		JLabel lblNewLabel_2_2 = new JLabel("생년월일");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(10, 93, 70, 24);
		registerPanel.add(lblNewLabel_2_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(92, 126, 116, 21);
		registerPanel.add(txtHp);
		
		JLabel lblNewLabel_2_3 = new JLabel("휴대폰");
		lblNewLabel_2_3.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(10, 124, 70, 24);
		registerPanel.add(lblNewLabel_2_3);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(92, 158, 116, 21);
		registerPanel.add(txtAge);
		
		JLabel lblNewLabel_2_4 = new JLabel("나이");
		lblNewLabel_2_4.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(10, 155, 70, 24);
		registerPanel.add(lblNewLabel_2_4);
		
		JButton btnList = new JButton("목록");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "listPanel");
			}
		});
		btnList.setBounds(10, 201, 89, 23);
		registerPanel.add(btnList);
		
		JButton btnInsert = new JButton("등록하기");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid= txtUid.getText();
				String name = txtName.getText();
				String birth = txtBirth.getText();
				String hp = txtHp.getText();
				int age =Integer.parseInt(txtAge.getText());
				
				User1VO vo = new User1VO(uid,name,birth,hp,age);
				UserDAO.getinstance().insertUser(vo);
				
				JOptionPane.showMessageDialog(null, "등록 완료!");
				
				
			}
		});
		btnInsert.setBounds(119, 201, 89, 23);
		registerPanel.add(btnInsert);
	
	}
}
