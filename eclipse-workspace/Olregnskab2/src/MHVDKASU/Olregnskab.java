package MHVDKASU;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Olregnskab {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Olregnskab window = new Olregnskab();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Olregnskab() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 543, 88);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		//panel 1 overskrift og tilf�j g�st knap
		JLabel lblRegnskab = new JLabel("Regnskab");
		lblRegnskab.setForeground(Color.WHITE);
		lblRegnskab.setBounds(206, 11, 170, 32);
		lblRegnskab.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblRegnskab);
		
		JButton btnNewButton = new JButton("Tilf\u00F8j g\u00E6st");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("tilf�jet");
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Navn"});
			}
		});
		btnNewButton.setBounds(51, 54, 443, 23);
		panel.add(btnNewButton);
		//panel 2 med tabellen med info omkring kunderne
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 87, 543, 299);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.BLACK);
		table.setForeground(Color.WHITE);
		table.setBounds(10, 29, 513, 259);
		panel_1.add(table);
		
		//labels til kolloner
		JLabel lbll = new JLabel("\u00D8l");
		lbll.setForeground(Color.WHITE);
		lbll.setBounds(115, 11, 46, 14);
		panel_1.add(lbll);
		
		JLabel lblVin = new JLabel("Vin");
		lblVin.setForeground(Color.WHITE);
		lblVin.setBounds(216, 11, 46, 14);
		panel_1.add(lblVin);
		
		JLabel lblSpiritus = new JLabel("Spiritus");
		lblSpiritus.setForeground(Color.WHITE);
		lblSpiritus.setBounds(320, 11, 46, 14);
		panel_1.add(lblSpiritus);
		
		JLabel lblVand = new JLabel("Vand");
		lblVand.setForeground(Color.WHITE);
		lblVand.setBounds(425, 11, 46, 14);
		panel_1.add(lblVand);
		
		JLabel lblNavn = new JLabel("Navn");
		lblNavn.setForeground(Color.WHITE);
		lblNavn.setBounds(10, 11, 46, 14);
		panel_1.add(lblNavn);
		// panel 3 med knappen til at generere et regnskab til at kunne se hvad folk skal af med
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 387, 543, 99);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Lav Regning");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(106, 5, 326, 62);
		panel_2.add(btnNewButton_1);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		//tilf�je kolonner til tabellen
		model.addColumn("Navn");
		model.addColumn("�l");
		model.addColumn("Vin");
		model.addColumn("Spiritus");
		model.addColumn("Vand");
	}
}
