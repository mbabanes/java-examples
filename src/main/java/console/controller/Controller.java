package console.controller;

import console.model.Model;
import console.view.View;

import java.util.Scanner;

public class Controller
{
    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(View view, Model model)
    {
        this.view = view;
        this.model = model;
        scanner = new Scanner(System.in);
    }


    public void start()
    {
        do
        {
            view.pritnMenu();
            int option = Integer.valueOf(scanner.nextLine());

            switch (option)
            {
                case 1: {
                    view.option1();
                    String login = scanner.nextLine();
                    model.doSomethingWithLogin(login);
                    break;
                }
                case 2:
                {
                    view.exitMessage();
                    return;
                }
                default: {
                    view.wrongOption();
                    break;
                }
            }


        } while (true);
    }
}
