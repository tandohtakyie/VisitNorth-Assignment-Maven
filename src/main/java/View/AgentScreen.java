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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

import com.toedter.calendar.JCalendar;

import Database.DatabaseConnection;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgentScreen extends JFrame {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection conn = DatabaseConnection.connectDB();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
	
	int xx,xy;
	
	private static AgentScreen agentScreenFrame;
	
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel sellTicketPanel;
	private JPanel schedulePanel;
	private JPanel settingsPanel;
	JPanel panelBG;
	JPanel sidePanel;
	JPanel panel;
	final JPanel homePanel;
	JPanel btnHomePanel;
	JLabel lblNewLabel;
	JLabel lblHomeButton;
	JPanel btnSellTicket;
	JPanel btnProceedBuyTicket;
	JLabel label;
	JLabel lblSellTicketButton;
	JPanel panel_9;
	JLabel lblNewLabel_8;
	JPanel btnSchedulePanel;
	JLabel label_2;
	JLabel lblSchedulesButton;
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
	JLabel lblSettings_1;
	JPanel btnBlueishColor;
	JCheckBox chkbAutoLogout;
	JLabel lblFontSizeText;
	JComboBox cmbFontSize;
	JPanel btnPurpleColor;
	private JPanel profilePanel;
	private JPanel profilePanelBar;
	private JCalendar departureDate;
	private JLabel lblNewLabel_10;
	private JComboBox<String> cmbFromTo;
	private JLabel lblDestination;
	private JLabel lblDate;
	private JComboBox<String> cmbDateTravel;
	private JLabel lblTime;
	private JComboBox<String> cmbTimeTravel;
	private JTable tableTicket;

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
	public AgentScreen() {
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
				AgentScreen.this.setLocation(x - xx, y - xy);
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
		
		btnSellTicket = new JPanel();
		btnSellTicket.setLayout(null);
		btnSellTicket.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnSellTicket.setBounds(0, 164, 283, 58);
		btnSellTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchPanel(sellTicketPanel);
				getFromTo();
				displayTicketInTable();
			}
		});
		sidePanel.add(btnSellTicket);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_tour_bus_20px.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(22, 11, 40, 33);
		btnSellTicket.add(label);
		
		lblSellTicketButton = new JLabel("Sell Ticket");
		lblSellTicketButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblSellTicketButton.setForeground(Color.WHITE);
		lblSellTicketButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
		lblSellTicketButton.setBounds(95, 14, 137, 33);
		btnSellTicket.add(lblSellTicketButton);
		
		btnSchedulePanel = new JPanel();
		btnSchedulePanel.setLayout(null);
		btnSchedulePanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnSchedulePanel.setBounds(0, 224, 283, 58);
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
		
		lblSchedulesButton = new JLabel("Schedules");
		lblSchedulesButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblSchedulesButton.setForeground(Color.WHITE);
		lblSchedulesButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
		lblSchedulesButton.setBounds(95, 14, 97, 33);
		btnSchedulePanel.add(lblSchedulesButton);
		
		btnSettingsPanel = new JPanel();
		btnSettingsPanel.setLayout(null);
		btnSettingsPanel.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnSettingsPanel.setBounds(0, 283, 283, 58);
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
//				agentScreenFrame.dispose();
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
		
		JLabel lblWelcomeName = new JLabel("Welcome " + Login.empName);
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
		
		sellTicketPanel = new JPanel();
		sellTicketPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(sellTicketPanel, "name_20101062289600");
		sellTicketPanel.setLayout(null);
		
		JLabel lblProceedWithSelling = new JLabel("Proceed with selling tickets");
		lblProceedWithSelling.setFont(new Font("Candara", Font.PLAIN, 13));
		lblProceedWithSelling.setBounds(20, 48, 533, 32);
		sellTicketPanel.add(lblProceedWithSelling);
		
		JLabel lblSellTicket = new JLabel("Sell Ticket");
		lblSellTicket.setFont(new Font("Candara", Font.PLAIN, 18));
		lblSellTicket.setBounds(10, 11, 110, 41);
		sellTicketPanel.add(lblSellTicket);
		
		cmbFromTo = new JComboBox<String>();
		cmbFromTo.setToolTipText("From and To destination of customer");
		cmbFromTo.setBounds(22, 143, 207, 30);
		sellTicketPanel.add(cmbFromTo);
		
		lblDestination = new JLabel("From & To");
		lblDestination.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDestination.setBounds(20, 120, 209, 20);
		sellTicketPanel.add(lblDestination);
		
		lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Candara", Font.PLAIN, 13));
		lblDate.setBounds(20, 184, 209, 20);
		sellTicketPanel.add(lblDate);
		
		cmbDateTravel = new JComboBox<String>();
		cmbDateTravel.setToolTipText("date customer wants to travel");
		cmbDateTravel.setBounds(22, 207, 207, 30);
		sellTicketPanel.add(cmbDateTravel);
		
		lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTime.setBounds(20, 248, 209, 20);
		sellTicketPanel.add(lblTime);
		
		cmbTimeTravel = new JComboBox<String>();
		cmbTimeTravel.setToolTipText("time customer wants to travel");
		cmbTimeTravel.setBounds(22, 271, 207, 30);
		sellTicketPanel.add(cmbTimeTravel);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(239, 120, 22, 246);
		sellTicketPanel.add(separator_4);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(250, 120, 514, 231);
		sellTicketPanel.add(scrollPane_4);
		
		tableTicket = new JTable();
		scrollPane_4.setViewportView(tableTicket);
		
		btnProceedBuyTicket = new JPanel();
		btnProceedBuyTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				insertTicket();
				displayTicketInTable();
			}
		});
		btnProceedBuyTicket.setLayout(null);
		btnProceedBuyTicket.setBackground(new Color(getColorR(), getColorG(), getColorB()));
		btnProceedBuyTicket.setBounds(119, 319, 110, 32);
		sellTicketPanel.add(btnProceedBuyTicket);
		
		JLabel lblProceed = new JLabel("PROCEED");
		lblProceed.setHorizontalAlignment(SwingConstants.CENTER);
		lblProceed.setForeground(Color.WHITE);
		lblProceed.setFont(new Font("Candara", Font.BOLD, 14));
		lblProceed.setBounds(10, 11, 90, 14);
		btnProceedBuyTicket.add(lblProceed);
		
		schedulePanel = new JPanel();
		schedulePanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(schedulePanel, "name_20107772105900");
		schedulePanel.setLayout(null);
		
		JLabel lblScheduleForAgent = new JLabel("Schedule for Agent");
		lblScheduleForAgent.setFont(new Font("Candara", Font.PLAIN, 18));
		lblScheduleForAgent.setBounds(10, 11, 176, 41);
		schedulePanel.add(lblScheduleForAgent);
		
		JLabel lblTheFollowingSchedule = new JLabel("The following schedule will appear as soon as it is done. It is currently in developing mode.");
		lblTheFollowingSchedule.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTheFollowingSchedule.setBounds(20, 48, 533, 32);
		schedulePanel.add(lblTheFollowingSchedule);
		
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
				changeColorToSellTicketPanel(getColorR(), getColorG(), getColorB());
				changeColorToInProfilePanel(getColorR(), getColorG(), getColorB());
			}
		});
		btnBlueishColor.setBackground(new Color(61, 70, 85));
		btnBlueishColor.setBounds(632, 11, 20, 20);
		panel_1.add(btnBlueishColor);
		
		btnBeigeColor = new JPanel();
		btnBeigeColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateColorTheme(245, 222, 179);
				btnProfilePanel.setBackground(new Color(getColorR() - 23, getColorG() - 23, getColorB() - 21));
				
				changeColorToInSettingPanel(getColorR(), getColorG(), getColorB());
				changeColorToSellTicketPanel(getColorR(), getColorG(), getColorB());
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
				changeColorToSellTicketPanel(getColorR(), getColorG(), getColorB());
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
				changeColorToSellTicketPanel(getColorR(), getColorG(), getColorB());
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
				lblSchedulesButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblSettingsButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
				lblSellTicketButton.setFont(new Font("Candara", Font.BOLD, getFontSizeNavigation()));
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
		profilePanelBar.setBounds(0, 0, 801, 110);
		profilePanel.add(profilePanelBar);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(214, 176, 340, 60);
		profilePanel.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_secured_letter_20px.png")));
		lblNewLabel_3.setBounds(10, 11, 39, 38);
		panel_14.add(lblNewLabel_3);
		
		JLabel lblEmailAddress = new JLabel(Login.email);
		lblEmailAddress.setFont(new Font("Candara", Font.PLAIN, 15));
		lblEmailAddress.setBounds(70, 23, 241, 14);
		panel_14.add(lblEmailAddress);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(214, 247, 340, 60);
		profilePanel.add(panel_15);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_phone_20px.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(10, 11, 39, 38);
		panel_15.add(label_7);
		
		JLabel lblPhoneNumber = new JLabel(Login.phoneNumber);
		lblPhoneNumber.setFont(new Font("Candara", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(70, 23, 241, 14);
		panel_15.add(lblPhoneNumber);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBounds(214, 318, 340, 60);
		profilePanel.add(panel_16);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(ManagerScreen.class.getResource("/Images/icons8_website_20px.png")));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(10, 11, 39, 38);
		panel_16.add(label_9);
		
		JLabel lblWebsite = new JLabel(Login.website);
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
	
	
	public void getFromTo() {
		try {
			//String query = "select distinct * from route where numberOfSeatLeft > 0";
			String query = "select distinct * from route";
			preparedStatement = conn.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cmbFromTo.setSelectedIndex(-1);
				cmbFromTo.addItem(resultSet.getString("description"));
				cmbDateTravel.setSelectedIndex(-1);
				cmbDateTravel.addItem(resultSet.getString("departureDate"));
				cmbTimeTravel.setSelectedIndex(-1);
				cmbTimeTravel.addItem(resultSet.getString("departureTime"));
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
			preparedStatement.setString(1, cmbFromTo.getSelectedItem().toString());
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
			preparedStatement.setString(1, cmbFromTo.getSelectedItem().toString());
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
			preparedStatement.setString(3, cmbDateTravel.getSelectedItem().toString());
			preparedStatement.setString(4, cmbTimeTravel.getSelectedItem().toString());
			preparedStatement.setDouble(5, price);
			preparedStatement.execute();
			
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	
	
	public void updateTicketwithScheduleID() {
//		try {
//			String timeStamp = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
//			
//			String insertDataQueryString = "Update ticket set scheduleID=?, price=?  WHERE id = 1;";
//			preparedStatement = conn.prepareStatement(insertDataQueryString);
//			preparedStatement.setString(1, timeStamp);
//			preparedStatement.setString(2, getScheduleID());
//			preparedStatement.setDouble(3, getPrice());
//			preparedStatement.execute();
//			
//		} catch (Exception e) {
//			System.out.println("error: " + e);
//		}
	}
	

public void displayTicketInTable() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("TRANSACTION TIME");
		model.addColumn("SCHEDULE ID");
		model.addColumn("DATE");
		model.addColumn("TIME");
		model.addColumn("PRICE");
        try {
        	String query = "select * from ticket";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
            	model.addRow(new Object[] {
            			resultSet.getString("transactionTime"),
            			resultSet.getString("scheduleID"),
            			resultSet.getString("date"),
            			resultSet.getString("time"),
            			resultSet.getString("price")
            	});
            }
            
            tableTicket.setModel(model);
            
        }catch (Exception e) {
			System.out.println("error: " + e);
		}
	}

	public void changeColorToInSettingPanel(int r, int g, int b) {
		sidePanel.setBackground(new Color(r, g, b));
		btnHomePanel.setBackground(new Color(r, g, b));
		btnSchedulePanel.setBackground(new Color(r, g, b));
		btnSettingsPanel.setBackground(new Color(r, g, b));
		btnSellTicket.setBackground(new Color(r, g, b));
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
//	
	public void changeColorToSellTicketPanel(int r, int g, int b){
		btnProceedBuyTicket.setBackground(new Color(r, g, b));
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
	
}
