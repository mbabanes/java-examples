package console.view;

public class View
{
    public void pritnMenu()
    {
        System.out.println("1 - Pobierz dane");
        System.out.println("2 - Exit");
        System.out.print("Podaj opcje:");
    }


    public void option1()
    {
        System.out.println("Wybrałeś 1 - pobierz dane.");
        System.out.print("Wprowadź login: ");
    }

    public void exitMessage()
    {
        System.out.println("Wybrałeś 2 - Exit");
        System.out.println("Zamykam aplikacje");
    }

    public void wrongOption()
    {
        System.out.println("Nieznane polecenie");
    }
}

