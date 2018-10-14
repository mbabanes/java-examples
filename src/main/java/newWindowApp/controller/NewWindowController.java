package newWindowApp.controller;

import newWindowApp.view.NewWindowView;
import newWindowApp.model.Calculator;

public class NewWindowController
{
    private NewWindowView windowView;
    private Calculator calculator;

    public NewWindowController(NewWindowView windowView, Calculator calculator)
    {
        this.windowView = windowView;
        this.calculator = calculator;

        this.initialize();
    }

    private void initialize()
    {
        windowView.getButton().addActionListener((e) -> buttonOnClick());
    }

    private void buttonOnClick()
    {
        int a = Integer.valueOf( windowView.getValueATextField().getText() );
        int b = Integer.valueOf(windowView.getValueBTextField().getText());

        int result = calculator.add(a, b);

        windowView.getResultLabel().setText(Integer.toString(result));
    }
}
