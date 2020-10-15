
package TrazoFigura;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Figuras extends JPanel{    
    private JFrame ventana;
  private Container contenedor;
        public  Figuras(){
        // inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(870, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
             //rectangulos
        g.setColor(Color.MAGENTA);
         g.drawRect(10, 5, 250, 200);
          g.drawRect(280, 5, 250, 200);
           g.drawRect(550, 5, 250, 200);
           g.drawRect(10, 230, 250, 200);
         g.drawRect(280,  230, 250, 200);
           g.drawRect(550, 230, 250, 200);
         
           g.setColor(Color.red);
        g.drawLine(131, 31, 41, 81);
        g.drawLine(131, 31, 211,81);
        g.drawLine(41, 81, 211, 81);
        g.drawLine(211, 81, 211, 131);
        g.drawLine(41, 81, 41, 131);
        g.drawLine(41, 131, 211, 131);
        g.drawLine(70, 100, 100, 100);
        g.drawLine(70, 100, 70, 130);
        g.drawLine(100, 100, 100, 130);
        g.drawLine(70, 130, 60, 150);
        g.drawLine(100, 130, 90, 150);
        g.setColor(Color.red);
         g.drawString("Dibujado de lineas", 76, 200);
       //trazo de rectangulos
        g.setColor(Color.red);
        g.drawRect(320, 120, 15, 50);
        g.drawRect(345, 100, 15, 70);
        g.drawRect(370, 80, 15, 90);
        g.drawRect(395, 60, 15, 110);
        g.drawRect(420, 40, 15, 130);
        g.setColor(Color.red);
        g.drawString("Dibujando rectangulos", 316, 200);
         //trazo de circulos
        g.setColor(Color.red);
        g.drawOval(60, 250, 150, 150);
       // g.fillOval(100, 290, 50, 50);
       g.drawOval(110, 315, 50, 50);
       g.drawOval(90, 275, 30, 30);
       g.drawOval(150, 275, 30, 30);
       g.fillOval(100, 285, 10, 10);
       g.fillOval(160, 285, 10, 10);
           g.setColor(Color.red);
       g.drawString("Dibujando circulos", 76, 425);
        //dibujando ovalos con rectangulos
        g.setColor(Color.red);
        g.drawRoundRect(618, 35, 85, 40, 140, 140);
        g.drawRoundRect(585, 60, 160, 50, 160, 160);
        g.drawOval(644, 19, 35, 125);
        g.drawString("Dibujado de ovalos rectangulos", 575, 190);
    //trazo de ovalos(circunferencia)
        g.setColor(Color.red);
        g.drawOval(310, 300, 180, 55);
        g.drawOval(380,260,35,150);
        g.drawOval(350, 280, 100, 40);
        g.drawString("Dibujado ovalos con circulos", 320, 420);
       //triangulos
        g.setColor(Color.red);
        g.drawLine(570, 320, 630, 320);
        g.drawLine(570, 320, 570, 250);
        g.drawLine(630, 320, 570, 250);
      
         g.drawLine(670, 350, 570, 400);
        g.drawLine(670, 350, 710, 400);
        g.drawLine(570, 400, 710, 400);
         g.drawString("Dibujando triangulos", 620, 420);
    }
    
}

