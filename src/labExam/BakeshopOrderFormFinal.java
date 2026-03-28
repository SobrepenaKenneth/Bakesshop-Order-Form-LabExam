package labExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BakeshopOrderFormFinal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtChocolateCakeSliceQty;
	private JTextField txtMinicakeQty;
	private JTextField txtBrowniesQty;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtEnsaymada;
	private JTextField txtCroissantQty;
	private JTextField txtPandesal;
	private boolean isDarkMode = true;
	private JTextField txtChocolateChipCookieQty;
	private JTextField txtOatmealCookieQty;
	private JTextField txtCrinklesQty;
	private JTextField txtBirthdayCandleQty;
	private JTextField txtCakeTopperQty;
	private JTextField greetingsCardQty;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BakeshopOrderFormFinal frame = new BakeshopOrderFormFinal();
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
	public BakeshopOrderFormFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1259, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel NorthPanel = new JPanel();
		NorthPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		NorthPanel.setBackground(new Color(255, 228, 196));
		contentPane.add(NorthPanel, BorderLayout.NORTH);
		NorthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPancakeImage = new JLabel("");
		lblPancakeImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/Pastry1.png")));
		NorthPanel.add(lblPancakeImage);

		JLabel lblLosamiaPastry = new JLabel("Losamia Pastry");
		lblLosamiaPastry.setFont(new Font("Segoe UI Black", Font.BOLD, 50));
		NorthPanel.add(lblLosamiaPastry);

		JLabel lblCroissantImage = new JLabel("");
		lblCroissantImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		NorthPanel.add(lblCroissantImage);

		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(255, 228, 225));
		westPanel.setPreferredSize(new Dimension(260, 50));
		contentPane.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(null);

		JPanel customerInformationPanel = new JPanel();
		customerInformationPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		customerInformationPanel.setBackground(new Color(255, 228, 225));
		customerInformationPanel.setBounds(0, 11, 250, 103);
		westPanel.add(customerInformationPanel);
		customerInformationPanel.setLayout(null);

		JLabel lblCustomerInformation = new JLabel("CUSTOMER INFORMATION");
		lblCustomerInformation.setBounds(22, 11, 206, 21);
		lblCustomerInformation.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		customerInformationPanel.add(lblCustomerInformation);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 39, 64, 16);
		lblName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		customerInformationPanel.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(74, 39, 166, 20);
		txtName.setColumns(20);
		customerInformationPanel.add(txtName);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(10, 71, 64, 16);
		lblPhone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		customerInformationPanel.add(lblPhone);

		txtPhone = new JTextField();
		txtPhone.setBounds(74, 72, 166, 20);
		txtPhone.setColumns(20);
		customerInformationPanel.add(txtPhone);

		JPanel oderTypePanel = new JPanel();
		oderTypePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		oderTypePanel.setBackground(new Color(255, 228, 225));
		oderTypePanel.setBounds(0, 125, 250, 103);
		westPanel.add(oderTypePanel);
		oderTypePanel.setLayout(null);

		JLabel lblOrderType = new JLabel("ORDER TYPE");
		lblOrderType.setBounds(79, 9, 92, 21);
		lblOrderType.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		oderTypePanel.add(lblOrderType);

		JRadioButton rdbtnPickup = new JRadioButton("Pickup");
		rdbtnPickup.setBackground(new Color(255, 228, 225));
		buttonGroup.add(rdbtnPickup);
		rdbtnPickup.setBounds(6, 31, 71, 29);
		rdbtnPickup.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnPickup);

		JRadioButton rdbtnDelivery = new JRadioButton("Delivery");
		rdbtnDelivery.setBackground(new Color(255, 228, 225));
		buttonGroup.add(rdbtnDelivery);
		rdbtnDelivery.setBounds(6, 63, 83, 29);
		rdbtnDelivery.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnDelivery);

		JLabel lblDeliveryImage = new JLabel("");
		lblDeliveryImage.setBounds(143, 39, 51, 50);
		lblDeliveryImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/delivery (1).png")));
		oderTypePanel.add(lblDeliveryImage);

		JPanel orderUnitPanel = new JPanel();
		orderUnitPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		orderUnitPanel.setBackground(new Color(255, 228, 225));
		orderUnitPanel.setBounds(0, 239, 250, 112);
		westPanel.add(orderUnitPanel);
		orderUnitPanel.setLayout(null);

		JRadioButton rdbtnPerPiece = new JRadioButton("Per Piece");
		rdbtnPerPiece.setBackground(new Color(255, 228, 225));
		buttonGroup_1.add(rdbtnPerPiece);
		rdbtnPerPiece.setBounds(6, 73, 89, 29);
		rdbtnPerPiece.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnPerPiece);

		JRadioButton rdbtnPerDozen = new JRadioButton("Per Dozen");
		rdbtnPerDozen.setBackground(new Color(255, 228, 225));
		buttonGroup_1.add(rdbtnPerDozen);
		rdbtnPerDozen.setBounds(6, 41, 97, 29);
		rdbtnPerDozen.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnPerDozen);

		JLabel lblOrderUnit = new JLabel("ORDER UNIT");
		lblOrderUnit.setBounds(76, 7, 97, 27);
		lblOrderUnit.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		orderUnitPanel.add(lblOrderUnit);

		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(255, 192, 203));
		southPanel.setPreferredSize(new Dimension(100, 50));
		contentPane.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new BorderLayout(0, 0));

		JPanel orderPageFooterCenter = new JPanel();
		southPanel.add(orderPageFooterCenter);
		orderPageFooterCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblOrderPageFooter = new JLabel("----- Order Page -----");
		lblOrderPageFooter.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		orderPageFooterCenter.add(lblOrderPageFooter);

		JPanel leftButtonPanelWest = new JPanel();
		southPanel.add(leftButtonPanelWest, BorderLayout.WEST);

		// ---------- Hide Information Button --------------
		JButton btnHideAndShowInformation = new JButton("Hide Information");
		btnHideAndShowInformation.setBackground(new Color(255, 127, 80));
		btnHideAndShowInformation.setForeground(new Color(255, 255, 255));
		btnHideAndShowInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (westPanel.isVisible()) {
					westPanel.setVisible(false);
					btnHideAndShowInformation.setText("Show Information");
				} else if (!westPanel.isVisible()) {
					westPanel.setVisible(true);
					btnHideAndShowInformation.setText("Hide Information");
				}
			}
		});

		btnHideAndShowInformation.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		leftButtonPanelWest.add(btnHideAndShowInformation);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnHelp.setBackground(new Color(64, 224, 208));
		leftButtonPanelWest.add(btnHelp);

		JPanel rightButtonPanelEast = new JPanel();
		southPanel.add(rightButtonPanelEast, BorderLayout.EAST);

		JButton btnDarkMode = new JButton("Dark Mode");
		btnDarkMode.setBackground(new Color(25, 25, 112));
		btnDarkMode.setForeground(new Color(255, 255, 255));
		btnDarkMode.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		rightButtonPanelEast.add(btnDarkMode);

		JButton btnHideAndShowOrderSummary_1 = new JButton("Hide order summary");
		btnHideAndShowOrderSummary_1.setForeground(Color.WHITE);
		btnHideAndShowOrderSummary_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnHideAndShowOrderSummary_1.setBackground(new Color(255, 127, 80));
		rightButtonPanelEast.add(btnHideAndShowOrderSummary_1);

		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		centerPanel.setBackground(new Color(240, 255, 240));
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BorderLayout(0, 0));

		JPanel productSelectionHeaderPanel = new JPanel();
		productSelectionHeaderPanel.setBackground(new Color(240, 255, 240));
		centerPanel.add(productSelectionHeaderPanel, BorderLayout.NORTH);

		JLabel lblProductSelection = new JLabel("PRODUCT SELECTION");
		lblProductSelection.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		productSelectionHeaderPanel.add(lblProductSelection);

		JPanel productSelectionPanel = new JPanel();
		productSelectionPanel.setBackground(new Color(240, 255, 240));
		centerPanel.add(productSelectionPanel, BorderLayout.CENTER);
		productSelectionPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		productSelectionPanel.add(scrollPane);

		JTabbedPane JTabbedPastriesPage = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(JTabbedPastriesPage);
		JTabbedPastriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

		JPanel bakedGoodsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Baked Goods", null, bakedGoodsPanel, null);
		bakedGoodsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel chocolateCakeSlicePanel = new JPanel();
		bakedGoodsPanel.add(chocolateCakeSlicePanel);
		chocolateCakeSlicePanel.setLayout(new BorderLayout(0, 0));

		JPanel chocolateCakeSectionNorth = new JPanel();
		chocolateCakeSlicePanel.add(chocolateCakeSectionNorth, BorderLayout.NORTH);

		JLabel lblChocolateCakeSliceImg = new JLabel("");
		lblChocolateCakeSliceImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/chocolate cake slice.png")));
		chocolateCakeSectionNorth.add(lblChocolateCakeSliceImg);

		JPanel chocolateCakeCenter = new JPanel();
		chocolateCakeSlicePanel.add(chocolateCakeCenter, BorderLayout.CENTER);

		JCheckBox chckbxChocolateCakeSlice = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter.add(chckbxChocolateCakeSlice);

		JPanel chocolateCakeSouth = new JPanel();
		chocolateCakeSlicePanel.add(chocolateCakeSouth, BorderLayout.SOUTH);

		JLabel lblChocolateCakeSliceQTY = new JLabel("QTY:");
		chocolateCakeSouth.add(lblChocolateCakeSliceQTY);

		txtChocolateCakeSliceQty = new JTextField();
		chocolateCakeSouth.add(txtChocolateCakeSliceQty);
		txtChocolateCakeSliceQty.setColumns(10);

		JPanel miniCakePanel = new JPanel();
		bakedGoodsPanel.add(miniCakePanel);
		miniCakePanel.setLayout(new BorderLayout(0, 0));

		JPanel miniCakeNorth = new JPanel();
		miniCakePanel.add(miniCakeNorth, BorderLayout.NORTH);

		JLabel lblMiniCakeImage = new JLabel("");
		lblMiniCakeImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/mini cake.png")));
		miniCakeNorth.add(lblMiniCakeImage);

		JPanel miniCakeCenter = new JPanel();
		miniCakePanel.add(miniCakeCenter, BorderLayout.CENTER);

		JCheckBox chckbxMinicake = new JCheckBox("Mini Cake - ₱450");
		miniCakeCenter.add(chckbxMinicake);

		JPanel miniCakeSouth = new JPanel();
		miniCakePanel.add(miniCakeSouth, BorderLayout.SOUTH);

		JLabel lblMinicakeQty = new JLabel("QTY:");
		miniCakeSouth.add(lblMinicakeQty);

		txtMinicakeQty = new JTextField();
		txtMinicakeQty.setColumns(10);
		miniCakeSouth.add(txtMinicakeQty);

		JPanel browniesPanel = new JPanel();
		bakedGoodsPanel.add(browniesPanel);
		browniesPanel.setLayout(new BorderLayout(0, 0));

		JPanel browniesNorth = new JPanel();
		browniesPanel.add(browniesNorth, BorderLayout.NORTH);

		JLabel lblBrowniesImg = new JLabel("");
		lblBrowniesImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/brownies.png")));
		browniesNorth.add(lblBrowniesImg);

		JPanel browniesCenter = new JPanel();
		browniesPanel.add(browniesCenter, BorderLayout.CENTER);

		JCheckBox chckbxBrownies = new JCheckBox("Brownies - ₱60");
		browniesCenter.add(chckbxBrownies);

		JPanel browniesSouth = new JPanel();
		browniesPanel.add(browniesSouth, BorderLayout.SOUTH);

		JLabel lblBrowniesQty = new JLabel("QTY:");
		browniesSouth.add(lblBrowniesQty);

		txtBrowniesQty = new JTextField();
		txtBrowniesQty.setColumns(10);
		browniesSouth.add(txtBrowniesQty);

		JPanel breadAndPastriesPanel = new JPanel();
		JTabbedPastriesPage.addTab("Bread And Pastries", null, breadAndPastriesPanel, null);

		JPanel ensaymadaPanel = new JPanel();
		breadAndPastriesPanel.add(ensaymadaPanel);
		ensaymadaPanel.setLayout(new BorderLayout(0, 0));

		JPanel ensaymadaNorth = new JPanel();
		ensaymadaPanel.add(ensaymadaNorth, BorderLayout.NORTH);

		JLabel lblEnsaymadaImg = new JLabel("");
		lblEnsaymadaImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/ensaymada.png")));
		ensaymadaNorth.add(lblEnsaymadaImg);

		JPanel ensaymadaCenter = new JPanel();
		ensaymadaPanel.add(ensaymadaCenter, BorderLayout.CENTER);

		JCheckBox chckbxEnsaymada = new JCheckBox("Ensaymada - ₱40");
		ensaymadaCenter.add(chckbxEnsaymada);

		JPanel ensaymadaSouth = new JPanel();
		ensaymadaPanel.add(ensaymadaSouth, BorderLayout.SOUTH);

		JLabel lblEnsaymadaQty = new JLabel("QTY:");
		ensaymadaSouth.add(lblEnsaymadaQty);

		txtEnsaymada = new JTextField();
		txtEnsaymada.setColumns(10);
		ensaymadaSouth.add(txtEnsaymada);

		JPanel croissantPanel = new JPanel();
		breadAndPastriesPanel.add(croissantPanel);
		croissantPanel.setLayout(new BorderLayout(0, 0));

		JPanel croissantNorth = new JPanel();
		croissantPanel.add(croissantNorth, BorderLayout.NORTH);

		JLabel lblCroissantImg = new JLabel("");
		lblCroissantImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant1.png")));
		croissantNorth.add(lblCroissantImg);

		JPanel croissantCenter = new JPanel();
		croissantPanel.add(croissantCenter, BorderLayout.CENTER);

		JCheckBox chckbxCroissant = new JCheckBox("Croissant - ₱70");
		croissantCenter.add(chckbxCroissant);

		JPanel croissantSouth = new JPanel();
		croissantPanel.add(croissantSouth, BorderLayout.SOUTH);

		JLabel lblCroissantQty = new JLabel("QTY:");
		croissantSouth.add(lblCroissantQty);

		txtCroissantQty = new JTextField();
		txtCroissantQty.setColumns(10);
		croissantSouth.add(txtCroissantQty);

		JPanel pandesalPanel = new JPanel();
		breadAndPastriesPanel.add(pandesalPanel);
		pandesalPanel.setLayout(new BorderLayout(0, 0));

		JPanel pandesalNorth = new JPanel();
		pandesalPanel.add(pandesalNorth, BorderLayout.NORTH);

		JLabel lblPandesalImg = new JLabel("");
		lblPandesalImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/pandesal.png")));
		pandesalNorth.add(lblPandesalImg);

		JPanel pandesalCenter = new JPanel();
		pandesalPanel.add(pandesalCenter, BorderLayout.CENTER);

		JCheckBox chckbxPandesal = new JCheckBox("Pandesal - ₱5");
		pandesalCenter.add(chckbxPandesal);

		JPanel pandesalSouth = new JPanel();
		pandesalPanel.add(pandesalSouth, BorderLayout.SOUTH);

		JLabel lblPandesalQty = new JLabel("QTY:");
		pandesalSouth.add(lblPandesalQty);

		txtPandesal = new JTextField();
		txtPandesal.setColumns(10);
		pandesalSouth.add(txtPandesal);

		JPanel cookiesAndTreatsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Cookies and Treats", null, cookiesAndTreatsPanel, null);

		JPanel chocolateChipCookiePanel = new JPanel();
		cookiesAndTreatsPanel.add(chocolateChipCookiePanel);
		chocolateChipCookiePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel chocolateChipCookieNorth = new JPanel();
		chocolateChipCookiePanel.add(chocolateChipCookieNorth, BorderLayout.NORTH);
		
		JLabel lblChocolateChipCookieImg = new JLabel("");
		lblChocolateChipCookieImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/chocolate chip cookie.png")));
		chocolateChipCookieNorth.add(lblChocolateChipCookieImg);
		
		JPanel chocolateChipCookieCenter = new JPanel();
		chocolateChipCookiePanel.add(chocolateChipCookieCenter, BorderLayout.CENTER);
		
		JCheckBox chckbxChocolateChipCookie = new JCheckBox("Chocolate Chip Cookie - ₱25");
		chocolateChipCookieCenter.add(chckbxChocolateChipCookie);
		
		JPanel chocolateChipCookieSouth = new JPanel();
		chocolateChipCookiePanel.add(chocolateChipCookieSouth, BorderLayout.SOUTH);
		
		JLabel lblChocolateChipCookieQty = new JLabel("QTY:");
		chocolateChipCookieSouth.add(lblChocolateChipCookieQty);
		
		txtChocolateChipCookieQty = new JTextField();
		txtChocolateChipCookieQty.setColumns(10);
		chocolateChipCookieSouth.add(txtChocolateChipCookieQty);

		JPanel oatmealCookiePanel = new JPanel();
		cookiesAndTreatsPanel.add(oatmealCookiePanel);
		oatmealCookiePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel oatmealCookieNorth = new JPanel();
		oatmealCookiePanel.add(oatmealCookieNorth, BorderLayout.NORTH);
		
		JLabel lblOatmealCookieImg = new JLabel("");
		lblOatmealCookieImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/oatmeal cookie.png")));
		oatmealCookieNorth.add(lblOatmealCookieImg);
		
		JPanel oatmealCookieCenter = new JPanel();
		oatmealCookiePanel.add(oatmealCookieCenter, BorderLayout.CENTER);
		
		JCheckBox chckbxOatmealCookie = new JCheckBox("Oatmeal Cookie- ₱20");
		oatmealCookieCenter.add(chckbxOatmealCookie);
		
		JPanel oatmealCookieSouth = new JPanel();
		oatmealCookiePanel.add(oatmealCookieSouth, BorderLayout.SOUTH);
		
		JLabel lblOatmealCookieQty = new JLabel("QTY:");
		oatmealCookieSouth.add(lblOatmealCookieQty);
		
		txtOatmealCookieQty = new JTextField();
		txtOatmealCookieQty.setColumns(10);
		oatmealCookieSouth.add(txtOatmealCookieQty);

		JPanel crinklesPanel = new JPanel();
		cookiesAndTreatsPanel.add(crinklesPanel);
		crinklesPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel crinklesNorth = new JPanel();
		crinklesPanel.add(crinklesNorth, BorderLayout.NORTH);
		
		JLabel lblCrinklesImg = new JLabel("");
		lblCrinklesImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/crinkles.png")));
		crinklesNorth.add(lblCrinklesImg);
		
		JPanel crinklesCenter = new JPanel();
		crinklesPanel.add(crinklesCenter, BorderLayout.CENTER);
		
		JCheckBox chckbxCrinkles = new JCheckBox("Crinkles - ₱18");
		crinklesCenter.add(chckbxCrinkles);
		
		JPanel crinklesSouth = new JPanel();
		crinklesPanel.add(crinklesSouth, BorderLayout.SOUTH);
		
		JLabel lblCrinklesQty = new JLabel("QTY:");
		crinklesSouth.add(lblCrinklesQty);
		
		txtCrinklesQty = new JTextField();
		txtCrinklesQty.setColumns(10);
		crinklesSouth.add(txtCrinklesQty);

		JPanel accessoriesPanel = new JPanel();
		JTabbedPastriesPage.addTab("Accessories", null, accessoriesPanel, null);
		
		JPanel birthdayCandlesSetPanel = new JPanel();
		accessoriesPanel.add(birthdayCandlesSetPanel);
		birthdayCandlesSetPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel birthdayCandleNorth = new JPanel();
		birthdayCandlesSetPanel.add(birthdayCandleNorth, BorderLayout.NORTH);
		
		JLabel lblBirthdayCandleImg = new JLabel("");
		lblBirthdayCandleImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/bday candle set.png")));
		birthdayCandleNorth.add(lblBirthdayCandleImg);
		
		JPanel birthdayCandleCenter = new JPanel();
		birthdayCandlesSetPanel.add(birthdayCandleCenter, BorderLayout.CENTER);
		
		JCheckBox chckbxBirthdayCandle = new JCheckBox("Birthday Candle Set - ₱50");
		birthdayCandleCenter.add(chckbxBirthdayCandle);
		
		JPanel birthdayCandleSouth = new JPanel();
		birthdayCandlesSetPanel.add(birthdayCandleSouth, BorderLayout.SOUTH);
		
		JLabel lblBirthdayCandleQty = new JLabel("QTY:");
		birthdayCandleSouth.add(lblBirthdayCandleQty);
		
		txtBirthdayCandleQty = new JTextField();
		txtBirthdayCandleQty.setColumns(10);
		birthdayCandleSouth.add(txtBirthdayCandleQty);
		
		JPanel cakeTopperPanel = new JPanel();
		accessoriesPanel.add(cakeTopperPanel);
		cakeTopperPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel cakeTopperNorth = new JPanel();
		cakeTopperPanel.add(cakeTopperNorth, BorderLayout.NORTH);
		
		JLabel lblCakeTopperImg = new JLabel("");
		lblCakeTopperImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/cake topper.png")));
		cakeTopperNorth.add(lblCakeTopperImg);
		
		JPanel cakeTopperCenter = new JPanel();
		cakeTopperPanel.add(cakeTopperCenter, BorderLayout.CENTER);
		
		JCheckBox chckbxCakeTopper = new JCheckBox("Cake Topper - ₱120");
		cakeTopperCenter.add(chckbxCakeTopper);
		
		JPanel cakeTopperSouth = new JPanel();
		cakeTopperPanel.add(cakeTopperSouth, BorderLayout.SOUTH);
		
		JLabel lblCakeTopperQty = new JLabel("QTY:");
		cakeTopperSouth.add(lblCakeTopperQty);
		
		txtCakeTopperQty = new JTextField();
		txtCakeTopperQty.setColumns(10);
		cakeTopperSouth.add(txtCakeTopperQty);
		
		JPanel greetingsCardPanel = new JPanel();
		accessoriesPanel.add(greetingsCardPanel);
		greetingsCardPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel greetingsCardNorth = new JPanel();
		greetingsCardPanel.add(greetingsCardNorth, BorderLayout.NORTH);
		
		JLabel lblGreetingsCardImg = new JLabel("");
		lblGreetingsCardImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/greeting card.png")));
		greetingsCardNorth.add(lblGreetingsCardImg);
		
		JPanel greetingsCardCenter = new JPanel();
		greetingsCardPanel.add(greetingsCardCenter, BorderLayout.CENTER);
		
		JCheckBox chckbxGreetingsCard = new JCheckBox("Greetings Card - ₱80");
		greetingsCardCenter.add(chckbxGreetingsCard);
		
		JPanel greetingsCardSouth = new JPanel();
		greetingsCardPanel.add(greetingsCardSouth, BorderLayout.SOUTH);
		
		JLabel lblGreetingsCardQty = new JLabel("QTY:");
		greetingsCardSouth.add(lblGreetingsCardQty);
		
		greetingsCardQty = new JTextField();
		greetingsCardQty.setColumns(10);
		greetingsCardSouth.add(greetingsCardQty);

		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		buttonPanel.setPreferredSize(new Dimension(0, 80));
		flowLayout.setHgap(50);
		centerPanel.add(buttonPanel, BorderLayout.SOUTH);

		// SUBMIT ORDER
		JButton btnSubmitOrder = new JButton("SUBMIT ORDER");
		btnSubmitOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmitOrder.setForeground(new Color(255, 255, 255));
		btnSubmitOrder.setBackground(new Color(173, 255, 47));
		btnSubmitOrder.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		buttonPanel.add(btnSubmitOrder);

		JButton btnClearOrder = new JButton("CLEAR ORDER");
		btnClearOrder.setForeground(new Color(255, 255, 255));
		btnClearOrder.setBackground(new Color(255, 99, 71));
		btnClearOrder.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		buttonPanel.add(btnClearOrder);

		// XXX
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(300, 100));
		contentPane.add(eastPanel, BorderLayout.EAST);
		eastPanel.setLayout(new BorderLayout(0, 0));

		// ----- DARK MODE FEATURE ------
		
		btnDarkMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isDarkMode) {
					NorthPanel.setBackground(new Color(255, 228, 196));
					lblLosamiaPastry.setForeground(new Color(0, 0, 0));
					btnDarkMode.setText("Light Mode");
					btnDarkMode.setBackground(new Color(0, 0, 0));
					btnDarkMode.setForeground(new Color(255, 255, 255));
					isDarkMode = true;
				} else {
					NorthPanel.setBackground(new Color(0, 0, 0));
					lblLosamiaPastry.setForeground(new Color(255, 255, 255));
					btnDarkMode.setBackground(new Color(25, 25, 112));
					btnDarkMode.setForeground(new Color(255, 255, 255));
					btnDarkMode.setText("Dark Mode");
					isDarkMode = false;
				}
			}
		});

		JPanel headerOrderSummaryPanel = new JPanel();
		eastPanel.add(headerOrderSummaryPanel, BorderLayout.NORTH);

		JLabel lblOrderSummary = new JLabel("ORDER SUMMARY");
		lblOrderSummary.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		headerOrderSummaryPanel.add(lblOrderSummary);

		JPanel orderSummaryAreaPanel = new JPanel();
		eastPanel.add(orderSummaryAreaPanel, BorderLayout.CENTER);
		orderSummaryAreaPanel.setLayout(new CardLayout(0, 0));

		JTextArea orderSummaryArea = new JTextArea();
		orderSummaryAreaPanel.add(orderSummaryArea, "name_16997509283899");

		btnClearOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int confirm = JOptionPane.showConfirmDialog(centerPanel, "Are you sure you want to clear the form?", "Confirm",
						JOptionPane.YES_NO_OPTION);

				if (confirm == JOptionPane.YES_OPTION) {
					try {

						// -------- BAKED GOODS --------
						txtChocolateCakeSliceQty.setText("");
						chckbxChocolateCakeSlice.setSelected(false);

						txtMinicakeQty.setText("");
						chckbxMinicake.setSelected(false);

						txtBrowniesQty.setText("");
						chckbxBrownies.setSelected(false);

						// -------- ORDER SUMMARY --------
						orderSummaryArea.setText("");

						JOptionPane.showMessageDialog(centerPanel, "All fields cleared!", "Clear Success",
								JOptionPane.INFORMATION_MESSAGE);

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(centerPanel, "Error clearing fields!", "System Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		JScrollPane scrollPane_1 = new JScrollPane();
		orderSummaryAreaPanel.add(scrollPane_1, "name_17015894853599");
		
		JPanel paymentMethodPanel = new JPanel();
		paymentMethodPanel.setPreferredSize(new Dimension(100, 80));
		eastPanel.add(paymentMethodPanel, BorderLayout.SOUTH);
		paymentMethodPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel paymentMethodHeader = new JPanel();
		paymentMethodPanel.add(paymentMethodHeader, BorderLayout.NORTH);
		paymentMethodHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPaymentMethod_1 = new JLabel("PAYMENT METHOD");
		lblPaymentMethod_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		paymentMethodHeader.add(lblPaymentMethod_1);
		
		JPanel paymentMethodOptionsPanel = new JPanel();
		paymentMethodPanel.add(paymentMethodOptionsPanel, BorderLayout.CENTER);
		
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		buttonGroup_2.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnCash.setBackground(new Color(255, 228, 225));
		paymentMethodOptionsPanel.add(rdbtnCash);
		
		JRadioButton rdbtnGcash = new JRadioButton("GCash");
		buttonGroup_2.add(rdbtnGcash);
		rdbtnGcash.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnGcash.setBackground(new Color(255, 228, 225));
		paymentMethodOptionsPanel.add(rdbtnGcash);
		
		JRadioButton rdbtnPerDozen_1_1 = new JRadioButton("Credit Card");
		buttonGroup_2.add(rdbtnPerDozen_1_1);
		rdbtnPerDozen_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnPerDozen_1_1.setBackground(new Color(255, 228, 225));
		paymentMethodOptionsPanel.add(rdbtnPerDozen_1_1);

	}
}
