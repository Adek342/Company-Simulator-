package com.company;

import java.util.Scanner;

public class Main_Interface {

    Actions actions = new Actions();
    Scanner scan = new Scanner(System.in);
    Time myTime = new Time();

    public Main_Interface(){ }

    public void Prolog(){       //METODA WSTEPNA
        System.out.println("");
        System.out.println("                                                 WPROWADZENIE");
        System.out.println("                                          Rozpoczynasz pracę 1 stycznia 2020, każdy dzień to jedna tura. \n" +
                "                                          Jeżeli jest to dzień wolny od pracy, możesz pracować samodzielnie, jeżeli jest \n" +
                "                                          to dzień roboczy, pracują twoi podwykonawcy oraz pracownicy.\n");
        System.out.println("                               Wprowadź dowolny klawicz aby kontynuować: \n");
        var Continue = scan.next();     //PRZEJSCIE DO GRY
        includeAction();
    }

    public void includeAction(){    // METODA WYWOLUJACA CODZIENNE CZYNNOSCI
        actions.showActions();
    }
}
