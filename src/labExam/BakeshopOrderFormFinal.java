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

// version 1.5
public class BakeshopOrderFormFinal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtChocolateCakeSliceQty;
	private JTextField txtMinicakeQty;
	private JTextField txtBrowniesQty;
	private final ButtonGroup buttonGroupOrderType = new ButtonGroup();
	private final ButtonGroup buttonGroupUnit = new ButtonGroup();
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
	private final ButtonGroup buttonGroupPayment = new ButtonGroup();

	private JCheckBox chckbxChocolateCakeSlice;
	private JCheckBox chckbxMinicake;
	private JCheckBox chckbxBrownies;
	private JCheckBox chckbxEnsaymada;
	private JCheckBox chckbxCroissant;
	private JCheckBox chckbxPandesal;
	private JCheckBox chckbxChocolateChipCookie;
	private JCheckBox chckbxOatmealCookie;
	private JCheckBox chckbxCrinkles;
	private JCheckBox chckbxBirthdayCandle;
	private JCheckBox chckbxCakeTopper;
	private JCheckBox chckbxGreetingsCard;

	private double subtotal = 0;
	private double discount = 0;
	private double finalTotal = 0;

	private boolean itemSelected = false;
	private JRadioButton rdbtnPerDozen;
	private JRadioButton rdbtnPerPiece;

	private int receiptNo = 1;

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
		NorthPanel.setBackground(new Color(102, 153, 102));
		contentPane.add(NorthPanel, BorderLayout.NORTH);
		NorthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPancakeImage = new JLabel("");
		lblPancakeImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/Pastry1.png")));
		NorthPanel.add(lblPancakeImage);

		JLabel lblLosamiaPastry = new JLabel("Losamia Pastry");
		lblLosamiaPastry.setFont(new Font("Castellar", Font.BOLD, 50));
		NorthPanel.add(lblLosamiaPastry);

		JLabel lblCroissantImage = new JLabel("");
		lblCroissantImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		NorthPanel.add(lblCroissantImage);

		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(255, 218, 185));
		westPanel.setPreferredSize(new Dimension(260, 50));
		contentPane.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(null);

		JPanel customerInformationPanel = new JPanel();
		customerInformationPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		customerInformationPanel.setBackground(new Color(240, 230, 140));
		customerInformationPanel.setBounds(0, 11, 250, 103);
		westPanel.add(customerInformationPanel);
		customerInformationPanel.setLayout(null);

		JLabel lblCustomerInformation = new JLabel("CUSTOMER INFORMATION");
		lblCustomerInformation.setBounds(10, 13, 216, 21);
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

		txtName.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent e) {
				char c = e.getKeyChar();

				if (!Character.isLetter(c) && c != ' ') {
					e.consume(); // blocks input
				}
			}
		});

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(10, 71, 64, 16);
		lblPhone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		customerInformationPanel.add(lblPhone);

		txtPhone = new JTextField();
		txtPhone.setBounds(74, 72, 166, 20);
		txtPhone.setColumns(20);
		customerInformationPanel.add(txtPhone);

		txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent e) {
				char c = e.getKeyChar();

				if (!Character.isDigit(c)) {
					e.consume();
				}

				if (txtPhone.getText().length() >= 11) {
					e.consume();
				}
			}
		});

		JPanel oderTypePanel = new JPanel();
		oderTypePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		oderTypePanel.setBackground(new Color(240, 230, 140));
		oderTypePanel.setBounds(0, 125, 250, 103);
		westPanel.add(oderTypePanel);
		oderTypePanel.setLayout(null);

		JLabel lblOrderType = new JLabel("ORDER TYPE");
		lblOrderType.setBounds(79, 9, 100, 21);
		lblOrderType.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		oderTypePanel.add(lblOrderType);

		JRadioButton rdbtnPickup = new JRadioButton("Pickup");
		rdbtnPickup.setActionCommand("Pickup");
		rdbtnPickup.setBackground(new Color(255, 250, 205));
		buttonGroupOrderType.add(rdbtnPickup);
		rdbtnPickup.setBounds(6, 31, 71, 29);
		rdbtnPickup.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnPickup);

		JRadioButton rdbtnDelivery = new JRadioButton("Delivery");
		rdbtnDelivery.setActionCommand("Delivery");
		rdbtnDelivery.setBackground(new Color(255, 250, 205));
		buttonGroupOrderType.add(rdbtnDelivery);
		rdbtnDelivery.setBounds(6, 63, 83, 29);
		rdbtnDelivery.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnDelivery);

		JLabel lblDeliveryImage = new JLabel("");
		lblDeliveryImage.setBounds(143, 39, 51, 50);
		lblDeliveryImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/delivery (1).png")));
		oderTypePanel.add(lblDeliveryImage);

		JPanel orderUnitPanel = new JPanel();
		orderUnitPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		orderUnitPanel.setBackground(new Color(240, 230, 140));
		orderUnitPanel.setBounds(0, 239, 250, 112);
		westPanel.add(orderUnitPanel);
		orderUnitPanel.setLayout(null);

		rdbtnPerPiece = new JRadioButton("Per Piece");
		rdbtnPerPiece.setBackground(new Color(255, 250, 205));
		buttonGroupUnit.add(rdbtnPerPiece);
		rdbtnPerPiece.setBounds(6, 73, 89, 29);
		rdbtnPerPiece.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnPerPiece);

		rdbtnPerDozen = new JRadioButton("Per Dozen");
		rdbtnPerDozen.setBackground(new Color(255, 250, 205));
		buttonGroupUnit.add(rdbtnPerDozen);
		rdbtnPerDozen.setBounds(6, 41, 97, 29);
		rdbtnPerDozen.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnPerDozen);

		JLabel lblOrderUnit = new JLabel("ORDER UNIT");
		lblOrderUnit.setBounds(76, 7, 97, 27);
		lblOrderUnit.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		orderUnitPanel.add(lblOrderUnit);
		
		JPanel helpPanel = new JPanel();
		helpPanel.setVisible(false);
		helpPanel.setBounds(0, 0, 260, 357);
		westPanel.add(helpPanel);
		helpPanel.setLayout(new CardLayout(0, 0));

		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(255, 192, 203));
		southPanel.setPreferredSize(new Dimension(100, 50));
		contentPane.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new BorderLayout(0, 0));

		JPanel orderPageFooterCenter = new JPanel();
		orderPageFooterCenter.setBackground(new Color(102, 153, 102));
		southPanel.add(orderPageFooterCenter);
		orderPageFooterCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblOrderPageFooter = new JLabel("----- Order Page -----");
		lblOrderPageFooter.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		orderPageFooterCenter.add(lblOrderPageFooter);

		JPanel leftButtonPanelWest = new JPanel();
		leftButtonPanelWest.setBackground(new Color(102, 153, 102));
		southPanel.add(leftButtonPanelWest, BorderLayout.WEST);

		// ---------- Hide Information Button --------------
		JButton btnHideAndShowInformation = new JButton("Hide Information");
		btnHideAndShowInformation.setBackground(new Color(102, 51, 0));
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

		JPanel rightButtonPanelEast = new JPanel();
		rightButtonPanelEast.setBackground(new Color(102, 153, 102));
		southPanel.add(rightButtonPanelEast, BorderLayout.EAST);

		JButton btnDarkMode = new JButton("Dark Mode");
		btnDarkMode.setBackground(new Color(25, 25, 112));
		btnDarkMode.setForeground(new Color(255, 255, 255));
		btnDarkMode.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		rightButtonPanelEast.add(btnDarkMode);


		JButton btnHideAndShowOrderSummary = new JButton("Hide order summary");
		btnHideAndShowOrderSummary.setForeground(Color.WHITE);
		btnHideAndShowOrderSummary.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnHideAndShowOrderSummary.setBackground(new Color(102, 51, 0));
		rightButtonPanelEast.add(btnHideAndShowOrderSummary);


		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		centerPanel.setBackground(new Color(240, 255, 240));
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BorderLayout(0, 0));

		JPanel productSelectionHeaderPanel = new JPanel();
		productSelectionHeaderPanel.setBackground(new Color(204, 102, 51));
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
		JTabbedPastriesPage.setBackground(new Color(255, 204, 153));
		scrollPane.setViewportView(JTabbedPastriesPage);
		JTabbedPastriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));

		JPanel bakedGoodsPanel = new JPanel();
		bakedGoodsPanel.setBackground(new Color(204, 102, 51));
		JTabbedPastriesPage.addTab("Baked Goods", null, bakedGoodsPanel, null);
		bakedGoodsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel chocolateCakeSlicePanel = new JPanel();
		chocolateCakeSlicePanel.setBorder(null);
		bakedGoodsPanel.add(chocolateCakeSlicePanel);
		chocolateCakeSlicePanel.setLayout(new BorderLayout(0, 0));

		JPanel chocolateCakeSectionNorth = new JPanel();
		chocolateCakeSectionNorth.setBackground(new Color(255, 153, 102));
		chocolateCakeSlicePanel.add(chocolateCakeSectionNorth, BorderLayout.NORTH);

		JLabel lblChocolateCakeSliceImg = new JLabel("");
		lblChocolateCakeSliceImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/chocolate cake slice.png")));
		chocolateCakeSectionNorth.add(lblChocolateCakeSliceImg);

		JPanel chocolateCakeCenter = new JPanel();
		chocolateCakeCenter.setBackground(new Color(255, 153, 102));
		chocolateCakeSlicePanel.add(chocolateCakeCenter, BorderLayout.CENTER);

		chckbxChocolateCakeSlice = new JCheckBox("Chocolate Cake Slice - ₱120");
		chckbxChocolateCakeSlice.setBackground(new Color(255, 153, 102));
		chocolateCakeCenter.add(chckbxChocolateCakeSlice);

		JPanel chocolateCakeSouth = new JPanel();
		chocolateCakeSouth.setBackground(new Color(255, 153, 102));
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
		miniCakeNorth.setBackground(new Color(255, 153, 102));
		miniCakePanel.add(miniCakeNorth, BorderLayout.NORTH);

		JLabel lblMiniCakeImage = new JLabel("");
		lblMiniCakeImage.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/mini cake.png")));
		miniCakeNorth.add(lblMiniCakeImage);

		JPanel miniCakeCenter = new JPanel();
		miniCakeCenter.setBackground(new Color(255, 153, 102));
		miniCakePanel.add(miniCakeCenter, BorderLayout.CENTER);

		chckbxMinicake = new JCheckBox("Mini Cake - ₱450");
		chckbxMinicake.setBackground(new Color(255, 153, 102));
		miniCakeCenter.add(chckbxMinicake);

		JPanel miniCakeSouth = new JPanel();
		miniCakeSouth.setBackground(new Color(255, 153, 102));
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
		browniesNorth.setBackground(new Color(255, 153, 102));
		browniesPanel.add(browniesNorth, BorderLayout.NORTH);

		JLabel lblBrowniesImg = new JLabel("");
		lblBrowniesImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/brownies.png")));
		browniesNorth.add(lblBrowniesImg);

		JPanel browniesCenter = new JPanel();
		browniesCenter.setBackground(new Color(255, 153, 102));
		browniesPanel.add(browniesCenter, BorderLayout.CENTER);

		chckbxBrownies = new JCheckBox("Brownies - ₱60");
		browniesCenter.add(chckbxBrownies);

		JPanel browniesSouth = new JPanel();
		browniesSouth.setBackground(new Color(255, 153, 102));
		browniesPanel.add(browniesSouth, BorderLayout.SOUTH);

		JLabel lblBrowniesQty = new JLabel("QTY:");
		browniesSouth.add(lblBrowniesQty);

		txtBrowniesQty = new JTextField();
		txtBrowniesQty.setColumns(10);
		browniesSouth.add(txtBrowniesQty);

		JPanel breadAndPastriesPanel = new JPanel();
		breadAndPastriesPanel.setBackground(new Color(204, 102, 0));
		JTabbedPastriesPage.addTab("Bread And Pastries", null, breadAndPastriesPanel, null);

		JPanel ensaymadaPanel = new JPanel();
		breadAndPastriesPanel.add(ensaymadaPanel);
		ensaymadaPanel.setLayout(new BorderLayout(0, 0));

		JPanel ensaymadaNorth = new JPanel();
		ensaymadaNorth.setBackground(new Color(255, 153, 102));
		ensaymadaPanel.add(ensaymadaNorth, BorderLayout.NORTH);

		JLabel lblEnsaymadaImg = new JLabel("");
		lblEnsaymadaImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/ensaymada.png")));
		ensaymadaNorth.add(lblEnsaymadaImg);

		JPanel ensaymadaCenter = new JPanel();
		ensaymadaCenter.setBackground(new Color(255, 153, 102));
		ensaymadaPanel.add(ensaymadaCenter, BorderLayout.CENTER);

		chckbxEnsaymada = new JCheckBox("Ensaymada - ₱40");
		chckbxEnsaymada.setBackground(new Color(255, 153, 102));
		ensaymadaCenter.add(chckbxEnsaymada);

		JPanel ensaymadaSouth = new JPanel();
		ensaymadaSouth.setBackground(new Color(255, 153, 102));
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
		croissantNorth.setBackground(new Color(255, 153, 102));
		croissantPanel.add(croissantNorth, BorderLayout.NORTH);

		JLabel lblCroissantImg = new JLabel("");
		lblCroissantImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant1.png")));
		croissantNorth.add(lblCroissantImg);

		JPanel croissantCenter = new JPanel();
		croissantCenter.setBackground(new Color(255, 153, 102));
		croissantPanel.add(croissantCenter, BorderLayout.CENTER);

		chckbxCroissant = new JCheckBox("Croissant - ₱70");
		chckbxCroissant.setBackground(new Color(255, 153, 102));
		croissantCenter.add(chckbxCroissant);

		JPanel croissantSouth = new JPanel();
		croissantSouth.setBackground(new Color(255, 153, 102));
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
		pandesalNorth.setBackground(new Color(255, 153, 102));
		pandesalPanel.add(pandesalNorth, BorderLayout.NORTH);

		JLabel lblPandesalImg = new JLabel("");
		lblPandesalImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/pandesal.png")));
		pandesalNorth.add(lblPandesalImg);

		JPanel pandesalCenter = new JPanel();
		pandesalCenter.setBackground(new Color(255, 153, 102));
		pandesalPanel.add(pandesalCenter, BorderLayout.CENTER);

		chckbxPandesal = new JCheckBox("Pandesal - ₱5");
		chckbxPandesal.setBackground(new Color(255, 153, 102));
		pandesalCenter.add(chckbxPandesal);

		JPanel pandesalSouth = new JPanel();
		pandesalSouth.setBackground(new Color(255, 153, 102));
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
		cookiesAndTreatsPanel.setBackground(new Color(204, 102, 0));
		chocolateChipCookiePanel.setLayout(new BorderLayout(0, 0));

		JPanel chocolateChipCookieNorth = new JPanel();
		chocolateChipCookieNorth.setBackground(new Color(255, 153, 102));
		chocolateChipCookiePanel.add(chocolateChipCookieNorth, BorderLayout.NORTH);

		JLabel lblChocolateChipCookieImg = new JLabel("");
		lblChocolateChipCookieImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/chocolate chip cookie.png")));
		chocolateChipCookieNorth.add(lblChocolateChipCookieImg);

		JPanel chocolateChipCookieCenter = new JPanel();
		chocolateChipCookieCenter.setBackground(new Color(255, 153, 102));
		chocolateChipCookiePanel.add(chocolateChipCookieCenter, BorderLayout.CENTER);

		chckbxChocolateChipCookie = new JCheckBox("Chocolate Chip Cookie - ₱25");
		chckbxChocolateChipCookie.setBackground(new Color(255, 153, 102));
		chocolateChipCookieCenter.add(chckbxChocolateChipCookie);

		JPanel chocolateChipCookieSouth = new JPanel();
		chocolateChipCookieSouth.setBackground(new Color(255, 153, 102));
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
		oatmealCookieNorth.setBackground(new Color(255, 153, 102));
		oatmealCookiePanel.add(oatmealCookieNorth, BorderLayout.NORTH);

		JLabel lblOatmealCookieImg = new JLabel("");
		lblOatmealCookieImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/oatmeal cookie.png")));
		oatmealCookieNorth.add(lblOatmealCookieImg);

		JPanel oatmealCookieCenter = new JPanel();
		oatmealCookieCenter.setBackground(new Color(255, 153, 102));
		oatmealCookiePanel.add(oatmealCookieCenter, BorderLayout.CENTER);

		chckbxOatmealCookie = new JCheckBox("Oatmeal Cookie- ₱20");
		chckbxOatmealCookie.setBackground(new Color(255, 153, 102));
		oatmealCookieCenter.add(chckbxOatmealCookie);

		JPanel oatmealCookieSouth = new JPanel();
		oatmealCookieSouth.setBackground(new Color(255, 153, 102));
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
		crinklesNorth.setBackground(new Color(255, 153, 102));
		crinklesPanel.add(crinklesNorth, BorderLayout.NORTH);

		JLabel lblCrinklesImg = new JLabel("");
		lblCrinklesImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/crinkles.png")));
		crinklesNorth.add(lblCrinklesImg);

		JPanel crinklesCenter = new JPanel();
		crinklesCenter.setBackground(new Color(255, 153, 102));
		crinklesPanel.add(crinklesCenter, BorderLayout.CENTER);

		chckbxCrinkles = new JCheckBox("Crinkles - ₱18");
		chckbxCrinkles.setBackground(new Color(255, 153, 102));
		crinklesCenter.add(chckbxCrinkles);

		JPanel crinklesSouth = new JPanel();
		crinklesSouth.setBackground(new Color(255, 153, 102));
		crinklesPanel.add(crinklesSouth, BorderLayout.SOUTH);

		JLabel lblCrinklesQty = new JLabel("QTY:");
		crinklesSouth.add(lblCrinklesQty);

		txtCrinklesQty = new JTextField();
		txtCrinklesQty.setColumns(10);
		crinklesSouth.add(txtCrinklesQty);

		JPanel accessoriesPanel = new JPanel();
		accessoriesPanel.setBackground(new Color(204, 102, 51));
		JTabbedPastriesPage.addTab("Accessories", null, accessoriesPanel, null);

		JPanel birthdayCandlesSetPanel = new JPanel();
		accessoriesPanel.add(birthdayCandlesSetPanel);
		birthdayCandlesSetPanel.setLayout(new BorderLayout(0, 0));

		JPanel birthdayCandleNorth = new JPanel();
		birthdayCandleNorth.setBackground(new Color(255, 153, 102));
		birthdayCandlesSetPanel.add(birthdayCandleNorth, BorderLayout.NORTH);

		JLabel lblBirthdayCandleImg = new JLabel("");
		lblBirthdayCandleImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/bday candle set.png")));
		birthdayCandleNorth.add(lblBirthdayCandleImg);

		JPanel birthdayCandleCenter = new JPanel();
		birthdayCandleCenter.setBackground(new Color(255, 153, 102));
		birthdayCandlesSetPanel.add(birthdayCandleCenter, BorderLayout.CENTER);

		chckbxBirthdayCandle = new JCheckBox("Birthday Candle Set - ₱50");
		chckbxBirthdayCandle.setBackground(new Color(255, 153, 102));
		birthdayCandleCenter.add(chckbxBirthdayCandle);

		JPanel birthdayCandleSouth = new JPanel();
		birthdayCandleSouth.setBackground(new Color(255, 153, 102));
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
		cakeTopperNorth.setBackground(new Color(255, 153, 102));
		cakeTopperPanel.add(cakeTopperNorth, BorderLayout.NORTH);

		JLabel lblCakeTopperImg = new JLabel("");
		lblCakeTopperImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/cake topper.png")));
		cakeTopperNorth.add(lblCakeTopperImg);

		JPanel cakeTopperCenter = new JPanel();
		cakeTopperCenter.setBackground(new Color(255, 153, 102));
		cakeTopperPanel.add(cakeTopperCenter, BorderLayout.CENTER);

		chckbxCakeTopper = new JCheckBox("Cake Topper - ₱120");
		chckbxCakeTopper.setBackground(new Color(255, 153, 102));
		cakeTopperCenter.add(chckbxCakeTopper);

		JPanel cakeTopperSouth = new JPanel();
		cakeTopperSouth.setBackground(new Color(255, 153, 102));
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
		greetingsCardNorth.setBackground(new Color(255, 153, 102));
		greetingsCardPanel.add(greetingsCardNorth, BorderLayout.NORTH);

		JLabel lblGreetingsCardImg = new JLabel("");
		lblGreetingsCardImg
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/greeting card.png")));
		greetingsCardNorth.add(lblGreetingsCardImg);

		JPanel greetingsCardCenter = new JPanel();
		greetingsCardCenter.setBackground(new Color(255, 153, 102));
		greetingsCardPanel.add(greetingsCardCenter, BorderLayout.CENTER);

		chckbxGreetingsCard = new JCheckBox("Greetings Card - ₱80");
		chckbxGreetingsCard.setBackground(new Color(255, 153, 102));
		greetingsCardCenter.add(chckbxGreetingsCard);

		JPanel greetingsCardSouth = new JPanel();
		greetingsCardSouth.setBackground(new Color(255, 153, 102));
		greetingsCardPanel.add(greetingsCardSouth, BorderLayout.SOUTH);

		JLabel lblGreetingsCardQty = new JLabel("QTY:");
		greetingsCardSouth.add(lblGreetingsCardQty);

		greetingsCardQty = new JTextField();
		greetingsCardQty.setColumns(10);
		greetingsCardSouth.add(greetingsCardQty);

		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		buttonPanel.setBackground(new Color(255, 218, 185));
		buttonPanel.setPreferredSize(new Dimension(0, 80));
		flowLayout.setHgap(50);
		centerPanel.add(buttonPanel, BorderLayout.SOUTH);

	
		
		// SUBMIT ORDER
		JButton btnSubmitOrder = new JButton("SUBMIT ORDER");

		btnSubmitOrder.setForeground(new Color(255, 255, 255));
		btnSubmitOrder.setBackground(new Color(102, 51, 0));
		btnSubmitOrder.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		buttonPanel.add(btnSubmitOrder);

		JButton btnClearOrder = new JButton("CLEAR ORDER");
		btnClearOrder.setForeground(new Color(255, 255, 255));
		btnClearOrder.setBackground(new Color(102, 51, 0));
		btnClearOrder.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		buttonPanel.add(btnClearOrder);

		// XXX
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(300, 100));
		contentPane.add(eastPanel, BorderLayout.EAST);
		eastPanel.setLayout(new BorderLayout(0, 0));

		btnHideAndShowOrderSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (eastPanel.isVisible()) {
					eastPanel.setVisible(false);
					btnHideAndShowOrderSummary.setText("Show Information");
				} else if (!eastPanel.isVisible()) {
					eastPanel.setVisible(true);
					btnHideAndShowOrderSummary.setText("Hide Information");
				}
			}
		});
		
	
		// ----- DARK MODE FEATURE ------

		btnDarkMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isDarkMode) {
					NorthPanel.setBackground(new Color(102, 153, 102));
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
		headerOrderSummaryPanel.setBackground(new Color(240, 230, 140));
		eastPanel.add(headerOrderSummaryPanel, BorderLayout.NORTH);

		JLabel lblOrderSummary = new JLabel("ORDER SUMMARY");
		lblOrderSummary.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		headerOrderSummaryPanel.add(lblOrderSummary);

		JPanel orderSummaryAreaPanel = new JPanel();
		eastPanel.add(orderSummaryAreaPanel, BorderLayout.CENTER);
		orderSummaryAreaPanel.setLayout(new CardLayout(0, 0));

		JTextArea orderSummaryArea = new JTextArea();
		orderSummaryArea.setBackground(new Color(255, 250, 205));
		orderSummaryArea.setEditable(false);

		orderSummaryAreaPanel.add(orderSummaryArea, "name_16997509283899");

		btnClearOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int confirm = JOptionPane.showConfirmDialog(centerPanel, "Are you sure you want to clear the form?",
						"Confirm", JOptionPane.YES_NO_OPTION);

				if (confirm == JOptionPane.YES_OPTION) {
					try {

						// -------- BAKED GOODS --------
						txtChocolateCakeSliceQty.setText("");
						chckbxChocolateCakeSlice.setSelected(false);

						txtMinicakeQty.setText("");
						chckbxMinicake.setSelected(false);

						txtBrowniesQty.setText("");
						chckbxBrownies.setSelected(false);

						// CLEAR ALL OTHER FIELDS

						txtEnsaymada.setText("");
						chckbxEnsaymada.setSelected(false);

						txtCroissantQty.setText("");
						chckbxCroissant.setSelected(false);

						txtPandesal.setText("");
						chckbxPandesal.setSelected(false);

						txtChocolateChipCookieQty.setText("");
						chckbxChocolateChipCookie.setSelected(false);

						txtOatmealCookieQty.setText("");
						chckbxOatmealCookie.setSelected(false);

						txtCrinklesQty.setText("");
						chckbxCrinkles.setSelected(false);

						txtBirthdayCandleQty.setText("");
						chckbxBirthdayCandle.setSelected(false);

						txtCakeTopperQty.setText("");
						chckbxCakeTopper.setSelected(false);

						greetingsCardQty.setText("");
						chckbxGreetingsCard.setSelected(false);

						// clear radio buttons
						buttonGroupUnit.clearSelection();
						buttonGroupPayment.clearSelection();
						buttonGroupOrderType.clearSelection();

						// clear name & phone
						txtName.setText("");
						txtPhone.setText("");

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
		paymentMethodHeader.setBackground(new Color(240, 230, 140));
		paymentMethodPanel.add(paymentMethodHeader, BorderLayout.NORTH);
		paymentMethodHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPaymentMethod_1 = new JLabel("PAYMENT METHOD");
		lblPaymentMethod_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		paymentMethodHeader.add(lblPaymentMethod_1);

		JPanel paymentMethodOptionsPanel = new JPanel();
		paymentMethodOptionsPanel.setBackground(new Color(240, 230, 140));
		paymentMethodPanel.add(paymentMethodOptionsPanel, BorderLayout.CENTER);

		JRadioButton rdbtnCash = new JRadioButton("Cash");
		buttonGroupPayment.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnCash.setBackground(new Color(255, 250, 205));
		paymentMethodOptionsPanel.add(rdbtnCash);

		JRadioButton rdbtnGcash = new JRadioButton("GCash");
		buttonGroupPayment.add(rdbtnGcash);
		rdbtnGcash.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnGcash.setBackground(new Color(255, 250, 205));
		paymentMethodOptionsPanel.add(rdbtnGcash);

		JRadioButton rdbtnPerDozen_1_1 = new JRadioButton("Credit Card");
		buttonGroupPayment.add(rdbtnPerDozen_1_1);
		rdbtnPerDozen_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnPerDozen_1_1.setBackground(new Color(255, 250, 205));
		paymentMethodOptionsPanel.add(rdbtnPerDozen_1_1);
		
		JPanel panel = new JPanel();
		eastPanel.add(panel, BorderLayout.WEST);
		

		btnSubmitOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!validateInputs(chckbxChocolateCakeSlice, chckbxMinicake, chckbxBrownies, chckbxEnsaymada,
						chckbxCroissant, chckbxPandesal, chckbxChocolateChipCookie, chckbxOatmealCookie, chckbxCrinkles,
						chckbxBirthdayCandle, chckbxCakeTopper, chckbxGreetingsCard))
					return;

				int confirm = JOptionPane.showConfirmDialog(null, "Confirm Order?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (confirm != JOptionPane.YES_OPTION)
					return;

				computeOrder(orderSummaryArea);
			}
		});

	}// END OF CONSTRUCTOR

	private void computeOrder(JTextArea receiptArea) {

		String deliveryType = "";

		if (buttonGroupOrderType.getSelection() != null) {
			deliveryType = buttonGroupOrderType.getSelection().getActionCommand();
		}

		boolean isDozen = rdbtnPerDozen.isSelected();
		String unitLabel = isDozen ? "Per Dozen" : "Per Piece";
		int multiplier = isDozen ? 12 : 1;

		subtotal = 0;
		discount = 0;
		finalTotal = 0;
		itemSelected = false;

		receiptArea.setText("");

		// HEADER
		receiptArea.append("========== Losamia Pastry ==========\n\n");
		receiptArea.append(String.format("Customer: %s\n", txtName.getText()));
		receiptArea.append(String.format("Phone: %s\n", txtPhone.getText()));
		receiptArea.append(String.format("Order Type: %s\n\n", deliveryType));

		receiptArea.append(String.format("%-20s %-5s %-15s %-10s\n", "Item", "Qty", "Unit", "Total"));
		receiptArea.append("-----------------------------------------------------\n");

		// ================= ITEMS =================

		if (chckbxChocolateCakeSlice.isSelected()) {
			int qty = getQuantity(txtChocolateCakeSliceQty);
			if (qty <= 0) {
				returnError("Chocolate Cake Slice");
				return;
			}

			double total = 120 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Chocolate Cake", qty, unitLabel, total));
		}

		if (chckbxMinicake.isSelected()) {
			int qty = getQuantity(txtMinicakeQty);
			if (qty <= 0) {
				returnError("Mini Cake");
				return;
			}

			double total = 450 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Mini Cake", qty, unitLabel, total));
		}

		if (chckbxBrownies.isSelected()) {
			int qty = getQuantity(txtBrowniesQty);
			if (qty <= 0) {
				returnError("Brownies");
				return;
			}

			double total = 60 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Brownies", qty, unitLabel, total));
		}

		if (chckbxEnsaymada.isSelected()) {
			int qty = getQuantity(txtEnsaymada);
			if (qty <= 0) {
				returnError("Ensaymada");
				return;
			}

			double total = 40 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Ensaymada", qty, unitLabel, total));
		}

		if (chckbxCroissant.isSelected()) {
			int qty = getQuantity(txtCroissantQty);
			if (qty <= 0) {
				returnError("Croissant");
				return;
			}

			double total = 70 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Croissant", qty, unitLabel, total));
		}

		if (chckbxPandesal.isSelected()) {
			int qty = getQuantity(txtPandesal);
			if (qty <= 0) {
				returnError("Pandesal");
				return;
			}

			double total = 5 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Pandesal", qty, unitLabel, total));
		}

		if (chckbxChocolateChipCookie.isSelected()) {
			int qty = getQuantity(txtChocolateChipCookieQty);
			if (qty <= 0) {
				returnError("Chocolate Chip Cookie");
				return;
			}

			double total = 25 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Chocolate Cookie", qty, unitLabel, total));
		}

		if (chckbxOatmealCookie.isSelected()) {
			int qty = getQuantity(txtOatmealCookieQty);
			if (qty <= 0) {
				returnError("Oatmeal Cookie");
				return;
			}

			double total = 20 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Oatmeal Cookie", qty, unitLabel, total));
		}

		if (chckbxCrinkles.isSelected()) {
			int qty = getQuantity(txtCrinklesQty);
			if (qty <= 0) {
				returnError("Crinkles");
				return;
			}

			double total = 18 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Crinkles", qty, unitLabel, total));
		}

		if (chckbxBirthdayCandle.isSelected()) {
			int qty = getQuantity(txtBirthdayCandleQty);
			if (qty <= 0) {
				returnError("Birthday Candle");
				return;
			}

			double total = 50 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Candle Set", qty, unitLabel, total));
		}

		if (chckbxCakeTopper.isSelected()) {
			int qty = getQuantity(txtCakeTopperQty);
			if (qty <= 0) {
				returnError("Cake Topper");
				return;
			}

			double total = 120 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Cake Topper", qty, unitLabel, total));
		}

		if (chckbxGreetingsCard.isSelected()) {
			int qty = getQuantity(greetingsCardQty);
			if (qty <= 0) {
				returnError("Greeting Card");
				return;
			}

			double total = 80 * qty * multiplier;
			subtotal += total;
			itemSelected = true;

			receiptArea.append(String.format("%-20s %-5d %-15s %-10.2f\n", "Greeting Card", qty, unitLabel, total));
		}

		// ================= VALIDATION =================
		if (!itemSelected) {
			JOptionPane.showMessageDialog(this, "No items selected!");
			return;
		}

		receiptArea.append("-----------------------------------------------------\n");

		// ================= COMPUTATION =================
		double vat = subtotal * 0.12;

		if (subtotal > 2000) {
			discount += subtotal * 0.05;
		}

		finalTotal = subtotal + vat - discount;

		receiptArea.append(String.format("%-25s ₱%10.2f\n", "Subtotal:", subtotal));
		receiptArea.append(String.format("%-25s ₱%10.2f\n", "VAT (12%):", vat));
		receiptArea.append(String.format("%-25s -₱%9.2f\n", "Discount:", discount));
		receiptArea.append(String.format("%-25s ₱%10.2f\n", "Grand Total:", finalTotal));

		// Payment
		String payment = "";
		if (buttonGroupPayment.getSelection() != null) {
			payment = buttonGroupPayment.getSelection().getActionCommand();
		}

		receiptArea.append("\nPayment: " + payment);

		// Footer
		receiptArea.append("\nReceipt No: " + receiptNo++);
		receiptArea.append("\n" + java.time.LocalDateTime.now());
	}

	private void returnError(String item) {
		JOptionPane.showMessageDialog(this, "Invalid quantity for " + item);
	}

	private boolean validateInputs(JCheckBox... checkboxes) {


		if (txtName.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Customer name is required!");
			return false;
		}
		
		if (!txtPhone.getText().matches("09[0-9]{9}")) {
			JOptionPane.showMessageDialog(this, "Invalid PH phone number format!");
			return false;
		}

		if (!txtName.getText().matches("[a-zA-Z\\s]+")) {
			JOptionPane.showMessageDialog(this, "Name must contain letters only!");
			return false;
		}

		boolean hasSelected = false;
		for (JCheckBox cb : checkboxes) {
			if (cb.isSelected()) {
				hasSelected = true;
				break;
			}
		}

		if (buttonGroupOrderType.getSelection() == null) {
			JOptionPane.showMessageDialog(this, "Select order type!");
			return false;
		}

		if (!hasSelected) {
			JOptionPane.showMessageDialog(this, "Select at least one product!");
			return false;
		}

		if (buttonGroupUnit.getSelection() == null) {
			JOptionPane.showMessageDialog(this, "Select order unit!");
			return false;
		}

		if (buttonGroupPayment.getSelection() == null) {
			JOptionPane.showMessageDialog(this, "Select payment method!");
			return false;
		}

		return true;
	}

	private int getQuantity(JTextField field) {
		try {
			int qty = Integer.parseInt(field.getText().trim());
			if (qty <= 0)
				return 0;
			return qty;
		} catch (Exception e) {
			return 0;
		}
	}
}
