package swing.view;

import javax.swing.*;

public class MenuPanel
{
    private JPanel menuJPanel;
    private JButton form1Button;
    private JButton form2Button;

    public MenuPanel()
    {
        this.initialize();
    }

    private void initialize()
    {
        form1Button = new JButton("Form 1");
        form2Button = new JButton("Form 2");
        menuJPanel = new JPanel();

        menuJPanel.setLayout(new BoxLayout(menuJPanel, BoxLayout.X_AXIS));
        menuJPanel.add(form1Button);
        menuJPanel.add(form2Button);
    }


    public JPanel getMenuJPanel()
    {
        return menuJPanel;
    }

    public JButton getForm1Button()
    {
        return form1Button;
    }

    public JButton getForm2Button()
    {
        return form2Button;
    }
}


