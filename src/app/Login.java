package app;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		 setWindow();
	}

	private void setWindow() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("( Usernames: \"Furkan\",  \"Baran\" )");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 189, 364, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Enter Username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 64, 264, 20);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(61, 95, 264, 20);
		panel.add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(150, 122, 86, 20);

		panel.add(btnNewButton);
		btnNewButton.getAction();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] users = new String[]{"Furkan", "Baran"};
				List<String>usersList = Arrays.asList(users);


				if (usersList.contains(textField.getText() )){
					new mainFrame().setVisible(true);	
					frame.setVisible(false);
				}else {
					 JOptionPane.showMessageDialog(new JFrame(), "Incorrect username", "Error!",
						        JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
	}	
	
	

}
