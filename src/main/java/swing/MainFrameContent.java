package swing;

import javax.swing.*;

public class MainFrameContent
{
    private JPanel mainFrameContent;

    public MainFrameContent()
    {
        this.initialize();
    }


    private void initialize()
    {
        mainFrameContent = new JPanel();
        mainFrameContent.setLayout(new BoxLayout(mainFrameContent, BoxLayout.Y_AXIS));

    }

    public JPanel getMainFrameContent()
    {
        return mainFrameContent;
    }

    public void add(JPanel jPanel)
    {
        mainFrameContent.add(jPanel);
    }

}
