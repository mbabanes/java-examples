package newWindowApp;

import newWindowApp.controller.MainWindowController;
import newWindowApp.view.MainWindowView;

public class Main
{
    public static void main(String[] args)
    {
        MainWindowView mainWindowView = new MainWindowView();
        MainWindowController mainWindowController = new MainWindowController(mainWindowView);
    }

}
