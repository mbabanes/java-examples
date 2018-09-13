package swing.controllers;

import swing.model.SomeLogic;
import swing.view.FormPanel;
import swing.view.FormPanel2;
import swing.view.ContentPanel;
import swing.view.MenuPanel;

import javax.swing.*;

public class MainController
{
    private MenuPanel menuPanel;
    private ContentPanel contentPanel;


    public MainController(MenuPanel menuPanel, ContentPanel contentPanel)
    {
        this.menuPanel = menuPanel;
        this.contentPanel = contentPanel;


        this.initialize();
    }


    private void initialize()
    {
        JButton form1Button = menuPanel.getForm1Button();
        form1Button.addActionListener(e -> {
            this.showForm1();
        });

        menuPanel.getForm2Button().addActionListener(e -> {
            this.showForm2();
        });
    }


    private void showForm1()
    {
        FormPanel formPanel = new FormPanel();
        Form1Controller form1Controller = new Form1Controller(formPanel, new SomeLogic());
        contentPanel.setContent(formPanel.getForm());
        System.out.println("showForm1");
    }

    private void showForm2()
    {
        FormPanel2 formPanel2 = new FormPanel2();
        Form2Controller form2Controller = new Form2Controller(formPanel2, new SomeLogic());
        contentPanel.setContent(formPanel2.getForm());
        System.out.println("showForm2");
    }
}
