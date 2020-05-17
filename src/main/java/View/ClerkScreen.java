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
	
	private JPanel citiesPanel;
	private JPanel issueTicketNumberPanel;
	private JPanel availableSeatsPanel;
	private JPanel settingsPanel;
	private JTextField txtCity;
	private JTable tableCity;
	private JScrollPane scrollPane;
	JPanel panelBG;
	JPanel sidePanel;
	JPanel panel;
	final JPanel homePanel;
	JPanel btnHomePanel;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JPanel btnIssueTicketNumber;
	JLabel label;
	JLabel lblCities;
	JLabel lblVehicle;
	JSeparator separator;
	JPanel panel_9;
	JLabel lblLastname;
	JLabel lblNewLabel_8;
	JPanel btnSchedulePanel;
	JPanel btnAddCity;
	JPanel btnAddDriver;
	JLabel label_2;
	JLabel lblWelcomeName;
	JLabel lblSchedules;
	JLabel lblReduceTheBrightness;
	JPanel btnSettingsPanel;
	JLabel label_4;
	JLabel lblType;
	JPanel btnAddVehicle;
	JLabel lblSettings;
	JPanel panel_5;
	JLabel lblLogout;
	JPanel panel_10;
	JComboBox<String> cmbType;
	JLabel lblAllThePossible;
	JLabel lblEmployeeName;
	JLabel lblLogoutWhenNo;
	JLabel lblVisitNorth;
	JPanel panel_6;
	JLabel lblCities_1;
	final JPanel driversPanel;
	JPanel panel_8;
	JSeparator separator_3;
	final JPanel vehiclesPanel;
	JLabel lblVehicleLicensePlate;
	final JPanel routesPanel;
	JPanel panel_1;
	JLabel lblCancel;
	JLabel lblAdjustBrightness;
	JLabel lblBrightness;
	JLabel lblAddDriver;
	JSeparator separator_1;
	JLabel lblRoute;
	JCheckBox chckbxNewCheckBox;
	JLabel lblFrom;
	JPanel panel_11;
	JComboBox<String> cmbFromCity;
	JLabel lblErrorIssueTicketNumber;
	JLabel lblFirstname;
	JPanel panel_12;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_7;
	JScrollPane scrollPane_2;
	JLabel lblNewLabel_2;
	JLabel lblAddCity;
	JLabel lblClose;
	JLabel lblCities_2;
	JLabel lblLogOutIf;
	JLabel lblErrorCity;
	JLabel lblNewLabel_5;
	JPanel panel_3;
	JLabel lblAutoLogOut;
	JLabel lblAListOf_2;
	JLabel lblChangeTheFont;
	JLabel lblFont;
	JPanel panel_4;
	JPanel btnAvailableSeatsLeft;
	JLabel lblSettings_1;
	JPanel panel_2;
	JLabel lblAListOf_1;
	JLabel lblDriver;
	JCheckBox checkBox;
	JLabel lblFontSize;
	JComboBox comboBox;
	JScrollPane scrollPane_1;
	JPanel panel_7;
	private JLabel lblAListOf;
	private JLabel lblCity_1;
	JSeparator separator_2;
	JLabel lblAddRoute;
	private JTextField txtFirstnameDriver;
	JLabel lblAddVehicle;
	private JTextField txtLastnameDriver;
	private JTable tableDrivers;
	private JLabel lblErrorDriver;
	private JTextField txtLicencePlate;
	private JTable tableVehicle;
	private JLabel lblErrorVehicle;
	private JPanel profilePanel;
	private JPanel panel_13;
	JPanel btnAddRoute;
	private JTextField txtDepartureDate;
	private JCalendar departureDate;
	private JTextField txtDepartureTime;
	JComboBox<String> cmbToCity;
	private JLabel lblDepartureTime;
	JPanel btnProceedIssueTicketNumber;
	private JLabel lblErrorRoute;
	private JTable tableRoute;
	JScrollPane scrollPane_3;
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
		
		lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setBounds(95, 14, 78, 33);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 19));
		btnHomePanel.add(lblNewLabel_1);
		
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
		
		lblCities = new JLabel("Issue Ticket Numbers");
		lblCities.setHorizontalAlignment(SwingConstants.LEFT);
		lblCities.setForeground(Color.WHITE);
		lblCities.setFont(new Font("Candara", Font.BOLD, 19));
		lblCities.setBounds(95, 14, 178, 33);
		btnIssueTicketNumber.add(lblCities);
		
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
		
		lblSchedules = new JLabel("Available Seats");
		lblSchedules.setHorizontalAlignment(SwingConstants.LEFT);
		lblSchedules.setForeground(Color.WHITE);
		lblSchedules.setFont(new Font("Candara", Font.BOLD, 19));
		lblSchedules.setBounds(95, 14, 143, 33);
		btnSchedulePanel.add(lblSchedules);
		
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
		
		lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.LEFT);
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setFont(new Font("Candara", Font.BOLD, 19));
		lblSettings.setBounds(95, 14, 78, 33);
		btnSettingsPanel.add(lblSettings);
		
		panel_5 = new JPanel();
		panel_5.setToolTipText("Profile");
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(profilePanel);
			}
		});
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(48, 55, 66));
		panel_5.setBounds(0, 702, 283, 58);
		sidePanel.add(panel_5);
		
		lblLogout = new JLabel("");
		lblLogout.setToolTipText("Sign out");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
