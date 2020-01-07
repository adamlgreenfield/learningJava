import javax.swing.*;
import java.awt.*;

public class Frame
{
    public static void main( String [] args )
    {
        Frame613 f = new Frame613();
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setVisible(true);
    }
}

class Frame613 extends JFrame
{
    public Frame613()
    {
        setTitle("613 rocks!");
        setSize(300, 200);
        setLocation(100, 200);

        Panel613 panel = new Panel613();
        Container cp = getContentPane();
        cp.add(panel);
    }
}

class Panel613 extends JPanel
{
    public void paintComponet( Graphics g )
    {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.drawString("Hi",75,100);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.red);
        g.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);
        
    }
}