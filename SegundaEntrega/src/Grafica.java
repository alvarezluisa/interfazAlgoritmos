/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author sala_b
 */
public class Grafica extends JFrame{

    JPanel panel;
    public Grafica(){
        setTitle("Clases que se cierran");
        setSize(800,600);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        init();
    }
 
    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset defaultpiedataset = new DefaultPieDataset();
        defaultpiedataset.setValue("Abiertas 81%", new Double(81D));
        defaultpiedataset.setValue("Cerradas 19%", new Double(19D));
//        defaultpiedataset.setValue("Hacking", new Double(19.5D));
//        defaultpiedataset.setValue("SEO", new Double(30.5D));
//        defaultpiedataset.setValue("Redes", new Double(2.0D));
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("Materias con insuficientes cupos", defaultpiedataset, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
        pieplot3d.setDepthFactor(0.5);
        pieplot3d.setStartAngle(290D);
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F);
        
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    
//    public static void main(String args[]){
//        new Grafica().setVisible(true);
//    }
    
}
