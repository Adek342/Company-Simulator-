package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Company {
    public Double accountBalance;                                       //STAN KONTA
    List<Project> toDoList = new ArrayList<>();                         //LISTA PROJEKTÓW DO ZROBIENIA
    List<Project> projectContractsAvailable = new ArrayList<>();        //DOSTĘPNE PROJEKTY DO ZREALIZOWANIA
    List<Project> projectList = new ArrayList<>();                      //LISTA WSZYSTKICH PROJEKTÓW

    public Company()
    {
        accountBalance = 10000.0;
        listOfAllProjects();
        generateThreeProjects();
    }

    public void generateProject(){                                      //METODA GENERUJĄCA PROJEKTY DO ROZGRYWKI

    }

    public void generateThreeProjects(){                                //GENERUJE PIERWSZE TRZY PROJEKTY DOSTĘPNE DO REALIZACJI PO URUCHOMIENIU GRY
        for (int i = 0; i < 3; i++)
        {
            projectContractsAvailable.add(projectList.get(randomBetween(0, 14)));
        }
    }

    public void listOfAllProjects(){                                    //LISTA WSZYSTKICH PROJEKTÓW
        projectList.add(new Project("Project1", new Client("Mariusz", "Konieczko"), 23, 500.0, 6000.0, 2, "Trudny"));
        projectList.add(new Project("Project2", new Client("Dariusz", "Granda"), 10, 1000.0, 3000.0, 2, "Średni"));
        projectList.add(new Project("Project3", new Client("Kacper", "Bromski"), 6, 1500.0, 1000.0, 3, "Łatwy"));
        projectList.add(new Project("Project4", new Client("Jan", "Malanowski"), 10, 1000.0, 3000.0, 5, "Średni"));
        projectList.add(new Project("Project5", new Client("Edward", "Bułka"), 6, 1500.0, 1000.0, 4, "Łatwy"));
        projectList.add(new Project("Project6", new Client("Krzysztof", "Fasola"), 23, 500.0, 6000.0, 3, "Trudny"));
        projectList.add(new Project("Project7", new Client("Zbigniew", "Boczek"), 6, 1500.0, 1000.0, 2, "Łatwy"));
        projectList.add(new Project("Project8", new Client("Andrzej", "Filipowicz"), 10, 1000.0, 3000.0, 3, "Średni"));
        projectList.add(new Project("Project9", new Client("Grzegorz", "Brzęczyszczykiewicz"), 6, 1500.0, 1000.0, 2, "Łatwy"));
        projectList.add(new Project("Project10", new Client("Sebastian", "Bąk"), 10, 1000.0, 3000.0, 1, "Średni"));
        projectList.add(new Project("Project11", new Client("Adam", "Górzyński"), 6, 1500.0, 1000.0, 2, "Łatwy"));
        projectList.add(new Project("Project12", new Client("Rajmund", "Górski"), 23, 500.0, 6000.0, 1, "Trudny"));
        projectList.add(new Project("Project13", new Client("Leszek", "Izbaner"), 10, 1000.0, 3000.0, 2, "Średni"));
        projectList.add(new Project("Project14", new Client("Eryk", "Kawulski"), 6, 1500.0, 1000.0, 3, "Łatwy"));
        projectList.add(new Project("Project15", new Client("Kajetan", "Szaranowicz"), 6, 1500.0, 3000.0, 2, "Łatwy"));
    }

    public List<Project> getProjectContractsAvailable() {
        for (int i = 0; i < projectContractsAvailable.size(); i++)
            System.out.println(projectContractsAvailable.get(i));
        return projectContractsAvailable;
    }

    public int randomBetween(int start, int end)
    {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2= a1 + start;
        return a2;
    }
}

