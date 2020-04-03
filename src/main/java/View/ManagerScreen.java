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
	JLabel lblNewLabel_10;
	JPanel panel;
	final JPanel homePanel;
	JPanel btnHomePanel;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JPanel btnRoutePanel;
	JLabel label;
	JLabel lblCities;
	JSeparator separator;
	JPanel panel_9;
	JLabel lblNewLabel_8;
	JPanel btnSchedulePanel;
	JPanel btnAddCity;
	JLabel label_2;
	JLabel lblSchedules;
	JLabel lblReduceTheBrightness;
	JPanel btnSettingsPanel;
	JLabel label_4;
	JLabel lblSettings;
	JPanel panel_5;
	JLabel lblLogout;
	JPanel panel_10;
	JLabel lblJohnDoe;
	JPanel btnRoutesPanel;
	JLabel lblLogoutWhenNo;
	JLabel lblVisitNorth;
	JPanel panel_6;
	JLabel lblCities_1;
	final JPanel driversPanel;
	JLabel lblNewLabel_9;
	JPanel panel_8;
	final JPanel vehiclesPanel;
	JLabel lblNewLabel_11;
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
	JLabel lblDrivers;
	JLabel label_3;
	JCheckBox chckbxNewCheckBox;
	JPanel btnVehiclesPanel;
	JLabel label_5;
	JPanel panel_11;
	JPanel panel_12;
	JLabel lblRoutes;
	JLabel lblNewLabel_4;
	JLabel label_6;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_2;
	JLabel lblAddCity;
	JLabel lblClose;
	JLabel lblCities_2;
	JLabel lblLogOutIf;
	JLabel lblErrorCity;
	JLabel lblNewLabel_5;
	JPanel panel_3;
	JLabel lblAutoLogOut;
	JLabel lblCity;
	JLabel lblChangeTheFont;
	JLabel lblFont;
	JPanel panel_4;
	JLabel lblSettings_1;
	JPanel panel_2;
	JCheckBox checkBox;
	JLabel lblFontSize;
	JComboBox comboBox;
	JPanel panel_7;
	private JLabel lblAListOf;

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
		
		lblNewLabel_9 = new JLabel("drivers");
		lblNewLabel_9.setBounds(27, 31, 46, 14);
		driversPanel.add(lblNewLabel_9);
		
		vehiclesPanel = new JPanel();
		vehiclesPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(vehiclesPanel, "name_42931343579900");
		vehiclesPanel.setLayout(null);
		
		lblNewLabel_10 = new JLabel("Vehicle");
		lblNewLabel_10.setBounds(29, 35, 46, 14);
		vehiclesPanel.add(lblNewLabel_10);
		
		routesPanel = new JPanel();
		routesPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(routesPanel, "name_42936498807100");
		routesPanel.setLayout(null);
		
		lblNewLabel_11 = new JLabel("Routes");
		lblNewLabel_11.setBounds(35, 11, 46, 14);
		routesPanel.add(lblNewLabel_11);
		
		btnCitiesPanel = new JPanel();
		btnCitiesPanel.setBackground(new Color(61,70,85));
		btnCitiesPanel.setBounds(79, 225, 179, 40);
		btnCitiesPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(citiesPanel);
				getRequestedTable("City", "city", "cityID", "cityName", tableCity);
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
		txtCity.setBounds(10, 170, 175, 30);
		citiesPanel.add(txtCity);
		txtCity.setColumns(10);
		
		btnAddCity = new JPanel();
		btnAddCity.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertData("city","cityName", txtCity);
				getRequestedTable("City", "city", "cityID", "cityName", tableCity);
			}
		});
		btnAddCity.setLayout(null);
		btnAddCity.setBackground(new Color(60, 71, 85));
		btnAddCity.setBounds(97, 211, 88, 32);
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
		lblErrorCity.setBounds(10, 257, 175, 20);
		citiesPanel.add(lblErrorCity);
		
		lblAListOf = new JLabel("A list of the cities where tourists can visit. Feel free to add more cities to it. ");
		lblAListOf.setFont(new Font("Candara", Font.PLAIN, 13));
		lblAListOf.setBounds(20, 48, 533, 32);
		citiesPanel.add(lblAListOf);
		
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
		
		
		
	}
	
	public void switchPanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	public void insertData(String dbTableName, String dbTableColumnName, JTextField textField ) {
		try {
			String query = "select * from "+ dbTableName +" where "+ dbTableColumnName+"=?";
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, textField.getText());
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				lblErrorCity.setText(textField.getText() + " already exists!");
				System.out.println(textField.getText() + " already exists!");
			}else {
				String insertDataQueryString = "insert into "+dbTableName+" ("+ dbTableColumnName+") values(?)";
				preparedStatement = conn.prepareStatement(insertDataQueryString);
				preparedStatement.setString(1, textField.getText());
				preparedStatement.execute();
				textField.setText("");
			}
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void getRequestedTable(String guiTableColumnName, String dbTableName, String dbTableColumnID, String dbTableColumnName, JTable guiTableName ) {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn(guiTableColumnName);
        try {
        	String query = "select * from " + dbTableName;
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString(dbTableColumnID),
            			resultSet.getString(dbTableColumnName)
            	});
            }
            
            guiTableName.setModel(model);
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
}
