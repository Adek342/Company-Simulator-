package com.company;

public class WorkBackground {
    Time myTime = new Time();
    Company company;
    int Day;
    int Day2;
    int Day3;

    public WorkBackground(Company company)
    {
        this.company = company;
    }       //REALIZACJA PRACY ZLECONEJ STUDENTOM

    public void studentWork()
    {
        if (Day != myTime.Day)
            company.studentWork();
        Day = myTime.Day;
    }

    public void projectReturnDate()                     //METODA LICZĄCA ILOSC DNI DO KONCA TERMINU
    {
        if (company.toDoList.isEmpty() == false && Day2 != myTime.Day)
        {
            for (int i = 0; i < company.toDoList.size(); i++) {
                company.toDoList.get(i).projectDeliveryDeadline--;
            }
        }
        Day2 = myTime.Day;
    }

    public void employeeMaintenanceCost()           //METODA POBIERAJĄCA W TLE PIENIĄDZE NA UTRZYMANIE PRACOWNIKA, ORAZ WYKONYWANIE PRZEZ PRACOWNIKA PROJEKTU W TLE
    {
        if (company.listOfEmployees.isEmpty() == false && Day3 != myTime.Day)
        {
            for (int i = 0; i < company.listOfEmployees.size(); i++) {
                if (company.accountBalance < company.listOfEmployees.get(i).maintenanceCost)
                    company.listOfEmployees.remove(company.listOfEmployees.get(i));
                else {
                    company.accountBalance = company.accountBalance - company.listOfEmployees.get(i).maintenanceCost;
                }
            }
        }
        Day3 = myTime.Day;
    }
}
