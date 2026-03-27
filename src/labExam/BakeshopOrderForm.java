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
		
		JPanel headerPanelNorth = new JPanel();
		headerPanelNorth.setBackground(new Color(255, 218, 185));
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
		
	}
}
