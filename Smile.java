import java.awt.*;
import javax.swing.*;

public class Smile extends JPanel {

  public void paintComponent(Graphics g) {
    g.setColor(Color.yellow);
    g.fillRect(0, 0, getWidth(), getHeight());
    g.setColor(Color.black);
    g.fillOval(getWidth()/20, getHeight()/20, 
        getWidth()/2, getHeight()/2);
    g.setColor(Color.black);
    g.fillOval(getWidth()/2, getHeight()/2, 
        getWidth()/2, getHeight()/2);
    }

  public static void main(String args[]) {
    JFrame frame = new JFrame("Smile");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Smile panel = new Smile();
    
    frame.add(panel);

    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}