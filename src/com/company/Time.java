package com.company;

public class Time {
    public static String[] Months = new String[12];            //TABLICA MIESIĘCY
    public static int Day;                                     //AKTUALNY DZIEN
    public static String Month;                                //AKTUALNY MIESIĄC
    public static String dayOfTheWeek;                         //AKTUALNY DZIEN TYGODNIA
    public static int Year;                                    //ROK

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

        dayOfTheWeek = "środa";
        Month = Months[0];
        Year = 2020;
        Day = 1;
    }
    public static void endOfTurn(){     //METODA WYWOLYWANA PO WYKONANIU CZYNNOSCI DZIENNEJ
        Day++;                          // PRZECHODZI DO NASTEPNEGO DNIA MIESIACA ( TURY ) PO WYKONANIU CZYNNOSCI
        nextMonth();
        nextDayOfTheWeek();
    }

    public static void nextDayOfTheWeek(){      //METODA MODYFIKUJĄCA DNI TYGODNIA
        switch(dayOfTheWeek) {
            case "poniedziałek":
                dayOfTheWeek = "wtorek";
                break;
            case "wtorek":
                dayOfTheWeek = "środa";
                break;
            case "środa":
                dayOfTheWeek = "czwartek";
                // code block
                break;
            case "czwartek":
                dayOfTheWeek = "piątek";
                // code block
                break;
            case "piątek":
                dayOfTheWeek = "sobota";
                // code block
                break;
            case "sobota":
                dayOfTheWeek = "niedziela";
                // code block
                break;
            case "niedziela":
                dayOfTheWeek = "poniedziałek";
                // code block
                break;
        }
    }

    public static void nextMonth(){     //METODA MODYFIKUJĄCA MIESIĄC
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
        return "                              " + Day + " " + Month + " " + Year + " " + dayOfTheWeek;
    }
}
