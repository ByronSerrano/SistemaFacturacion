package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class MenuPrincipal extends JFrame {

	private JPanel contenedor;
	private JDesktopPane panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Sistema de Facturaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 516);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("OCR A Extended", Font.BOLD, 13));
		menuBar.setBackground(new Color(255, 121, 121));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sistema");
		mnNewMenu.setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		mnNewMenu_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Crear Cliente");
		CrearCliente crearCliente = new CrearCliente();
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (crearCliente.isVisible() == false) {
				panel.add(crearCliente);
				crearCliente.setVisible(true);
				Dimension desktopSize = panel.getSize();
		        Dimension FrameSize = crearCliente.getSize();
		        crearCliente.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
		        crearCliente.show();
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lista de Clientes");		
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		
		JMenu mnNewMenu_2 = new JMenu("Productos");
		mnNewMenu_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Agregar Producto");
		CrearProducto crearProducto = new CrearProducto();
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (crearProducto.isVisible() == false) {
					panel.add(crearProducto);
					crearProducto.setVisible(true);
					Dimension desktopSize = panel.getSize();
			        Dimension FrameSize = crearProducto.getSize();
			        crearProducto.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
			        crearProducto.show();
					}
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Redes Sociales");
		mnNewMenu_3.setFont(new Font("Segoe UI Symbol", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Facebook");
		mntmNewMenuItem_3.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/facebook_chiqui.png")));
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Instagram");
		mntmNewMenuItem_4.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/instagram.png")));
		mnNewMenu_3.add(mntmNewMenuItem_4);
		contenedor = new JPanel();
		contenedor.setToolTipText("");
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		panel = new JDesktopPane();
		panel.setBackground(new Color(162, 196, 251));
		contenedor.add(panel, "name_433212790685800");
		panel.setLayout(null);
	}
}
