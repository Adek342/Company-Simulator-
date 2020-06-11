package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // MENU GLOWNE GRY

        int choice = -1;
        Main_Interface mainInterface = new Main_Interface();

        while (choice < 0 || choice > 1){
        System.out.println("");
        System.out.println("");
        System.out.println("                                                                                        COMPANY SIMULATOR");
        System.out.println("");
        System.out.println("                                                                                            1. START");
        System.out.println("                                                                                            0. EXIT");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        }
        if(choice == 1){
            mainInterface.Prolog();

        }
    }
}
