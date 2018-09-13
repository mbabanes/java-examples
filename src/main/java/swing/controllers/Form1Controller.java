package swing.controllers;

import swing.model.SomeLogic;
import swing.view.FormPanel;

import javax.swing.*;

public class Form1Controller
{
    private FormPanel formPanel;
    private SomeLogic someLogic;


    public Form1Controller(FormPanel formPanel, SomeLogic someLogic)
    {
        this.formPanel = formPanel;
        this.someLogic = someLogic;
        this.initialize();
    }

    private void initialize()
    {
        JButton saveButton = formPanel.getSaveButton();

        saveButton.addActionListener(e -> {
          this.onClickSaveButton();
        });
    }

    private void onClickSaveButton()
    {
        String text = formPanel.getNameTextField().getText();
        someLogic.doLogic(text);
    }
}
