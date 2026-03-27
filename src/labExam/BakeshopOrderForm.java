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

public class BakeshopOrderForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//---------- HEADER ------------
		JPanel headerPanelNorth = new JPanel();
		headerPanelNorth.setBackground(new Color(255, 218, 185));
		headerPanelNorth.setPreferredSize(new Dimension(100, 120));
		contentPane.add(headerPanelNorth, BorderLayout.NORTH);
		headerPanelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BakeshopOrderForm.class.getResource("/labExam/Pastry1.png")));
		headerPanelNorth.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Losamia Pastry");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 50));
		headerPanelNorth.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(BakeshopOrderForm.class.getResource("/labExam/croissant.png")));
		headerPanelNorth.add(lblNewLabel_1);
		
		//---------- CUSTOMER INFO PANEL ------------
		JPanel InfoPanel = new JPanel();
		InfoPanel.setBackground(new Color(255, 228, 181));
		contentPane.add(InfoPanel, BorderLayout.CENTER);
		InfoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel customerInfoPanel = new JPanel();
		customerInfoPanel.setPreferredSize(new Dimension(100, 200));
		InfoPanel.add(customerInfoPanel, BorderLayout.NORTH);
		customerInfoPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER INFORMATION");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 0, 267, 39);
		customerInfoPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 35, 46, 14);
		customerInfoPanel.add(lblNewLabel_3);
		
		
	}
}
