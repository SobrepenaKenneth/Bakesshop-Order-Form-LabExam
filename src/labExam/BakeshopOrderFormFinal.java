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
import java.awt.GridLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class BakeshopOrderFormFinal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		rdbtnPickup.setBounds(6, 31, 71, 29);
		rdbtnPickup.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		oderTypePanel.add(rdbtnPickup);
		
		JRadioButton rdbtnDelivery = new JRadioButton("Delivery");
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
		rdbtnPerPiece.setBounds(6, 73, 89, 29);
		rdbtnPerPiece.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		orderUnitPanel.add(rdbtnPerPiece);
		
		JRadioButton rdbtnPerDozen = new JRadioButton("Per Dozen");
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
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblOrderForm = new JLabel("---- Order Form -----");
		lblOrderForm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		southPanel.add(lblOrderForm);
		
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
		lblChocolateCakeSliceImg.setIcon(new ImageIcon(BakeshopOrderFormFinal.class.getResource("/labExam/croissant.png")));
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
		
		JPanel cookiesAndTreatsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Cookies and Treats", null, cookiesAndTreatsPanel, null);
		
		JPanel accessoriesPanel = new JPanel();
		JTabbedPastriesPage.addTab("Accessories", null, accessoriesPanel, null);
		
		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		buttonPanel.setPreferredSize(new Dimension(0, 60));
		flowLayout.setHgap(50);
		centerPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		JButton btnSubmitOrder = new JButton("SUBMIT ORDER");
		btnSubmitOrder.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		buttonPanel.add(btnSubmitOrder);
		
		JButton btnClearOrder = new JButton("CLEAR ORDER");
		btnClearOrder.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		buttonPanel.add(btnClearOrder);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(300, 100));
		contentPane.add(eastPanel, BorderLayout.EAST);
		eastPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		eastPanel.add(panel, BorderLayout.NORTH);
		
		JLabel lblProductSelection_1 = new JLabel("ORDER SUMMARY");
		lblProductSelection_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblProductSelection_1);

	}
}
