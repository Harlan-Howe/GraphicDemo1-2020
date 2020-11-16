import javax.swing.*;
import java.awt.*;

public class GraphicsPane extends JPanel
{

    public GraphicsPane()
    {
        super();
        setBackground(Color.gray);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(new Color(200,64,255));
        g.fillOval(30,50,80,20);

        g.setColor(Color.YELLOW);
        g.drawRect(100,300,50,50);

    }


}
