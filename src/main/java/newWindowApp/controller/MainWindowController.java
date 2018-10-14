package newWindowApp.controller;

import newWindowApp.view.MainWindowView;
import newWindowApp.view.NewWindowView;
import newWindowApp.model.Calculator;

public class MainWindowController
{
    private MainWindowView mainWindowView;

    public MainWindowController(MainWindowView mainWindowView)
    {
        this.mainWindowView = mainWindowView;
        this.initialize();
    }

    private void initialize()
    {
        mainWindowView.getButton().addActionListener((e) -> newWindowOpen());

    }


    private void newWindowOpen()
    {
        NewWindowView newWindowView = new NewWindowView();
        Calculator calculator = new Calculator();
        NewWindowController newWindowController = new NewWindowController(newWindowView, calculator);
    }
}
