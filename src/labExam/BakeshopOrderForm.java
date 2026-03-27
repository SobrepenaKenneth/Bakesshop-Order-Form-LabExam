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

public class BakeshopOrderForm extends JFrame {

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
		setBounds(100, 100, 887, 600);
		
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
		lblNewLabel_2.setBounds(10, 107, 267, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 145, 59, 21);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(75, 148, 196, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 177, 59, 21);
		contentPane.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 177, 196, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("ORDER TYPE");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(689, 99, 130, 39);
		contentPane.add(lblNewLabel_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pickup");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(689, 143, 71, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Delivery");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(689, 172, 85, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(BakeshopOrderForm.class.getResource("/labExam/delivery (1).png")));
		lblNewLabel_4.setBounds(783, 145, 50, 50);
		contentPane.add(lblNewLabel_4);
		
		JTabbedPane JTabbedPastriesPage = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPastriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		JTabbedPastriesPage.setBounds(10, 230, 383, 208);
		contentPane.add(JTabbedPastriesPage);
		
		JPanel bakedGoodsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Baked Goods", null, bakedGoodsPanel, null);
		bakedGoodsPanel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Baked Goods");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_5.setBounds(144, 11, 89, 22);
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
		
		JPanel cookiesAndTreatsPanel = new JPanel();
		JTabbedPastriesPage.addTab("Cookies and Treats", null, cookiesAndTreatsPanel, null);
		cookiesAndTreatsPanel.setLayout(null);
		
		JTabbedPane JTabbedAccessoriesPage = new JTabbedPane(JTabbedPane.TOP);
		JTabbedAccessoriesPage.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		JTabbedAccessoriesPage.setBounds(425, 230, 326, 214);
		contentPane.add(JTabbedAccessoriesPage);
		
		JPanel accessoriesPanel = new JPanel();
		JTabbedAccessoriesPage.addTab("Accessories", null, accessoriesPanel, null);
		accessoriesPanel.setLayout(null);
		
		
	}
}
