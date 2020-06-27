package com.company;

import java.util.Scanner;

public class Actions {
    Company company = new Company();
    Time myTime = new Time();
    public Actions(){}

    public void showActions() {     // METODA WYSWIETLAJACA DOSTEPNE CZYNNOSCI
        System.out.print(myTime);
        System.out.println(company.getAccountBalance() + "\n");
        System.out.println("                                          1. Podpisz umowę na realizację projektu");
        System.out.println("                                          2. Przeznacz dzień na szukanie klientów (każde 5 dni to jeden nowy dostępny projekt)");
        System.out.println("                                          3. Lista projektów do zrealizowania");
        System.out.println("                                          4. Oddaj gotowy projekt klientowi");
        System.out.println("                                          5. Zatrudnij nowego pracownika");
        System.out.println("                                          6. Zwolnij pracownika");
        System.out.println("                                          7. Przeznacz dzień na rozliczenia z urzędami (Wymagane 2 dni w miesiącu, w przeciwnym wypadku zamykasz firmę z długami)");
        System.out.println("                                          8. Sprawdź swój zespół \n");
        System.out.println("                                       Twój wybór: ");
        choiceAction();
    }

    public void choiceAction(){     //WYBÓR AKCJI
        int choice = -1;

        while (choice >= 1 || choice <= 11){
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();

        switch(choice) {
            case 1:
                company.getProjectContractsAvailable();
                company.choiceActionOnContractsAvailable();
                break;
            case 2:
                company.generateProject();
                break;
            case 3:
                company.getToDoList();
                company.choiceActionOnToDoList();
                break;
            case 4:
                company.returnFinishedProject();
                break;
            case 5:
                // code block
                break;
            case 6:
                // code block
                break;
            case 7:
                // code block
                break;
            case 8:
                // code block
                break;
        }
        showActions();
        }
    }
}