//				clerkScreenFrame.dispose();
//				Login loginScreen = new Login();
//				loginScreen.setUndecorated(true);
//				loginScreen.setVisible(true);
			}
		});
		lblLogout.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_sign_out_20px.png")));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setBounds(22, 11, 40, 33);
		panel_5.add(lblLogout);
		
		lblEmployeeName = new JLabel(Login.empName);
		lblEmployeeName.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeName.setForeground(Color.WHITE);
		lblEmployeeName.setFont(new Font("Candara", Font.BOLD, 19));
		lblEmployeeName.setBounds(95, 14, 78, 33);
		panel_5.add(lblEmployeeName);
		
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
		
		driversPanel = new JPanel();
		driversPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(driversPanel, "name_42887129278700");
		driversPanel.setLayout(null);
		
		btnAddDriver = new JPanel();
		btnAddDriver.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertDriver();
				getDrivers();
			}
		});
		btnAddDriver.setLayout(null);
		btnAddDriver.setBackground(new Color(60, 71, 85));
		btnAddDriver.setBounds(83, 306, 110, 32);
		driversPanel.add(btnAddDriver);
		
		lblAddDriver = new JLabel("ADD DRIVER");
		lblAddDriver.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddDriver.setForeground(Color.WHITE);
		lblAddDriver.setFont(new Font("Candara", Font.BOLD, 14));
		lblAddDriver.setBounds(10, 11, 90, 14);
		btnAddDriver.add(lblAddDriver);
		
		lblAListOf_1 = new JLabel("A list of the coach drivers. Feel free to add more drivers to it. ");
		lblAListOf_1.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAListOf_1.setBounds(20, 48, 533, 32);
		driversPanel.add(lblAListOf_1);
		
		lblDriver = new JLabel("Drivers");
		lblDriver.setFont(new Font("Candara", Font.PLAIN, 18));
		lblDriver.setBounds(10, 11, 110, 41);
		driversPanel.add(lblDriver);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(264, 170, 22, 316);
		driversPanel.add(separator_1);
		
		lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Candara", Font.PLAIN, 13));
		lblFirstname.setBounds(20, 170, 65, 20);
		driversPanel.add(lblFirstname);
		
		txtFirstnameDriver = new JTextField();
		txtFirstnameDriver.setToolTipText("Driver's firstname");
		txtFirstnameDriver.setColumns(10);
		txtFirstnameDriver.setBounds(20, 199, 175, 30);
		driversPanel.add(txtFirstnameDriver);
		
		lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Candara", Font.PLAIN, 13));
		lblLastname.setBounds(18, 236, 67, 20);
		driversPanel.add(lblLastname);
		
		txtLastnameDriver = new JTextField();
		txtLastnameDriver.setToolTipText("Driver's lastname");
		txtLastnameDriver.setColumns(10);
		txtLastnameDriver.setBounds(18, 265, 175, 30);
		driversPanel.add(txtLastnameDriver);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(298, 172, 255, 293);
		driversPanel.add(scrollPane_1);
		
		tableDrivers = new JTable();
		scrollPane_1.setViewportView(tableDrivers);
		
		lblErrorDriver = new JLabel("");
		lblErrorDriver.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorDriver.setForeground(new Color(204, 0, 0));
		lblErrorDriver.setFont(new Font("Candara", Font.PLAIN, 12));
		lblErrorDriver.setBounds(20, 349, 175, 20);
		driversPanel.add(lblErrorDriver);
		
		vehiclesPanel = new JPanel();
		vehiclesPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(vehiclesPanel, "name_42931343579900");
		vehiclesPanel.setLayout(null);
		
		lblVehicle = new JLabel("Vehicle");
		lblVehicle.setFont(new Font("Candara", Font.PLAIN, 18));
		lblVehicle.setBounds(10, 11, 110, 41);
		vehiclesPanel.add(lblVehicle);
		
		lblAListOf_2 = new JLabel("A list of the coaches/buses.  Feel free to add more to it. ");
		lblAListOf_2.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAListOf_2.setBounds(20, 48, 533, 32);
		vehiclesPanel.add(lblAListOf_2);
		
		lblVehicleLicensePlate = new JLabel("Vehicle License Plate");
		lblVehicleLicensePlate.setFont(new Font("Candara", Font.PLAIN, 13));
		lblVehicleLicensePlate.setBounds(20, 170, 122, 20);
		vehiclesPanel.add(lblVehicleLicensePlate);
		
		txtLicencePlate = new JTextField();
		txtLicencePlate.setToolTipText("Vehicle license plate");
		txtLicencePlate.setColumns(10);
		txtLicencePlate.setBounds(20, 199, 175, 30);
		vehiclesPanel.add(txtLicencePlate);
		
		lblType = new JLabel("Type");
		lblType.setFont(new Font("Candara", Font.PLAIN, 13));
		lblType.setBounds(18, 236, 67, 20);
		vehiclesPanel.add(lblType);
		
		btnAddVehicle = new JPanel();
		btnAddVehicle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertVehicle();
			}
		});
		btnAddVehicle.setLayout(null);
		btnAddVehicle.setBackground(new Color(60, 71, 85));
		btnAddVehicle.setBounds(83, 306, 110, 32);
		vehiclesPanel.add(btnAddVehicle);
		
		lblAddVehicle = new JLabel("ADD VEHICLE");
		lblAddVehicle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddVehicle.setForeground(Color.WHITE);
		lblAddVehicle.setFont(new Font("Candara", Font.BOLD, 14));
		lblAddVehicle.setBounds(10, 11, 90, 14);
		btnAddVehicle.add(lblAddVehicle);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(220, 170, 22, 316);
		vehiclesPanel.add(separator_2);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(252, 172, 361, 316);
		vehiclesPanel.add(scrollPane_2);
		
		tableVehicle = new JTable();
		scrollPane_2.setViewportView(tableVehicle);
		
		cmbType = new JComboBox<String>();
		cmbType.setToolTipText("type of vehicle");
		cmbType.setModel(new DefaultComboBoxModel<String>(new String[] {"Coach", "Bus"}));
		cmbType.setBounds(20, 259, 175, 30);
		vehiclesPanel.add(cmbType);
		
		lblErrorVehicle = new JLabel("");
		lblErrorVehicle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorVehicle.setForeground(new Color(204, 0, 0));
		lblErrorVehicle.setFont(new Font("Candara", Font.PLAIN, 12));
		lblErrorVehicle.setBounds(20, 349, 175, 20);
		vehiclesPanel.add(lblErrorVehicle);
		
		routesPanel = new JPanel();
		routesPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(routesPanel, "name_42936498807100");
		routesPanel.setLayout(null);
		
		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(264, 170, 22, 354);
		routesPanel.add(separator_3);
		
		btnAddRoute = new JPanel();
		btnAddRoute.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertRoute();
				displayRouteInTable();
			}
		});
		btnAddRoute.setLayout(null);
		btnAddRoute.setBackground(new Color(60, 71, 85));
		btnAddRoute.setBounds(75, 454, 110, 32);
		routesPanel.add(btnAddRoute);
		
		lblAddRoute = new JLabel("ADD ROUTE");
		lblAddRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRoute.setForeground(Color.WHITE);
		lblAddRoute.setFont(new Font("Candara", Font.BOLD, 14));
		lblAddRoute.setBounds(10, 11, 90, 14);
		btnAddRoute.add(lblAddRoute);
		
		lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Candara", Font.PLAIN, 13));
		lblFrom.setBounds(10, 163, 35, 20);
		routesPanel.add(lblFrom);
		
		lblAllThePossible = new JLabel("All the possible routes. Feel free to add more to the list.");
		lblAllThePossible.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAllThePossible.setBounds(20, 48, 533, 32);
		routesPanel.add(lblAllThePossible);
		
		lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Candara", Font.PLAIN, 18));
		lblRoute.setBounds(10, 11, 110, 41);
		routesPanel.add(lblRoute);
		
		cmbFromCity = new JComboBox();
		cmbFromCity.setToolTipText("from which city");
		cmbFromCity.setBounds(10, 192, 175, 30);
		routesPanel.add(cmbFromCity);
		
		cmbToCity = new JComboBox();
		cmbToCity.setToolTipText("to which city");
		cmbToCity.setBounds(10, 263, 175, 30);
		routesPanel.add(cmbToCity);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTo.setBounds(10, 234, 35, 20);
		routesPanel.add(lblTo);
		
