package com.company;

import java.util.Random;

public class Workers {
    String Name;
    String lastName;
    String employeeType;

    public Workers(String Name, String lastName, String employeeType)
    {
        this.Name = Name;
        this.lastName = lastName;
        this.employeeType = employeeType;
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
