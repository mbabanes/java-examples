package swing;

import swing.controllers.MainController;
import swing.view.ContentPanel;
import swing.view.MenuPanel;

public class Main
{
    public static void main(String[] args)
    {
        MainFrame mainFrame = new MainFrame();

        MenuPanel menuPanel = new MenuPanel();
        ContentPanel contentPanel = new ContentPanel();

        MainController mainController = new MainController(menuPanel, contentPanel);

        MainFrameContent mainFrameContent = new MainFrameContent();

        mainFrameContent.add(menuPanel.getMenuJPanel());
        mainFrameContent.add(contentPanel.getContent());
        mainFrame.addContent(mainFrameContent.getMainFrameContent());
    }
}
