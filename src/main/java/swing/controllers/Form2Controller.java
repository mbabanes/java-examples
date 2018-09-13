package swing.controllers;

import swing.model.SomeLogic;
import swing.view.FormPanel2;

import javax.swing.*;

public class Form2Controller
{
    private FormPanel2 formPanel2;
    private SomeLogic someLogic;

    public Form2Controller(FormPanel2 formPanel2, SomeLogic someLogic)
    {
        this.formPanel2 = formPanel2;
        this.someLogic = someLogic;
        this.initialize();
    }

    private void initialize()
    {
        JButton saveButton = formPanel2.getSaveButton();

        saveButton.addActionListener(e ->{
            this.onClickSaveButton();
        });
    }

    private void onClickSaveButton()
    {
        String text = formPanel2.getNameTextField().getText();
        someLogic.doLogic(text);
    }
}
