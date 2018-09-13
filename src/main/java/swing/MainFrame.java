package swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame
{
    private JFrame mainFrame;

    public MainFrame()
    {
        this.initialize();
    }

    private void initialize()
    {
        mainFrame = new JFrame("Swing with MVC Example");
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new FlowLayout());
    }


    public void addContent(JPanel content)
    {
        mainFrame.add(content);
    }
}
