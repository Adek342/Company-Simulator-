package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Project {
    public String projectName;                                        //NAZWA PROJEKTU
    public Integer leadTime = 0;                                      //ILOSC DNI POTRZEBNYCH NA REALIZACJE PROJEKTU
    public Client client;                                             //KLIENT
    public Integer projectDeliveryDeadline;                           //TERMIN ODDANIA PROJEKTU (DNI)
    public Double amountOfPenalty;                                    //WYSOKOSC KARY ZA PRZEKROCZENIE TERMINU
    public Double Price;                                              //CENA
    public Integer dateOfPayment;                                     //TERMIN UZYSKANIA ZAPLATY W DNIACH
    public String levelOfComplexity;                                  //POZIOM ZLOZONOSCI: latwy sredni, trudny
    List<Technologies> projectContent = new ArrayList<>();            //ZAWARTOSC PROJEKTU
    List<Technologies> typesOfDesignProperties = new ArrayList<>();   //WSZYSTKIE OPCJE ZAWARTOSCI

    public Project(String projectName, Client client, Integer projectDeliveryDeadline,
                   Double amountOfPenalty, Double Price, Integer dateOfPayment, String levelOfComplexity){
        this.projectName = projectName;
        this.client = client;
        this.projectDeliveryDeadline = projectDeliveryDeadline;
        this.amountOfPenalty = amountOfPenalty;
        this.Price = Price;
        this.dateOfPayment = dateOfPayment;
        this.levelOfComplexity = levelOfComplexity;

        typesOfDesignProperties.add(new Technologies("front-end"));       //3 DNI
        typesOfDesignProperties.add(new Technologies("back-end"));        //4 DNI
        typesOfDesignProperties.add(new Technologies("baza-danych"));     //4 DNI
        typesOfDesignProperties.add(new Technologies("mobile"));          //6 DNI
        typesOfDesignProperties.add(new Technologies("wordpress"));       //3 DNI
        typesOfDesignProperties.add(new Technologies("prestashop"));      //3 DNI

        generateProjectContent();
    }

    public List<Technologies> getProjectContent() {
        return projectContent;
    }

    public void generateProjectContent(){       //GENERUJE ZAWARTOSC PROJEKTU
        int numberOfProperties = 0;
        int typeOfDeignProperty;
        if(levelOfComplexity == "Łatwy") numberOfProperties = 1;
        if(levelOfComplexity == "Średni") numberOfProperties = 2;
        if(levelOfComplexity == "Trudny") numberOfProperties = randomBetween(3,6);

        while(projectContent.size() != numberOfProperties){
            typeOfDeignProperty = randomBetween(0,5);
            if (projectContent.isEmpty() == true || projectContent.contains(typesOfDesignProperties.get(typeOfDeignProperty)) == false)  //WARUNEK CHRONI PRZED POWTARZALNOSCIA TECHNOLOGII W PROJEKCIE
                projectContent.add(typesOfDesignProperties.get(typeOfDeignProperty));
        }
        countTheLeadTime();
    }

    public void countTheLeadTime()      //LICZY ILOSC DNI POTRZEBNYCH NA REALIZACJE PROJEKTU
    {
        for(int i = 0; i < projectContent.size(); i++){
            leadTime += projectContent.get(i).timeNeededToComplete;
        }
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
        return projectName;
    }
}
