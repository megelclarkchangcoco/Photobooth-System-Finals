package Dashboard;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.MatteBorder;

public class PanelProduct extends JPanel {
	// ============== image for package
	private ImageIcon pic4r = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\21.jpg")
					.getImage().getScaledInstance(266, 145, Image.SCALE_DEFAULT));
	private ImageIcon picpolaroid = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\polaroid 2.png")
					.getImage().getScaledInstance(266, 145, Image.SCALE_DEFAULT));
	private ImageIcon pictwin = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\twin strip - 6.png")
					.getImage().getScaledInstance(266, 257, Image.SCALE_DEFAULT));
	private ImageIcon pictdedi = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\dedication - 10.jpg")
					.getImage().getScaledInstance(266, 257, Image.SCALE_DEFAULT));
	
	///=============== image for product =================
	private ImageIcon photo = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\photopaper.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon standee = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\4rstandee.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon twinstandee = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\twinpaper.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon magnet = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\magnetics.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon shoutout = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\shoutsout.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon ink = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\ink.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon headdress = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\headdress.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	
	//=================== image checked============
	private ImageIcon checked = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\checked.png")
					.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	

	/**
	 * Create the panel.
	 */
	public PanelProduct() {
		setBackground(new Color(255, 255, 255));
		setBounds(196, 90, 1084, 628); // Update height to 780
	    setLayout(null);

	    JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1084, 628); 	
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(0, 0, 1084, 628);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    mainPanel.add(scrollPane);
	    
	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setPreferredSize(new Dimension(1001, 1540)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    scrollContent.setLayout(null);
	    	    
	    // === package =====
	    JLabel lblNewLabel = new JLabel("4R");
	    lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
	    lblNewLabel.setBounds(151, 88, 131, 38);
	    scrollContent.add(lblNewLabel);
	    
	    JLabel standardlbl = new JLabel("");
	    standardlbl.setIcon(pic4r);
	    standardlbl.setBounds(151, 137, 266, 145);
	    scrollContent.add(standardlbl);
	    
	    JLabel lblPolaroid = new JLabel("Polaroid");
	    lblPolaroid.setFont(new Font("Arial", Font.PLAIN, 25));
	    lblPolaroid.setBounds(515, 88, 131, 38);
	    scrollContent.add(lblPolaroid);
	    
	    JLabel polaroid = new JLabel("");
	    polaroid.setIcon(picpolaroid);
	    polaroid.setBounds(515, 137, 266, 145);
	    scrollContent.add(polaroid);
	    
	    JLabel lblNewLabel_2 = new JLabel("Twin Strip");
	    lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 25));
	    lblNewLabel_2.setBounds(151, 331, 131, 38);
	    scrollContent.add(lblNewLabel_2);
	    
	    JLabel twinstriplbl = new JLabel("");
	    twinstriplbl.setIcon(pictwin);
	    twinstriplbl.setBounds(151, 380, 266, 257);
	    scrollContent.add(twinstriplbl);
	    
	    JLabel dedicationlbl = new JLabel("");
	    dedicationlbl.setIcon(pictdedi);
	    dedicationlbl.setBounds(497, 380, 266, 257);
	    scrollContent.add(dedicationlbl);
	    
	    JLabel lblPolaroid_1 = new JLabel("Dedication");
	    lblPolaroid_1.setFont(new Font("Arial", Font.PLAIN, 25));
	    lblPolaroid_1.setBounds(515, 331, 131, 38);
	    scrollContent.add(lblPolaroid_1);
	    // === package end here ====
	    
	    // === product ====
	    JLabel lblProduct = new JLabel("Product");
	    lblProduct.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
	    lblProduct.setBounds(10, 690, 278, 63);
	    scrollContent.add(lblProduct);
	    
	    JPanel productPanel = new JPanel();
	    productPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel.setBackground(new Color(255, 255, 255));
	    productPanel.setBounds(53, 830, 857, 93);
	    scrollContent.add(productPanel);
	    productPanel.setLayout(null);
	    
	    JLabel photolbl = new JLabel("");
	    photolbl.setIcon(photo);
	    photolbl.setBounds(10, 11, 174, 71);
	    productPanel.add(photolbl);
	    
	    JLabel phototextlbl = new JLabel("Photo Paper");
	    phototextlbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl.setBounds(377, 35, 163, 47);
	    productPanel.add(phototextlbl);
	    
	    JLabel available1lbl = new JLabel("Available");
	    available1lbl.setIcon(checked);
	    available1lbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl.setBounds(734, 35, 97, 47);
	    productPanel.add(available1lbl);
	    
	    JPanel productPanel2 = new JPanel();
	    productPanel2.setLayout(null);
	    productPanel2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel2.setBackground(Color.WHITE);
	    productPanel2.setBounds(53, 932, 857, 93);
	    scrollContent.add(productPanel2);
	    
	    JLabel photolbl_1 = new JLabel("");
	    photolbl_1.setIcon(standee);
	    photolbl_1.setBounds(10, 11, 174, 71);
	    productPanel2.add(photolbl_1);
	    
	    JLabel lblStandee = new JLabel("Standee\r\n");
	    lblStandee.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    lblStandee.setBounds(377, 35, 163, 47);
	    productPanel2.add(lblStandee);
	    
	    JLabel available1lbl_1 = new JLabel("Available");
	    available1lbl_1.setIcon(checked);
	    available1lbl_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_1.setBounds(734, 35, 97, 47);
	    productPanel2.add(available1lbl_1);
	    
	    JPanel productPanel3 = new JPanel();
	    productPanel3.setLayout(null);
	    productPanel3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel3.setBackground(Color.WHITE);
	    productPanel3.setBounds(53, 1034, 857, 93);
	    scrollContent.add(productPanel3);
	    
	    JLabel photolbl_2 = new JLabel("");
	    photolbl_2.setIcon(twinstandee);
	    photolbl_2.setBounds(10, 11, 174, 71);
	    productPanel3.add(photolbl_2);
	    
	    JLabel phototextlbl_2 = new JLabel("Twin Standee");
	    phototextlbl_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_2.setBounds(377, 35, 163, 47);
	    productPanel3.add(phototextlbl_2);
	    
	    JLabel available1lbl_2 = new JLabel("Available");
	    available1lbl_2.setIcon(checked);
	    available1lbl_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_2.setBounds(734, 35, 97, 47);
	    productPanel3.add(available1lbl_2);
	    
	    JPanel productPanel4 = new JPanel();
	    productPanel4.setLayout(null);
	    productPanel4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel4.setBackground(Color.WHITE);
	    productPanel4.setBounds(53, 1136, 857, 93);
	    scrollContent.add(productPanel4);
	    
	    JLabel photolbl_3 = new JLabel("");
	    photolbl_3.setIcon(magnet);
	    photolbl_3.setBounds(10, 11, 174, 71);
	    productPanel4.add(photolbl_3);
	    
	    JLabel phototextlbl_3 = new JLabel("Magnet");
	    phototextlbl_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_3.setBounds(377, 35, 163, 47);
	    productPanel4.add(phototextlbl_3);
	    
	    JLabel available1lbl_3 = new JLabel("Available");
	    available1lbl_3.setIcon(checked);
	    available1lbl_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_3.setBounds(734, 35, 97, 47);
	    productPanel4.add(available1lbl_3);
	    
	    JPanel productPanel7 = new JPanel();
	    productPanel7.setLayout(null);
	    productPanel7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel7.setBackground(Color.WHITE);
	    productPanel7.setBounds(53, 1340, 857, 93);
	    scrollContent.add(productPanel7);
	    
	    JLabel photolbl_3_1 = new JLabel("");
	    photolbl_3_1.setIcon(shoutout);
	    photolbl_3_1.setBounds(10, 11, 174, 71);
	    productPanel7.add(photolbl_3_1);
	    
	    JLabel phototextlbl_3_1 = new JLabel("Shoutsout");
	    phototextlbl_3_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_3_1.setBounds(377, 35, 163, 47);
	    productPanel7.add(phototextlbl_3_1);
	    
	    JLabel available1lbl_3_1 = new JLabel("Available");
	    available1lbl_3_1.setIcon(checked);
	    available1lbl_3_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_3_1.setBounds(734, 35, 97, 47);
	    productPanel7.add(available1lbl_3_1);
	    
	    JPanel productPanel6 = new JPanel();
	    productPanel6.setLayout(null);
	    productPanel6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel6.setBackground(Color.WHITE);
	    productPanel6.setBounds(53, 1238, 857, 93);
	    scrollContent.add(productPanel6);
	    
	    JLabel photolbl_3_2 = new JLabel("");
	    photolbl_3_2.setIcon(ink);
	    photolbl_3_2.setBounds(10, 11, 174, 71);
	    productPanel6.add(photolbl_3_2);
	    
	    JLabel phototextlbl_3_2 = new JLabel("INK");
	    phototextlbl_3_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_3_2.setBounds(377, 35, 163, 47);
	    productPanel6.add(phototextlbl_3_2);
	    
	    JLabel available1lbl_3_2 = new JLabel("Available");
	    available1lbl_3_2.setIcon(checked);
	    available1lbl_3_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_3_2.setBounds(734, 35, 97, 47);
	    productPanel6.add(available1lbl_3_2);
	    
	    JPanel productPanel4_3 = new JPanel();
	    productPanel4_3.setLayout(null);
	    productPanel4_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel4_3.setBackground(Color.WHITE);
	    productPanel4_3.setBounds(53, 1442, 857, 93);
	    scrollContent.add(productPanel4_3);
	    
	    JLabel photolbl_3_3 = new JLabel("");
	    photolbl_3_3.setIcon(headdress);
	    photolbl_3_3.setBounds(10, 11, 174, 71);
	    productPanel4_3.add(photolbl_3_3);
	    
	    JLabel phototextlbl_3_3 = new JLabel("HeadDress");
	    phototextlbl_3_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_3_3.setBounds(377, 35, 163, 47);
	    productPanel4_3.add(phototextlbl_3_3);
	    
	    JLabel available1lbl_3_3 = new JLabel("Available");
	    available1lbl_3_3.setIcon(checked);
	    available1lbl_3_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_3_3.setBounds(734, 35, 97, 47);
	    productPanel4_3.add(available1lbl_3_3);
	    
	    JLabel packagelbl = new JLabel("Package");
	    packagelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
	    packagelbl.setBounds(10, 11, 278, 63);
	    scrollContent.add(packagelbl);
	    // ==== end here ====

	}

}
