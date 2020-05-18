package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;

import Database.DatabaseConnection;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ManagerScreen extends JFrame {
	
	Connection conn = DatabaseConnection.connectDB();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
	
	int xx,xy;
	
	private static ManagerScreen managerFrame;
	
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	
	private JPanel citiesPanel;
	private JPanel availableSeatsPanel;
	private JPanel schedulePanel;
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
	JLabel lblHomeButton;
	JPanel btnAvailableSeatsLeft;
	JPanel btnAvailableSeats;
	JLabel lblErrorAssignDriverVehicle;
	JLabel label;
	JLabel lblAvailableSeatsButton;
	JLabel lblVehicle;
	JSeparator separator;
	JPanel panel_9;
	JLabel lblLastname;
	JLabel lblDepartureDate;
	JLabel lblNewLabel_8;
	JPanel btnSchedulePanel;
	JPanel btnAddCity;
	JPanel btnAddDriver;
	JLabel label_2;
	JLabel lblSchedulesButton;
	JLabel lblReduceTheBrightness;
	JPanel btnSettingsPanel;
	JLabel label_4;
	JLabel lblType;
	JPanel btnAddVehicle;
	JLabel lblSettingsButton;
	JPanel btnProfilePanel;
	JLabel lblLogout;
	JPanel panel_10;
	JComboBox<String> cmbType;
	JLabel lblAllThePossible;
	JLabel lblEmployeeName;
	JPanel btnRoutesPanel;
	JLabel lblLogoutWhenNoText;
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
	JPanel btnCitiesPanel;
	JLabel lblNewLabel_6;
	JLabel lblCancelButtonText;
	JComboBox<String> cmbVehicle;
	JLabel lblVehicles;
	JLabel label_1;
	JLabel lblAdjustBrightnessText;
	JLabel lblBrightness;
	JPanel btnDriversPanel;
	JLabel lblAddDriver;
	JPanel btnAddScheduleID;
	JLabel lblDrivers;
	JSeparator separator_1;
	JLabel lblTo;
	JLabel lblWelcomeName;
	JLabel lblRoute;
	JLabel label_3;
	JComboBox<String> cmbSchedule;
	JCheckBox chkbAdjustBrightness;
	JLabel lblPrice;
	JPanel btnVehiclesPanel;
	JLabel lblFrom;
	JLabel label_5;
	JPanel btnSettingsSave;
	JComboBox<String> cmbFromCity;
	JLabel lblAssignRouteTo;
	JLabel lblFirstname;
	JPanel btnSettingsCancel;
	JLabel lblRoutes;
	JLabel lblThemeColorText;
	JLabel label_6;
	JLabel lblNewLabel_7;
	JScrollPane scrollPane_2;
	JLabel lblRouteDescription;
	JLabel lblNewLabel_2;
	JComboBox<String> cmbRole;
	JLabel lblAddCity;
	JLabel lblClose;
	JLabel lblCities_2;
	JLabel lblLogOutIf;
	JLabel lblErrorCity;
	JLabel lblNewLabel_5;
	JPanel btnBeigeColor;
	JLabel lblAutoLogOut;
	JLabel lblAListOf_2;
	JLabel lblChangeTheFont;
	JLabel lblFont;
	JPanel btnGreenishColor;
	JLabel lblSettings_1;
	JPanel btnBlueishColor;
	JLabel lblAListOf_1;
	JLabel lblDriver;
	JCheckBox chkbAutoLogout;
	JLabel lblName;
	JLabel lblFontSizeText;
	JComboBox cmbFontSize;
	JScrollPane scrollPane_1;
	JPanel btnAssignDriverVehicle;
	JPanel btnPurpleColor;
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
	JPanel btnAddEmployee;
	private JPanel profilePanel;
	private JPanel profilePanelBar;
	JPanel btnAddRoute;
	private JTextField txtDepartureDate;
	private JCalendar departureDate;
	private JTextField txtDepartureTime;
	JComboBox<String> cmbToCity;
	private JLabel lblDepartureTime;
	private JLabel lblErrorRoute;
	private JTable tableRoute;
	JScrollPane scrollPane_3;
	private JLabel lblNewLabel_10;
	private JTextField txtPrice;
	private JTextField txtScheduleID;
	private JTable tableScheduleIDs;
	private JLabel lblErrorScheduleID;
	JComboBox<String> cmbDriver;
	private JPanel issueTicketNumberPanel;
	JLabel lblAddEmployee;
	private JLabel label_10;
	private JLabel label_11;
	JLabel lblScheduleID;
	private JComboBox<String> cmbIssueTicketScheduleID;
	private JLabel label_12;
	private JSeparator separator_5;
	private JPanel btnProceedIssueTicketNumber;
	private JLabel label_13;
	private JLabel lblErrorIssueTicketNumber;
	private JTextField txtTicketNumber;
	private JLabel label_15;
	private JPanel btnIssueTicketNumber;
	private JLabel label_16;
	private JLabel lblIssueTicketNumberButton;
	private JTable tableTicket;
	private JScrollPane scrollPane_5;
	private JTextField txtAvailableSeatsLeft;
	private JTable tableTicketNrOfSeat;
	private JLabel lblErrorNumberSeats;
	private JPanel panel_14;
	private JLabel label_7;
	private JLabel lblEmailAddress;
	private JPanel panel_15;
	private JLabel label_9;
	private JLabel lblPhoneNumber;
	private JPanel panel_16;
	private JLabel label_22;
	private JLabel lblWebsite;
	private JTextField txtName;
	private JTable tableEmployees;
	private JLabel lblErrorHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					managerFrame = new ManagerScreen();
					managerFrame.setUndecorated(true);
					managerFrame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManagerScreen() {
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
				ManagerScreen.this.setLocation(x - xx, y - xy);
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
		sidePanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
				displayEmployeeInTable();
			}
		});
		btnHomePanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
		lblHomeButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
		btnHomePanel.add(lblHomeButton);
		
		btnAvailableSeats = new JPanel();
		btnAvailableSeats.setLayout(null);
		btnAvailableSeats.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnAvailableSeats.setBounds(0, 164, 283, 58);
		btnAvailableSeats.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(availableSeatsPanel);
				displayRouteInTableWithNrOfSeat();
				btnAvailableSeatsLeft.setVisible(false);
				
				
				populateAllDriversToComboBox();
				populateAllVehiclesToComboBox();
				
				btnAssignDriverVehicle.setVisible(false);
			}
		});
		sidePanel.add(btnAvailableSeats);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_tour_bus_20px.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(22, 11, 40, 33);
		btnAvailableSeats.add(label);
		
		lblAvailableSeatsButton = new JLabel("Available Seats");
		lblAvailableSeatsButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvailableSeatsButton.setForeground(Color.WHITE);
		lblAvailableSeatsButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
		lblAvailableSeatsButton.setBounds(95, 14, 133, 33);
		btnAvailableSeats.add(lblAvailableSeatsButton);
		
		btnSchedulePanel = new JPanel();
		btnSchedulePanel.setLayout(null);
		btnSchedulePanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnSchedulePanel.setBounds(0, 407, 283, 58);
		btnSchedulePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(schedulePanel);
				getScheduleIDs();
			}
		});
		sidePanel.add(btnSchedulePanel);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_grid_3_20px.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(22, 11, 40, 33);
		btnSchedulePanel.add(label_2);
		
		lblSchedulesButton = new JLabel("Schedules");
		lblSchedulesButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblSchedulesButton.setForeground(Color.WHITE);
		lblSchedulesButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
		lblSchedulesButton.setBounds(95, 14, 97, 33);
		btnSchedulePanel.add(lblSchedulesButton);
		
		btnSettingsPanel = new JPanel();
		btnSettingsPanel.setLayout(null);
		btnSettingsPanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnSettingsPanel.setBounds(0, 525, 283, 58);
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
		lblSettingsButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
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
		btnProfilePanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnProfilePanel.setBounds(0, 702, 283, 58);
		sidePanel.add(btnProfilePanel);
		
		lblLogout = new JLabel("");
		lblLogout.setToolTipText("Sign out");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				System.exit(0);
