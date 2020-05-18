package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import com.toedter.calendar.JCalendar;

import Database.DatabaseConnection;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClerkScreen extends JFrame {
	
	

	Connection conn = DatabaseConnection.connectDB();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
	
	int xx,xy;
	
	private static ClerkScreen clerkScreenFrame;
	
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel issueTicketNumberPanel;
	private JPanel availableSeatsPanel;
	private JPanel settingsPanel;
	JPanel panelBG;
	JPanel sidePanel;
	JPanel panel;
	final JPanel homePanel;
	JPanel btnHomePanel;
	JLabel lblNewLabel;
	JLabel lblHomeButton;
	JPanel btnIssueTicketNumber;
	JLabel label;
	JLabel lblIssueTicketNumberButton;
	JPanel panel_9;
	JLabel lblNewLabel_8;
	JPanel btnSchedulePanel;
	JLabel label_2;
	JLabel lblWelcomeName;
	JLabel lblAvailableSeatsButton;
	JLabel lblReduceTheBrightness;
	JPanel btnSettingsPanel;
	JLabel label_4;
	JLabel lblSettingsButton;
	JPanel btnProfilePanel;
	JLabel lblLogout;
	JPanel panel_10;
	JLabel lblEmployeeName;
	JLabel lblLogoutWhenNoText;
	JLabel lblVisitNorth;
	JPanel panel_6;
	JLabel lblCities_1;
	JPanel panel_8;
	JPanel panel_1;
	JLabel lblCancelButtonText;
	JLabel lblAdjustBrightnessText;
	JLabel lblBrightness;
	JCheckBox chkbAdjustBrightness;
	JPanel btnSettingsSave;
	JLabel lblErrorIssueTicketNumber;
	JPanel btnSettingsCancel;
	JLabel lblThemeColorText;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_2;
	JLabel lblClose;
	JLabel lblLogOutIf;
	JLabel lblNewLabel_5;
	JPanel btnBeigeColor;
	JLabel lblAutoLogOut;
	JLabel lblChangeTheFont;
	JLabel lblFont;
	JPanel btnGreenishColor;
	JPanel btnAvailableSeatsLeft;
	JLabel lblSettings_1;
	JPanel btnBlueishColor;
	JCheckBox chkbAutoLogout;
	JLabel lblFontSizeText;
	JComboBox cmbFontSize;
	JPanel btnPurpleColor;
	private JPanel profilePanel;
	private JPanel panel_13;
	private JCalendar departureDate;
	JPanel btnProceedIssueTicketNumber;
	private JLabel lblNewLabel_10;
	private JComboBox<String> cmbIssueTicketScheduleID;
	private JLabel lblDestination;
	private JTable tableTicket;
	private JTextField txtTicketNumber;
	private JTable tableTicketNrOfSeat;
	private JLabel lblSelectARow;
	private JLabel lblRouteDescriptionLable;
	private JLabel lblRouteDescription;
	private JLabel lblScheduleIdLabel;
	private JLabel lblScheduleID;
	private JTextField txtAvailableSeatsLeft;
	private JLabel lblErrorNumberSeats;
	private JPanel panel_14;
	private JLabel label_1;
	private JLabel lblEmailAddress;
	private JPanel panel_15;
	private JLabel label_5;
	private JLabel lblPhoneNumber;
	private JPanel panel_16;
	private JLabel label_7;
	private JLabel lblWebsite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentScreen frame = new AgentScreen();
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
	public ClerkScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 755);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
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
				ClerkScreen.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelBG = new JPanel();
		panelBG.setBackground(new Color(255, 255, 255));
		panelBG.setBounds(0, 0, 1073, 760);
		contentPane.add(panelBG);
		panelBG.setLayout(null);
		
		sidePanel = new JPanel();
		sidePanel.setBackground(new Color(61, 70, 85));
		sidePanel.setBounds(0, 0, 283, 760);
		panelBG.add(sidePanel);
		sidePanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(283, 0, 790, 760);
		panelBG.add(panel);
		panel.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(255, 255, 255));
		layeredPane.setBounds(0, 105, 790, 655);
		panel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		homePanel = new JPanel();
		homePanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(homePanel, "name_42633884571900");
		homePanel.setLayout(null);
		
		btnHomePanel = new JPanel();
		btnHomePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(homePanel);
			}
		});
		btnHomePanel.setBackground(new Color(61, 70, 85));
		btnHomePanel.setBounds(0, 105, 283, 58);
		sidePanel.add(btnHomePanel);
		btnHomePanel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(22, 11, 40, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_home_20px.png")));
		btnHomePanel.add(lblNewLabel);
		
		lblHomeButton = new JLabel("Home");
		lblHomeButton.setBounds(95, 14, 78, 33);
		lblHomeButton.setForeground(new Color(255, 255, 255));
		lblHomeButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomeButton.setFont(new Font("Candara", Font.BOLD, 19));
		btnHomePanel.add(lblHomeButton);
		
		btnIssueTicketNumber = new JPanel();
		btnIssueTicketNumber.setLayout(null);
		btnIssueTicketNumber.setBackground(new Color(61, 70, 85));
		btnIssueTicketNumber.setBounds(0, 164, 283, 58);
		btnIssueTicketNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(issueTicketNumberPanel);
				getScheduleIDFromSoldTicket();
				displayTicketInTable();
			}
		});
		sidePanel.add(btnIssueTicketNumber);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_tour_bus_20px.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(22, 11, 40, 33);
		btnIssueTicketNumber.add(label);
		
		lblIssueTicketNumberButton = new JLabel("Issue Ticket Numbers");
		lblIssueTicketNumberButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblIssueTicketNumberButton.setForeground(Color.WHITE);
		lblIssueTicketNumberButton.setFont(new Font("Candara", Font.BOLD, 19));
		lblIssueTicketNumberButton.setBounds(95, 14, 178, 33);
		btnIssueTicketNumber.add(lblIssueTicketNumberButton);
		
		btnSchedulePanel = new JPanel();
		btnSchedulePanel.setLayout(null);
		btnSchedulePanel.setBackground(new Color(61, 70, 85));
		btnSchedulePanel.setBounds(0, 223, 283, 58);
		btnSchedulePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(availableSeatsPanel);
				displayRouteInTableWithNrOfSeat();
				btnAvailableSeatsLeft.setVisible(false);
				
			}
		});
		sidePanel.add(btnSchedulePanel);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_grid_3_20px.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(22, 11, 40, 33);
		btnSchedulePanel.add(label_2);
		
		lblAvailableSeatsButton = new JLabel("Available Seats");
		lblAvailableSeatsButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvailableSeatsButton.setForeground(Color.WHITE);
		lblAvailableSeatsButton.setFont(new Font("Candara", Font.BOLD, 19));
		lblAvailableSeatsButton.setBounds(95, 14, 143, 33);
		btnSchedulePanel.add(lblAvailableSeatsButton);
		
		btnSettingsPanel = new JPanel();
		btnSettingsPanel.setLayout(null);
		btnSettingsPanel.setBackground(new Color(61, 70, 85));
		btnSettingsPanel.setBounds(0, 282, 283, 58);
		btnSettingsPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(settingsPanel);
			}
		});
		sidePanel.add(btnSettingsPanel);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_settings_20px.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(22, 11, 40, 33);
		btnSettingsPanel.add(label_4);
		
		lblSettingsButton = new JLabel("Settings");
		lblSettingsButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblSettingsButton.setForeground(Color.WHITE);
		lblSettingsButton.setFont(new Font("Candara", Font.BOLD, 19));
		lblSettingsButton.setBounds(95, 14, 78, 33);
		btnSettingsPanel.add(lblSettingsButton);
		
		btnProfilePanel = new JPanel();
		btnProfilePanel.setToolTipText("Profile");
		btnProfilePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(profilePanel);
			}
		});
		btnProfilePanel.setLayout(null);
		btnProfilePanel.setBackground(new Color(48, 55, 66));
		btnProfilePanel.setBounds(0, 702, 283, 58);
		sidePanel.add(btnProfilePanel);
		
		lblLogout = new JLabel("");
		lblLogout.setToolTipText("Sign out");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				System.exit(0);
