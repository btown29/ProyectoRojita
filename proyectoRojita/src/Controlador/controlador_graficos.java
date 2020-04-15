package Controlador;
	
	import java.awt.BorderLayout;

	import javax.swing.JFrame;
	import javax.swing.JPanel;

	import org.jfree.chart.ChartFactory;
	import org.jfree.chart.ChartPanel;
	import org.jfree.chart.JFreeChart;
	import org.jfree.chart.plot.PlotOrientation;
	import org.jfree.data.xy.XYSeries;
	import org.jfree.data.xy.XYSeriesCollection;
	import org.jfree.chart.ChartFactory;
	import org.jfree.chart.ChartUtilities;
	import org.jfree.chart.JFreeChart;
	import org.jfree.chart.JFreeChart;
	import org.jfree.chart.plot.*;
	import org.jfree.data.category.DefaultCategoryDataset;
	import org.jfree.data.general.DefaultPieDataset;
	import java.io.*;
	public class controlador_graficos {
		
		public controlador_graficos() {
			
		}
	    
	    
	    public static DefaultPieDataset graficoPie(String titulo, int numero){
	        
	        DefaultPieDataset grafico = new DefaultPieDataset();
	        try{
	        OutputStream out = OutputStream.nullOutputStream();
	        grafico.setValue(titulo + String.valueOf(numero), numero);
	        grafico.setValue(titulo + String.valueOf(numero + 2), numero + 2);
	        
	        JFreeChart cha = ChartFactory.createPieChart3D("Etapas", grafico, true, true, true);
	        ChartPanel cp = new ChartPanel(cha);
	        JFrame frame = new JFrame("Grafico");
	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());
	        panel.add(cp);
	        frame.add(panel);
	        frame.pack();
	        frame.setVisible(true);
	        
	        return grafico;
	        }
	        catch(Exception ex){
	        return grafico;
	        }
	    }
	    public static DefaultCategoryDataset graficoBarra(String titulo, int numero){
	        
	        DefaultCategoryDataset dcs = new DefaultCategoryDataset();

	        try{
	            dcs.setValue(10, "numero", "ejemplo");
	            dcs.setValue(30, "obtengo", "final");
	            dcs.setValue(50,"direcci�n","resultado");
	        OutputStream out = OutputStream.nullOutputStream();
	        
	        JFreeChart cha = ChartFactory.createBarChart3D("Etapas", "numero", "salida",dcs,PlotOrientation.VERTICAL, true, true,false);
	        ChartPanel cp = new ChartPanel(cha);
	        JFrame frame = new JFrame("Grafico");
	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());
	        panel.add(cp);
	        frame.add(panel);
	        frame.pack();
	        frame.setVisible(true);
	        
	        return dcs;
	        }
	        catch(Exception ex){
	        return dcs;
	        }
	    }
	}

