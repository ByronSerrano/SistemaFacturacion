package ec.edu.puce;

import java.awt.EventQueue;
import java.awt.print.PrinterException;
import java.util.Objects;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaCliente extends JInternalFrame {
	private JTable tablaCliente;
	Cliente cliente;
	DefaultTableModel datatitle = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaCliente frame = new ListaCliente();
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
	public ListaCliente() {
		setClosable(true);
		setTitle("Lista de Clientes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		tablaCliente = new JTable(datosRow, nombresCol);
		tablaCliente.setBounds(10, 96, 408, 16);
		getContentPane().add(tablaCliente);
		
	}
	private String [] nombresCol = {"Nombre", "Email", "Cedula"};
	private String [][] datosRow = {
			{"Byron Serrano", "bsantyserrano@gmail.com", "1350061782"}
	};
}
