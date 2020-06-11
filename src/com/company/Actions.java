package com.company;

import java.util.Scanner;

public class Actions {
    Company company = new Company();

    public Actions(){}

    public void showActions() {     // METODA WYSWIETLAJACA DOSTEPNE CZYNNOSCI
        System.out.println("                                          1. Podpisz umowę na realizację projektu");
        System.out.println("                                          2. Przeznacz dzień na szukanie klientów (każde 5 dni to jeden nowy dostępny projekt)");
        System.out.println("                                          3. Przeznacz dzień na programowanie");
        System.out.println("                                          4. Przeznacz dzień na testowanie (możesz testować własny kod, kod podwykonawców i kod pracowników)");
        System.out.println("                                          5. Oddaj gotowy projekt klientowi");
        System.out.println("                                          6. Zatrudnij nowego pracownika");
        System.out.println("                                          7. Zwolnij pracownika");
        System.out.println("                                          8. Przeznacz dzień na rozliczenia z urzędami (Wymagane 2 dni w miesiącu, w przeciwnym wypadku zamykasz firmę z długami)");
        System.out.println("                                          9. Sprawdź stan realizacji projektu)");
        System.out.println("                                          10. Sprawdź swój zespół");
        System.out.println("                                          11. Sprawdź stan konta \n");
        System.out.println("                                       Twój wybór: ");
        choiceAction();
    }

    public void choiceAction(){     //WYBÓR AKCJI
        int choice = -1;

        while (choice < 1 || choice > 11){
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
        }
        switch(choice){
            case 1:
                company.getProjectContractsAvailable();
                break;
            case 2:
                // code block
                break;
            case 3:
                // code block
                break;
            case 4:
                // code block
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
            case 9:
                // code block
                break;
            case 10:
                // code block
                break;
            case 11:
                // code block
                break;
        }
    }
}

