package ec.edu.puce;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CrearCliente extends JInternalFrame {
	private JTextField tfCedula;
	private JTextField tfNames;
	private JTextField tfDirection;
	private JTextField tfPhone;
	private JTextField tfEmail;
	private JButton btnCancel;
	private JButton btnSave;
	private JButton btnNew;
	private Cliente cliente;
	
	DefaultTableModel model = new DefaultTableModel();
	private JTable table;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCliente frame = new CrearCliente();
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
	public CrearCliente() {
		setClosable(true);
		setTitle("Clientes");
		setBounds(100, 100, 445, 428);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00E9dula");
		lblNewLabel.setBounds(28, 29, 58, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setBounds(28, 66, 58, 14);
		getContentPane().add(lblNewLabel_1);
		
		tfCedula = new JTextField();
		tfCedula.setBounds(125, 26, 238, 20);
		
		getContentPane().add(tfCedula);
		tfCedula.setColumns(10);
		
		tfNames = new JTextField();
		tfNames.setBounds(125, 63, 238, 20);
		getContentPane().add(tfNames);
		tfNames.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setBounds(28, 102, 58, 14);
		getContentPane().add(lblNewLabel_2);
		
		tfDirection = new JTextField();
		tfDirection.setBounds(125, 94, 238, 20);
		getContentPane().add(tfDirection);
		tfDirection.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tel\u00E9fono");
		lblNewLabel_3.setBounds(28, 139, 58, 14);
		getContentPane().add(lblNewLabel_3);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(125, 136, 238, 20);
		getContentPane().add(tfPhone);
		tfPhone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(28, 182, 52, 14);
		getContentPane().add(lblNewLabel_4);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(125, 179, 238, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		JButton btnNew = new JButton("Nuevo");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNew.setBounds(10, 221, 110, 23);
		getContentPane().add(btnNew);
		
		
		JButton btnSave = new JButton("Agregar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarCliente();
			}
		});
		btnSave.setBounds(157, 221, 110, 23);
		getContentPane().add(btnSave);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(296, 221, 110, 23);
		getContentPane().add(btnCancel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 269, 409, 118);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {"Cédula", "Nombres", "Dirección", "Teléfono", "Email"}
		));
		scrollPane.setViewportView(table);
		
		model = (DefaultTableModel) table.getModel();

	}
	
	private void nuevo() {
		cliente = new Cliente();
		tfCedula.setText(cliente.getCi());
		tfNames.setText(cliente.getName());
		tfDirection.setText(cliente.getDireccion());
		tfPhone.setText(cliente.getTlf());
		tfEmail.setText(cliente.getEmail());
		
	}
	
	private void agregarCliente() {
		cliente = new Cliente();
		cliente.setCi(tfCedula.getText());
		cliente.setName(tfNames.getText());
		cliente.setDireccion(tfDirection.getText());
		cliente.setTlf(tfPhone.getText());
		cliente.setEmail(tfEmail.getText());
		agregarFila();
	}
	
	private void agregarFila() {
		Object[] row = new Object[5];
		row[0] = cliente.getCi();
		row[1] = cliente.getName();
		row[2] = cliente.getDireccion();
		row[3] = cliente.getTlf();
		row[4] = cliente.getEmail();
		model.addRow(row);
	}

		
}
