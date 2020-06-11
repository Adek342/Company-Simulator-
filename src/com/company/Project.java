package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Project {
    public String projectName;                                  //NAZWA PROJEKTU
    public Integer leadTime = 0;                                //ILOSC DNI POTRZEBNYCH NA REALIZACJE PROJEKTU
    public Client client;                                       //KLIENT
    public Integer projectDeliveryDeadline;                     //TERMIN ODDANIA PROJEKTU (DNI)
    public Double amountOfPenalty;                              //WYSOKOSC KARY ZA PRZEKROCZENIE TERMINU
    public Double Price;                                        //CENA
    public Integer dateOfPayment;                               //TERMIN UZYSKANIA ZAPLATY W DNIACH
    public String levelOfComplexity;                            //POZIOM ZLOZONOSCI: latwy sredni, trudny
    List<String> projectContent = new ArrayList<>();            //ZAWARTOSC PROJEKTU
    List<String> typesOfDesignProperties = new ArrayList<>();   //WSZYSTKIE OPCJE ZAWARTOSCI

    public Project(String projectName, Client client, Integer projectDeliveryDeadline,
                   Double amountOfPenalty, Double Price, Integer dateOfPayment, String levelOfComplexity){
        this.projectName = projectName;
        this.client = client;
        this.projectDeliveryDeadline = projectDeliveryDeadline;
        this.amountOfPenalty = amountOfPenalty;
        this.Price = Price;
        this.dateOfPayment = dateOfPayment;
        this.levelOfComplexity = levelOfComplexity;

        typesOfDesignProperties.add("front-end");       //3 DNI
        typesOfDesignProperties.add("back-end");        //4 DNI
        typesOfDesignProperties.add("baza-danych");     //4 DNI
        typesOfDesignProperties.add("mobile");          //6 DNI
        typesOfDesignProperties.add("wordpress");       //3 DNI
        typesOfDesignProperties.add("prestashop");      //3 DNI

        generateProjectContent();
    }

    public void generateProjectContent(){       //GENERUJE ZAWARTOSC PROJEKTU
        int numberOfProperties = 0;
        int typeOfDeignProperty;
        if(levelOfComplexity == "Łatwy") numberOfProperties = 1;
        if(levelOfComplexity == "Średni") numberOfProperties = 2;
        if(levelOfComplexity == "Trudny") numberOfProperties = randomBetween(3,6);

        for(int i = 0; i < numberOfProperties; i++){
            typeOfDeignProperty = randomBetween(0,5);
            projectContent.add(typesOfDesignProperties.get(typeOfDeignProperty));
        }
        countTheLeadTime();
    }

    public void countTheLeadTime()      //LICZY ILOSC DNI POTRZEBNYCH NA REALIZACJE PROJEKTU
    {
        for(int i = 0; i < projectContent.size(); i++){
            if(projectContent.get(i) == "front-end")
                leadTime += 3;
            if(projectContent.get(i) == "back-end")
                leadTime += 4;
            if(projectContent.get(i) == "baza-danych")
                leadTime += 4;
            if(projectContent.get(i) == "mobile")
                leadTime += 6;
            if(projectContent.get(i) == "wordpress")
                leadTime += 3;
            if(projectContent.get(i) == "prestashop")
                leadTime += 3;
        }
    }

    public int randomBetween(int start, int end)
    {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2= a1 + start;
        return a2;
    }

    @Override
    public String toString() {
        return projectName;
    }
}
