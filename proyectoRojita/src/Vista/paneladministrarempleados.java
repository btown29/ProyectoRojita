package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class paneladministrarempleados extends JPanel {


	public JButton boton_buscar;
	public JButton boton_modificar;
	public JButton boton_eliminar;
	public JButton boton_agregar;
	public JButton boton_verregistromensual;
	public JButton boton_opciones;
	
	
	public JTextField camporut;
	public JTextField campocargo;
	public JTextField camponombre;
	public JTextField campotelefono;
	public JTextField campoapellido;
	
	public JDialog dialog;
	
	
	public JPanel panellista;
	public JTable table;
	public DefaultTableModel modelo;
	
	
	public paneladministrarempleados() {


		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(286, 11, 236, 48);
		panel.add(panel_3);
		
		JLabel lblInventario = new JLabel("Empleados");
		panel_3.add(lblInventario);
		lblInventario.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 64, 793, 436);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(10, 11, 775, 136);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblrut = new JLabel("Rut:");
		lblrut.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblrut.setBounds(63, 11, 33, 19);
		panel_5.add(lblrut);
		
		camporut = new JTextField();
		camporut.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		camporut.setBounds(129, 10, 214, 20);
		panel_5.add(camporut);
		camporut.setColumns(10);
		
		JLabel lblNombre = new JLabel("Cargo:");
		lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNombre.setBounds(420, 10, 66, 19);
		panel_5.add(lblNombre);
		
		campocargo = new JTextField();
		campocargo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		campocargo.setColumns(10);
		campocargo.setBounds(496, 9, 214, 20);
		panel_5.add(campocargo);
		
		JLabel lblapellido = new JLabel("Nombre:");
		lblapellido.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblapellido.setBounds(53, 41, 66, 19);
		panel_5.add(lblapellido);
		
		camponombre = new JTextField();
		camponombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		camponombre.setColumns(10);
		camponombre.setBounds(129, 40, 214, 20);
		panel_5.add(camponombre);
		
		campotelefono = new JTextField();
		campotelefono.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		campotelefono.setColumns(10);
		campotelefono.setBounds(496, 40, 214, 20);
		panel_5.add(campotelefono);
		
		JLabel lbltelefono = new JLabel("Telefono:");
		lbltelefono.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lbltelefono.setBounds(420, 40, 66, 19);
		panel_5.add(lbltelefono);
		
		boton_agregar = new JButton("Agregar");
		boton_agregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_agregar.setBackground(Color.LIGHT_GRAY);
		boton_agregar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		boton_agregar.setBounds(63, 102, 102, 23);
		panel_5.add(boton_agregar);
		
		boton_buscar = new JButton("Buscar");
		boton_buscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_buscar.setBackground(Color.LIGHT_GRAY);
		boton_buscar.setBounds(175, 102, 102, 23);
		panel_5.add(boton_buscar);
		boton_buscar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		boton_modificar = new JButton("Modificar");
		boton_modificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_modificar.setBackground(Color.LIGHT_GRAY);
		boton_modificar.setBounds(287, 102, 102, 23);
		panel_5.add(boton_modificar);
		boton_modificar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		boton_eliminar = new JButton("Eliminar");
		boton_eliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_eliminar.setBackground(Color.LIGHT_GRAY);
		boton_eliminar.setBounds(399, 102, 102, 23);
		panel_5.add(boton_eliminar);
		boton_eliminar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		campoapellido = new JTextField();
		campoapellido.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		campoapellido.setColumns(10);
		campoapellido.setBounds(129, 71, 214, 20);
		panel_5.add(campoapellido);
		
		JLabel lblCargo = new JLabel("Apellido:");
		lblCargo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblCargo.setBounds(53, 72, 66, 19);
		panel_5.add(lblCargo);
		
		boton_verregistromensual = new JButton("Ver Registro Mensual");
		boton_verregistromensual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_verregistromensual.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		boton_verregistromensual.setBackground(Color.LIGHT_GRAY);
		boton_verregistromensual.setBounds(511, 102, 189, 23);
		//boton_verregistromensual.addActionListener(this);
		panel_5.add(boton_verregistromensual);
		
		boton_opciones = new JButton("Opciones");
		boton_opciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_opciones.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		boton_opciones.setBackground(Color.LIGHT_GRAY);
		boton_opciones.setBounds(511, 102, 189, 23);

		panellista = new JPanel();
		panellista.setBounds(10, 152, 775, 273);
		panellista.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panellista.add(scrollPane, BorderLayout.CENTER);
		panellista.add(boton_opciones, BorderLayout.SOUTH);
		panel_4.add(panellista);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Rut", "Nombre", "Apellido", "Cargo", "Telefono"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

	}
}
