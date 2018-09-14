package console;

import console.controller.Controller;
import console.model.Model;
import console.view.View;

public class Main
{
    public static void main(String[] args)
    {
        Controller controller = new Controller(new View(), new Model());
        controller.start();
    }
}
