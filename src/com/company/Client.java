package com.company;

import java.util.Random;

public class Client {
    public String Name;
    public String lastName;
    public String customerType;

    public Client(String Name, String lastName){
        this.Name = Name;
        this.lastName = lastName;

        int i = randomBetween(1,3);
        if(i == 1)
            customerType = "wyluzowany";
        if(i == 2)
            customerType = "wymagający";
        if(i == 3)
            customerType = "skrwl";
    }

    public int randomBetween(int start, int end)
    {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2= a1 + start;
        return a2;
    }
}
