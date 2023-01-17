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

public class CrearCliente extends JInternalFrame {
	private JTextField tfCedula;
	private JTextField tfNames;
	private JTextField tfDirection;
	private JTextField tfPhone;
	private JTextField tfEmail;
	private JButton btnCancel;
	
	Cliente cliente = new Cliente();
	DefaultTableModel defaultTable = new DefaultTableModel();
	private JTable tablaCliente;
	
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
		tfCedula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setCi(tfCedula.getText());
			}
		});
		getContentPane().add(tfCedula);
		tfCedula.setColumns(10);
		
		tfNames = new JTextField();
		tfNames.setBounds(125, 63, 238, 20);
		tfNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setName(tfNames.getText());
			}
		});
		getContentPane().add(tfNames);
		tfNames.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setBounds(28, 102, 58, 14);
		getContentPane().add(lblNewLabel_2);
		
		tfDirection = new JTextField();
		tfDirection.setBounds(125, 94, 238, 20);
		tfDirection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setDireccion(tfDirection.getText());
			}
		});
		getContentPane().add(tfDirection);
		tfDirection.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tel\u00E9fono");
		lblNewLabel_3.setBounds(28, 139, 58, 14);
		getContentPane().add(lblNewLabel_3);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(125, 136, 238, 20);
		tfPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setTlf(tfPhone.getText());
			}
		});
		getContentPane().add(tfPhone);
		tfPhone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(28, 182, 52, 14);
		getContentPane().add(lblNewLabel_4);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(125, 179, 238, 20);
		tfEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setEmail(tfEmail.getText());
				
			}
		});
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		JButton btnNew = new JButton("Nuevo");
		btnNew.setBounds(10, 221, 110, 23);
        btnNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfCedula.setText(" ");
                tfNames.setText(" ");
                tfDirection.setText(" ");
                tfPhone.setText(" ");
                tfEmail.setText(" ");
            }});
		getContentPane().add(btnNew);
		
		
		JButton btnSave = new JButton("Guardar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String datosCol [] = {"Cedula", "Nombres", "Direccion", "Telefono", "Email"};
		        String datosRow [][] = new String [5][5];
                datosRow[0][0] = tfCedula.getText();
                datosRow[0][1] = tfNames.getText();
                datosRow[0][2] = tfDirection.getText();
                datosRow[0][3] = tfPhone.getText();
                datosRow[0][4] = tfEmail.getText();
                defaultTable = new DefaultTableModel(datosRow, datosCol);
                tablaCliente.setModel(new DefaultTableModel(datosRow, datosCol));
			}
		});
		btnSave.setBounds(157, 221, 110, 23);
		getContentPane().add(btnSave);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(296, 221, 110, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(btnCancel);
		
		tablaCliente = new JTable();
		tablaCliente.setBounds(28, 266, 378, 121);
		getContentPane().add(tablaCliente);
		
		
		
		
		

	}
}
