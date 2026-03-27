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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private boolean isDarkMode = true;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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

		JPanel panel_1 = new JPanel();
		southPanel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("----- Order Page -----");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		southPanel.add(panel_2, BorderLayout.WEST);

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
		panel_2.add(btnHideAndShowInformation);

		JPanel panel_3 = new JPanel();
		southPanel.add(panel_3, BorderLayout.EAST);

		JButton btnDarkMode = new JButton("Dark Mode");
		btnDarkMode.setBackground(new Color(25, 25, 112));
		btnDarkMode.setForeground(new Color(255, 255, 255));
		btnDarkMode.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		panel_3.add(btnDarkMode);

		JButton btnHideAndShowOrderSummary_1 = new JButton("Hide order summary");
		btnHideAndShowOrderSummary_1.setForeground(Color.WHITE);
		btnHideAndShowOrderSummary_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		btnHideAndShowOrderSummary_1.setBackground(new Color(255, 127, 80));
		panel_3.add(btnHideAndShowOrderSummary_1);

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
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		chocolateCakeSectionNorth.add(lblChocolateCakeSliceImg);

		JPanel chocolateCakeCenter = new JPanel();
		chocolateCakeSlicePanel.add(chocolateCakeCenter, BorderLayout.CENTER);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter.add(chckbxNewCheckBox_1);

		JPanel chocolateCakeSouth = new JPanel();
		chocolateCakeSlicePanel.add(chocolateCakeSouth, BorderLayout.SOUTH);

		JLabel lblNewLabel_1 = new JLabel("QTY:");
		chocolateCakeSouth.add(lblNewLabel_1);

		textField = new JTextField();
		chocolateCakeSouth.add(textField);
		textField.setColumns(10);

		JPanel miniCakePanel = new JPanel();
		bakedGoodsPanel.add(miniCakePanel);
		miniCakePanel.setLayout(new BorderLayout(0, 0));

		JPanel miniCakeNorth = new JPanel();
		miniCakePanel.add(miniCakeNorth, BorderLayout.NORTH);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		miniCakeNorth.add(lblNewLabel_2);

		JPanel miniCakeCenter = new JPanel();
		miniCakePanel.add(miniCakeCenter, BorderLayout.CENTER);

		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		miniCakeCenter.add(chckbxNewCheckBox_1_1);

		JPanel miniCakeSouth = new JPanel();
		miniCakePanel.add(miniCakeSouth, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_1 = new JLabel("QTY:");
		miniCakeSouth.add(lblNewLabel_1_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		miniCakeSouth.add(textField_1);

		JPanel browniesPanel = new JPanel();
		bakedGoodsPanel.add(browniesPanel);
		browniesPanel.setLayout(new BorderLayout(0, 0));

		JPanel browniesNorth = new JPanel();
		browniesPanel.add(browniesNorth, BorderLayout.NORTH);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		browniesNorth.add(lblNewLabel_2_1);

		JPanel browniesCenter = new JPanel();
		browniesPanel.add(browniesCenter, BorderLayout.CENTER);

		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		browniesCenter.add(chckbxNewCheckBox_1_1_1);

		JPanel browniesSouth = new JPanel();
		browniesPanel.add(browniesSouth, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_1_1 = new JLabel("QTY:");
		browniesSouth.add(lblNewLabel_1_1_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		browniesSouth.add(textField_2);

		JPanel breadAndPastriesPanel = new JPanel();
		JTabbedPastriesPage.addTab("Bread And Pastries", null, breadAndPastriesPanel, null);

		JPanel ensaymadaPanel = new JPanel();
		breadAndPastriesPanel.add(ensaymadaPanel);
		ensaymadaPanel.setLayout(new BorderLayout(0, 0));

		JPanel browniesNorth_1 = new JPanel();
		ensaymadaPanel.add(browniesNorth_1, BorderLayout.NORTH);

		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		browniesNorth_1.add(lblNewLabel_2_1_1);

		JPanel chocolateCakeCenter_1 = new JPanel();
		ensaymadaPanel.add(chocolateCakeCenter_1, BorderLayout.CENTER);

		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter_1.add(chckbxNewCheckBox_1_2);

		JPanel chocolateCakeSouth_1 = new JPanel();
		ensaymadaPanel.add(chocolateCakeSouth_1, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_2 = new JLabel("QTY:");
		chocolateCakeSouth_1.add(lblNewLabel_1_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		chocolateCakeSouth_1.add(textField_3);

		JPanel croissantPanel = new JPanel();
		breadAndPastriesPanel.add(croissantPanel);
		croissantPanel.setLayout(new BorderLayout(0, 0));

		JPanel browniesNorth_1_1 = new JPanel();
		croissantPanel.add(browniesNorth_1_1, BorderLayout.NORTH);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		browniesNorth_1_1.add(lblNewLabel_2_1_1_1);

		JPanel chocolateCakeCenter_1_1 = new JPanel();
		croissantPanel.add(chocolateCakeCenter_1_1, BorderLayout.CENTER);

		JCheckBox chckbxNewCheckBox_1_2_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter_1_1.add(chckbxNewCheckBox_1_2_1);

		JPanel chocolateCakeSouth_1_1 = new JPanel();
		croissantPanel.add(chocolateCakeSouth_1_1, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_2_1 = new JLabel("QTY:");
		chocolateCakeSouth_1_1.add(lblNewLabel_1_2_1);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		chocolateCakeSouth_1_1.add(textField_4);

		JPanel pandesalPanel = new JPanel();
		breadAndPastriesPanel.add(pandesalPanel);
		pandesalPanel.setLayout(new BorderLayout(0, 0));

		JPanel browniesNorth_1_1_1 = new JPanel();
		pandesalPanel.add(browniesNorth_1_1_1, BorderLayout.NORTH);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1
				.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		browniesNorth_1_1_1.add(lblNewLabel_2_1_1_1_1);

		JPanel chocolateCakeCenter_1_1_1 = new JPanel();
		pandesalPanel.add(chocolateCakeCenter_1_1_1, BorderLayout.CENTER);

		JCheckBox chckbxNewCheckBox_1_2_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter_1_1_1.add(chckbxNewCheckBox_1_2_1_1);

		JPanel chocolateCakeSouth_1_1_1 = new JPanel();
		pandesalPanel.add(chocolateCakeSouth_1_1_1, BorderLayout.SOUTH);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("QTY:");
		chocolateCakeSouth_1_1_1.add(lblNewLabel_1_2_1_1);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		chocolateCakeSouth_1_1_1.add(textField_5);

		JPanel cookiesAndTreatsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Cookies and Treats", null, cookiesAndTreatsPanel, null);

		JPanel chocolateChipCookiePanel = new JPanel();
		cookiesAndTreatsPanel.add(chocolateChipCookiePanel);
		chocolateChipCookiePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel browniesNorth_1_2 = new JPanel();
		chocolateChipCookiePanel.add(browniesNorth_1_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("");
		lblNewLabel_2_1_1_2.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		browniesNorth_1_2.add(lblNewLabel_2_1_1_2);
		
		JPanel chocolateCakeCenter_1_2 = new JPanel();
		chocolateChipCookiePanel.add(chocolateCakeCenter_1_2, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox_1_2_2 = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter_1_2.add(chckbxNewCheckBox_1_2_2);
		
		JPanel chocolateCakeSouth_1_2 = new JPanel();
		chocolateChipCookiePanel.add(chocolateCakeSouth_1_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("QTY:");
		chocolateCakeSouth_1_2.add(lblNewLabel_1_2_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		chocolateCakeSouth_1_2.add(textField_6);

		JPanel oatmealCookiePanel = new JPanel();
		cookiesAndTreatsPanel.add(oatmealCookiePanel);
		oatmealCookiePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel browniesNorth_1_2_1 = new JPanel();
		oatmealCookiePanel.add(browniesNorth_1_2_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("");
		lblNewLabel_2_1_1_2_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		browniesNorth_1_2_1.add(lblNewLabel_2_1_1_2_1);
		
		JPanel chocolateCakeCenter_1_2_1 = new JPanel();
		oatmealCookiePanel.add(chocolateCakeCenter_1_2_1, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox_1_2_2_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		chocolateCakeCenter_1_2_1.add(chckbxNewCheckBox_1_2_2_1);
		
		JPanel panel_5 = new JPanel();
		oatmealCookiePanel.add(panel_5, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("QTY:");
		panel_5.add(lblNewLabel_1_2_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_5.add(textField_7);

		JPanel crinklesPanel = new JPanel();
		cookiesAndTreatsPanel.add(crinklesPanel);
		crinklesPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		crinklesPanel.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1_2_1_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		panel_6.add(lblNewLabel_2_1_1_2_1_1);
		
		JPanel panel_6_1 = new JPanel();
		crinklesPanel.add(panel_6_1, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox_1_2_2_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		panel_6_1.add(chckbxNewCheckBox_1_2_2_1_1);
		
		JPanel panel_7 = new JPanel();
		crinklesPanel.add(panel_7, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("QTY:");
		panel_7.add(lblNewLabel_1_2_2_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_7.add(textField_8);

		JPanel accessoriesPanel = new JPanel();
		JTabbedPastriesPage.addTab("Accessories", null, accessoriesPanel, null);
		
		JPanel crinklesPanel_1 = new JPanel();
		accessoriesPanel.add(crinklesPanel_1);
		crinklesPanel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6_2 = new JPanel();
		crinklesPanel_1.add(panel_6_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_2_1_1_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		panel_6_2.add(lblNewLabel_2_1_1_2_1_1_1);
		
		JPanel panel_6_1_1 = new JPanel();
		crinklesPanel_1.add(panel_6_1_1, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox_1_2_2_1_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		panel_6_1_1.add(chckbxNewCheckBox_1_2_2_1_1_1);
		
		JPanel panel_8 = new JPanel();
		crinklesPanel_1.add(panel_8, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("QTY:");
		panel_8.add(lblNewLabel_1_2_2_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_8.add(textField_9);
		
		JPanel crinklesPanel_1_1 = new JPanel();
		accessoriesPanel.add(crinklesPanel_1_1);
		crinklesPanel_1_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		crinklesPanel_1_1.add(panel_9, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_2_1_1_1_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		panel_9.add(lblNewLabel_2_1_1_2_1_1_1_1);
		
		JPanel panel_10 = new JPanel();
		crinklesPanel_1_1.add(panel_10, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox_1_2_2_1_1_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		panel_10.add(chckbxNewCheckBox_1_2_2_1_1_1_1);
		
		JPanel panel_11 = new JPanel();
		crinklesPanel_1_1.add(panel_11, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("QTY:");
		panel_11.add(lblNewLabel_1_2_2_1_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_11.add(textField_10);
		
		JPanel crinklesPanel_1_2 = new JPanel();
		accessoriesPanel.add(crinklesPanel_1_2);
		crinklesPanel_1_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_1 = new JPanel();
		crinklesPanel_1_2.add(panel_9_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_2_1_1_1_1_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		panel_9_1.add(lblNewLabel_2_1_1_2_1_1_1_1_1);
		
		JPanel panel_12 = new JPanel();
		crinklesPanel_1_2.add(panel_12, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox_1_2_2_1_1_1_1_1 = new JCheckBox("Chocolate Cake Slice - ₱120");
		panel_12.add(chckbxNewCheckBox_1_2_2_1_1_1_1_1);
		
		JPanel panel_13 = new JPanel();
		crinklesPanel_1_2.add(panel_13, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1_1 = new JLabel("QTY:");
		panel_13.add(lblNewLabel_1_2_2_1_1_1_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_13.add(textField_11);

		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		buttonPanel.setPreferredSize(new Dimension(0, 80));
		flowLayout.setHgap(50);
		centerPanel.add(buttonPanel, BorderLayout.SOUTH);

		JButton btnSubmitOrder = new JButton("SUBMIT ORDER");
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

		JPanel panel = new JPanel();
		eastPanel.add(panel, BorderLayout.NORTH);

		JLabel lblProductSelection_1 = new JLabel("ORDER SUMMARY");
		lblProductSelection_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblProductSelection_1);

		JPanel panel_4 = new JPanel();
		eastPanel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new CardLayout(0, 0));

		JTextArea orderSummaryArea = new JTextArea();
		panel_4.add(orderSummaryArea, "name_16997509283899");

		btnClearOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int confirm = JOptionPane.showConfirmDialog(centerPanel, "Are you sure you want to clear the form?", "Confirm",
						JOptionPane.YES_NO_OPTION);

				if (confirm == JOptionPane.YES_OPTION) {
					try {

						// -------- BAKED GOODS --------
						textField.setText("");
						chckbxNewCheckBox_1.setSelected(false);

						textField_1.setText("");
						chckbxNewCheckBox_1_1.setSelected(false);

						textField_2.setText("");
						chckbxNewCheckBox_1_1_1.setSelected(false);

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
		panel_4.add(scrollPane_1, "name_17015894853599");

	}
}