//				clerkScreenFrame.dispose();
//				Login loginScreen = new Login();
//				loginScreen.setUndecorated(true);
//				loginScreen.setVisible(true);
			}
		});
		lblLogout.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_sign_out_20px.png")));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setBounds(22, 11, 40, 33);
		btnProfilePanel.add(lblLogout);
		
		lblEmployeeName = new JLabel(Login.empName);
		lblEmployeeName.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeName.setForeground(Color.WHITE);
		lblEmployeeName.setFont(new Font("Candara", Font.BOLD, 19));
		lblEmployeeName.setBounds(95, 14, 78, 33);
		btnProfilePanel.add(lblEmployeeName);
		
		lblVisitNorth = new JLabel("Visit North");
		lblVisitNorth.setBounds(39, 39, 111, 33);
		sidePanel.add(lblVisitNorth);
		lblVisitNorth.setHorizontalAlignment(SwingConstants.LEFT);
		lblVisitNorth.setForeground(Color.WHITE);
		lblVisitNorth.setFont(new Font("Candara", Font.BOLD, 19));
		
		panel_6 = new JPanel();
		panel_6.setBounds(29, 69, 227, 3);
		sidePanel.add(panel_6);
		
		
		
		lblCities_1 = new JLabel("Home");
		lblCities_1.setFont(new Font("Candara", Font.PLAIN, 18));
		lblCities_1.setBounds(10, 0, 110, 41);
		homePanel.add(lblCities_1);
		
		lblWelcomeName = new JLabel("Welcome " + Login.empName);
		lblWelcomeName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcomeName.setFont(new Font("Candara", Font.PLAIN, 18));
		lblWelcomeName.setBounds(591, 0, 131, 41);
		homePanel.add(lblWelcomeName);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_handshake_30px.png")));
		lblNewLabel_10.setBounds(495, 0, 40, 41);
		homePanel.add(lblNewLabel_10);
		
		lblNewLabel_7 = new JLabel("v. 1.0.0.1");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Candara", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(152, 39, 46, 14);
		sidePanel.add(lblNewLabel_7);
		
		
		
		lblNewLabel_2 = new JLabel("Luxury coaches for  tourists in and North East England.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Candara", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 41, 770, 26);
		panel.add(lblNewLabel_2);
		
		lblClose = new JLabel("");
		lblClose.setVerticalAlignment(SwingConstants.TOP);
		lblClose.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClose.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_multiply_20px_2.png")));
		lblClose.setBounds(757, 0, 33, 32);
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		panel.add(lblClose);
		
		issueTicketNumberPanel = new JPanel();
		issueTicketNumberPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(issueTicketNumberPanel, "name_20101062289600");
		issueTicketNumberPanel.setLayout(null);
		
		JLabel lblProceedWithSelling = new JLabel("Proceed with adding ticket numbers to the following list based on the schedule ID.");
		lblProceedWithSelling.setFont(new Font("Candara", Font.PLAIN, 13));
		lblProceedWithSelling.setBounds(20, 48, 533, 32);
		issueTicketNumberPanel.add(lblProceedWithSelling);
		
		JLabel lblSellTicket = new JLabel("Issue Ticket Number");
		lblSellTicket.setFont(new Font("Candara", Font.PLAIN, 18));
		lblSellTicket.setBounds(10, 11, 165, 41);
		issueTicketNumberPanel.add(lblSellTicket);
		
		cmbIssueTicketScheduleID = new JComboBox<String>();
		cmbIssueTicketScheduleID.setToolTipText("From and To destination of customer");
		cmbIssueTicketScheduleID.setBounds(22, 143, 207, 30);
		issueTicketNumberPanel.add(cmbIssueTicketScheduleID);
		
		lblDestination = new JLabel("Select Schedule ID");
		lblDestination.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDestination.setBounds(20, 120, 209, 20);
		issueTicketNumberPanel.add(lblDestination);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(239, 120, 22, 440);
		issueTicketNumberPanel.add(separator_4);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(250, 120, 514, 440);
		issueTicketNumberPanel.add(scrollPane_4);
		
		tableTicket = new JTable();
		scrollPane_4.setViewportView(tableTicket);
		
		btnProceedIssueTicketNumber = new JPanel();
		btnProceedIssueTicketNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				updateTicketNumberBasedOnScheduleID();
				displayTicketInTable();
			}
		});
		btnProceedIssueTicketNumber.setLayout(null);
		btnProceedIssueTicketNumber.setBackground(new Color(60, 71, 85));
		btnProceedIssueTicketNumber.setBounds(119, 319, 110, 32);
		issueTicketNumberPanel.add(btnProceedIssueTicketNumber);
		
		JLabel lblProceed = new JLabel("PROCEED");
		lblProceed.setHorizontalAlignment(SwingConstants.CENTER);
		lblProceed.setForeground(Color.WHITE);
		lblProceed.setFont(new Font("Candara", Font.BOLD, 14));
		lblProceed.setBounds(10, 11, 90, 14);
		btnProceedIssueTicketNumber.add(lblProceed);
		
		lblErrorIssueTicketNumber = new JLabel("");
		lblErrorIssueTicketNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorIssueTicketNumber.setForeground(new Color(204, 0, 0));
		lblErrorIssueTicketNumber.setFont(new Font("Candara", Font.PLAIN, 10));
		lblErrorIssueTicketNumber.setBounds(54, 258, 175, 20);
		issueTicketNumberPanel.add(lblErrorIssueTicketNumber);
		
		txtTicketNumber = new JTextField();
		txtTicketNumber.setToolTipText("Ticket number");
		txtTicketNumber.setColumns(10);
		txtTicketNumber.setBounds(20, 202, 209, 30);
		issueTicketNumberPanel.add(txtTicketNumber);
		
		JLabel lblTicketNumber = new JLabel("Ticket number");
		lblTicketNumber.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTicketNumber.setBounds(20, 184, 122, 20);
		issueTicketNumberPanel.add(lblTicketNumber);
		
		availableSeatsPanel = new JPanel();
		availableSeatsPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(availableSeatsPanel, "name_20107772105900");
		availableSeatsPanel.setLayout(null);
		
		JLabel lblNumberOfSeats = new JLabel("Number of seats left");
		lblNumberOfSeats.setFont(new Font("Candara", Font.PLAIN, 18));
		lblNumberOfSeats.setBounds(10, 11, 168, 41);
		availableSeatsPanel.add(lblNumberOfSeats);
		
		JLabel lblAListOf_3 = new JLabel("A list of the available route added by the manager. Feel free to assign the number of seats left.");
		lblAListOf_3.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAListOf_3.setBounds(20, 48, 533, 32);
		availableSeatsPanel.add(lblAListOf_3);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(30, 91, 726, 221);
		availableSeatsPanel.add(scrollPane_5);
		
		tableTicketNrOfSeat = new JTable();
		tableTicketNrOfSeat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getRouteInfoFromSelectedRow();
			}
		});
		scrollPane_5.setViewportView(tableTicketNrOfSeat);
		
		lblSelectARow = new JLabel("Select a row and adjust the available seats left. ");
		lblSelectARow.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectARow.setFont(new Font("Candara", Font.PLAIN, 13));
		lblSelectARow.setBounds(20, 323, 637, 32);
		availableSeatsPanel.add(lblSelectARow);
		
		lblRouteDescriptionLable = new JLabel("ROUTE DESCRIPTION");
		lblRouteDescriptionLable.setFont(new Font("Candara", Font.PLAIN, 18));
		lblRouteDescriptionLable.setBounds(30, 366, 168, 41);
		availableSeatsPanel.add(lblRouteDescriptionLable);
		
		lblRouteDescription = new JLabel("Route description");
		lblRouteDescription.setFont(new Font("Candara", Font.PLAIN, 13));
		lblRouteDescription.setBounds(40, 403, 267, 32);
		availableSeatsPanel.add(lblRouteDescription);
		
		lblScheduleIdLabel = new JLabel("SCHEDULE ID");
		lblScheduleIdLabel.setFont(new Font("Candara", Font.PLAIN, 18));
		lblScheduleIdLabel.setBounds(30, 446, 168, 41);
		availableSeatsPanel.add(lblScheduleIdLabel);
		
		lblScheduleID = new JLabel("Schedule ID");
		lblScheduleID.setFont(new Font("Candara", Font.PLAIN, 13));
		lblScheduleID.setBounds(40, 483, 267, 32);
		availableSeatsPanel.add(lblScheduleID);
		
		JLabel lblAssignAvailableSeat = new JLabel("Assign available seat left");
		lblAssignAvailableSeat.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAssignAvailableSeat.setBounds(486, 366, 209, 20);
		availableSeatsPanel.add(lblAssignAvailableSeat);
		
		txtAvailableSeatsLeft = new JTextField();
		((AbstractDocument)txtAvailableSeatsLeft.getDocument()).setDocumentFilter(new DocumentFilter() {
			Pattern regEx = Pattern.compile("\\d*");

	        @Override
	        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {          
	            Matcher matcher = regEx.matcher(text);
	            if(!matcher.matches()){
	                return;
	            }
	            super.replace(fb, offset, length, text, attrs);
	        }
		});
		txtAvailableSeatsLeft.setToolTipText("Ticket number");
		txtAvailableSeatsLeft.setColumns(10);
		txtAvailableSeatsLeft.setBounds(486, 384, 209, 30);
		availableSeatsPanel.add(txtAvailableSeatsLeft);
		
		btnAvailableSeatsLeft = new JPanel();
		btnAvailableSeatsLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				updateNumberOfSeatsLeft();
				displayRouteInTableWithNrOfSeat();
			}
		});
		btnAvailableSeatsLeft.setLayout(null);
		btnAvailableSeatsLeft.setBackground(new Color(60, 71, 85));
		btnAvailableSeatsLeft.setBounds(486, 425, 209, 32);
		availableSeatsPanel.add(btnAvailableSeatsLeft);
		
		JLabel lblAssignSeatsLeft = new JLabel("ASSIGN SEATS LEFT");
		lblAssignSeatsLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssignSeatsLeft.setForeground(Color.WHITE);
		lblAssignSeatsLeft.setFont(new Font("Candara", Font.BOLD, 14));
		lblAssignSeatsLeft.setBounds(10, 11, 189, 14);
		btnAvailableSeatsLeft.add(lblAssignSeatsLeft);
		
		lblErrorNumberSeats = new JLabel("");
		lblErrorNumberSeats.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorNumberSeats.setForeground(new Color(204, 0, 0));
		lblErrorNumberSeats.setFont(new Font("Candara", Font.PLAIN, 10));
		lblErrorNumberSeats.setBounds(520, 483, 175, 20);
		availableSeatsPanel.add(lblErrorNumberSeats);
		
		settingsPanel = new JPanel();
		settingsPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(settingsPanel, "name_20239578953600");
		settingsPanel.setLayout(null);
		
		lblSettings_1 = new JLabel("Appearance");
		lblSettings_1.setBounds(10, 11, 110, 41);
		lblSettings_1.setFont(new Font("Candara", Font.PLAIN, 18));
		settingsPanel.add(lblSettings_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(41, 47, 721, 69);
		settingsPanel.add(panel_1);
		panel_1.setLayout(null);
		
		lblThemeColorText = new JLabel("THEME COLOR");
		lblThemeColorText.setForeground(new Color(61, 70, 85));
		lblThemeColorText.setFont(new Font("Candara", Font.BOLD, 16));
		lblThemeColorText.setBounds(10, 11, 105, 14);
		panel_1.add(lblThemeColorText);
		
		lblNewLabel_5 = new JLabel("Change the theme color of the application to your preference");
		lblNewLabel_5.setFont(new Font("Candara", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 26, 374, 32);
		panel_1.add(lblNewLabel_5);
		
		btnBlueishColor = new JPanel();
		btnBlueishColor.setBackground(new Color(61, 70, 85));
		btnBlueishColor.setBounds(632, 11, 20, 20);
		panel_1.add(btnBlueishColor);
		
		btnBeigeColor = new JPanel();
		btnBeigeColor.setBackground(new Color(245, 222, 179));
		btnBeigeColor.setBounds(662, 11, 20, 20);
		panel_1.add(btnBeigeColor);
		
		btnGreenishColor = new JPanel();
		btnGreenishColor.setBackground(new Color(51, 153, 153));
		btnGreenishColor.setBounds(632, 38, 20, 20);
		panel_1.add(btnGreenishColor);
		
		btnPurpleColor = new JPanel();
		btnPurpleColor.setBackground(new Color(102, 0, 204));
		btnPurpleColor.setBounds(662, 38, 20, 20);
		panel_1.add(btnPurpleColor);
		
		lblFont = new JLabel("Font");
		lblFont.setFont(new Font("Candara", Font.PLAIN, 18));
		lblFont.setBounds(10, 122, 110, 41);
		settingsPanel.add(lblFont);
		
		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(252, 252, 252));
		panel_8.setBounds(41, 158, 721, 69);
		settingsPanel.add(panel_8);
		
		lblFontSizeText = new JLabel("Font size");
		lblFontSizeText.setForeground(new Color(61, 70, 85));
		lblFontSizeText.setFont(new Font("Candara", Font.BOLD, 16));
		lblFontSizeText.setBounds(10, 11, 105, 14);
		panel_8.add(lblFontSizeText);
		
		lblChangeTheFont = new JLabel("Change the font size of the application to your preference");
		lblChangeTheFont.setFont(new Font("Candara", Font.PLAIN, 13));
		lblChangeTheFont.setBounds(10, 26, 374, 32);
		panel_8.add(lblChangeTheFont);
		
		cmbFontSize = new JComboBox();
		cmbFontSize.setFont(new Font("Candara", Font.PLAIN, 12));
		cmbFontSize.setForeground(new Color(255, 255, 255));
		cmbFontSize.setModel(new DefaultComboBoxModel(new String[] {"12", "13", "14", "15", "16", "17", "18", "19"}));
		cmbFontSize.setBackground(new Color(61, 70, 85));
		cmbFontSize.setBounds(635, 11, 48, 20);
		panel_8.add(cmbFontSize);
		
		lblBrightness = new JLabel("Brightness");
		lblBrightness.setFont(new Font("Candara", Font.PLAIN, 18));
		lblBrightness.setBounds(10, 238, 110, 41);
		settingsPanel.add(lblBrightness);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(41, 274, 721, 69);
		settingsPanel.add(panel_9);
		
		lblAdjustBrightnessText = new JLabel("Adjust brightness");
		lblAdjustBrightnessText.setForeground(new Color(61, 70, 85));
		lblAdjustBrightnessText.setFont(new Font("Candara", Font.BOLD, 16));
		lblAdjustBrightnessText.setBounds(10, 11, 138, 20);
		panel_9.add(lblAdjustBrightnessText);
		
		lblReduceTheBrightness = new JLabel("Reduce the brightness of the application");
		lblReduceTheBrightness.setFont(new Font("Candara", Font.PLAIN, 13));
		lblReduceTheBrightness.setBounds(10, 26, 374, 32);
		panel_9.add(lblReduceTheBrightness);
		
		chkbAdjustBrightness = new JCheckBox("");
		chkbAdjustBrightness.setBackground(new Color(61,70,85));
		chkbAdjustBrightness.setForeground(new Color(255, 255, 255));
		chkbAdjustBrightness.setBounds(664, 11, 21, 23);
		panel_9.add(chkbAdjustBrightness);
		
		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(252, 252, 252));
		panel_10.setBounds(41, 390, 721, 69);
		settingsPanel.add(panel_10);
		
		lblLogoutWhenNoText = new JLabel("Logout when no interaction");
		lblLogoutWhenNoText.setForeground(new Color(61, 70, 85));
		lblLogoutWhenNoText.setFont(new Font("Candara", Font.BOLD, 16));
		lblLogoutWhenNoText.setBounds(10, 11, 217, 20);
		panel_10.add(lblLogoutWhenNoText);
		
		lblLogOutIf = new JLabel("Log out if no interaction within 30 minutes");
		lblLogOutIf.setFont(new Font("Candara", Font.PLAIN, 13));
		lblLogOutIf.setBounds(10, 26, 374, 32);
		panel_10.add(lblLogOutIf);
		
		chkbAutoLogout = new JCheckBox("");
		chkbAutoLogout.setForeground(Color.WHITE);
		chkbAutoLogout.setBackground(new Color(61, 70, 85));
		chkbAutoLogout.setBounds(665, 10, 21, 23);
		panel_10.add(chkbAutoLogout);
		
		lblAutoLogOut = new JLabel("Auto Log out");
		lblAutoLogOut.setFont(new Font("Candara", Font.PLAIN, 18));
		lblAutoLogOut.setBounds(10, 354, 110, 41);
		settingsPanel.add(lblAutoLogOut);
		
		btnSettingsSave = new JPanel();
		btnSettingsSave.setBackground(new Color(60,71,85));
		btnSettingsSave.setBounds(674, 566, 88, 32);
		settingsPanel.add(btnSettingsSave);
		btnSettingsSave.setLayout(null);
		
		lblNewLabel_8 = new JLabel("SAVE");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Candara", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 11, 68, 14);
		btnSettingsSave.add(lblNewLabel_8);
		
		btnSettingsCancel = new JPanel();
		btnSettingsCancel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		btnSettingsCancel.setLayout(null);
		btnSettingsCancel.setBackground(new Color(255, 255, 255));
		btnSettingsCancel.setBounds(576, 566, 88, 32);
		settingsPanel.add(btnSettingsCancel);
		
		lblCancelButtonText = new JLabel("CANCEL");
		lblCancelButtonText.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelButtonText.setForeground(new Color(61,70,85));
		lblCancelButtonText.setFont(new Font("Candara", Font.BOLD, 14));
		lblCancelButtonText.setBounds(10, 11, 68, 14);
		btnSettingsCancel.add(lblCancelButtonText);
		
		profilePanel = new JPanel();
		profilePanel.setBackground(Color.WHITE);
		layeredPane.add(profilePanel, "name_255630843630500");
		profilePanel.setLayout(null);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(86, 97, 115));
		panel_13.setBounds(0, 0, 790, 110);
		profilePanel.add(panel_13);
		
		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(210, 192, 340, 60);
		profilePanel.add(panel_14);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ClerkScreen.class.getResource("/Images/icons8_secured_letter_20px.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 11, 39, 38);
		panel_14.add(label_1);
		
		lblEmailAddress = new JLabel(Login.email);
		lblEmailAddress.setFont(new Font("Candara", Font.PLAIN, 15));
		lblEmailAddress.setBounds(70, 23, 241, 14);
		panel_14.add(lblEmailAddress);
		
		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(210, 263, 340, 60);
		profilePanel.add(panel_15);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(ClerkScreen.class.getResource("/Images/icons8_phone_20px.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(10, 11, 39, 38);
		panel_15.add(label_5);
		
		lblPhoneNumber = new JLabel(Login.phoneNumber);
		lblPhoneNumber.setFont(new Font("Candara", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(70, 23, 241, 14);
		panel_15.add(lblPhoneNumber);
		
		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBounds(210, 334, 340, 60);
		profilePanel.add(panel_16);
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(ClerkScreen.class.getResource("/Images/icons8_website_20px.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(10, 11, 39, 38);
		panel_16.add(label_7);
		
		lblWebsite = new JLabel(Login.website);
		lblWebsite.setFont(new Font("Candara", Font.PLAIN, 15));
		lblWebsite.setBounds(70, 23, 241, 14);
		panel_16.add(lblWebsite);
	}
	
	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	

	
	
	public void getScheduleIDFromSoldTicket() {
		try {
			String query = "select distinct scheduleID from ticket";
			preparedStatement = conn.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cmbIssueTicketScheduleID.setSelectedIndex(-1);
				cmbIssueTicketScheduleID.addItem(resultSet.getString("scheduleID"));
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	
	public double getPrice() {
		double price = 0;
		try {
			String query = "select * from route where description=?";
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, cmbIssueTicketScheduleID.getSelectedItem().toString());
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				price = resultSet.getDouble("price");
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		} 
		return price;
	}
	
	
	public String getScheduleID() {
		String scheduleCode = "";
		try {
			String query = "select * from route where description=?";
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, cmbIssueTicketScheduleID.getSelectedItem().toString());
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				scheduleCode = resultSet.getString("scheduleCode");
			}
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		} 
		return scheduleCode;
	}
	
	public void insertTicket() {
		try {
			String timeStamp = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
			String scheduleID = getScheduleID();
			double price = getPrice();
			
			String insertDataQueryString = "insert into ticket (transactionTime,scheduleID,date,time,price) values(?,?,?,?,?)";
			preparedStatement = conn.prepareStatement(insertDataQueryString);
			preparedStatement.setString(1, timeStamp);
			preparedStatement.setString(2, scheduleID);
			preparedStatement.setDouble(5, price);
			preparedStatement.execute();
			
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	
	
	public void updateTicketNumberBasedOnScheduleID() {
		if (!(txtTicketNumber.getText().isEmpty())) {
			try {
				String query = "update ticket set ticketNumber=? where scheduleID=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, txtTicketNumber.getText());
				preparedStatement.setString(2, cmbIssueTicketScheduleID.getSelectedItem().toString());
				preparedStatement.executeUpdate();
				
				txtTicketNumber.setText("");
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorIssueTicketNumber.setText("Provide ticket number!");
		}
	}
	

	public void displayTicketInTable() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("TICKET NUMBER");
		model.addColumn("TRANSACTION TIME");
		model.addColumn("SCHEDULE ID");
		model.addColumn("PRICE");
        try {
        	String query = "select * from ticket";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString("ticketNumber"),
            			resultSet.getString("transactionTime"),
            			resultSet.getString("scheduleID"),
            			resultSet.getString("price")
            	});
            }
            
            tableTicket.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void displayRouteInTableWithNrOfSeat() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("SCHEDULE ID");
		model.addColumn("ROUTE ID");
		model.addColumn("DESCRIPTION");
		model.addColumn("DATE");
		model.addColumn("TIME");
		model.addColumn("PRICE");
		model.addColumn("SEATS LEFT");
        try {
        	String query = "select * from route";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString("scheduleCode"),
            			resultSet.getString("rID"),
            			resultSet.getString("description"),
            			resultSet.getString("departureDate"),
            			resultSet.getString("departureTime"),
            			resultSet.getString("price"),
            			resultSet.getString("numberOfSeatLeft")
            	});
            }
            
            tableTicketNrOfSeat.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void	getRouteInfoFromSelectedRow() {
		btnAvailableSeatsLeft.setVisible(true);
		
		try {
			int row = tableTicketNrOfSeat.getSelectedRow();
			String routeDescription = (tableTicketNrOfSeat.getModel().getValueAt(row, 2)).toString();
			String scheduleIDCode = (tableTicketNrOfSeat.getModel().getValueAt(row, 0)).toString();
			
			String query = "select * from route where description=? and scheduleCode=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, routeDescription);
            preparedStatement.setString(2, scheduleIDCode);
            
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
            	lblRouteDescription.setText(resultSet.getString("description"));
            	lblScheduleID.setText(resultSet.getString("scheduleCode"));
            }
            
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void updateNumberOfSeatsLeft() {
		
		if (!(txtAvailableSeatsLeft.getText().isEmpty())) {
			try {
				String query = "update route set numberOfSeatLeft=? where description=? and scheduleCode=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, txtAvailableSeatsLeft.getText());
				preparedStatement.setString(2, lblRouteDescription.getText());
				preparedStatement.setString(3, lblScheduleID.getText());
				preparedStatement.executeUpdate();
				
				txtAvailableSeatsLeft.setText("");
				lblErrorNumberSeats.setText("");
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorNumberSeats.setText("Provide number of available seats!");
		}
	}
}
