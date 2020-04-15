package Vista;
import Controlador.controlador_graficos;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Dialog;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class panelopciones extends JPanel {

	public controlador_graficos controlador_graficos;
	
	public JRadioButton consulta1;
	public JRadioButton consulta2;
	public JButton boton_modificar;
	public JButton graficos;
	public JButton salir;
	public JTable table;
	public DefaultTableModel modelo;
	public JTable table_1;
	
	
	public panelopciones() {
		
		
		String query1 = "Número de cargos por empleados";
		String query2 = "El empleado del mes"; 
				
		JRadioButton consulta1 = new JRadioButton(query1);
		consulta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		consulta1.setBackground(Color.LIGHT_GRAY);
		consulta1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		//consulta1.setBounds(63, 102, 102, 23);
		
		JRadioButton consulta2 = new JRadioButton(query2);
		consulta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		consulta2.setBackground(Color.LIGHT_GRAY);
		consulta2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		//consulta2.setBounds(90, 102, 122, 23);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		JButton graficos = new JButton("Gráficos");
		JButton salir = new JButton("Salir");
		
		panel2.add(graficos,BorderLayout.WEST);
		panel2.add(salir,BorderLayout.EAST);
		
		
		
		
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(consulta1);
        bgroup.add(consulta2);
        JPanel panelBotones = new JPanel();

        panelBotones.setLayout(new GridLayout(2,0));
        panelBotones.add(consulta1);
        panelBotones.add(consulta2);
        JLabel lblNewLabel = new JLabel("Opciones Avanzadas");
		panel.add(lblNewLabel);
		
		panel_1.add(panelBotones, BorderLayout.WEST);
		JScrollPane scrollPane = new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(table);
		
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		panel_1.add(panel2, BorderLayout.SOUTH);
		
	}
}
