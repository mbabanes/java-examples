package newWindowApp.view;

import javax.swing.*;

public class MainWindowView
{
    JFrame mainFrame;
    JButton button;



    public MainWindowView()
    {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(null);

        button = new JButton("Nowe okno");
        button.setBounds(10, 10, 100, 50);

        mainFrame.add(button);
        mainFrame.setVisible(true);
    }

    public JButton getButton()
    {
        return button;
    }
}
