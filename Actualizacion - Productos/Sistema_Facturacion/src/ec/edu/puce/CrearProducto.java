package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearProducto extends JInternalFrame {
	private JTextField tfCodigo;
	private JTextField tfCantidad;
	private JTextField tfDescripcion;
	private JTextField tfPrecio;
	private JButton btnNuevo;
	private JButton btnAgregar;
	private JButton btnCancelar;
	private JScrollPane scrollPane;
	private JTable table;
	Producto producto = new Producto();
	DefaultTableModel model = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearProducto frame = new CrearProducto();
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
	public CrearProducto() {
		setClosable(true);
		setTitle("Producto");
		setBounds(100, 100, 445, 428);
		getContentPane().setLayout(null);
		
		JLabel lblCedula = new JLabel("C\u00F3digo");
		lblCedula.setBounds(28, 29, 58, 14);
		getContentPane().add(lblCedula);
		
		JLabel lblNombre = new JLabel("Cantidad");
		lblNombre.setBounds(28, 66, 58, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Descripcion");
		lblDireccion.setBounds(28, 102, 58, 14);
		getContentPane().add(lblDireccion);
		
		JLabel lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(28, 141, 58, 14);
		getContentPane().add(lblNewLabel);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(108, 26, 127, 20);
		getContentPane().add(tfCodigo);
		tfCodigo.setColumns(10);
		
		tfCantidad = new JTextField();
		tfCantidad.setBounds(108, 63, 127, 20);
		getContentPane().add(tfCantidad);
		tfCantidad.setColumns(10);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setBounds(108, 99, 281, 20);
		getContentPane().add(tfDescripcion);
		tfDescripcion.setColumns(10);
		
		tfPrecio = new JTextField();
		tfPrecio.setBounds(108, 138, 127, 20);
		getContentPane().add(tfPrecio);
		tfPrecio.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		btnNuevo.setBounds(20, 198, 89, 23);
		getContentPane().add(btnNuevo);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarProducto();
			}
		});
		btnAgregar.setBounds(168, 198, 89, 23);
		getContentPane().add(btnAgregar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(321, 198, 89, 23);
		getContentPane().add(btnCancelar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 247, 390, 140);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Cantidad", "Descripci\u00F3n", "Precio", "Total"
			}
		));
		scrollPane.setViewportView(table);
		model = (DefaultTableModel) table.getModel();
	}
	
	private void nuevo() {
		producto = new Producto();
		tfCodigo.setText(producto.getCodigo());
		tfCantidad.setText(Integer.toString(producto.getCantidad()));
		tfDescripcion.setText(producto.getDescripcion());
		tfPrecio.setText(Float.toString(producto.getPrecio()));
		
	}
	
	private void agregarProducto() {
		producto = new Producto();
		producto.setCodigo(tfCodigo.getText());
		producto.setCantidad(Integer.parseInt(tfCantidad.getText()));
		producto.setDescripcion(tfDescripcion.getText());
		producto.setPrecio(Float.parseFloat(tfPrecio.getText()));
		producto.setTotal(producto.getPrecio()*producto.getPrecio());
		agregarFila();
	}
	
	private void agregarFila() {
		Object[] row = new Object[5];
		row[0] = producto.getCodigo();
		row[1] = producto.getCantidad();
		row[2] = producto.getDescripcion();
		row[3] = producto.getPrecio();
		row[4] = producto.getTotal();
		model.addRow(row);
	}
}
