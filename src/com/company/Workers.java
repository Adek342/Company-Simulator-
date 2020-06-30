package com.company;

import java.util.Random;

public class Workers {
    String Name;
    String lastName;
    String employeeType;
    Integer maintenanceCost;

    public Workers(String Name, String lastName, String employeeType)
    {
        this.Name = Name;
        this.lastName = lastName;
        this.employeeType = employeeType;

        setMaintenanceCost();
    }

    public void setMaintenanceCost() {
        if (employeeType == "Programista")
            maintenanceCost = 400;
        if (employeeType == "Tester")
            maintenanceCost = 300;
        if (employeeType == "Sprzedawca")
            maintenanceCost = 200;
    }

    public int randomBetween(int start, int end)        //METODA LOSUJĄCA RANDOMOWE LICZBY Z PRZEDZIALU
    {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2= a1 + start;
        return a2;
    }

    @Override
    public String toString() {
        return Name + " " + lastName + " " + employeeType;
    }
}
