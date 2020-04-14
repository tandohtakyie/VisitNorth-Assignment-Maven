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
	private JPanel travelInfoPanel;
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
	JLabel lblNewLabel_1;
	JPanel btnRoutePanel;
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
	JComboBox cmbType;
	JLabel lblAllThePossible;
	JLabel lblJohnDoe;
	JPanel btnRoutesPanel;
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
	JPanel btnCitiesPanel;
	JLabel lblSchedule;
	JLabel lblNewLabel_6;
	JLabel lblCancel;
	JLabel lblVehicles;
	JLabel label_1;
	JLabel lblAdjustBrightness;
	JLabel lblBrightness;
	JPanel btnDriversPanel;
	JLabel lblAddDriver;
	JLabel lblDrivers;
	JSeparator separator_1;
	JLabel lblRoute;
	JLabel label_3;
	JCheckBox chckbxNewCheckBox;
	JPanel btnVehiclesPanel;
	JLabel lblFrom;
	JLabel label_5;
	JPanel panel_11;
	JComboBox<String> cmbFromCity;
	JLabel lblFirstname;
	JPanel panel_12;
	JLabel lblRoutes;
	JLabel lblNewLabel_4;
	JLabel label_6;
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
	JLabel lblCity;
	JLabel lblChangeTheFont;
	JLabel lblFont;
	JPanel panel_4;
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
	private JLabel lblErrorRoute;
	private JTable tableRoute;
	JScrollPane scrollPane_3;

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
		
		btnRoutePanel = new JPanel();
		btnRoutePanel.setLayout(null);
		btnRoutePanel.setBackground(new Color(61, 70, 85));
		btnRoutePanel.setBounds(0, 164, 283, 58);
		btnRoutePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(travelInfoPanel);
			}
		});
		sidePanel.add(btnRoutePanel);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_tour_bus_20px.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(22, 11, 40, 33);
		btnRoutePanel.add(label);
		
		lblCities = new JLabel("Travel info");
		lblCities.setHorizontalAlignment(SwingConstants.LEFT);
		lblCities.setForeground(Color.WHITE);
		lblCities.setFont(new Font("Candara", Font.BOLD, 19));
		lblCities.setBounds(95, 14, 110, 33);
		btnRoutePanel.add(lblCities);
		
		btnSchedulePanel = new JPanel();
		btnSchedulePanel.setLayout(null);
		btnSchedulePanel.setBackground(new Color(61, 70, 85));
		btnSchedulePanel.setBounds(0, 407, 283, 58);
		btnSchedulePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(schedulePanel);
			}
		});
		sidePanel.add(btnSchedulePanel);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_grid_3_20px.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(22, 11, 40, 33);
		btnSchedulePanel.add(label_2);
		
		lblSchedules = new JLabel("Schedules");
		lblSchedules.setHorizontalAlignment(SwingConstants.LEFT);
		lblSchedules.setForeground(Color.WHITE);
		lblSchedules.setFont(new Font("Candara", Font.BOLD, 19));
		lblSchedules.setBounds(95, 14, 97, 33);
		btnSchedulePanel.add(lblSchedules);
		
		btnSettingsPanel = new JPanel();
		btnSettingsPanel.setLayout(null);
		btnSettingsPanel.setBackground(new Color(61, 70, 85));
		btnSettingsPanel.setBounds(0, 465, 283, 58);
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
		lblLogout.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_sign_out_20px.png")));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setBounds(22, 11, 40, 33);
		panel_5.add(lblLogout);
		
		lblJohnDoe = new JLabel("John Doe");
		lblJohnDoe.setHorizontalAlignment(SwingConstants.LEFT);
		lblJohnDoe.setForeground(Color.WHITE);
		lblJohnDoe.setFont(new Font("Candara", Font.BOLD, 19));
		lblJohnDoe.setBounds(95, 14, 78, 33);
		panel_5.add(lblJohnDoe);
		
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
		
		cmbType = new JComboBox();
		cmbType.setToolTipText("type of vehicle");
		cmbType.setModel(new DefaultComboBoxModel(new String[] {"Coach", "Bus"}));
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
		txtDepartureDate.setToolTipText("Vehicle license plate");
		txtDepartureDate.setColumns(10);
		txtDepartureDate.setBounds(10, 333, 175, 30);
		routesPanel.add(txtDepartureDate);
		
		JLabel lblDepartureDate = new JLabel("Departure Date");
		lblDepartureDate.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDepartureDate.setBounds(10, 304, 122, 20);
		routesPanel.add(lblDepartureDate);
		
		txtDepartureTime = new JTextField();
		txtDepartureTime.setToolTipText("Vehicle license plate");
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
		
		btnCitiesPanel = new JPanel();
		btnCitiesPanel.setBackground(new Color(61,70,85));
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
		btnDriversPanel.setBackground(new Color(61, 70, 85));
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
		btnVehiclesPanel.setBackground(new Color(61, 70, 85));
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
		btnRoutesPanel.setBackground(new Color(61, 70, 85));
		btnRoutesPanel.setBounds(79, 356, 179, 40);
		btnRoutesPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(routesPanel);
				getCitiesToComboBox();
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
		
		travelInfoPanel = new JPanel();
		travelInfoPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(travelInfoPanel, "name_20101062289600");
		travelInfoPanel.setLayout(null);
		
		lblCity = new JLabel("Travel Info");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCity.setBounds(126, 137, 110, 41);
		travelInfoPanel.add(lblCity);
		
		schedulePanel = new JPanel();
		schedulePanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(schedulePanel, "name_20107772105900");
		schedulePanel.setLayout(null);
		
		lblSchedule = new JLabel("Schedule");
		lblSchedule.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSchedule.setBounds(166, 144, 110, 41);
		schedulePanel.add(lblSchedule);
		
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
		layeredPane.add(profilePanel, "name_255630843630500");
		profilePanel.setLayout(null);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(86, 97, 115));
		panel_13.setBounds(0, 0, 790, 110);
		profilePanel.add(panel_13);
		
		
		
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
}
