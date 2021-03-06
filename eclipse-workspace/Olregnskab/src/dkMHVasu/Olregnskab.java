package dkMHVasu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;

public class Olregnskab extends JFrame {

	private JPanel contentPane;
	private JTextField txtKr;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Olregnskab frame = new Olregnskab();
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
	public Olregnskab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 586, 87);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		
		JLabel lblRegnskab = DefaultComponentFactory.getInstance().createTitle("Regnskab");
		lblRegnskab.setForeground(Color.WHITE);
		lblRegnskab.setFont(new Font("Trajan Pro 3", Font.PLAIN, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(208)
							.addComponent(lblRegnskab)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblRegnskab)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		
		JButton btnTilfjGst = new JButton("Tilf\u00F8j G\u00E6st");
		btnTilfjGst.addMouseListener(new MouseAdapter() {
			@Override
			//click p� knap action
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("tilf�jet");
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addColumn("Navn");
				//model.addRow(new Object[] {"Navn"});
			}
		});
		btnTilfjGst.setForeground(Color.WHITE);
		btnTilfjGst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//skal tilf�je en g�st mere og s�tte nogle 
				// nye �l vin og spiritus op
			}
		});
		btnTilfjGst.setBackground(Color.BLACK);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(62)
					.addComponent(btnTilfjGst, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnTilfjGst, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(106, 92, 519, 364);
		panel_3.setBackground(Color.BLACK);
		contentPane.add(panel_3);
		
		JButton btnl = new JButton("\u00D8l \u00E1 20 kr");
		btnl.addMouseListener(new MouseAdapter() {
			//�l knap click event
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("�l");
			}
		});
		
		JButton btnNewButton = new JButton("Vin \u00E1 25 kr ");
		btnNewButton.addMouseListener(new MouseAdapter() {
			//vin knap event
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("vin");
			}
		});

		JButton btnShots = new JButton("Shots \u00E1 10 kr");
		btnShots.addMouseListener(new MouseAdapter() {
			//shots knap event
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("shots");

			}
		});
		
		JButton btnDrinks = new JButton("Drinks \u00E1 40 kr");
		btnDrinks.addMouseListener(new MouseAdapter() {
			@Override
			//drinks knap event
			public void mouseClicked(MouseEvent e) {
				System.out.println("drink");
			}
		});
		
		JSeparator separator = new JSeparator();
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("85px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("84px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("96px"),
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("100px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("36px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("2px"),}));
		panel_3.add(btnl, "2, 2");
		panel_3.add(btnNewButton, "4, 2");
		panel_3.add(btnShots, "6, 2");
		panel_3.add(btnDrinks, "8, 2");
		panel_3.add(separator, "2, 4, 7, 1");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(525, 92, 66, 364);
		panel_4.setBackground(Color.BLACK);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("I Alt");
		lblNewLabel.setForeground(Color.WHITE);
		
		JSeparator separator_1 = new JSeparator();
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("66px"),},
			new RowSpec[] {
				RowSpec.decode("16px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("2px"),}));
		
		txtKr = new JTextField();
		txtKr.setText("10 kr");
		txtKr.setColumns(10);
		panel_4.add(txtKr, "1, 3, fill, top");
		panel_4.add(lblNewLabel, "1, 1, right, top");
		panel_4.add(separator_1, "1, 5, fill, top");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(5, 92, 100, 364);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(6, 6, 88, 352);
		panel_5.add(table_1);
	}
}
