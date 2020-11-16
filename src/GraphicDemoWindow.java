import javax.swing.*;
import java.awt.*;

public class GraphicDemoWindow extends JFrame
{

    private GraphicsPane myPane;

    public GraphicDemoWindow()
    {
        super("Graphic Demo!");
        setSize(600,600);
        getContentPane().setLayout(new GridLayout(1,1));
        myPane = new GraphicsPane();
        getContentPane().add(myPane);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quit when we close the window.
        setVisible(true);

    }


}
