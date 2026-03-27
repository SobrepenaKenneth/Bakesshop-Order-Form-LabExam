package labExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;

public class BakeshopOrderForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BakeshopOrderForm frame = new BakeshopOrderForm();
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
	public BakeshopOrderForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 522);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BakeshopOrderForm.class.getResource("/labExam/Pastry1.png")));
		lblNewLabel.setBounds(126, 11, 85, 88);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Losamia Pastry");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 50));
		lblNewLabel_1_1.setBounds(231, 27, 393, 67);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(BakeshopOrderForm.class.getResource("/labExam/croissant.png")));
		lblNewLabel_1.setBounds(642, 23, 92, 69);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER INFORMATION");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 128, 267, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 166, 59, 21);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(75, 169, 196, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 198, 59, 21);
		contentPane.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 198, 196, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("ORDER TYPE");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(590, 123, 130, 39);
		contentPane.add(lblNewLabel_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pickup");
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(590, 167, 71, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Delivery");
		buttonGroup_2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(590, 196, 85, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(BakeshopOrderForm.class.getResource("/labExam/delivery (1).png")));
		lblNewLabel_4.setBounds(684, 169, 50, 50);
		contentPane.add(lblNewLabel_4);
		
		JTabbedPane JTabbedPastriesPage = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPastriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		JTabbedPastriesPage.setBounds(10, 230, 353, 208);
		contentPane.add(JTabbedPastriesPage);
		
		JPanel bakedGoodsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Baked Goods", null, bakedGoodsPanel, null);
		bakedGoodsPanel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Baked Goods");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5.setBounds(104, 11, 89, 22);
		bakedGoodsPanel.add(lblNewLabel_5);
		
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
		JTabbedPastriesPage.addTab("Bread and Pastries", null, breadAndPastriesPanel, null);
		breadAndPastriesPanel.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("Bread and Pastries");
		lblNewLabel_5_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(84, 11, 132, 22);
		breadAndPastriesPanel.add(lblNewLabel_5_1);
		
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
		JTabbedPastriesPage.addTab("Cookies and Treats", null, cookiesAndTreatsPanel, null);
		cookiesAndTreatsPanel.setLayout(null);
		
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
		JTabbedAccessoriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		JTabbedAccessoriesPage.setBounds(373, 230, 156, 214);
		contentPane.add(JTabbedAccessoriesPage);
		
		JPanel accessoriesPanel = new JPanel();
		JTabbedAccessoriesPage.addTab("Accessories", null, accessoriesPanel, null);
		accessoriesPanel.setLayout(null);
		
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
		
		JLabel lblNewLabel_2_2 = new JLabel("---- Order Page ----");
		lblNewLabel_2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(342, 83, 187, 39);
		contentPane.add(lblNewLabel_2_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Per Piece");
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_1.setBounds(543, 303, 107, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Per Dozen");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBounds(543, 274, 107, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ORDER UNIT");
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(543, 230, 130, 39);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Payment Method");
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1.setBounds(543, 329, 177, 39);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Cash");
		buttonGroup.add(rdbtnNewRadioButton_2_1);
		rdbtnNewRadioButton_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_1.setBounds(543, 372, 107, 23);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("GCash");
		buttonGroup.add(rdbtnNewRadioButton_1_1_1);
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_1_1.setBounds(543, 401, 107, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Credit Card");
		buttonGroup.add(rdbtnNewRadioButton_1_1_1_1);
		rdbtnNewRadioButton_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_1_1_1.setBounds(543, 427, 107, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(761, 120, 260, 352);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 46, 215, 257);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
	}
}
