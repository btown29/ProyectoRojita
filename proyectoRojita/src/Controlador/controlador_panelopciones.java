package Controlador;

import Vista.panelopciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.controlador_graficos;

public class controlador_panelopciones implements ActionListener {
	
	
	panelopciones opcion;
	
	public controlador_panelopciones(panelopciones opcion) {

		this.opcion = opcion;
		opcion.graficos.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == opcion.graficos) {
			// Falta por implementar
			controlador_graficos.graficoPie("ejemplo1", 30);
			controlador_graficos.graficoBarra("ejemplo2", 30);
			
		}
		if(e.getSource() == opcion.salir) {
			// Falta por implementar
			
			
		}
		
	}

}
