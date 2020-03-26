package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.DatabaseConnection;

import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	private static Login frameLogin;

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblError;
	
	Connection conn = DatabaseConnection.connectDB();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
	
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameLogin = new Login();
					frameLogin.setUndecorated(true);
					frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 408);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Login.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 333, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VisitNorth System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));
		lblNewLabel.setBounds(0, 107, 333, 170);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 333, 420);
		label.setIcon(new ImageIcon(Login.class.getResource("/Images/bg.jpg")));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		lblError = new JLabel("");
		lblError.setVisible(false);
		lblError.setForeground(Color.RED);
		lblError.setBounds(343, 319, 235, 22);
		
		JLabel lblNewLabel_1 = new JLabel("VisitNorth System");
		lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 205, 301, 19);
		panel.add(lblNewLabel_1);
		
		Button btnLogin = new Button("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String query = "select * from employee where username=? and password=?";
                try {
                    preparedStatement = conn.prepareStatement(query);
                    preparedStatement.setString(1, txtUsername.getText());
                    preparedStatement.setString(2, txtPassword.getText());
                    resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()){
                        System.out.println("logged in");
                        frameLogin.dispose();
                        
                        if (getEmployeeRole().equals("Agent")) {
                            AgentScreen agentScreen = new AgentScreen();
                            agentScreen.setVisible(true);
                        }else if (getEmployeeRole().equals("Manager")){
                            ManagerScreen managerScreen = new ManagerScreen();
                            managerScreen.setVisible(true);
                        }
                    }else {
                    	lblError.setVisible(true);
                    	lblError.setText("Invalid Username or Password!");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(0, 0, 128));
		btnLogin.setFont(new Font("Candara", Font.BOLD, 14));
		btnLogin.setBounds(343, 253, 311, 37);
		contentPane.add(btnLogin);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(343, 99, 311, 37);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Candara Light", Font.BOLD, 14));
		lblUsername.setBounds(343, 68, 92, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Candara Light", Font.BOLD, 14));
		lblPassword.setBounds(343, 157, 92, 28);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(343, 185, 311, 37);
		contentPane.add(txtPassword);
		
		JLabel lblClose = new JLabel("X");
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClose.setForeground(new Color(0, 0, 128));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setBounds(632, 0, 22, 22);
		contentPane.add(lblClose);
		
		
		contentPane.add(lblError);
	}
	
	private String getEmployeeRole(){
        String employeeRole = "";
        try {
            String query = "select role from employee where username='" + txtUsername.getText() + "'";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                employeeRole = resultSet.getString("role");
            }
        }catch (SQLException e) {
            e.getMessage();
        }
        return employeeRole;
    }
}