//				managerFrame.dispose();
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
		lblEmployeeName.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
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
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(256, 131, 22, 316);
		homePanel.add(separator_6);
		
		btnAddEmployee = new JPanel();
		btnAddEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				addNewEmployee();
				addNewEmployeeSettings();
				displayEmployeeInTable();
			}
		});
		btnAddEmployee.setLayout(null);
		btnAddEmployee.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnAddEmployee.setBounds(63, 267, 122, 32);
		homePanel.add(btnAddEmployee);
		
		lblAddEmployee = new JLabel("ADD EMPLOYEE");
		lblAddEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddEmployee.setForeground(Color.WHITE);
		lblAddEmployee.setFont(new Font("Candara", Font.BOLD, 14));
		lblAddEmployee.setBounds(10, 11, 102, 14);
		btnAddEmployee.add(lblAddEmployee);
		
		txtName = new JTextField();
		txtName.setToolTipText("New employees name");
		txtName.setColumns(10);
		txtName.setBounds(12, 160, 175, 30);
		homePanel.add(txtName);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Candara", Font.PLAIN, 13));
		lblName.setBounds(12, 131, 65, 20);
		homePanel.add(lblName);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(288, 133, 434, 314);
		homePanel.add(scrollPane_7);
		
		tableEmployees = new JTable();
		scrollPane_7.setViewportView(tableEmployees);
		
		cmbRole = new JComboBox<String>();
		cmbRole.setModel(new DefaultComboBoxModel(new String[] {"Agent", "Manager", "Clerk"}));
		cmbRole.setToolTipText("Role employee");
		cmbRole.setBounds(12, 226, 175, 30);
		homePanel.add(cmbRole);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setFont(new Font("Candara", Font.PLAIN, 13));
		lblRole.setBounds(10, 203, 67, 20);
		homePanel.add(lblRole);
		
		lblErrorHome = new JLabel("");
		lblErrorHome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorHome.setForeground(new Color(204, 0, 0));
		lblErrorHome.setFont(new Font("Candara", Font.PLAIN, 12));
		lblErrorHome.setBounds(10, 310, 175, 20);
		homePanel.add(lblErrorHome);
		
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
		btnAddDriver.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
		btnAddVehicle.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
		separator_3.setBounds(195, 163, 22, 440);
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
		btnAddRoute.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnAddRoute.setBounds(75, 571, 110, 32);
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
		
		cmbFromCity = new JComboBox<String>();
		cmbFromCity.setToolTipText("from which city");
		cmbFromCity.setBounds(10, 182, 175, 30);
		routesPanel.add(cmbFromCity);
		
		cmbToCity = new JComboBox<String>();
		cmbToCity.setToolTipText("to which city");
		cmbToCity.setBounds(10, 241, 175, 30);
		routesPanel.add(cmbToCity);
		
		lblTo = new JLabel("To");
		lblTo.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTo.setBounds(10, 223, 35, 20);
		routesPanel.add(lblTo);
		
