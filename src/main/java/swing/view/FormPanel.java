package swing.view;

import javax.swing.*;

public class FormPanel
{
    private JPanel formContent;
    private JLabel titleLabel;
    private JLabel nameLabel;
    private JTextField nameTextField;

    private JButton saveButton;

    public FormPanel()
    {
        this.initialize();
    }

    private void initialize()
    {
        formContent = new JPanel();

        titleLabel = new JLabel("Form 1");

        nameLabel = new JLabel("Nazwisko");
        nameTextField = new JTextField();

        saveButton = new JButton("Zatwierdź");

        formContent.setLayout(new BoxLayout(formContent,BoxLayout.Y_AXIS) );

        formContent.add(titleLabel);
        formContent.add(nameLabel);
        formContent.add(nameTextField);
        formContent.add(saveButton);


    }


    public JPanel getForm()
    {
        return formContent;
    }

    public JTextField getNameTextField()
    {
        return nameTextField;
    }

    public JButton getSaveButton()
    {
        return saveButton;
    }
}
