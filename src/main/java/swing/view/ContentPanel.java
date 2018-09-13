package swing.view;

import javax.swing.*;

public class ContentPanel
{
    private JPanel content;

    public ContentPanel()
    {
        initialize();
    }

    private void initialize()
    {
        content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.X_AXIS));
    }


    public void setContent(JPanel content)
    {
        this.content.removeAll();
        this.content.add(content);
        this.content.updateUI();
    }

    public JPanel getContent()
    {
        return content;
    }
}