//		departureDate = new JCalendar();
//		departureDate.setBounds(10, 304, 122, 20);
//		routesPanel.add(departureDate);
		
		txtDepartureDate = new JTextField();
		txtDepartureDate.setToolTipText("Departure Date");
		txtDepartureDate.setColumns(10);
		txtDepartureDate.setBounds(10, 303, 175, 30);
		routesPanel.add(txtDepartureDate);
		
		lblDepartureDate = new JLabel("Departure Date");
		lblDepartureDate.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDepartureDate.setBounds(10, 282, 122, 20);
		routesPanel.add(lblDepartureDate);
		
		txtDepartureTime = new JTextField();
		txtDepartureTime.setToolTipText("Departure Time");
		txtDepartureTime.setColumns(10);
		txtDepartureTime.setBounds(10, 365, 175, 30);
		routesPanel.add(txtDepartureTime);
		
		lblDepartureTime = new JLabel("Departure Time");
		lblDepartureTime.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDepartureTime.setBounds(10, 344, 122, 20);
		routesPanel.add(lblDepartureTime);
		
		lblErrorRoute = new JLabel("");
		lblErrorRoute.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorRoute.setForeground(new Color(204, 0, 0));
		lblErrorRoute.setFont(new Font("Candara", Font.PLAIN, 10));
		lblErrorRoute.setBounds(10, 540, 175, 20);
		routesPanel.add(lblErrorRoute);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(211, 170, 533, 316);
		routesPanel.add(scrollPane_3);
		
		tableRoute = new JTable();
		scrollPane_3.setViewportView(tableRoute);
		
		txtPrice = new JTextField();
		txtPrice.setToolTipText("Price ex. 10.50");
		txtPrice.setColumns(10);
		txtPrice.setBounds(10, 424, 175, 30);
		routesPanel.add(txtPrice);
		
		lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Candara", Font.PLAIN, 13));
		lblPrice.setBounds(10, 406, 122, 20);
		routesPanel.add(lblPrice);
		
		cmbSchedule = new JComboBox<String>();
		cmbSchedule.setToolTipText("from which city");
		cmbSchedule.setBounds(10, 484, 175, 30);
		routesPanel.add(cmbSchedule);
		
		lblAssignRouteTo = new JLabel("Assign Route to Schedule");
		lblAssignRouteTo.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAssignRouteTo.setBounds(10, 465, 159, 20);
		routesPanel.add(lblAssignRouteTo);
		
		btnCitiesPanel = new JPanel();
		btnCitiesPanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnCitiesPanel.setBounds(79, 225, 179, 40);
		btnCitiesPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(citiesPanel);
				getcities();
			}
		});
		sidePanel.add(btnCitiesPanel);
		btnCitiesPanel.setLayout(null);
		
		lblNewLabel_6 = new JLabel("Cities");
		lblNewLabel_6.setFont(new Font("Candara", Font.BOLD, 14));
		lblNewLabel_6.setForeground(new Color(255, 153, 51));
		lblNewLabel_6.setBounds(69, 11, 53, 18);
		btnCitiesPanel.add(lblNewLabel_6);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_city_15px.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 0, 38, 40);
		btnCitiesPanel.add(label_1);
		
		btnDriversPanel = new JPanel();
		btnDriversPanel.setLayout(null);
		btnDriversPanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnDriversPanel.setBounds(79, 270, 179, 40);
		btnDriversPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(driversPanel);
				getDrivers();
			}
		});
		sidePanel.add(btnDriversPanel);
		
		lblDrivers = new JLabel("Drivers");
		lblDrivers.setForeground(new Color(255, 153, 51));
		lblDrivers.setFont(new Font("Candara", Font.BOLD, 14));
		lblDrivers.setBounds(69, 11, 53, 18);
		btnDriversPanel.add(lblDrivers);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_driver_15px.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(10, 0, 38, 40);
		btnDriversPanel.add(label_3);
		
		btnVehiclesPanel = new JPanel();
		btnVehiclesPanel.setLayout(null);
		btnVehiclesPanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnVehiclesPanel.setBounds(79, 314, 179, 40);
		btnVehiclesPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(vehiclesPanel);
				getVehicles();
				
			}
		});
		sidePanel.add(btnVehiclesPanel);
		
		lblVehicles = new JLabel("Vehicles");
		lblVehicles.setForeground(new Color(255, 153, 51));
		lblVehicles.setFont(new Font("Candara", Font.BOLD, 14));
		lblVehicles.setBounds(69, 11, 53, 18);
		btnVehiclesPanel.add(lblVehicles);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_bus_15px.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(10, 0, 38, 40);
		btnVehiclesPanel.add(label_5);
		
		btnRoutesPanel = new JPanel();
		btnRoutesPanel.setLayout(null);
		btnRoutesPanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnRoutesPanel.setBounds(79, 356, 179, 40);
		btnRoutesPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(routesPanel);
				getCitiesToComboBox();
				getScheduleToComboBox();
				displayRouteInTable();
			}
		});
		sidePanel.add(btnRoutesPanel);
		
		lblRoutes = new JLabel("Routes");
		lblRoutes.setForeground(new Color(255, 153, 51));
		lblRoutes.setFont(new Font("Candara", Font.BOLD, 14));
		lblRoutes.setBounds(69, 11, 53, 18);
		btnRoutesPanel.add(lblRoutes);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_route_15px.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(10, 0, 38, 40);
		btnRoutesPanel.add(label_6);
		
		lblNewLabel_7 = new JLabel("v. 1.0.0.1");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Candara", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(152, 39, 46, 14);
		sidePanel.add(lblNewLabel_7);
		
		btnIssueTicketNumber = new JPanel();
		btnIssueTicketNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				switchPanel(issueTicketNumberPanel);
				getScheduleIDFromSoldTicket();
				displayRouteInTableManager();
				displayTicketInTable();
			}
		});
		btnIssueTicketNumber.setLayout(null);
		btnIssueTicketNumber.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnIssueTicketNumber.setBounds(0, 466, 283, 58);
		sidePanel.add(btnIssueTicketNumber);
		
		label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_home_address_20px.png")));
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(22, 11, 40, 33);
		btnIssueTicketNumber.add(label_16);
		
		lblIssueTicketNumberButton = new JLabel("Issue Ticket Number");
		lblIssueTicketNumberButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblIssueTicketNumberButton.setForeground(Color.WHITE);
		lblIssueTicketNumberButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
		lblIssueTicketNumberButton.setBounds(95, 14, 178, 33);
		btnIssueTicketNumber.add(lblIssueTicketNumberButton);
		
		
		
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
		btnAddCity.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
		
		availableSeatsPanel = new JPanel();
		availableSeatsPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(availableSeatsPanel, "name_20101062289600");
		availableSeatsPanel.setLayout(null);
		
		JLabel label_14 = new JLabel("Number of seats left");
		label_14.setFont(new Font("Candara", Font.PLAIN, 18));
		label_14.setBounds(10, 11, 168, 41);
		availableSeatsPanel.add(label_14);
		
		JLabel label_17 = new JLabel("A list of the available route added by the manager. Feel free to assign the number of seats left.");
		label_17.setFont(new Font("Candara", Font.PLAIN, 13));
		label_17.setBounds(20, 48, 533, 32);
		availableSeatsPanel.add(label_17);
		
		JLabel label_18 = new JLabel("Select a row and adjust the available seats left. ");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Candara", Font.BOLD, 15));
		label_18.setBounds(20, 323, 749, 32);
		availableSeatsPanel.add(label_18);
		
		JLabel label_19 = new JLabel("ROUTE DESCRIPTION");
		label_19.setFont(new Font("Candara", Font.PLAIN, 18));
		label_19.setBounds(10, 366, 168, 41);
		availableSeatsPanel.add(label_19);
		
		lblRouteDescription = new JLabel("");
		lblRouteDescription.setFont(new Font("Candara", Font.PLAIN, 14));
		lblRouteDescription.setBounds(20, 403, 198, 32);
		availableSeatsPanel.add(lblRouteDescription);
		
		JLabel label_21 = new JLabel("SCHEDULE ID");
		label_21.setFont(new Font("Candara", Font.PLAIN, 18));
		label_21.setBounds(10, 446, 168, 41);
		availableSeatsPanel.add(label_21);
		
		lblScheduleID = new JLabel("");
		lblScheduleID.setFont(new Font("Candara", Font.PLAIN, 14));
		lblScheduleID.setBounds(20, 483, 158, 32);
		availableSeatsPanel.add(lblScheduleID);
		
		JLabel label_23 = new JLabel("Assign available seat left");
		label_23.setFont(new Font("Candara", Font.PLAIN, 16));
		label_23.setBounds(228, 366, 175, 31);
		availableSeatsPanel.add(label_23);
		
		txtAvailableSeatsLeft = new JTextField();
		txtAvailableSeatsLeft.setToolTipText("Ticket number");
		txtAvailableSeatsLeft.setColumns(10);
		txtAvailableSeatsLeft.setBounds(228, 395, 168, 30);
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
		btnAvailableSeatsLeft.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnAvailableSeatsLeft.setBounds(228, 436, 168, 32);
		availableSeatsPanel.add(btnAvailableSeatsLeft);
		
		JLabel label_24 = new JLabel("ASSIGN SEATS LEFT");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Candara", Font.BOLD, 14));
		label_24.setBounds(10, 11, 148, 14);
		btnAvailableSeatsLeft.add(label_24);
		
		lblErrorAssignDriverVehicle = new JLabel("");
		lblErrorAssignDriverVehicle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorAssignDriverVehicle.setForeground(new Color(204, 0, 0));
		lblErrorAssignDriverVehicle.setFont(new Font("Candara", Font.PLAIN, 10));
		lblErrorAssignDriverVehicle.setBounds(520, 551, 168, 20);
		availableSeatsPanel.add(lblErrorAssignDriverVehicle);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 91, 759, 228);
		availableSeatsPanel.add(scrollPane_6);
		
		tableTicketNrOfSeat = new JTable();
		tableTicketNrOfSeat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getRouteInfoFromSelectedRow();
			}
		});
		scrollPane_6.setViewportView(tableTicketNrOfSeat);
		
		lblErrorNumberSeats = new JLabel("");
		lblErrorNumberSeats.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorNumberSeats.setForeground(new Color(204, 0, 0));
		lblErrorNumberSeats.setFont(new Font("Candara", Font.PLAIN, 10));
		lblErrorNumberSeats.setBounds(228, 483, 168, 20);
		availableSeatsPanel.add(lblErrorNumberSeats);
		
		cmbDriver = new JComboBox<String>();
		cmbDriver.setToolTipText("type of vehicle");
		cmbDriver.setBounds(510, 389, 175, 30);
		availableSeatsPanel.add(cmbDriver);
		
		JLabel lblAssignDriver = new JLabel("Assign driver");
		lblAssignDriver.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAssignDriver.setBounds(508, 366, 83, 20);
		availableSeatsPanel.add(lblAssignDriver);
		
		cmbVehicle = new JComboBox<String>();
		cmbVehicle.setToolTipText("type of vehicle");
		cmbVehicle.setBounds(512, 453, 175, 30);
		availableSeatsPanel.add(cmbVehicle);
		
		JLabel lblAssignVehicle = new JLabel("Assign vehicle");
		lblAssignVehicle.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAssignVehicle.setBounds(510, 430, 83, 20);
		availableSeatsPanel.add(lblAssignVehicle);
		
		btnAssignDriverVehicle = new JPanel();
		btnAssignDriverVehicle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				updateAssignDriverVehicle();
				displayRouteInTableWithNrOfSeat();
			}
		});
		btnAssignDriverVehicle.setLayout(null);
		btnAssignDriverVehicle.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnAssignDriverVehicle.setBounds(510, 494, 178, 32);
		availableSeatsPanel.add(btnAssignDriverVehicle);
		
		JLabel lblAssignToSchedule = new JLabel("ASSIGN TO SCHEDULE");
		lblAssignToSchedule.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssignToSchedule.setForeground(Color.WHITE);
		lblAssignToSchedule.setFont(new Font("Candara", Font.BOLD, 14));
		lblAssignToSchedule.setBounds(10, 11, 158, 14);
		btnAssignDriverVehicle.add(lblAssignToSchedule);
		
		schedulePanel = new JPanel();
		schedulePanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(schedulePanel, "name_20107772105900");
		schedulePanel.setLayout(null);
		
		JLabel lblCreatingNewSchedule = new JLabel("Creating new schedule enables you as a manager to add new routes for booking.");
		lblCreatingNewSchedule.setFont(new Font("Candara", Font.PLAIN, 13));
		lblCreatingNewSchedule.setBounds(20, 48, 533, 32);
		schedulePanel.add(lblCreatingNewSchedule);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setFont(new Font("Candara", Font.PLAIN, 18));
		lblSchedule.setBounds(10, 11, 110, 41);
		schedulePanel.add(lblSchedule);
		
		JLabel lblCreateSchedule = new JLabel("Create Schedule");
		lblCreateSchedule.setFont(new Font("Candara", Font.PLAIN, 13));
		lblCreateSchedule.setBounds(20, 170, 100, 20);
		schedulePanel.add(lblCreateSchedule);
		
		txtScheduleID = new JTextField();
		txtScheduleID.setToolTipText("Schedule ID");
		txtScheduleID.setColumns(10);
		txtScheduleID.setBounds(20, 199, 173, 30);
		schedulePanel.add(txtScheduleID);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(264, 170, 22, 316);
		schedulePanel.add(separator_4);
		
		btnAddScheduleID = new JPanel();
		btnAddScheduleID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertSchedule();
				getScheduleIDs();
			}
		});
		btnAddScheduleID.setLayout(null);
		btnAddScheduleID.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnAddScheduleID.setBounds(48, 252, 145, 32);
		schedulePanel.add(btnAddScheduleID);
		
		JLabel lblAddScheduleId = new JLabel("ADD SCHEDULE ID");
		lblAddScheduleId.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddScheduleId.setForeground(Color.WHITE);
		lblAddScheduleId.setFont(new Font("Candara", Font.BOLD, 14));
		lblAddScheduleId.setBounds(10, 11, 125, 14);
		btnAddScheduleID.add(lblAddScheduleId);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(296, 172, 200, 314);
		schedulePanel.add(scrollPane_4);
		
		tableScheduleIDs = new JTable();
		scrollPane_4.setViewportView(tableScheduleIDs);
		
		lblErrorScheduleID = new JLabel("");
		lblErrorScheduleID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErrorScheduleID.setForeground(new Color(204, 0, 0));
		lblErrorScheduleID.setFont(new Font("Candara", Font.PLAIN, 12));
		lblErrorScheduleID.setBounds(20, 295, 175, 20);
		schedulePanel.add(lblErrorScheduleID);
		
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
		lblThemeColorText.setForeground(new Color(getColorR(), getColorG(), getColorB()));
		lblThemeColorText.setFont(new Font("Candara", Font.BOLD, 16));
		lblThemeColorText.setBounds(10, 11, 105, 14);
		panel_1.add(lblThemeColorText);
		
		lblNewLabel_5 = new JLabel("Change the theme color of the application to your preference");
		lblNewLabel_5.setFont(new Font("Candara", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 26, 374, 32);
		panel_1.add(lblNewLabel_5);
		
		btnBlueishColor = new JPanel();
		btnBlueishColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateColorTheme(61, 70, 85);
				btnProfilePanel.setBackground(new Color(getColorR() - 13, getColorG() - 15, getColorB() - 19));
				
				changeColorToInSettingPanel(getColorR(), getColorG(), getColorB());
				changeColorToInAvailableSeatPanel(getColorR(), getColorG(), getColorB());
				changeColorToInCitiesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInDriversPanel(getColorR(), getColorG(), getColorB());
				changeColorToInVehiclePanel(getColorR(), getColorG(), getColorB());
				changeColorToInHomePanel(getColorR(), getColorG(), getColorB());
				changeColorToInRoutesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInSchedulesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInIssueTicketNumberPanel(getColorR(), getColorG(), getColorB());
				changeColorToInProfilePanel(getColorR(), getColorG(), getColorB());
			}
		});
		btnBlueishColor.setBackground(new Color(61, 70, 85));
		btnBlueishColor.setBounds(632, 11, 20, 20);
		panel_1.add(btnBlueishColor);
		
		btnBeigeColor = new JPanel();
		btnBeigeColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				updateColorTheme(245, 222, 179);
				btnProfilePanel.setBackground(new Color(getColorR() - 23, getColorG() - 23, getColorB() - 21));
				
				changeColorToInSettingPanel(getColorR(), getColorG(), getColorB());
				changeColorToInAvailableSeatPanel(getColorR(), getColorG(), getColorB());
				changeColorToInCitiesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInHomePanel(getColorR(), getColorG(), getColorB());
				changeColorToInDriversPanel(getColorR(), getColorG(), getColorB());
				changeColorToInVehiclePanel(getColorR(), getColorG(), getColorB());
				changeColorToInRoutesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInSchedulesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInIssueTicketNumberPanel(getColorR(), getColorG(), getColorB());
				changeColorToInProfilePanel(getColorR(), getColorG(), getColorB());
				
				
			}
		});
		btnBeigeColor.setBackground(new Color(245, 222, 179));
		btnBeigeColor.setBounds(662, 11, 20, 20);
		panel_1.add(btnBeigeColor);
		
		btnGreenishColor = new JPanel();
		btnGreenishColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateColorTheme(51, 133, 153);
				btnProfilePanel.setBackground(new Color(getColorR() - 8, getColorG() - 30, getColorB() - 36));
				
				changeColorToInSettingPanel(getColorR(), getColorG(), getColorB());
				changeColorToInAvailableSeatPanel(getColorR(), getColorG(), getColorB());
				changeColorToInCitiesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInDriversPanel(getColorR(), getColorG(), getColorB());
				changeColorToInVehiclePanel(getColorR(), getColorG(), getColorB());
				changeColorToInHomePanel(getColorR(), getColorG(), getColorB());
				changeColorToInRoutesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInSchedulesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInIssueTicketNumberPanel(getColorR(), getColorG(), getColorB());
				changeColorToInProfilePanel(getColorR(), getColorG(), getColorB());
			}
		});
		btnGreenishColor.setBackground(new Color(51, 153, 153));
		btnGreenishColor.setBounds(632, 38, 20, 20);
		panel_1.add(btnGreenishColor);
		
		btnPurpleColor = new JPanel();
		btnPurpleColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateColorTheme(102, 0, 204);
				btnProfilePanel.setBackground(new Color(getColorR() - 16, getColorG() + 7, getColorB() - 38));
				
				changeColorToInSettingPanel(getColorR(), getColorG(), getColorB());
				changeColorToInAvailableSeatPanel(getColorR(), getColorG(), getColorB());
				changeColorToInCitiesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInDriversPanel(getColorR(), getColorG(), getColorB());
				changeColorToInVehiclePanel(getColorR(), getColorG(), getColorB());
				changeColorToInHomePanel(getColorR(), getColorG(), getColorB());
				changeColorToInRoutesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInSchedulesPanel(getColorR(), getColorG(), getColorB());
				changeColorToInIssueTicketNumberPanel(getColorR(), getColorG(), getColorB());
				changeColorToInProfilePanel(getColorR(), getColorG(), getColorB());
			}
		});
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
		lblFontSizeText.setForeground(new Color(getColorR(), getColorG(), getColorB()));
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
		cmbFontSize.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
		lblAdjustBrightnessText.setForeground(new Color(getColorR(), getColorG(), getColorB()));
		lblAdjustBrightnessText.setFont(new Font("Candara", Font.BOLD, 16));
		lblAdjustBrightnessText.setBounds(10, 11, 138, 20);
		panel_9.add(lblAdjustBrightnessText);
		
		lblReduceTheBrightness = new JLabel("Reduce the brightness of the application");
		lblReduceTheBrightness.setFont(new Font("Candara", Font.PLAIN, 13));
		lblReduceTheBrightness.setBounds(10, 26, 374, 32);
		panel_9.add(lblReduceTheBrightness);
		
		chkbAdjustBrightness = new JCheckBox("");
		chkbAdjustBrightness.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		chkbAdjustBrightness.setForeground(new Color(255, 255, 255));
		chkbAdjustBrightness.setBounds(664, 11, 21, 23);
		panel_9.add(chkbAdjustBrightness);
		
		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(252, 252, 252));
		panel_10.setBounds(41, 390, 721, 69);
		settingsPanel.add(panel_10);
		
		lblLogoutWhenNoText = new JLabel("Logout when no interaction");
		lblLogoutWhenNoText.setForeground(new Color(getColorR(), getColorG(), getColorB()));
		lblLogoutWhenNoText.setFont(new Font("Candara", Font.BOLD, 16));
		lblLogoutWhenNoText.setBounds(10, 11, 217, 20);
		panel_10.add(lblLogoutWhenNoText);
		
		lblLogOutIf = new JLabel("Log out if no interaction within 30 minutes");
		lblLogOutIf.setFont(new Font("Candara", Font.PLAIN, 13));
		lblLogOutIf.setBounds(10, 26, 374, 32);
		panel_10.add(lblLogOutIf);
		
		chkbAutoLogout = new JCheckBox("");
		chkbAutoLogout.setForeground(Color.WHITE);
		chkbAutoLogout.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		chkbAutoLogout.setBounds(665, 10, 21, 23);
		panel_10.add(chkbAutoLogout);
		
		lblAutoLogOut = new JLabel("Auto Log out");
		lblAutoLogOut.setFont(new Font("Candara", Font.PLAIN, 18));
		lblAutoLogOut.setBounds(10, 354, 110, 41);
		settingsPanel.add(lblAutoLogOut);
		
		btnSettingsSave = new JPanel();
		btnSettingsSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				updateNavigationFontSize();
				lblHomeButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblAvailableSeatsButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblSchedulesButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblIssueTicketNumberButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblSettingsButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblEmployeeName.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				
			}
		});
		btnSettingsSave.setBackground(new Color(getColorR(), getColorG(), getColorB()));
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
		btnSettingsCancel.setBorder(new CompoundBorder(new LineBorder(new Color(getColorR(), getColorG(), getColorB())), null));
		btnSettingsCancel.setLayout(null);
		btnSettingsCancel.setBackground(new Color(255, 255, 255));
		btnSettingsCancel.setBounds(576, 566, 88, 32);
		settingsPanel.add(btnSettingsCancel);
		
		lblCancelButtonText = new JLabel("CANCEL");
		lblCancelButtonText.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelButtonText.setForeground(new Color(getColorR(), getColorG(), getColorB()));
		lblCancelButtonText.setFont(new Font("Candara", Font.BOLD, 14));
		lblCancelButtonText.setBounds(10, 11, 68, 14);
		btnSettingsCancel.add(lblCancelButtonText);
		
		profilePanel = new JPanel();
		profilePanel.setBackground(Color.WHITE);
		layeredPane.add(profilePanel, "name_255630843630500");
		profilePanel.setLayout(null);
		
		profilePanelBar = new JPanel();
		profilePanelBar.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		profilePanelBar.setBounds(0, 0, 790, 110);
		profilePanel.add(profilePanelBar);
		
		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(215, 197, 340, 60);
		profilePanel.add(panel_14);
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_secured_letter_20px.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(10, 11, 39, 38);
		panel_14.add(label_7);
		
		lblEmailAddress = new JLabel(Login.email);
		lblEmailAddress.setFont(new Font("Candara", Font.PLAIN, 15));
		lblEmailAddress.setBounds(70, 23, 241, 14);
		panel_14.add(lblEmailAddress);
		
		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(215, 268, 340, 60);
		profilePanel.add(panel_15);
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_phone_20px.png")));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(10, 11, 39, 38);
		panel_15.add(label_9);
		
		lblPhoneNumber = new JLabel(Login.phoneNumber);
		lblPhoneNumber.setFont(new Font("Candara", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(70, 23, 241, 14);
		panel_15.add(lblPhoneNumber);
		
		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBounds(215, 339, 340, 60);
		profilePanel.add(panel_16);
		
		label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_website_20px.png")));
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setBounds(10, 11, 39, 38);
		panel_16.add(label_22);
		
		lblWebsite = new JLabel(Login.website);
		lblWebsite.setFont(new Font("Candara", Font.PLAIN, 15));
		lblWebsite.setBounds(70, 23, 241, 14);
		panel_16.add(lblWebsite);
		
		issueTicketNumberPanel = new JPanel();
		issueTicketNumberPanel.setLayout(null);
		issueTicketNumberPanel.setBackground(Color.WHITE);
		layeredPane.add(issueTicketNumberPanel, "name_5437684675900");
		
		label_10 = new JLabel("Proceed with adding ticket numbers to the following list based on the schedule ID.");
		label_10.setFont(new Font("Candara", Font.PLAIN, 13));
		label_10.setBounds(20, 48, 533, 32);
		issueTicketNumberPanel.add(label_10);
		
		label_11 = new JLabel("Issue Ticket Number");
		label_11.setFont(new Font("Candara", Font.PLAIN, 18));
		label_11.setBounds(10, 11, 165, 41);
		issueTicketNumberPanel.add(label_11);
		
		cmbIssueTicketScheduleID = new JComboBox<String>();
		cmbIssueTicketScheduleID.setToolTipText("From and To destination of customer");
		cmbIssueTicketScheduleID.setBounds(22, 143, 207, 30);
		issueTicketNumberPanel.add(cmbIssueTicketScheduleID);
		
		label_12 = new JLabel("Select Schedule ID");
		label_12.setFont(new Font("Candara", Font.PLAIN, 13));
		label_12.setBounds(20, 120, 209, 20);
		issueTicketNumberPanel.add(label_12);
		
		separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(239, 120, 22, 440);
		issueTicketNumberPanel.add(separator_5);
		
		btnProceedIssueTicketNumber = new JPanel();
		btnProceedIssueTicketNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				updateTicketNumberBasedOnScheduleID();
			}
		});
		btnProceedIssueTicketNumber.setLayout(null);
		btnProceedIssueTicketNumber.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnProceedIssueTicketNumber.setBounds(119, 319, 110, 32);
		issueTicketNumberPanel.add(btnProceedIssueTicketNumber);
		
		label_13 = new JLabel("PROCEED");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Candara", Font.BOLD, 14));
		label_13.setBounds(10, 11, 90, 14);
		btnProceedIssueTicketNumber.add(label_13);
		
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
		
		label_15 = new JLabel("Ticket number");
		label_15.setFont(new Font("Candara", Font.PLAIN, 13));
		label_15.setBounds(20, 184, 122, 20);
		issueTicketNumberPanel.add(label_15);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(251, 122, 478, 431);
		issueTicketNumberPanel.add(scrollPane_5);
		
		tableTicket = new JTable();
		scrollPane_5.setViewportView(tableTicket);
		
		
		
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
	
	public void insertSchedule() {
		if (!(txtScheduleID.getText().isEmpty())) {
			try {
				String query = "select * from schedule where scheduleCode=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, txtScheduleID.getText());
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					lblErrorScheduleID.setText(txtScheduleID.getText() + " already exists!");
				}else {
					String insertDataQueryString = "insert into schedule (scheduleCode) values(?)";
					preparedStatement = conn.prepareStatement(insertDataQueryString);
					preparedStatement.setString(1, txtScheduleID.getText());
					
					preparedStatement.execute();
					
					txtScheduleID.setText("");
					lblErrorScheduleID.setText("");
				}
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorScheduleID.setText("Please, provide schedule id...");
		}
	}
	
	public void getScheduleIDs() {
			
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("SCHEDULE ID");
	        try {
	        	String query = "select * from schedule";
	            preparedStatement = conn.prepareStatement(query);
	            resultSet = preparedStatement.executeQuery();
	            
	            while(resultSet.next()) {
	            	model.addRow(new Object[] {
	            			resultSet.getString("scheduleCode"),
	            	});
	            }
	            
	            tableScheduleIDs.setModel(model);
	            
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
		String from = cmbFromCity.getSelectedItem().toString();
		String to = cmbToCity.getSelectedItem().toString();
		
		char cFrom = from.charAt(0);
		char cTo = to.charAt(0);
	
		
		
		if (!(txtDepartureDate.getText().isEmpty() || txtDepartureTime.getText().isEmpty() || txtPrice.getText().isEmpty())) {
			try {
				if(!(checkComboBoxValues())) {
					String querySchedule = "select * from route where scheduleCode=?";
					preparedStatement = conn.prepareStatement(querySchedule);
					preparedStatement.setString(1, cmbSchedule.getSelectedItem().toString());
					resultSet = preparedStatement.executeQuery();
					
					if (resultSet.next()) {
						lblErrorRoute.setText("This schedule is assigned to route!");
						System.out.println("This schedule is assigned to route!");
						
					}else if (!(checkComboBoxValues())) {
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
								String insertRouteData = "insert into route (description,departureDate,departureTime,rID,price,scheduleCode,numberOfSeatLeft) values(?,?,?,?,?,?,?)";
								preparedStatement = conn.prepareStatement(insertRouteData);
								preparedStatement.setString(1, cmbFromCity.getSelectedItem().toString() + " - " + cmbToCity.getSelectedItem().toString());
								preparedStatement.setString(2, txtDepartureDate.getText());
								preparedStatement.setString(3, txtDepartureTime.getText());
								preparedStatement.setString(4, String.valueOf(cFrom) + String.valueOf(cTo));
								preparedStatement.setString(5, txtPrice.getText());		
								preparedStatement.setString(6, cmbSchedule.getSelectedItem().toString());		
								preparedStatement.setInt(7, 0);		
								
								preparedStatement.execute();
								
								txtDepartureDate.setText("");
								txtDepartureTime.setText("");
								txtPrice.setText("");
								lblErrorRoute.setText("");
								
							}
						} catch (Exception e) {
							System.out.println("error: " + e);
						}
					}else {
						lblErrorRoute.setText("From and To can't be the same");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}else {
			lblErrorRoute.setText("Invalid date, time or price...");
		}
	}
	
	public void displayRouteInTable() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("SCHEDULE ID");
		model.addColumn("ROUTE ID");
		model.addColumn("DESCRIPTION");
		model.addColumn("DATE");
		model.addColumn("TIME");
		model.addColumn("PRICE");
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
            			resultSet.getString("price")
            	});
            }
            
            tableRoute.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	
	public void getCitiesToComboBox() {
		try {
			String query = "select * from city";
			preparedStatement = conn.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cmbFromCity.addItem(resultSet.getString("cityName"));
				cmbToCity.addItem(resultSet.getString("cityName"));
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void getScheduleToComboBox() {
		try {
			String query = "select distinct scheduleCode from schedule";
			preparedStatement = conn.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cmbSchedule.setSelectedIndex(-1);
				cmbSchedule.addItem(resultSet.getString("scheduleCode"));
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	private int getScheduleID(){
        int scheduleID = 0;
        try {
            String query = "select * from schedule where scheduleCode='" + cmbSchedule.getSelectedItem().toString() + "'";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
            	scheduleID = resultSet.getInt("scheduleCode");
            }
        }catch (SQLException e) {
            e.getMessage();
        }
        return scheduleID;
    }
	
	public void getScheduleIDFromSoldTicket() {
		try {
			String query = "select distinct * from ticket";
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
	
	public void displayRouteInTableManager() {
		
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
		model.addColumn("DRIVER");
		model.addColumn("VEHICLE");
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
            			resultSet.getString("numberOfSeatLeft"),
            			resultSet.getString("driver"),
            			resultSet.getString("vehicle")
            	});
            }
            
            tableTicketNrOfSeat.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void	getRouteInfoFromSelectedRow() {
		btnAvailableSeatsLeft.setVisible(true);
		btnAssignDriverVehicle.setVisible(true);
		
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
	
	public void changeColorToInSettingPanel(int r, int g, int b) {
		sidePanel.setBackground(new Color(r, g, b));
		btnHomePanel.setBackground(new Color(r, g, b));
		btnAvailableSeats.setBackground(new Color(r, g, b));
		btnCitiesPanel.setBackground(new Color(r, g, b));
		btnDriversPanel.setBackground(new Color(r, g, b));
		btnVehiclesPanel.setBackground(new Color(r, g, b));
		btnRoutesPanel.setBackground(new Color(r, g, b));
		btnSchedulePanel.setBackground(new Color(r, g, b));
		btnIssueTicketNumber.setBackground(new Color(r, g, b));
		btnSettingsPanel.setBackground(new Color(r, g, b));
		//btnProfilePanel.setBackground(new Color(r - 23, g - 23, b - 21));
		
		btnSettingsSave.setBackground(new Color(r, g, b));
		btnSettingsCancel.setBorder(new CompoundBorder(new LineBorder(new Color(r,g, b)), null));
		lblCancelButtonText.setForeground(new Color(r, g, b));
		
		cmbFontSize.setBackground(new Color(r, g, b));
		chkbAdjustBrightness.setBackground(new Color(r, g, b));
		chkbAutoLogout.setBackground(new Color(r, g, b));
		
		lblThemeColorText.setForeground(new Color(r, g, b));
		lblFontSizeText.setForeground(new Color(r, g, b));
		lblAdjustBrightnessText.setForeground(new Color(r, g, b));
		lblLogoutWhenNoText.setForeground(new Color(r, g, b));
	}
	
	public void changeColorToInAvailableSeatPanel(int r, int g, int b){
		btnAvailableSeatsLeft.setBackground(new Color(r, g, b));
		btnAssignDriverVehicle.setBackground(new Color(r, g, b));
	}
	public void changeColorToInCitiesPanel(int r, int g, int b){
		btnAddCity.setBackground(new Color(r, g, b));
	}
	public void changeColorToInDriversPanel(int r, int g, int b){
		btnAddDriver.setBackground(new Color(r, g, b));
	}
	public void changeColorToInVehiclePanel(int r, int g, int b){
		btnAddVehicle.setBackground(new Color(r, g, b));
	}
	public void changeColorToInHomePanel(int r, int g, int b){
		btnAddEmployee.setBackground(new Color(r, g, b));
	}
	public void changeColorToInRoutesPanel(int r, int g, int b){
		btnAddRoute.setBackground(new Color(r, g, b));
	}
	public void changeColorToInSchedulesPanel(int r, int g, int b){
		btnAddScheduleID.setBackground(new Color(r, g, b));
	}
	public void changeColorToInIssueTicketNumberPanel(int r, int g, int b){
		btnProceedIssueTicketNumber.setBackground(new Color(r, g, b));
	}
	public void changeColorToInProfilePanel(int r, int g, int b){
		profilePanelBar.setBackground(new Color(r, g, b));
	}
	
	private int getColorR(){
		int colorR = 0;
		String employeeUsername = Login.username;
		String employeeName = Login.empName;
		
        try {
            String query = "select * from employeesettings where username=? and name=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, employeeUsername);
            preparedStatement.setString(2, employeeName);
            
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
            	colorR = resultSet.getInt("colorR");
            }
        }catch (SQLException e) {
        	System.out.println("error: " + e);
        }
        return colorR;
    }
	
	
	private int getColorG(){
		int colorG = 0;
		String employeeUsername = Login.username;
		String employeeName = Login.empName;
		
        try {
            String query = "select * from employeesettings where username=? and name=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, employeeUsername);
            preparedStatement.setString(2, employeeName);
            
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
            	colorG = resultSet.getInt("colorG");
            }
        }catch (SQLException e) {
        	System.out.println("error: " + e);
        }
        return colorG;
    }
	
	private int getColorB(){
		int colorB = 0;
		String employeeUsername = Login.username;
		String employeeName = Login.empName;
		
        try {
            String query = "select * from employeesettings where username=? and name=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, employeeUsername);
            preparedStatement.setString(2, employeeName);
            
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
            	colorB = resultSet.getInt("colorB");
            }
        }catch (SQLException e) {
        	System.out.println("error: " + e);
        }
        return colorB;
    }
	
	
	
	public void updateColorTheme(int r, int g, int b) {
		String employeeUsername = Login.username;
		String employeeName = Login.empName;
		
		try {
				String query = "update employeesettings set colorR=?, colorG=?, colorB=? where username=? and name=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setInt(1, r);
				preparedStatement.setInt(2, g);
				preparedStatement.setInt(3, b);
				preparedStatement.setString(4, employeeUsername);
				preparedStatement.setString(5, employeeName);
				
				
				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
	}
	
	private int getFontSizeNavigation(){
		int fontsize = 0;
		String employeeUsername = Login.username;
		String employeeName = Login.empName;
		
        try {
            String query = "select * from employeesettings where username=? and name=?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, employeeUsername);
            preparedStatement.setString(2, employeeName);
            
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
            	fontsize = resultSet.getInt("fontSize");
            }
        }catch (SQLException e) {
        	System.out.println("error: " + e);
        }
        return fontsize;
    }
		
	public void updateNavigationFontSize() {
		String fontSizeComboBox = cmbFontSize.getSelectedItem().toString();
		int fontSize = Integer.valueOf(fontSizeComboBox);
		
		String employeeUsername = Login.username;
		String employeeName = Login.empName;
		
		try {
				String query = "update employeesettings set fontSize=? where username=? and name=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setInt(1, fontSize);
				preparedStatement.setString(2, employeeUsername);
				preparedStatement.setString(3, employeeName);
				
				
				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		
	}
	
	public void addNewEmployee() {
		String name = txtName.getText();
		String roleEmployee = cmbRole.getSelectedItem().toString();
		
		if (!(txtName.getText().isEmpty())) {
			try {
				String query = "select * from employee where username=? and name=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, name.toLowerCase());
				preparedStatement.setString(2, name);
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					lblErrorHome.setText(name + " already exists!");
					System.out.println(name + " already exists!");
				}else {
					String insertDataQueryString = "insert into employee (username,password,name,role,email,phoneNumber,website) values(?,?,?,?,?,?,?)";
					preparedStatement = conn.prepareStatement(insertDataQueryString);
					preparedStatement.setString(1, name.toLowerCase());
					preparedStatement.setString(2, "123");
					preparedStatement.setString(3, name);
					preparedStatement.setString(4, roleEmployee);
					preparedStatement.setString(5, name.toLowerCase() + roleEmployee.toLowerCase() + "@visitnorth.ac.uk");
					preparedStatement.setString(6, "+44 7258 645 456");
					preparedStatement.setString(7, "www.visitnorth.ac.uk");
					preparedStatement.execute();
					
					
					lblErrorHome.setText("");
				}
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorHome.setText("Please, provide employee info...");
		}
		
	}
	
	public void addNewEmployeeSettings() {
		String name = txtName.getText();
		
			try {
				String query = "select * from employeesettings where username=? and name=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, name.toLowerCase());
				preparedStatement.setString(2, name);
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					lblErrorHome.setText(name + " already exists!");
					System.out.println(name + " already exists!");
				}else {
					String insertDataQueryString = "insert into employeesettings (username,name,fontSize,colorR,colorG,colorB) values(?,?,?,?,?,?)";
					preparedStatement = conn.prepareStatement(insertDataQueryString);
					preparedStatement.setString(1, name.toLowerCase());
					preparedStatement.setString(2, name);
					preparedStatement.setInt(3, 19);
					preparedStatement.setInt(4, 61);
					preparedStatement.setInt(5, 70);
					preparedStatement.setInt(6, 85);
					preparedStatement.execute();
					
					txtName.setText("");
					lblErrorHome.setText("");
				}
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		
		
	}
	
	public void displayEmployeeInTable() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("ROLE");
		model.addColumn("EMAIL");
		model.addColumn("PHONE NR");
        try {
        	String query = "select * from employee";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString("name"),
            			resultSet.getString("role"),
            			resultSet.getString("email"),
            			resultSet.getString("phoneNumber")
            	});
            }
            
            tableEmployees.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void populateAllDriversToComboBox() {
		try {
			String query = "select distinct * from driver";
			preparedStatement = conn.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cmbDriver.addItem(resultSet.getString("firstname") + " " + resultSet.getString("lastname"));
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void populateAllVehiclesToComboBox() {
		try {
			String query = "select distinct * from vehicle";
			preparedStatement = conn.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cmbVehicle.addItem(resultSet.getString("vehicleType") + " - " + resultSet.getString("vehicleLicensePlate"));
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
public void updateAssignDriverVehicle() {
		
		if (!(lblRouteDescription.getText().isEmpty() || lblScheduleID.getText().isEmpty())) {
			try {
				String query = "update route set driver=?, vehicle=? where description=? and scheduleCode=?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, cmbDriver.getSelectedItem().toString());
				preparedStatement.setString(2, cmbVehicle.getSelectedItem().toString());
				preparedStatement.setString(3, lblRouteDescription.getText());
				preparedStatement.setString(4, lblScheduleID.getText());
				preparedStatement.executeUpdate();
				
				txtAvailableSeatsLeft.setText("");
				lblErrorAssignDriverVehicle.setText("");
			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}else {
			lblErrorAssignDriverVehicle.setText("Select schedule to assign to!");
		}
	}
}
