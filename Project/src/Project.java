import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Project extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegisterUser = new JButton("Register user");
		btnRegisterUser.setBounds(10, 11, 112, 23);
		contentPane.add(btnRegisterUser);
		
		textField = new JTextField();
		textField.setBounds(132, 12, 225, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGroupManagement = new JLabel("Group Management");
		lblGroupManagement.setBounds(20, 45, 133, 14);
		contentPane.add(lblGroupManagement);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(10, 101, 89, 23);
		contentPane.add(btnCreate);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(109, 101, 89, 23);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(208, 101, 89, 23);
		contentPane.add(btnDelete);
		
		JLabel lblOnlineUser = new JLabel("Online Users");
		lblOnlineUser.setBounds(10, 135, 98, 14);
		contentPane.add(lblOnlineUser);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(288, 160, 383, 258);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Groups");
		lblNewLabel.setBounds(145, 135, 133, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(145, 160, 133, 258);
		contentPane.add(textArea_1);
		
		JLabel lblConversation = new JLabel("Conversation");
		lblConversation.setBounds(288, 135, 243, 14);
		contentPane.add(lblConversation);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 160, 125, 258);
		contentPane.add(textArea_2);
		
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.setBounds(10, 429, 121, 23);
		contentPane.add(btnSendMessage);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 430, 287, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 70, 267, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