//		departureDate = new JCalendar();
//		departureDate.setBounds(10, 304, 122, 20);
//		routesPanel.add(departureDate);
		
		txtDepartureDate = new JTextField();
		txtDepartureDate.setToolTipText("Departure Date");
		txtDepartureDate.setColumns(10);
		txtDepartureDate.setBounds(10, 333, 175, 30);
		routesPanel.add(txtDepartureDate);
		
		JLabel lblDepartureDate = new JLabel("Departure Date");
		lblDepartureDate.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDepartureDate.setBounds(10, 304, 122, 20);
		routesPanel.add(lblDepartureDate);
		
		txtDepartureTime = new JTextField();
		txtDepartureTime.setToolTipText("Departure Time");
		txtDepartureTime.setColumns(10);
		txtDepartureTime.setBounds(10, 407, 175, 30);
		routesPanel.add(txtDepartureTime);
		
		lblDepartureTime = new JLabel("Departure Time");
		lblDepartureTime.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDepartureTime.setBounds(10, 378, 122, 20);
		routesPanel.add(lblDepartureTime);
		
		lblErrorRoute = new JLabel("");
		lblErrorRoute.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorRoute.setForeground(new Color(204, 0, 0));
		lblErrorRoute.setFont(new Font("Candara", Font.PLAIN, 10));
		lblErrorRoute.setBounds(10, 504, 175, 20);
		routesPanel.add(lblErrorRoute);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(296, 170, 448, 316);
		routesPanel.add(scrollPane_3);
		
		tableRoute = new JTable();
		scrollPane_3.setViewportView(tableRoute);
		
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
		
		
		
		
		citiesPanel = new JPanel();
		citiesPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(citiesPanel, "name_20092475988800");
		citiesPanel.setLayout(null);
		
		lblCities_2 = new JLabel("Cities");
		lblCities_2.setFont(new Font("Candara", Font.PLAIN, 18));
		lblCities_2.setBounds(10, 11, 110, 41);
		citiesPanel.add(lblCities_2);
		
		txtCity = new JTextField();
		txtCity.setToolTipText("Add new city");
		txtCity.setBounds(10, 192, 175, 30);
		citiesPanel.add(txtCity);
		txtCity.setColumns(10);
		
		btnAddCity = new JPanel();
		btnAddCity.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertCity();
				getcities();
			}
		});
		btnAddCity.setLayout(null);
		btnAddCity.setBackground(new Color(60, 71, 85));
		btnAddCity.setBounds(97, 233, 88, 32);
		citiesPanel.add(btnAddCity);
		
		lblAddCity = new JLabel("ADD CITY");
		lblAddCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCity.setForeground(Color.WHITE);
		lblAddCity.setFont(new Font("Candara", Font.BOLD, 14));
		lblAddCity.setBounds(10, 11, 68, 14);
		btnAddCity.add(lblAddCity);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(264, 170, 22, 316);
		citiesPanel.add(separator);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(319, 170, 234, 316);
		citiesPanel.add(scrollPane);
		
		tableCity = new JTable();
		scrollPane.setViewportView(tableCity);
		
		lblErrorCity = new JLabel("");
		lblErrorCity.setFont(new Font("Candara", Font.PLAIN, 12));
		lblErrorCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorCity.setForeground(new Color(204, 0, 0));
		lblErrorCity.setBounds(10, 270, 175, 20);
		citiesPanel.add(lblErrorCity);
		
		lblAListOf = new JLabel("A list of the cities where tourists can visit. Feel free to add more cities to it. ");
		lblAListOf.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAListOf.setBounds(20, 48, 533, 32);
		citiesPanel.add(lblAListOf);
		
		lblCity_1 = new JLabel("City");
		lblCity_1.setFont(new Font("Candara", Font.PLAIN, 13));
		lblCity_1.setBounds(10, 163, 35, 20);
		citiesPanel.add(lblCity_1);
		
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
		
		lblNewLabel_4 = new JLabel("THEME COLOR");
		lblNewLabel_4.setForeground(new Color(61, 70, 85));
		lblNewLabel_4.setFont(new Font("Candara", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 11, 105, 14);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Change the theme color of the application to your preference");
		lblNewLabel_5.setFont(new Font("Candara", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 26, 374, 32);
		panel_1.add(lblNewLabel_5);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(61, 70, 85));
		panel_2.setBounds(632, 11, 20, 20);
		panel_1.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 153, 51));
		panel_3.setBounds(662, 11, 20, 20);
		panel_1.add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 153, 153));
		panel_4.setBounds(632, 38, 20, 20);
		panel_1.add(panel_4);
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(102, 0, 204));
		panel_7.setBounds(662, 38, 20, 20);
		panel_1.add(panel_7);
		
		lblFont = new JLabel("Font");
		lblFont.setFont(new Font("Candara", Font.PLAIN, 18));
		lblFont.setBounds(10, 122, 110, 41);
		settingsPanel.add(lblFont);
		
		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(252, 252, 252));
		panel_8.setBounds(41, 158, 721, 69);
		settingsPanel.add(panel_8);
		
		lblFontSize = new JLabel("Font size");
		lblFontSize.setForeground(new Color(61, 70, 85));
		lblFontSize.setFont(new Font("Candara", Font.BOLD, 16));
		lblFontSize.setBounds(10, 11, 105, 14);
		panel_8.add(lblFontSize);
		
		lblChangeTheFont = new JLabel("Change the font size of the application to your preference");
		lblChangeTheFont.setFont(new Font("Candara", Font.PLAIN, 13));
		lblChangeTheFont.setBounds(10, 26, 374, 32);
		panel_8.add(lblChangeTheFont);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Candara", Font.PLAIN, 12));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"12px", "14px", "16px"}));
		comboBox.setBackground(new Color(61, 70, 85));
		comboBox.setBounds(635, 11, 48, 20);
		panel_8.add(comboBox);
		
		lblBrightness = new JLabel("Brightness");
		lblBrightness.setFont(new Font("Candara", Font.PLAIN, 18));
		lblBrightness.setBounds(10, 238, 110, 41);
		settingsPanel.add(lblBrightness);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(41, 274, 721, 69);
		settingsPanel.add(panel_9);
		
		lblAdjustBrightness = new JLabel("Adjust brightness");
		lblAdjustBrightness.setForeground(new Color(61, 70, 85));
		lblAdjustBrightness.setFont(new Font("Candara", Font.BOLD, 16));
		lblAdjustBrightness.setBounds(10, 11, 138, 20);
		panel_9.add(lblAdjustBrightness);
		
		lblReduceTheBrightness = new JLabel("Reduce the brightness of the application");
		lblReduceTheBrightness.setFont(new Font("Candara", Font.PLAIN, 13));
		lblReduceTheBrightness.setBounds(10, 26, 374, 32);
		panel_9.add(lblReduceTheBrightness);
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(61,70,85));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(664, 11, 21, 23);
		panel_9.add(chckbxNewCheckBox);
		
		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(252, 252, 252));
		panel_10.setBounds(41, 390, 721, 69);
		settingsPanel.add(panel_10);
		
		lblLogoutWhenNo = new JLabel("Logout when no interaction");
		lblLogoutWhenNo.setForeground(new Color(61, 70, 85));
		lblLogoutWhenNo.setFont(new Font("Candara", Font.BOLD, 16));
		lblLogoutWhenNo.setBounds(10, 11, 217, 20);
		panel_10.add(lblLogoutWhenNo);
		
		lblLogOutIf = new JLabel("Log out if no interaction within 30 minutes");
		lblLogOutIf.setFont(new Font("Candara", Font.PLAIN, 13));
		lblLogOutIf.setBounds(10, 26, 374, 32);
		panel_10.add(lblLogOutIf);
		
		checkBox = new JCheckBox("");
		checkBox.setForeground(Color.WHITE);
		checkBox.setBackground(new Color(61, 70, 85));
		checkBox.setBounds(665, 10, 21, 23);
		panel_10.add(checkBox);
		
		lblAutoLogOut = new JLabel("Auto Log out");
		lblAutoLogOut.setFont(new Font("Candara", Font.PLAIN, 18));
		lblAutoLogOut.setBounds(10, 354, 110, 41);
		settingsPanel.add(lblAutoLogOut);
		
		panel_11 = new JPanel();
		panel_11.setBackground(new Color(60,71,85));
		panel_11.setBounds(674, 566, 88, 32);
		settingsPanel.add(panel_11);
		panel_11.setLayout(null);
		
		lblNewLabel_8 = new JLabel("SAVE");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Candara", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 11, 68, 14);
		panel_11.add(lblNewLabel_8);
		
		panel_12 = new JPanel();
		panel_12.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
		panel_12.setLayout(null);
		panel_12.setBackground(new Color(255, 255, 255));
		panel_12.setBounds(576, 566, 88, 32);
		settingsPanel.add(panel_12);
		
		lblCancel = new JLabel("CANCEL");
		lblCancel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancel.setForeground(new Color(61,70,85));
		lblCancel.setFont(new Font("Candara", Font.BOLD, 14));
		lblCancel.setBounds(10, 11, 68, 14);
		panel_12.add(lblCancel);
		
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
	
	public void insertCity() {
		if (!(txtCity.getText().isEmpty())) {
			try {
				String query = "select * from city where cityName=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, txtCity.getText());
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					lblErrorCity.setText(txtCity.getText() + " already exists!");
					System.out.println(txtCity.getText() + " already exists!");
				}else {
					String insertDataQueryString = "insert into city (cityName) values(?)";
					preparedStatement = conn.prepareStatement(insertDataQueryString);
					preparedStatement.setString(1, txtCity.getText());
					preparedStatement.execute();
					txtCity.setText("");
					lblErrorCity.setText("");
				}
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorCity.setText("Please, provide city...");
		}
	}
	
	public void getcities() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("City");
        try {
        	String query = "select * from city";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString("cityID"),
            			resultSet.getString("cityName")
            	});
            }
            
            tableCity.setModel(model);
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void insertDriver() {
		if (!(txtFirstnameDriver.getText().isEmpty() || txtLastnameDriver.getText().isEmpty())) {
			try {
				String query = "select * from driver where firstname=? and lastname=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, txtFirstnameDriver.getText());
				preparedStatement.setString(2, txtLastnameDriver.getText());
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					lblErrorDriver.setText(txtFirstnameDriver.getText() + " " + txtLastnameDriver.getText() + " already exists!");
					System.out.println(txtFirstnameDriver.getText() + " " + txtLastnameDriver.getText() + " already exists!");
				}else {
					String insertDataQueryString = "insert into driver (firstname,lastname) values(?,?)";
					preparedStatement = conn.prepareStatement(insertDataQueryString);
					preparedStatement.setString(1, txtFirstnameDriver.getText());
					preparedStatement.setString(2, txtLastnameDriver.getText());
					preparedStatement.execute();
					txtFirstnameDriver.setText("");
					txtLastnameDriver.setText("");
					lblErrorDriver.setText("");
				}
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorCity.setText("Please, provide city...");
		}
	}
	
	public void getDrivers() {
			
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("ID");
			model.addColumn("FIRSTNAME");
			model.addColumn("LASTNAME");
	        try {
	        	String query = "select * from driver";
	            preparedStatement = conn.prepareStatement(query);
	            resultSet = preparedStatement.executeQuery();
	            
	            while(resultSet.next()) {
	            	model.addRow(new Object[] {
	            			resultSet.getString("driverID"),
	            			resultSet.getString("firstname"),
	            			resultSet.getString("lastname")
	            	});
	            }
	            
	            tableDrivers.setModel(model);
	            
	        }catch (Exception e) {
				System.out.println("error: " + e);
			}
		}

	public void insertVehicle() {
		if (!(txtLicencePlate.getText().isEmpty())) {
			try {
				String query = "select * from vehicle where vehicleLicensePlate=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, txtLicencePlate.getText());
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					lblErrorVehicle.setText(txtLicencePlate.getText() + " already exists!");
					System.out.println(txtLicencePlate.getText() + " already exists!");
				}else {
					String insertDataQueryString = "insert into vehicle (vehicleType,vehicleLicensePlate) values(?,?)";
					preparedStatement = conn.prepareStatement(insertDataQueryString);
					preparedStatement.setString(1, cmbType.getSelectedItem().toString());
					preparedStatement.setString(2, txtLicencePlate.getText());
					preparedStatement.execute();
					txtLicencePlate.setText("");
					lblErrorVehicle.setText("");
				}
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorCity.setText("Please, provide vehicle...");
		}
	}
	
	public void getVehicles() {
			
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("ID");
			model.addColumn("VEHICLE TYPE");
			model.addColumn("LICENSE PLATE");
	        try {
	        	String query = "select * from vehicle";
	            preparedStatement = conn.prepareStatement(query);
	            resultSet = preparedStatement.executeQuery();
	            
	            while(resultSet.next()) {
	            	model.addRow(new Object[] {
	            			resultSet.getString("vehicleID"),
	            			resultSet.getString("vehicleType"),
	            			resultSet.getString("vehicleLicensePlate")
	            	});
	            }
	            
	            tableVehicle.setModel(model);
	            
	        }catch (Exception e) {
				System.out.println("error: " + e);
			}
	}
	
	public boolean checkComboBoxValues() {
		return cmbFromCity.getSelectedItem().toString().equals(cmbToCity.getSelectedItem().toString());
	}
	
	public void insertRoute() {
		if (!(txtDepartureDate.getText().isEmpty() || txtDepartureTime.getText().isEmpty())) {
			if (!(checkComboBoxValues())) {
				try {
					String query = "select * from route where description=? and departureDate=?";
					preparedStatement = conn.prepareStatement(query);
					preparedStatement.setString(1, cmbFromCity.getSelectedItem().toString() + " - " + cmbToCity.getSelectedItem().toString());
					preparedStatement.setString(2, txtDepartureDate.getText());
					resultSet = preparedStatement.executeQuery();
					if (resultSet.next()) {
						lblErrorRoute.setText("This route already exists!");
						System.out.println("This route already exists!");
					}else {
						String insertRouteData = "insert into route (description,departureDate,departureTime) values(?,?,?)";
						preparedStatement = conn.prepareStatement(insertRouteData);
						preparedStatement.setString(1, cmbFromCity.getSelectedItem().toString() + " - " + cmbToCity.getSelectedItem().toString());
						preparedStatement.setString(2, txtDepartureDate.getText());
						preparedStatement.setString(3, txtDepartureTime.getText());
						preparedStatement.execute();
						txtDepartureDate.setText("");
						txtDepartureTime.setText("");
						lblErrorRoute.setText("");
					}
				} catch (Exception e) {
					System.out.println("error: " + e);
				}
			}else {
				lblErrorRoute.setText("From and To can't be the same");
			}
			

		}else {
			lblErrorRoute.setText("Invalid date or time...");
		}
	}
	
	public void displayRouteInTable() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("DESCRIPTION");
		model.addColumn("DATE");
		model.addColumn("TIME");
        try {
        	String query = "select * from route";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString("routeID"),
            			resultSet.getString("description"),
            			resultSet.getString("departureDate"),
            			resultSet.getString("departureTime")
            	});
            }
            
            tableRoute.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
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
