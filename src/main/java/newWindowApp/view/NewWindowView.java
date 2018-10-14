package newWindowApp.view;

import javax.swing.*;

public class NewWindowView
{
    JFrame window;
    JTextField valueATextField;
    JTextField valueBTextField;
    JLabel resultLabel;
    JButton jButton;

    public NewWindowView()
    {
        window = new JFrame("Nowe OKno");
        window.setSize(200, 200);
        window.setLayout(null);

        valueATextField = new JTextField();
        valueBTextField = new JTextField();

        valueATextField.setBounds(10, 10, 100, 30);
        valueBTextField.setBounds(10, 45, 100, 30);

        window.add(valueATextField);
        window.add(valueBTextField);

        jButton = new JButton("Dodaj");
        jButton.setBounds(10, 80, 80, 30);
        window.add(jButton);

        resultLabel = new JLabel();
        resultLabel.setBounds(10, 125, 80, 30);
        window.add(resultLabel);

        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setVisible(true);

    }

    public JTextField getValueATextField()
    {
        return valueATextField;
    }

    public JTextField getValueBTextField()
    {
        return valueBTextField;
    }

    public JButton getButton()
    {
        return jButton;
    }

    public JLabel getResultLabel()
    {
        return resultLabel;
    }
}
