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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class BakeshopOrderFormFinal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JPanel headerNorthPanel = new JPanel();
		headerNorthPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		headerNorthPanel.setBackground(new Color(255, 228, 196));
		contentPane.add(headerNorthPanel, BorderLayout.NORTH);
		headerNorthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/Pastry1.png")));
		headerNorthPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Losamia Pastry");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 50));
		headerNorthPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
		headerNorthPanel.add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER INFORMATION");
		lblNewLabel_2.setBounds(22, 0, 206, 21);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		customerInformationPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setBounds(0, 34, 64, 16);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		customerInformationPanel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(74, 35, 166, 20);
		textField.setColumns(20);
		customerInformationPanel.add(textField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone:");
		lblNewLabel_3_1.setBounds(0, 59, 64, 16);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		customerInformationPanel.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 60, 166, 20);
		textField_1.setColumns(20);
		customerInformationPanel.add(textField_1);
		
		JPanel oderTypePanel = new JPanel();
		oderTypePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		oderTypePanel.setBackground(new Color(255, 228, 225));
		oderTypePanel.setBounds(0, 125, 250, 103);
		westPanel.add(oderTypePanel);
		oderTypePanel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("ORDER TYPE");
		lblNewLabel_2_1.setBounds(79, 9, 92, 21);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		oderTypePanel.add(lblNewLabel_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pickup");
		rdbtnNewRadioButton.setBounds(6, 31, 71, 29);
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Delivery");
		rdbtnNewRadioButton_1.setBounds(6, 63, 83, 29);
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(143, 39, 51, 50);
		lblNewLabel_4.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/delivery (1).png")));
		oderTypePanel.add(lblNewLabel_4);
		
		JPanel orderUnitPanel = new JPanel();
		orderUnitPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		orderUnitPanel.setBackground(new Color(255, 228, 225));
		orderUnitPanel.setBounds(0, 234, 250, 112);
		westPanel.add(orderUnitPanel);
		orderUnitPanel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Per Piece");
		rdbtnNewRadioButton_1_1.setBounds(6, 73, 89, 29);
		rdbtnNewRadioButton_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Per Dozen");
		rdbtnNewRadioButton_2.setBounds(6, 41, 97, 29);
		rdbtnNewRadioButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ORDER UNIT");
		lblNewLabel_2_1_1.setBounds(76, 7, 97, 27);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		orderUnitPanel.add(lblNewLabel_2_1_1);
		
		JPanel footerPanel = new JPanel();
		footerPanel.setBackground(new Color(255, 192, 203));
		footerPanel.setPreferredSize(new Dimension(100, 50));
		contentPane.add(footerPanel, BorderLayout.SOUTH);
		footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("---- Order Form -----");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		footerPanel.add(lblNewLabel_5);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		orderPanel.setBackground(new Color(240, 255, 240));
		contentPane.add(orderPanel, BorderLayout.CENTER);
		orderPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel productSelectionHeaderPanel = new JPanel();
		productSelectionHeaderPanel.setBackground(new Color(240, 255, 240));
		orderPanel.add(productSelectionHeaderPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_6 = new JLabel("PRODUCT SELECTION");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		productSelectionHeaderPanel.add(lblNewLabel_6);
		
		JPanel productSelectionPanel = new JPanel();
		productSelectionPanel.setBackground(new Color(240, 255, 240));
		orderPanel.add(productSelectionPanel, BorderLayout.CENTER);
		productSelectionPanel.setLayout(new BoxLayout(productSelectionPanel, BoxLayout.X_AXIS));
		
		JTabbedPane JTabbedPastriesPage = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPastriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		productSelectionPanel.add(JTabbedPastriesPage);
		
		JPanel bakedGoodsPanel = new JPanel();
		bakedGoodsPanel.setLayout(null);
		JTabbedPastriesPage.addTab("Baked Goods", null, bakedGoodsPanel, null);
		
		JLabel lblNewLabel_5_1 = new JLabel("Baked Goods");
		lblNewLabel_5_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(104, 11, 89, 22);
		bakedGoodsPanel.add(lblNewLabel_5_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Chocolate Cake Slice");
		chckbxNewCheckBox.setBounds(19, 40, 133, 23);
		bakedGoodsPanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMiniCake = new JCheckBox("Mini Cake");
		chckbxMiniCake.setBounds(19, 66, 133, 23);
		bakedGoodsPanel.add(chckbxMiniCake);
		
		JCheckBox chckbxBrownies = new JCheckBox("Brownies");
		chckbxBrownies.setBounds(19, 92, 133, 23);
		bakedGoodsPanel.add(chckbxBrownies);
		
		JPanel breadAndPastriesPanel = new JPanel();
		breadAndPastriesPanel.setLayout(null);
		JTabbedPastriesPage.addTab("Bread and Pastries", null, breadAndPastriesPanel, null);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Bread and Pastries");
		lblNewLabel_5_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5_1_1.setBounds(84, 11, 132, 22);
		breadAndPastriesPanel.add(lblNewLabel_5_1_1);
		
		JCheckBox chckbxEnsaymada = new JCheckBox("Ensaymada");
		chckbxEnsaymada.setBounds(6, 47, 133, 23);
		breadAndPastriesPanel.add(chckbxEnsaymada);
		
		JCheckBox chckbxCroissant = new JCheckBox("Croissant");
		chckbxCroissant.setBounds(6, 71, 133, 23);
		breadAndPastriesPanel.add(chckbxCroissant);
		
		JCheckBox chckbxPandesal = new JCheckBox("Pandesal");
		chckbxPandesal.setBounds(6, 99, 133, 23);
		breadAndPastriesPanel.add(chckbxPandesal);
		
		JPanel cookiesAndTreatsPanel = new JPanel();
		cookiesAndTreatsPanel.setLayout(null);
		JTabbedPastriesPage.addTab("Cookies and Treats", null, cookiesAndTreatsPanel, null);
		
		JLabel lblNewLabel_5_2 = new JLabel("Cookies and Treats");
		lblNewLabel_5_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(75, 11, 128, 22);
		cookiesAndTreatsPanel.add(lblNewLabel_5_2);
		
		JCheckBox chckbxChocolateChipCookie = new JCheckBox("Chocolate Chip Cookie");
		chckbxChocolateChipCookie.setBounds(17, 40, 133, 23);
		cookiesAndTreatsPanel.add(chckbxChocolateChipCookie);
		
		JCheckBox chckbxOatmealCookie = new JCheckBox("Oatmeal Cookie");
		chckbxOatmealCookie.setBounds(18, 66, 133, 23);
		cookiesAndTreatsPanel.add(chckbxOatmealCookie);
		
		JCheckBox chckbxCrinkles = new JCheckBox("Crinkles");
		chckbxCrinkles.setBounds(20, 96, 133, 23);
		cookiesAndTreatsPanel.add(chckbxCrinkles);
		
		JTabbedPane JTabbedAccessoriesPage = new JTabbedPane(JTabbedPane.TOP);
		JTabbedAccessoriesPage.setBackground(new Color(240, 255, 240));
		JTabbedAccessoriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		productSelectionPanel.add(JTabbedAccessoriesPage);
		
		JPanel accessoriesPanel = new JPanel();
		accessoriesPanel.setLayout(null);
		JTabbedAccessoriesPage.addTab("Accessories", null, accessoriesPanel, null);
		
		JLabel lblNewLabel_5_3 = new JLabel("Accessories");
		lblNewLabel_5_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(31, 11, 77, 22);
		accessoriesPanel.add(lblNewLabel_5_3);
		
		JCheckBox chckbxBirthdayCandleSet = new JCheckBox("Birthday Candle Set");
		chckbxBirthdayCandleSet.setBounds(6, 39, 133, 23);
		accessoriesPanel.add(chckbxBirthdayCandleSet);
		
		JCheckBox chckbxCakeTopper = new JCheckBox("Cake Topper");
		chckbxCakeTopper.setBounds(6, 63, 133, 23);
		accessoriesPanel.add(chckbxCakeTopper);
		
		JCheckBox chckbxCrinkles_1 = new JCheckBox("Crinkles");
		chckbxCrinkles_1.setBounds(6, 92, 133, 23);
		accessoriesPanel.add(chckbxCrinkles_1);
		
		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		flowLayout.setHgap(100);
		orderPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		buttonPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		buttonPanel.add(btnNewButton_1);
		
		JPanel orderSummaryPanel = new JPanel();
		orderSummaryPanel.setPreferredSize(new Dimension(300, 100));
		contentPane.add(orderSummaryPanel, BorderLayout.EAST);
		orderSummaryPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 280, 341);
		orderSummaryPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
}
