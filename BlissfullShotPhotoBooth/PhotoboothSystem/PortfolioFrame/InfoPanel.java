package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class InfoPanel extends JPanel {
	
	private ImageIcon maps = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\map.PNG")
					.getImage().getScaledInstance(876, 439, Image.SCALE_DEFAULT));
	private ImageIcon point = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\placeholder.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon gmail = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\gmail.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon telephone = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\telephone.png")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon facebook = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\facebook.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	
	/**
	 * Create the panel.
	 */
	public InfoPanel() {
		setBackground(new Color(244, 252, 239));
		setBounds(0, 100, 1280, 618);
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
		 scrollContent.setPreferredSize(new Dimension(1001, 1080)); // increase the size of the panel to fit all 9 labels
		 scrollPane.setViewportView(scrollContent);
		
		JPanel mappanel = new JPanel();
		mappanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
		mappanel.setBounds(199, 475, 876, 439);
		scrollContent.add(mappanel);
		mappanel.setOpaque(false);
		mappanel.setLayout(null);
		
		JLabel maplbl = new JLabel("");
		maplbl.setIcon(maps);
		maplbl.setBounds(0, 11, 876, 439);
		mappanel.add(maplbl);
		
		JPanel contactpanel = new JPanel();
		contactpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
		contactpanel.setBounds(199, 930, 876, 136);
		scrollContent.add(contactpanel);
		contactpanel.setOpaque(false);
		contactpanel.setLayout(null);
		
		JLabel icon1lbl = new JLabel("");
		icon1lbl.setIcon(point);
		icon1lbl.setBounds(10, 11, 46, 44);
		contactpanel.add(icon1lbl);
		
		JLabel lblNewLabel = new JLabel("1360 Quiricada St. Manila, Phillipines, 1013");
		lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel.setBounds(66, 22, 309, 33);
		contactpanel.add(lblNewLabel);
		
		JLabel icon2lbl = new JLabel("");
		icon2lbl.setIcon(gmail);
		icon2lbl.setBounds(10, 69, 46, 44);
		contactpanel.add(icon2lbl);
		
		JLabel lblNewLabel2 = new JLabel("blissfulshotsphotobooth@gmail.com");
		lblNewLabel2.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel2.setBounds(66, 80, 309, 33);
		contactpanel.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("0916-296-0814 |  0947-601-4387");
		lblNewLabel3.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel3.setBounds(535, 80, 309, 33);
		contactpanel.add(lblNewLabel3);
		
		JLabel icon3lbl = new JLabel("");
		icon3lbl.setIcon(telephone);
		icon3lbl.setBounds(479, 69, 46, 44);
		contactpanel.add(icon3lbl);
		
		JLabel icon4lbl = new JLabel("");
		icon4lbl.setIcon(facebook);
		icon4lbl.setBounds(479, 11, 46, 44);
		contactpanel.add(icon4lbl);
		
		JLabel lblNewLabel4 = new JLabel("Blissful Shots Photobooth");
		lblNewLabel4.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel4.setBounds(535, 22, 309, 33);
		contactpanel.add(lblNewLabel4);
		
		JPanel historypanel = new JPanel();
		historypanel.setBorder(new MatteBorder(2, 2, 2, 3, (Color) new Color(105, 244, 222)));
		historypanel.setBackground(new Color(255, 255, 255));
		historypanel.setBounds(199, 24, 876, 424);
		scrollContent.add(historypanel);
		historypanel.setLayout(null);
		
		JLabel historyText = new JLabel("History");
		historyText.setFont(new Font("Anton", Font.PLAIN, 50));
		historyText.setBounds(10, 11, 172, 59);
		historypanel.add(historyText);
		
		JLabel text1 = new JLabel("-The history of our business starts with our brother, Stary, who bought a camera and some units. Then, his son had");
		text1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1.setBounds(61, 81, 788, 34);
		historypanel.add(text1);
		
		JLabel lblABirthdayParty = new JLabel("a birthday party, and during the event, he decided to try setting up a photobooth. While operating the photobooth, the owner");
		lblABirthdayParty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblABirthdayParty.setBounds(22, 115, 827, 34);
		historypanel.add(lblABirthdayParty);
		
		JLabel text1_1_1 = new JLabel("asked him for a calling card, even though they didn't have an established photobooth business at that time. However, he started");
		text1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1_1_1.setBounds(22, 149, 844, 34);
		historypanel.add(text1_1_1);
		
		JLabel text1_1_1_1 = new JLabel("giving out his Facebook contacts and, subsequently, the manager asked for the photobooth contacts of this owner. This led us");
		text1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1_1_1_1.setBounds(22, 183, 844, 34);
		historypanel.add(text1_1_1_1);
		
		JLabel text1_1_1_1_1 = new JLabel("to create a Facebook page and endorse the photobooth, encouraging people to join the page.");
		text1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1_1_1_1_1.setBounds(22, 217, 844, 34);
		historypanel.add(text1_1_1_1_1);
		
		JLabel lblAfterThatOur = new JLabel("After that, our business began to gain momentum, with daily bookings for the photobooth. However, the pandemic");
		lblAfterThatOur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAfterThatOur.setBounds(78, 262, 788, 34);
		historypanel.add(lblAfterThatOur);
		
		JLabel lblStruckAndWe = new JLabel("struck, and we had to pause our operations for a year. But after that challenging period, we were able to resume our business,");
		lblStruckAndWe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStruckAndWe.setBounds(39, 291, 837, 34);
		historypanel.add(lblStruckAndWe);
		
		JLabel lblAndItHas = new JLabel("and it has been continuing successfully until now. Our photobooth business has persevered through the difficulties, and we");
		lblAndItHas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAndItHas.setBounds(39, 319, 827, 34);
		historypanel.add(lblAndItHas);
		
		JLabel lblRemainCommittedTo = new JLabel("remain committed to providing quality services to our customers.");
		lblRemainCommittedTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRemainCommittedTo.setBounds(39, 352, 827, 34);
		historypanel.add(lblRemainCommittedTo);
	}

}
