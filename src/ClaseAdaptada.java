    
    import java.awt.*;
import javax.swing.*;


public class ClaseAdaptada extends JPanel {
 
public ClaseAdaptada() {
super();
}
 
@Override
public void paintComponent(Graphics g)
{
  Dimension tam = getSize();
  ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("images/comojugar_diaria.jpg")).getImage());
  g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
  setOpaque(false);
  super.paintComponent(g);
 }
}