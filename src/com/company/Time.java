package com.company;

public class Time {
    public static String[] Months = new String[12];     //TABLICA MIESIĘCY
    public static int Day = 1;                          //DZIEN
    public static String Month = Months[0];             //MIESIĄC
    public static int Year = 2020;                      //ROK

    public Time(){
        Months[0] = "styczeń";
        Months[1] = "luty";
        Months[2] = "marzec";
        Months[3] = "kwiecień";
        Months[4] = "maj";
        Months[5] = "czerwiec";
        Months[6] = "lipiec";
        Months[7] = "sierpień";
        Months[8] = "wrzesień";
        Months[9] = "październik";
        Months[10] = "listopad";
        Months[11] = "grudzień";
    }
    public static void endOfTurn(){
        Day++;
        nextMonth();
    }
    public static void nextMonth(){
        if(Month == Months[0] && Day == 32){
            Day = 1;
            Month = Months[1];
        }
        if(Month == Months[1] && Day == 30){
            Day = 1;
            Month = Months[2];
        }
        if(Month == Months[2] && Day == 32){
            Day = 1;
            Month = Months[3];
        }
        if(Month == Months[3] && Day == 31){
            Day = 1;
            Month = Months[4];
        }
        if(Month == Months[4] && Day == 32){
            Day = 1;
            Month = Months[5];
        }
        if(Month == Months[5] && Day == 31){
            Day = 1;
            Month = Months[6];
        }
        if(Month == Months[6] && Day == 32){
            Day = 1;
            Month = Months[7];
        }
        if(Month == Months[7] && Day == 32){
            Day = 1;
            Month = Months[8];
        }
        if(Month == Months[8] && Day == 31){
            Day = 1;
            Month = Months[9];
        }
        if(Month == Months[9] && Day == 32){
            Day = 1;
            Month = Months[10];
        }
        if(Month == Months[10] && Day == 31){
            Day = 1;
            Month = Months[11];
        }
        if(Month == Months[11] && Day == 32){
            Day = 1;
            Month = Months[0];
            Year++;
        }
    }

    @Override
    public String toString() {
        return "                              " + Day + " " + Month + " " + Year + "\n";
    }
}
