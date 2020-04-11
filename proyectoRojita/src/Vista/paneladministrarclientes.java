package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class paneladministrarclientes extends JPanel {
	
	public JButton boton_buscar;
	public JTextField camporut;
	public JTextField camponombre;
	public JTextField campoapellido;
	public JTextField campotelefono;
	public JPanel panellista;
	public JTable table;
	public JButton btnModificar;

	
	public paneladministrarclientes() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(286, 11, 236, 48);
		panel.add(panel_3);
		
		JLabel lblInventario = new JLabel("Clientes");
		panel_3.add(lblInventario);
		lblInventario.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 81, 793, 419);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(10, 11, 775, 71);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblrut = new JLabel("Rut:");
		lblrut.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblrut.setBounds(30, 11, 66, 19);
		panel_5.add(lblrut);
		
		camporut = new JTextField();
		camporut.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		camporut.setBounds(96, 10, 214, 20);
		panel_5.add(camporut);
		camporut.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNombre.setBounds(320, 11, 66, 19);
		panel_5.add(lblNombre);
		
		camponombre = new JTextField();
		camponombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		camponombre.setColumns(10);
		camponombre.setBounds(396, 10, 214, 20);
		panel_5.add(camponombre);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblapellido.setBounds(30, 41, 56, 19);
		panel_5.add(lblapellido);
		
		campoapellido = new JTextField();
		campoapellido.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		campoapellido.setColumns(10);
		campoapellido.setBounds(96, 40, 214, 20);
		panel_5.add(campoapellido);
		
		campotelefono = new JTextField();
		campotelefono.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		campotelefono.setColumns(10);
		campotelefono.setBounds(396, 41, 214, 20);
		panel_5.add(campotelefono);
		
		JLabel lbltelefono = new JLabel("Telefono:");
		lbltelefono.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lbltelefono.setBounds(320, 41, 66, 19);
		panel_5.add(lbltelefono);
		
		boton_buscar = new JButton("Buscar");
		boton_buscar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		boton_buscar.setBounds(647, 39, 102, 23);
		panel_5.add(boton_buscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnModificar.setBounds(647, 9, 102, 23);
		panel_5.add(btnModificar);
		
		panellista = new JPanel();
		panellista.setBounds(10, 93, 775, 315);
		panel_4.add(panellista);
		panellista.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panellista.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Rut", "Nombre", "Apellido", "Telefono"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

	}
}
