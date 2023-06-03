package PhotoboothBookingSystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JDateChooser;

import Dashboard.PanelDashboard;

public class TwinStripPanel extends JPanel {

	//=== TwinStrip Layout Picture ===
		private ImageIcon ts1 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 1.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts2 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 2.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts3 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 3.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts4 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 4.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts5 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 5.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts6 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 6.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts7 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 7.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts8 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 8.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts9 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 9.jpg")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon ts10 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemTwinStripImage\\twin strip - 10.png")
				.getImage().getScaledInstance(371, 361, Image.SCALE_DEFAULT));
		private ImageIcon atm = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\credit.png")
				.getImage().getScaledInstance(426, 221, Image.SCALE_DEFAULT));
		
		// ============================= curtain image ============================
		private ImageIcon c1 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\green.png")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c2 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\black2.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c3 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\curtaintinsel.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c4 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\cold.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c5 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\pinkvioletcurtain.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c6 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\pinkcurtain.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c7 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\violetcurtain.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c8 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\silver.jpeg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c9 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\redcurtain.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c10 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\curtainlightwhite.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
		
				
		public static String[] layoutTwinstripChoose = { "Choose Twin Strip Layout Design", "1. Unicorn", "2. White - Redrose","3. Wedding Design","4. Baptism Design",
				"5. Birthday Design","6. Jungle Design","7. Barbie Design","8. Jungel (2)","9. Redrose (2)","10. Red Gray Design"};
			
		// curtain or backdrop arraylist for combobox
		public static String[] curtain = { "Choose Backdrops", "1. Green Screen", "2. Black", "3. Tinsel",
				"4. Gold" , "5. Pink White", "6. Pink", "7. Violet", "8. Silver","9. Red" , "10. Light White"};	
			
		private JPasswordField enterPINfield;	
	    private JTextField TotaltextField;
	    private JTextField EnterName;
	    private JTextField Amount;
	    private JTextField eventtypeField;
	    private JTextField organizernameField;
	    private JTextField txtEnterCelebrantName;
	    private JTextField monthField;
	    private JTextField dayField;
	    private JTextField yearField;
	    private JTextField eventplaceField;
	    private JTextField PhoneNumberField;   
	    private JButton fileButton;
		private JComboBox twinstripComboBox;
		private JComboBox curtainCombobox;
		private JCheckBox extendthirtycheckbox;
	    private JCheckBox extendonehourcheckbox;
	    private JCheckBox magneticchckbox;
		private JPanel buttonTwinStripPanel;
		private JPanel buttonInsertDesignPanel;
		private JPanel buttonBooknowPanel;
		private JPanel  paymentPanel;
	    private JPanel  buttoncheckoutpanel;
	    private JPanel buttonpurchase;
	    private JPanel buttonChooseBackground;
	    private JPanel backgroundshoowpanel;
	    private JLabel lblshowbackground;
		private JLabel showTwinStripPictureLbl;
		private JLabel  twinstriplayoutlbl;
	    
	    public static String magneticPrice;
	    public static String designPrice;
	    public static String layoutName;
	    public static String ownlayoutPrice;
	    public static String ownlayoutDesign;//
	    public static Double totalPrice;
	    public static String totalprices;
	    public static String organizerName;
	    public static String celebrantName;
	    public static String magnetics;
	    public static String eventtypes;//
	    public static String phoneNumber;//
	    public static String eventPlaces;//
	    public static String designLayout;//
	    public static String curtainLayout;//
		public static String filename;
	    public static String fileNameTs; // for jchooser file
	    public static String thirtyminsPrice;
	    public static String onehourPrice;
	    public static String thirtymins2;
	    public static String onehour2;
	    public static String amounts;
	    public static String months;
	    public static String days;
	    public static String years;
	    public static String  date;
			/**
			 * Create the panel.
			 */
			public TwinStripPanel() {
				setBackground(new Color(255, 255, 255));
			    setBounds(0, 122, 1280, 780); // Update height to 780
			    setLayout(null);

			    JPanel mainPanel = new JPanel();
				mainPanel.setBounds(0, 0, 1280, 607);		
				add(mainPanel);
				mainPanel.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
			    scrollPane.setBounds(0, 0, 1280, 607);
			    scrollPane.setBackground(new Color(225, 254, 253));
			    mainPanel.add(scrollPane);
			    

			    JPanel scrollContent = new JPanel();
			    scrollContent.setBackground(new Color(255, 255, 255));
			    scrollContent.setLayout(null);
			    scrollContent.setPreferredSize(new Dimension(1001, 2690)); // increase the size of the panel to fit all 9 labels
			    scrollPane.setViewportView(scrollContent);
			       
			    
			    JPanel showsTSPanel = new JPanel();
			    showsTSPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    showsTSPanel.setBackground(new Color(255, 255, 255));
			    showsTSPanel.setBounds(186, 11, 885, 417);
			    scrollContent.add(showsTSPanel);
			    showsTSPanel.setLayout(null);
			    
			    JLabel tsbookingsystemlbl = new JLabel("Twin Strip Booking System");
			    tsbookingsystemlbl.setFont(new Font("Anton", Font.PLAIN, 25));
			    tsbookingsystemlbl.setBounds(315, 0, 317, 48);
			    showsTSPanel.add(tsbookingsystemlbl);
			    
			    // this is why reason why you select design on combo box will show
			    showTwinStripPictureLbl = new JLabel("");
			    showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
			    showsTSPanel.add(showTwinStripPictureLbl);
			    
			    
			    JPanel step1Panel = new JPanel();
			    step1Panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    step1Panel.setBackground(new Color(255, 255, 255));
			    step1Panel.setBounds(186, 430, 885, 83);
			    scrollContent.add(step1Panel);
			    step1Panel.setLayout(null);
			    
			    JLabel step1text = new JLabel("Step 1: Click on \" Twin Strip Photo Layout\" to display the layout options for choosing a design.");
			    step1text.setFont(new Font("Anton", Font.PLAIN, 15));
			    step1text.setBounds(173, 0, 586, 23);
			    step1Panel.add(step1text);
			    
			    buttonTwinStripPanel = new JPanel();
			    buttonTwinStripPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    buttonTwinStripPanel.setBackground(new Color(255, 255, 255));
			    buttonTwinStripPanel.setBounds(293, 31, 291, 41);
			    buttonTwinStripPanel.addMouseListener(new PanelButtonMouseAdapter(buttonTwinStripPanel));
			    step1Panel.add(buttonTwinStripPanel);
			    buttonTwinStripPanel.setLayout(null);
			    
			    twinstriplayoutlbl = new JLabel("Twin Strip Layout");
			    twinstriplayoutlbl.setFont(new Font("Anton", Font.PLAIN, 16));
			    twinstriplayoutlbl.setBounds(90, 0, 122, 41);
			    buttonTwinStripPanel.add(twinstriplayoutlbl);
			    
			    JPanel step2Panel = new JPanel();
			    step2Panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    step2Panel.setBackground(new Color(255, 255, 255));
			    step2Panel.setBounds(186, 524, 885, 75);
			    scrollContent.add(step2Panel);
			    step2Panel.setLayout(null);
			    
			    JLabel lblStepSelect = new JLabel("Step 2: Select the desired design for the photo layout.");
			    lblStepSelect.setFont(new Font("Anton", Font.PLAIN, 15));
			    lblStepSelect.setBounds(173, 0, 358, 23);
			    step2Panel.add(lblStepSelect);
			    
			    twinstripComboBox = new JComboBox(layoutTwinstripChoose);
				twinstripComboBox.setBounds(263, 36, 391, 28);
				twinstripComboBox.setVisible(false);
				step2Panel.add(twinstripComboBox);
				twinstripComboBox.setFont(new Font("Anton", Font.PLAIN, 16));
				twinstripComboBox.addItemListener(new ItemListener() {
				    public void itemStateChanged(ItemEvent e) {
				        if (e.getStateChange() == ItemEvent.SELECTED) {
				            String selectedlayout = twinstripComboBox.getSelectedItem().toString();
				            switch (selectedlayout) {
				            case "Choose Twin Strip Layout Design":
				            	showTwinStripPictureLbl.setIcon(null);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "1. Unicorn":
				            	showTwinStripPictureLbl.setIcon(ts1);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "2. White - Redrose":
				            	showTwinStripPictureLbl.setIcon(ts2);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "3. Wedding Design":
				            	showTwinStripPictureLbl.setIcon(ts3);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "4. Baptism Design":
				            	showTwinStripPictureLbl.setIcon(ts4);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "5. Birthday Design":
				            	showTwinStripPictureLbl.setIcon(ts5);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "6. Jungle Design":
				            	showTwinStripPictureLbl.setIcon(ts6);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "7. Barbie Design":
				            	showTwinStripPictureLbl.setIcon(ts7);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "8. Jungel (2)":
				            	showTwinStripPictureLbl.setIcon(ts8);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "9. Redrose (2)":
				            	showTwinStripPictureLbl.setIcon(ts9);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            case "10. Red Gray Design":
				            	showTwinStripPictureLbl.setIcon(ts10);
				            	showTwinStripPictureLbl.setBounds(262, 45, 371, 361);
				                break;
				            default:
				            	showTwinStripPictureLbl.setIcon(null);
				                break;
				            }
				        }
				    }
				});
			    
				JPanel step5panel = new JPanel();
			    step5panel.setLayout(null);
			    step5panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    step5panel.setBackground(Color.WHITE);
			    step5panel.setBounds(186, 1130, 885, 522);
			    scrollContent.add(step5panel);
			    
			    JLabel lblStepSelect2 = new JLabel("Step 5 : Input Date of Main Event");
			    lblStepSelect2.setFont(new Font("Anton", Font.PLAIN, 15));
			    lblStepSelect2.setBounds(173, 24, 549, 48);
			    step5panel.add(lblStepSelect2);
			    
			    JPanel calendarPanel = new JPanel();
				calendarPanel.setBounds(911, 24, 322, 228);
				step5panel.add(calendarPanel);
				calendarPanel.setLayout(null);
				
				JLabel lblStepFill = new JLabel("Step 6 : Fill out the entire form.");
				lblStepFill.setFont(new Font("Anton", Font.PLAIN, 15));
				lblStepFill.setBounds(159, 158, 549, 48);
				step5panel.add(lblStepFill);
				
				eventplaceField = new JTextField();
				eventplaceField.setFont(new Font("Anton", Font.PLAIN, 15));
				eventplaceField.setText("Enter Event Place");
				eventplaceField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				eventplaceField.setBounds(194, 276, 426, 48);
				eventplaceField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (eventplaceField.getText().equals("")) {
							eventplaceField.setForeground(new Color(96, 96, 96));
							eventplaceField.setText("Enter Event Place");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (eventplaceField.getText().equals("Enter Event Place")) {
							eventplaceField.setForeground(Color.BLACK);
							eventplaceField.setText("");
						}
					}
				});
				step5panel.add(eventplaceField);
				eventplaceField.setColumns(10);
				
				
				organizernameField = new JTextField();
				organizernameField.setFont(new Font("Anton", Font.PLAIN, 15));
				organizernameField.setText("Enter Organizer Name");
				organizernameField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				organizernameField.setColumns(10);
				organizernameField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (organizernameField.getText().equals("")) {
							organizernameField.setForeground(new Color(96, 96, 96));
							organizernameField.setText("Enter Organizer Name");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (organizernameField.getText().equals("Enter Organizer Name")) {
							organizernameField.setForeground(Color.BLACK);
							organizernameField.setText("");
						}
					}
				});
				organizernameField.setBounds(195, 394, 426, 48);
				step5panel.add(organizernameField);
				
				PhoneNumberField = new JTextField();
				PhoneNumberField.setFont(new Font("Anton", Font.PLAIN, 15));
				PhoneNumberField.setText("Enter Contact Number");
				PhoneNumberField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				PhoneNumberField.setColumns(10);
				PhoneNumberField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (PhoneNumberField.getText().equals("")) {
							PhoneNumberField.setForeground(new Color(96, 96, 96));
							PhoneNumberField.setText("Enter Contact Number");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (PhoneNumberField.getText().equals("Enter Contact Number")) {
							PhoneNumberField.setForeground(Color.BLACK);
							PhoneNumberField.setText("");
						}
					}
				});
				PhoneNumberField.addKeyListener(new KeyAdapter() {
		            @Override // this is why 9 only number can input in Phone Number
		            public void keyTyped(KeyEvent e) {
		                char c = e.getKeyChar();
		                if (!Character.isDigit(c) || PhoneNumberField.getText().length() >= 9) {
		                    e.consume();
		                }
		            }
		        });
				PhoneNumberField.setBounds(195, 453, 426, 48);
				step5panel.add(PhoneNumberField);
				
				eventtypeField = new JTextField();
				eventtypeField.setText("Enter Event Type");
				eventtypeField.setFont(new Font("Anton", Font.PLAIN, 15));
				eventtypeField.setColumns(10);
				eventtypeField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				eventtypeField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (eventtypeField.getText().equals("")) {
							eventtypeField.setForeground(new Color(96, 96, 96));
							eventtypeField.setText("Enter Event Type");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (eventtypeField.getText().equals("Enter Event Type")) {
							eventtypeField.setForeground(Color.BLACK);
							eventtypeField.setText("");
						}
					}
				});
				eventtypeField.setBounds(194, 217, 426, 48);
				step5panel.add(eventtypeField);
				
				txtEnterCelebrantName = new JTextField();
				txtEnterCelebrantName.setText("Enter Celebrant Name");
				txtEnterCelebrantName.setFont(new Font("Anton", Font.PLAIN, 15));
				txtEnterCelebrantName.setColumns(10);
				txtEnterCelebrantName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				txtEnterCelebrantName.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (txtEnterCelebrantName.getText().equals("")) {
							txtEnterCelebrantName.setForeground(new Color(96, 96, 96));
							txtEnterCelebrantName.setText("Enter Celebrant Name");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (txtEnterCelebrantName.getText().equals("Enter Celebrant Name")) {
							txtEnterCelebrantName.setForeground(Color.BLACK);
							txtEnterCelebrantName.setText("");
						}
					}
				});
				txtEnterCelebrantName.setBounds(195, 335, 426, 48);
				step5panel.add(txtEnterCelebrantName);
				
				monthField = new JTextField();
				monthField.setFont(new Font("Anton", Font.PLAIN, 15));
				monthField.setBounds(268, 75, 66, 41);
				monthField.setText("MM");
				monthField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				monthField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (monthField.getText().equals("")) {
							monthField.setForeground(new Color(96, 96, 96));
							monthField.setText("MM");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (monthField.getText().equals("MM")) {
							monthField.setForeground(Color.BLACK);
							monthField.setText("");
						}
					}
				});
				monthField.addKeyListener(new KeyAdapter() {
				    @Override
				    public void keyTyped(KeyEvent e) {
				        char c = e.getKeyChar();
				        if (!Character.isDigit(c) || monthField.getText().length() >= 2) {
				            e.consume();
				        }
				    }
				});
				step5panel.add(monthField);
				monthField.setColumns(10);
				
				dayField = new JTextField();
				dayField.setFont(new Font("Anton", Font.PLAIN, 15));
				dayField.setColumns(10);
				dayField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				dayField.setBounds(344, 75, 66, 41);
				dayField.setText("DD");
				dayField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (dayField.getText().equals("")) {
							dayField.setForeground(new Color(96, 96, 96));
							dayField.setText("DD");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (dayField.getText().equals("DD")) {
							dayField.setForeground(Color.BLACK);
							dayField.setText("");
						}
					}
				});
				dayField.addKeyListener(new KeyAdapter() {
				    @Override
				    public void keyTyped(KeyEvent e) {
				        char c = e.getKeyChar();
				        if (!Character.isDigit(c) || dayField.getText().length() >= 2) {
				            e.consume();
				        }
				    }
				});
				step5panel.add(dayField);
				
				yearField = new JTextField();
				yearField.setFont(new Font("Anton", Font.PLAIN, 15));
				yearField.setColumns(10);
				yearField.setBounds(420, 75, 106, 41);
				yearField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				yearField.setText("YYYY");
				yearField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (yearField.getText().equals("")) {
							yearField.setForeground(new Color(96, 96, 96));
							yearField.setText("YYYY");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (yearField.getText().equals("YYYY")) {
							yearField.setForeground(Color.BLACK);
							yearField.setText("");
						}
					}
				});
				yearField.addKeyListener(new KeyAdapter() {
				    @Override
				    public void keyTyped(KeyEvent e) {
				        char c = e.getKeyChar();
				        if (!Character.isDigit(c) || yearField.getText().length() >= 4) {
				            e.consume();
				        }
				    }
				});
				step5panel.add(yearField);
				
				
				fileButton = new JButton("Insert File");
				fileButton.setFont(new Font("Anton", Font.PLAIN, 10));
				fileButton.setBounds(365, 27, 120, 37);
				fileButton.setVisible(false); // Set the fileButton initially invisible
				step2Panel.add(fileButton);

				fileButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        JFileChooser fileChooser = new JFileChooser();
				        int returnValue = fileChooser.showOpenDialog(null);
				        if (returnValue == JFileChooser.APPROVE_OPTION) {
				            File selectedFile = fileChooser.getSelectedFile();
				            filename = selectedFile.getName();
				            fileButton.setText(filename);

				            // Display the selected file in showStandardPictureLbl
				            ImageIcon imageIcon = new ImageIcon(
				                    new ImageIcon(selectedFile.getAbsolutePath())
				                            .getImage()
				                            .getScaledInstance(790, 361, Image.SCALE_DEFAULT)
				            );
				            showTwinStripPictureLbl.setIcon(imageIcon);
				        }
		        // Save the file name in a text file
		        
		        try {
		            FileWriter writer = new FileWriter("C:\\data.txt", true);
		            writer.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        			}
						}
					
				});
				
				JPanel Step7panel = new JPanel();
				Step7panel.setLayout(null);
				Step7panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				Step7panel.setBackground(Color.WHITE);
				Step7panel.setBounds(186, 1665, 885, 543);
				scrollContent.add(Step7panel);
				
				JLabel lblStepDo = new JLabel("Step 7: Do you want your picture to be magnetic? It's up to you if you want it or not. There is");
				lblStepDo.setFont(new Font("Anton", Font.PLAIN, 15));
				lblStepDo.setBounds(173, 11, 579, 48);
				Step7panel.add(lblStepDo);
				
				magneticchckbox = new JCheckBox("             Magnetic");
				magneticchckbox.setFont(new Font("Anton", Font.PLAIN, 15));
				magneticchckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
				magneticchckbox.setBounds(331, 83, 193, 48);
				Step7panel.add(magneticchckbox);
				
				JLabel lblStepClick = new JLabel("Step 9 : Click \"Check Out\" if you want to see the total price.");
				lblStepClick.setFont(new Font("Anton", Font.PLAIN, 15));
				lblStepClick.setBounds(173, 360, 549, 48);
				Step7panel.add(lblStepClick);
				
				JLabel lblAnAdditionalCost = new JLabel("an additional cost of 1000 if you want it to be magnetic.");
				lblAnAdditionalCost.setFont(new Font("Anton", Font.PLAIN, 15));
				lblAnAdditionalCost.setBounds(173, 31, 579, 48);
				Step7panel.add(lblAnAdditionalCost);
				
				buttoncheckoutpanel = new JPanel();
				buttoncheckoutpanel.setLayout(null);
				buttoncheckoutpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
				buttoncheckoutpanel.setBackground(Color.WHITE);
				buttoncheckoutpanel.setBounds(278, 405, 291, 41);
				buttoncheckoutpanel.addMouseListener(new PanelButtonMouseAdapter3(buttoncheckoutpanel));
				Step7panel.add(buttoncheckoutpanel);
				
				JLabel lblCheckOut = new JLabel("Check Out");
				lblCheckOut.setFont(new Font("Anton", Font.PLAIN, 15));
				lblCheckOut.setBounds(108, 0, 142, 41);
				buttoncheckoutpanel.add(lblCheckOut);
				
				JLabel lblTotal = new JLabel("Total :");
				lblTotal.setFont(new Font("Anton", Font.PLAIN, 15));
				lblTotal.setBounds(217, 457, 51, 48);
				Step7panel.add(lblTotal);
				
				TotaltextField = new JTextField();
				TotaltextField.setFont(new Font("Anton", Font.PLAIN, 15));
				TotaltextField.setBounds(278, 457, 291, 48);
				Step7panel.add(TotaltextField);
				TotaltextField.setEditable(false);
				TotaltextField.setColumns(10);
				
				JLabel lblStepUnlimited = new JLabel("Step 8 : Unlimited Shots for 2 Hours per Book");
				lblStepUnlimited.setFont(new Font("Anton", Font.PLAIN, 15));
				lblStepUnlimited.setBounds(173, 142, 579, 48);
				Step7panel.add(lblStepUnlimited);
				
				JLabel lblPleaseNote = new JLabel("Please note : that some clients may choose to extend their booking in in advance, while others may opt to extend it");
				lblPleaseNote.setForeground(Color.RED);
				lblPleaseNote.setFont(new Font("Arial", Font.PLAIN, 14));
				lblPleaseNote.setBounds(82, 176, 753, 39);
				Step7panel.add(lblPleaseNote);
				
				JLabel lblInAdvanceWhile = new JLabel(" on-site at the event location. However, if you are undecided, you can skip this step for now.");
				lblInAdvanceWhile.setForeground(Color.RED);
				lblInAdvanceWhile.setFont(new Font("Arial", Font.PLAIN, 14));
				lblInAdvanceWhile.setBounds(145, 198, 665, 39);
				Step7panel.add(lblInAdvanceWhile);
				
				JLabel lblLocationHoweverIf = new JLabel("Please be aware that each extension of 30 minutes costs 500, and each extension of 1 hour costs 1000.");
				lblLocationHoweverIf.setForeground(Color.RED);
				lblLocationHoweverIf.setFont(new Font("Arial", Font.PLAIN, 14));
				lblLocationHoweverIf.setBounds(103, 223, 707, 39);
				Step7panel.add(lblLocationHoweverIf);
				
			    extendthirtycheckbox = new JCheckBox("             30 Minute");
				extendthirtycheckbox.setFont(new Font("Anton", Font.PLAIN, 15));
				extendthirtycheckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
				extendthirtycheckbox.setBounds(192, 269, 193, 48);
				Step7panel.add(extendthirtycheckbox);
				
				extendonehourcheckbox = new JCheckBox("             1 Hour\r\n");
				extendonehourcheckbox.setFont(new Font("Anton", Font.PLAIN, 15));
				extendonehourcheckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
				extendonehourcheckbox.setBounds(426, 269, 193, 48);
				Step7panel.add(extendonehourcheckbox);
			    
				JPanel Step8panel = new JPanel();
			    Step8panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    Step8panel.setBackground(new Color(255, 255, 255));
			    Step8panel.setBounds(186, 2215, 885, 428);
			    scrollContent.add(Step8panel);
			    Step8panel.setLayout(null);
			    
			    JLabel lblStepIs = new JLabel("Step 10: Is the price acceptable to you? If yes, click \"Book Now!\".");
			    lblStepIs.setBounds(173, 11, 549, 48);
			    Step8panel.add(lblStepIs);
			    lblStepIs.setFont(new Font("Anton", Font.PLAIN, 15));
			    
			     buttonBooknowPanel = new JPanel();
			    buttonBooknowPanel.setBounds(278, 57, 291, 41);
			    Step8panel.add(buttonBooknowPanel);
			    buttonBooknowPanel.setLayout(null);
			    buttonBooknowPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    buttonBooknowPanel.setBackground(Color.WHITE);
			    buttonBooknowPanel.addMouseListener(new PanelButtonMouseAdapter4(buttonBooknowPanel));
			 
			    
			    JLabel lblBookNow = new JLabel("Book Now!");
			    lblBookNow.setFont(new Font("Anton", Font.PLAIN, 15));
			    lblBookNow.setBounds(108, 0, 142, 41);
			    buttonBooknowPanel.add(lblBookNow);
			    
			    paymentPanel = new JPanel();
			    paymentPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
			    paymentPanel.setBackground(new Color(255, 255, 255));
			    paymentPanel.setBounds(91, 109, 720, 292);
			    paymentPanel.setVisible(false); // Initially hide the paymentPanel
			    Step8panel.add(paymentPanel);
			    paymentPanel.setLayout(null);
			    
			    JLabel atmlbl = new JLabel("");
			    atmlbl.setFont(new Font("Anton", Font.PLAIN, 15));
			    atmlbl.setIcon(atm);
			    atmlbl.setBounds(10, 11, 426, 221);
			    paymentPanel.add(atmlbl);
			    
			    EnterName = new JTextField();
			    EnterName.setFont(new Font("Anton", Font.PLAIN, 15));
			    EnterName.setBounds(446, 88, 264, 46);
			    EnterName.setText("Enter Name");
			    EnterName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
			    EnterName.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (EnterName.getText().equals("")) {
							EnterName.setForeground(new Color(96, 96, 96));
							EnterName.setText("Enter Name");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (EnterName.getText().equals("Enter Name")) {
							EnterName.setForeground(Color.BLACK);
							EnterName.setText("");
						}
					}
				});
			    paymentPanel.add(EnterName);
			    EnterName.setColumns(10);
			    
			    Amount = new JTextField();
			    Amount.setFont(new Font("Anton", Font.PLAIN, 15));
			    Amount.setColumns(10);
			    Amount.setText("Enter Amount");
			    Amount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
			    Amount.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (Amount.getText().equals("")) {
							Amount.setForeground(new Color(96, 96, 96));
							Amount.setText("Enter Amount");
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (Amount.getText().equals("Enter Amount")) {
							Amount.setForeground(Color.BLACK);
							Amount.setText("");
						}
					}
				});
			    Amount.setBounds(446, 145, 264, 46);
			    paymentPanel.add(Amount);
			    
			    enterPINfield= new JPasswordField();
			    enterPINfield.setText("Enter PIN Number");
			    enterPINfield.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
			    enterPINfield.addFocusListener(new FocusAdapter(){
					@Override
					public void focusLost(FocusEvent e) {
						if (enterPINfield.getText().equals("")) {
							enterPINfield.setForeground(new Color(96, 96, 96));
							enterPINfield.setText("Enter PIN Number");
							enterPINfield.setEchoChar((char) 0);
						}
					}

					@Override
					public void focusGained(FocusEvent e) {
						if (enterPINfield.getText().equals("Enter PIN Number")) {
							enterPINfield.setEchoChar('●');
							enterPINfield.setForeground(Color.BLACK);
							enterPINfield.setText("");
						}
					}

				});
			    enterPINfield.addKeyListener(new KeyAdapter() {
		            @Override // this is why 6 only number can input in PIN Field
		            public void keyTyped(KeyEvent e) {
		                char c = e.getKeyChar();
		                if (!Character.isDigit(c) || enterPINfield.getText().length() >= 6) {
		                    e.consume();
		                }
		            }
		        });
			    enterPINfield.setForeground(new Color(96, 96, 96));
			    enterPINfield.setEchoChar('●');
			    enterPINfield.setBounds(446, 31, 264, 46);
			    paymentPanel.add(enterPINfield);
			    
			    buttonpurchase = new JPanel();
			    buttonpurchase.setLayout(null);
			    buttonpurchase.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			    buttonpurchase.setBackground(Color.WHITE);
			    buttonpurchase.setBounds(482, 202, 203, 46);
			    buttonpurchase.addMouseListener(new PanelButtonMouseAdapter5(buttonpurchase));
			    paymentPanel.add(buttonpurchase);
			    
			    JLabel lblPur = new JLabel("Purchase ");
			    lblPur.setFont(new Font("Anton", Font.PLAIN, 15));
			    lblPur.setBounds(67, 0, 126, 41);
			    buttonpurchase.add(lblPur);
			     
			     JPanel Step3panel = new JPanel();
			     Step3panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			     Step3panel.setBackground(new Color(255, 255, 255));
			     Step3panel.setBounds(186, 610, 885, 124);
			     scrollContent.add(Step3panel);
			     Step3panel.setLayout(null);
			     
			     JLabel lblStepIf = new JLabel("Step 3: If you have your own design, select any layout style that represents your design.");
			     lblStepIf.setBounds(157, 11, 549, 48);
			     Step3panel.add(lblStepIf);
			     lblStepIf.setFont(new Font("Anton", Font.PLAIN, 15));
			     
			     buttonInsertDesignPanel = new JPanel();
			     buttonInsertDesignPanel.setBounds(300, 51, 291, 41);
			     Step3panel.add(buttonInsertDesignPanel);
			     buttonInsertDesignPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
			     buttonInsertDesignPanel.setBackground(new Color(255, 255, 255));
			     buttonInsertDesignPanel.addMouseListener(new PanelButtonMouseAdapter2(buttonInsertDesignPanel));
			     buttonInsertDesignPanel.setLayout(null);
			     
			      JLabel insertyourowndesigntextlbl = new JLabel("Insert your Own Design");
			      insertyourowndesigntextlbl.setFont(new Font("Anton", Font.PLAIN, 15));
			      insertyourowndesigntextlbl.setBounds(69, 0, 181, 41);
			      buttonInsertDesignPanel.add(insertyourowndesigntextlbl);
			      
			      JPanel Step4panel = new JPanel();
			      Step4panel.setBorder(new MatteBorder(2, 2, 2, 1, (Color) new Color(102, 244, 222)));
			      Step4panel.setBackground(new Color(255, 255, 255));
			      Step4panel.setBounds(186, 745, 885, 365);
			      scrollContent.add(Step4panel);
			      Step4panel.setLayout(null);
			      
			      JLabel lblStepChoose = new JLabel("Step 4: Choose a Background for the Layout");
			      lblStepChoose.setFont(new Font("Anton", Font.PLAIN, 15));
			      lblStepChoose.setBounds(197, 11, 549, 48);
			      Step4panel.add(lblStepChoose);
			      
			     // ========================= Step 4 background panel and lbl ================================================
			    buttonChooseBackground = new JPanel();
			  	buttonChooseBackground.setLayout(null);
			  	buttonChooseBackground.addMouseListener(new PanelButtonMouseAdapter6(buttonChooseBackground));
			  	buttonChooseBackground.setBorder(new MatteBorder(2, 2, 2, 2, new Color(102, 244, 222)));
			  	buttonChooseBackground.setBackground(Color.WHITE);
			  	buttonChooseBackground.setBounds(312, 51, 291, 41);
			  	Step4panel.add(buttonChooseBackground);

			  	JLabel lblChooseBackground = new JLabel("Choose Background");
			  	lblChooseBackground.setFont(new Font("Anton", Font.PLAIN, 15));
			  	lblChooseBackground.setBounds(69, 0, 181, 41);
			  	buttonChooseBackground.add(lblChooseBackground);

			  	backgroundshoowpanel = new JPanel();
			  	backgroundshoowpanel.setVisible(false);
			  	backgroundshoowpanel.setBorder(new MatteBorder(2, 2, 2, 2, new Color(102, 244, 222)));
			  	backgroundshoowpanel.setBackground(new Color(255, 255, 255));
			  	backgroundshoowpanel.setBounds(32, 103, 835, 251);
			  	Step4panel.add(backgroundshoowpanel);
			  	backgroundshoowpanel.setLayout(null);

			  	lblshowbackground = new JLabel("");
			  	lblshowbackground.setBounds(460, 22, 354, 229);
			  	backgroundshoowpanel.add(lblshowbackground);

			  	JLabel lblNewLabel = new JLabel("Please note: If the layout you have selected already includes a");
			  	lblNewLabel.setForeground(Color.RED);
			  	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
			  	lblNewLabel.setBounds(10, 11, 451, 39);
			  	backgroundshoowpanel.add(lblNewLabel);

			  	JLabel lblItIsA = new JLabel("background, it indicates that it is a green screen. If you do not");
			  	lblItIsA.setForeground(Color.RED);
			  	lblItIsA.setFont(new Font("Arial", Font.PLAIN, 14));
			  	lblItIsA.setBounds(10, 30, 451, 39);
			  	backgroundshoowpanel.add(lblItIsA);

			  	JLabel lblTheFlexibilityTo = new JLabel("want that particular background in your layout, you have the flexibility");
			  	lblTheFlexibilityTo.setForeground(Color.RED);
			  	lblTheFlexibilityTo.setFont(new Font("Arial", Font.PLAIN, 14));
			  	lblTheFlexibilityTo.setBounds(10, 47, 451, 39);
			  	backgroundshoowpanel.add(lblTheFlexibilityTo);
			  	
			  	// ============ COMBO BOX WITH FUNCTION OF ITEMSTATECHANGED=================================
			  	curtainCombobox = new JComboBox(curtain);
			  	curtainCombobox.setBounds(10, 142, 416, 31);
			  	backgroundshoowpanel.add(curtainCombobox);
			  	curtainCombobox.addItemListener(new ItemListener() {
				    public void itemStateChanged(ItemEvent e) {
				        if (e.getStateChange() == ItemEvent.SELECTED) {
				            String selectedlayout = curtainCombobox.getSelectedItem().toString();
				            switch (selectedlayout) {
				            case "Choose Backdrops":
				            	lblshowbackground.setIcon(null);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "1. Green Screen":
				            	lblshowbackground.setIcon(c1);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "2. Black":
				            	lblshowbackground.setIcon(c2);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "3. Tinsel":
				            	lblshowbackground.setIcon(c3);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "4. Gold":
				            	lblshowbackground.setIcon(c4);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "5. Pink White":
				            	lblshowbackground.setIcon(c5);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "6. Pink":
				            	lblshowbackground.setIcon(c6);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "7. Violet":
				            	lblshowbackground.setIcon(c7);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "8. Silver":
				            	lblshowbackground.setIcon(c8);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "9. Red":
				            	lblshowbackground.setIcon(c9);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            case "10. Light White":
				            	lblshowbackground.setIcon(c10);
				            	lblshowbackground.setBounds(460, 22, 354, 229);
				                break;
				            default:
				            	lblshowbackground.setIcon(null);
				                break;
				            }
				        }
				    }
				});
			  	//=========================== END HERE====================================================================
			  	JLabel lblFlexibilityToChoose = new JLabel("flexibility to choose a different one instead.\r\n");
			  	lblFlexibilityToChoose.setForeground(Color.RED);
			  	lblFlexibilityToChoose.setFont(new Font("Arial", Font.PLAIN, 14));
			  	lblFlexibilityToChoose.setBounds(10, 68, 451, 39);
			  	backgroundshoowpanel.add(lblFlexibilityToChoose);
			    // ============================== end here===================================================================
			    scrollPane.setPreferredSize(new Dimension(1500, 500)); // set the size of the scroll pane to fit the labels

			}
			private class PanelButtonMouseAdapter extends MouseAdapter{
				
				JPanel panel;
				 boolean isComboBoxVisible = false;
				 
				public PanelButtonMouseAdapter(JPanel panel) {
					this.panel = panel;
				}
			    public void mouseEntered(MouseEvent e){
								
					panel.setBackground(new Color(102, 244, 222));
				}
							
				@Override
				public void mouseExited(MouseEvent e) {
			        if (!isComboBoxVisible) {
			            panel.setBackground(new Color(240, 240, 240));
			        }
			    }
							
				@Override
				public void mousePressed(MouseEvent e) {
			        panel.setBackground(new Color(102, 244, 222));
			        if (isComboBoxVisible) {
			            twinstripComboBox.setVisible(false);
			            isComboBoxVisible = false;
			        } else {
			            twinstripComboBox.setVisible(true);
			            isComboBoxVisible = true;
			        }
			        
				}
			    
				@Override
			   public void mouseReleased(MouseEvent e){
				  panel.setBackground(new Color(102, 244, 222));
				   }
				}	
			
			private class PanelButtonMouseAdapter2 extends MouseAdapter{
				
				 JPanel panel2;
				 boolean isButtonVisible = false;
				 
				 public PanelButtonMouseAdapter2(JPanel panel2) {
					    this.panel2 = panel2;
					}

					public void mouseEntered(MouseEvent e){
					    panel2.setBackground(new Color(102, 244, 222));
					}

					@Override
					public void mouseExited(MouseEvent e) {
					    if (!isButtonVisible) {
					        panel2.setBackground(new Color(255, 255, 255));
					    }
					}

					@Override
					public void mousePressed(MouseEvent e) {
					    panel2.setBackground(new Color(102, 244, 222));
					    if (isButtonVisible) {
					        fileButton.setVisible(false);
					        isButtonVisible = false;
					    } else {
					        fileButton.setVisible(true);
					        isButtonVisible = true;
					    }
					}

					@Override
					public void mouseReleased(MouseEvent e){
					    panel2.setBackground(new Color(102, 244, 222));
					}
			}
			

			private class PanelButtonMouseAdapter3 extends MouseAdapter{
			    
			    JPanel panel3;
			    boolean isButtonVisible = false;
			     
			    public PanelButtonMouseAdapter3(JPanel panel3) {
			        this.panel3 = panel3;
			    }

			    public void mouseEntered(MouseEvent e){
			        panel3.setBackground(new Color(102, 244, 222));
			    }

			    @Override
			    public void mouseExited(MouseEvent e) {
			        panel3.setBackground(new Color(240, 240, 240));
			    }

			    @Override
			    public void mousePressed(MouseEvent e) {
			        panel3.setBackground(new Color(102, 244, 222));
			        
			        PhotoboothPricingEncapsulation ppe = new PhotoboothPricingEncapsulation();
			        PanelDashboard pd = new PanelDashboard();

			        layoutName = twinstriplayoutlbl.getText();
			        ownlayoutPrice = fileButton.getText().toString();
			        designPrice = twinstripComboBox.getSelectedItem().toString();

			        if (magneticchckbox.isSelected()) {
			            magneticPrice = magneticchckbox.getText();
			        } else {
			            magneticPrice = null; // Set magneticPrice to null if the checkbox is not selected;
			        }
			        

			        if (ownlayoutPrice.isEmpty()) {
			            ownlayoutPrice = null; // Set ownlayoutPrice to null if fileButton.getText() is empty;
			        }

			        if (designPrice.isEmpty()) {
			            designPrice = null; // Set designPrice to null if standardComboBox.getSelectedItem() is empty;
			        }
			        
			        
					if(extendthirtycheckbox.isSelected()) {
			        	thirtyminsPrice = extendthirtycheckbox.getText();
			        } else {
			        	thirtyminsPrice = null; // set thirtymins to null if the checkbox is not selected
			        }
					
					if(extendonehourcheckbox.isSelected()) {
						onehourPrice = extendonehourcheckbox.getText();
					} else {
						onehourPrice = null; // set onehourPrice to null if the checkbox is not selected
					}
			        
			        totalPrice = ppe.calculatePackageTwinstrip(designPrice, magneticPrice, thirtyminsPrice, onehourPrice); // calculate all 
			        totalPrice = ppe.calculatePackageTwinstrip2(ownlayoutPrice, magneticPrice, thirtyminsPrice, onehourPrice); // calculate all
			        TotaltextField.setText(Double.toString(totalPrice));

			        
			       
			    }

			    @Override
			    public void mouseReleased(MouseEvent e){
			        panel3.setBackground(new Color(102, 244, 222));
			    }
			}

			
			private class PanelButtonMouseAdapter4 extends MouseAdapter{
				
				JPanel panel4;
				boolean isPaymentButton = false;

				public PanelButtonMouseAdapter4(JPanel panel4) {
				    this.panel4 = panel4;
				}

				public void mouseEntered(MouseEvent e){
				    panel4.setBackground(new Color(102, 244, 222));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					if (!isPaymentButton) {
				        panel4.setBackground(new Color(255, 255, 255));
				    }
				    
				}

				@Override
				public void mousePressed(MouseEvent e) {
				    panel4.setBackground(new Color(102, 244, 222));
				    if (isPaymentButton) {
				    	paymentPanel.setVisible(false);
				        isPaymentButton = false;
				    } else {
				    	paymentPanel.setVisible(true);
				        isPaymentButton = true;
				    }
				
				  
				}

				@Override
				public void mouseReleased(MouseEvent e){
				    panel4.setBackground(new Color(102, 244, 222));
				}
			}
			
			private class PanelButtonMouseAdapter5 extends MouseAdapter{
				
				JPanel panel5;
				boolean isPaymentButton = false;

				public PanelButtonMouseAdapter5(JPanel panel5) {
				    this.panel5 = panel5;
				}

				public void mouseEntered(MouseEvent e){
				    panel5.setBackground(new Color(102, 244, 222));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					if (!isPaymentButton) {
				        panel5.setBackground(new Color(255, 255, 255));
				    }
				    
				}

				@Override
				public void mousePressed(MouseEvent e) {
				    panel5.setBackground(new Color(102, 244, 222));
				    
				    String amount = Amount.getText();
				    String pin = String.valueOf(enterPINfield.getPassword());
				    
				    // ...

				    PanelDashboard pD = new PanelDashboard();
				    organizerName = organizernameField.getText().toString(); // 1. get organizer name
				    celebrantName = txtEnterCelebrantName.getText();// 2. get celebrant name
				    eventtypes = eventtypeField.getText(); // 3. get Event type 
				    eventPlaces = eventplaceField.getText().toString(); //4. get Event place
				    phoneNumber = PhoneNumberField.getText();// 5. get contact number 
				    designLayout = twinstripComboBox.getSelectedItem().toString();// 6. get combo box design select
				    curtainLayout = curtainCombobox.getSelectedItem().toString();// 7. get combo box backdrops select
				    magnetics = magneticchckbox.getText(); //8. check if magnetics
				    thirtymins2 = extendthirtycheckbox.getText(); // 9. get thirtymins txt
				    onehour2 = extendonehourcheckbox.getText();// 10. get one hour text
				    ownlayoutDesign = fileButton.getText().toString();// 11. get the insert design
				    months = monthField.getText();
				    days = dayField.getText();
				    years = yearField.getText();

				     date = months + ":" + days + ":" + years; // get date from field
				    String extendTime = "";

				    if (extendthirtycheckbox.isSelected()) {
				        extendTime += extendthirtycheckbox.getText();
				    }

				    if (extendonehourcheckbox.isSelected()) {
				        if (!extendTime.isEmpty()) {
				            extendTime += "/";
				        }
				        extendTime += extendonehourcheckbox.getText();
				    }

				     months = monthField.getText();
				     days = dayField.getText();
				     years = yearField.getText();

				     
				    


				    if (ownlayoutDesign.isEmpty() || designLayout.isEmpty() || eventPlaces.isEmpty() || organizerName.isEmpty() || phoneNumber.isEmpty() || date == null) {
				        // Show fail message (fill out all steps in booking system)
				        JOptionPane.showMessageDialog(null, "Please fill out all steps in the booking system.");
				    } else if (amount.isEmpty()) {
				        JOptionPane.showMessageDialog(TwinStripPanel.this, "Amount field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
				    } else {
				        double amount4 = 4800.0;
				        double amount3 = 4300.0;
				        double amount1 = 3800.0;
				        double amount2 = 2800.0;
				        double totalAmount;

				        if (enterPINfield.getText().equals("134221")) {
				            try {
				                totalAmount = Double.parseDouble(Amount.getText());

				                if (totalAmount == amount1 || totalAmount == amount2 || totalAmount == amount3 || totalAmount == amount4) {
				                   
				                    
				                 // Update incomeLbl label
				                    String paymentStatus = " Paid";
				                    pD.incomeLbl.setText("Income: $" + String.format("%.2f", totalAmount) + " " + paymentStatus);

				                    // Write data to the file
				                    FileWriter writer = new FileWriter("C:\\data.txt", true);
				                    // Prepare the data to be written, removing leading and trailing spaces from "magnetics" and "extendTime"
				                    String data = organizerName + "/" + celebrantName + "/" + phoneNumber + "/" + eventPlaces + "/" + eventtypes + "/" + totalAmount + paymentStatus  + "/" + "Standard" + "/" + designLayout + "/" + curtainLayout + "/" + magnetics.trim() + "/" + extendTime.trim() + "/" + ownlayoutDesign + "/" + date + "\n";
				                    writer.write(data);
				                    writer.close();

				                   

				                    // Show success message
				                    JOptionPane.showMessageDialog(null, "Booking successful! See you at the event!");
				                } else if (totalAmount < amount4 || totalAmount < amount3 || totalAmount < amount2 || totalAmount < amount1) {
				                	 // Show partial payment message
				                    String paymentStatus = " DP";
				                    JOptionPane.showMessageDialog(null, "Booking successful! Please make the remaining payment. See you at the event!");
				                    
				                    // Write data to the file
				                    FileWriter writer = new FileWriter("C:\\data.txt", true);
				                    // Prepare the data to be written, removing leading and trailing spaces from "magnetics" and "extendTime"
				                    String data = organizerName + "/" + celebrantName + "/" + phoneNumber + "/" + eventPlaces + "/" + eventtypes + "/" + totalAmount + paymentStatus  + "/" + "Standard" + "/" + designLayout + "/" + curtainLayout + "/" + magnetics.trim() + "/" + extendTime.trim() + "/" + ownlayoutDesign + "/" + date + "\n";
				                    writer.write(data);
				                    writer.close();
				                    
				                } else if (totalAmount > amount1  || totalAmount > amount2 || totalAmount > amount3 || totalAmount > amount4) {
				                    // Show overpayment message
				                    JOptionPane.showMessageDialog(null, "Payment failed! Overpayment.");
				                } else {
				                    // Show incorrect PIN message
				                    JOptionPane.showMessageDialog(null, "PIN incorrect. Payment failed.");
				                }
				            } catch (NumberFormatException | IOException ex) {
				                ex.printStackTrace();
				            }
				        } else {
				            // Show incorrect PIN message
				            JOptionPane.showMessageDialog(null, "PIN incorrect. Payment failed.");
				        }
				    }
				}

				@Override
				public void mouseReleased(MouseEvent e){
				    panel5.setBackground(new Color(102, 244, 222));
				}
			}
			
			

			// Add the following code to show/hide the backgroundshoowpanel when buttonChooseBackground is clicked

			private class PanelButtonMouseAdapter6 extends MouseAdapter {
			    JPanel panel6;
			    boolean panelVisible = false;
			    
			    public PanelButtonMouseAdapter6(JPanel panel6) {
			        this.panel6 = panel6;
			    }
			    
			    public void mouseEntered(MouseEvent e) {
			        panel6.setBackground(new Color(102, 244, 222));
			    }
			    
			    @Override
			    public void mouseExited(MouseEvent e) {
			        if (!panelVisible) {
			            panel6.setBackground(new Color(255, 255, 255));
			        }
			    }
			    
			    @Override
			    public void mousePressed(MouseEvent e) {
			        panel6.setBackground(new Color(102, 244, 222));
			        if (panelVisible) {
			            backgroundshoowpanel.setVisible(false);
			            panelVisible = false;
			        } else {
			            backgroundshoowpanel.setVisible(true);
			            panelVisible = true;
			        }
			    }
			    
			    public void mouseReleased(MouseEvent e) {
			        panel6.setBackground(new Color(102, 244, 222));
			    }
			}
		}