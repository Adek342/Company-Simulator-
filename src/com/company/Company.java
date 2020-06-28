package com.company;

import java.util.*;


public class Company {
    public Double accountBalance;                                       //STAN KONTA
    List<Project> toDoList = new ArrayList<>();                         //LISTA PROJEKTÓW DO ZROBIENIA
    List<Project> projectContractsAvailable = new ArrayList<>();        //DOSTĘPNE PROJEKTY DO ZREALIZOWANIA
    List<Project> projectList = new ArrayList<>();                      //LISTA WSZYSTKICH PROJEKTÓW
    List<Project> completedProjects = new ArrayList<>();                //LISTA UKONCZONYCH PROJEKTÓW
    List<Classmates> classMates = new ArrayList<>();                    //LISTA ZNAJOMYCH ZE STUDIÓW
    Time myTime = new Time();
    public int dayCounter = 0;                                          //LICZNIK DNI W POSZUKIWANIU KLIENTÓW

    public Company()
    {
        accountBalance = 10000.0;
        listOfAllProjects();
        generateThreeProjects();
        classMates.add(new Classmates("Grzegorz", "Zioło", "Najlepszy", 1500, this));
        classMates.add(new Classmates("Robert", "Biedroń", "Sredni", 1000, this));
        classMates.add(new Classmates("Fabian", "Kluczyński", "Luzak", 500, this));
    }

    public void generateProject(){                                      //METODA GENERUJĄCA NOWE PROJEKTY DO ROZGRYWKI
        boolean hasBeenAdded = false;
        dayCounter++;
        myTime.endOfTurn();
        if(dayCounter == 5) {
            while (hasBeenAdded == false) {
                int Number = randomBetween(0,14);
                if (projectContractsAvailable.contains(projectList.get(Number)) == false) {
                    projectContractsAvailable.add(projectList.get(Number));
                    hasBeenAdded = true;
                }
            }
            dayCounter = 0;
        }
    }

    public void generateThreeProjects(){                                //GENERUJE PIERWSZE TRZY PROJEKTY DOSTĘPNE DO REALIZACJI PO URUCHOMIENIU GRY
        while (projectContractsAvailable.size() != 3)
        {
            int Number = randomBetween(0,14);   //NUMER NA LISCIE
            if (projectContractsAvailable.isEmpty() == true || projectContractsAvailable.contains(projectList.get(Number)) == false)
                projectContractsAvailable.add(projectList.get(Number));
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

    public List<Project> getProjectContractsAvailable() {       //METODA SPRAWDZAJĄCA DOSTĘPNE PROJEKTY DO ZREALIZOWANIA
        for (int i = 0; i < projectContractsAvailable.size(); i++){
            System.out.println("                                                     "+ "ID: " + i + " " + projectContractsAvailable.get(i) + " - " + projectContractsAvailable.get(i).levelOfComplexity + " Poziom zaawansowania" + " " + "Cena: " + projectContractsAvailable.get(i).Price);}
        return projectContractsAvailable;
    }

    public void choiceActionOnContractsAvailable(){     //METODA DOKONANIA WYBORU
        System.out.println("");
        System.out.println("                                      1. Spawdź wymagania technologiczne lub podpisz umowę: ");
        System.out.println("                                      0. Wyjdź");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if(choice == 1)
            checkTechnologiesContractsAvailable();
    }

    public void checkTechnologiesContractsAvailable(){        //METODA SPRAWDZAJĄCA POTRZEBY TECHNOLOGICZNE DOSTĘPNEGO PROJEKTU
        System.out.println("");
        System.out.println("                                        Wprowadź ID Projektu: ");
        int ID;
        Scanner scan = new Scanner(System.in);
        ID = scan.nextInt();
        System.out.println("                                                    Wymagania technologiczne: ");
        System.out.println("");
        for (int i = 0; i < projectContractsAvailable.get(ID).projectContent.size(); i++){
            System.out.println("                                  " + "- " +projectContractsAvailable.get(ID).getProjectContent().get(i).name);
        }
        sighTheContract(projectContractsAvailable.get(ID));
    }

    public void sighTheContract(Project project){      //METODA PODPISUJĄCA KONTRAKT NA REALIZACJE PROJEKTU
        System.out.println("");
        System.out.println("                                 1. Podpisz kontrakt");
        System.out.println("                                 0. Wyjdź");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if(choice == 1) {
            toDoList.add(project);
            projectContractsAvailable.remove(project);
            myTime.endOfTurn();
        }
    }

    public void choiceActionOnToDoList(){       //METODA DOKONANIA WYBORU
        System.out.println("");
        System.out.println("                                          1. Sprawdź stan realizacji projektu: ");
        System.out.println("                                          2. Przeznacz dzień na testowanie: ");
        System.out.println("                                          0. Wyjdź");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if(toDoList.isEmpty() == false) {
            if (choice == 1)
                checkTheStatusProject();
        }
    }

    public void checkTechnologiesSignedContracts(int ID){     //METODA SPRAWDZAJĄCA POTRZEBY TECHNOLOGICZE PROJEKTU DO ZREAZLIZOWANIA
        for(int i = 0; i < toDoList.get(ID).projectContent.size(); i++)
        {
           System.out.println("                   " + "ID: " + toDoList.get(ID).projectContent.indexOf(toDoList.get(ID).projectContent.get(i)) + " " + toDoList.get(ID).projectContent.get(i).name + ": " + toDoList.get(ID).projectContent.get(i).timeNeededToComplete + " dni do końca realizacji");
        }
        System.out.println("");
        System.out.println("                                            1. Przeznacz dzień na programowanie: ");
        System.out.println("                                            2. Zleć pracę znajomemu ze studiów: ");
        System.out.println("                                            0. Wyjdź: ");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if (choice == 1)
            isWorking(ID);
        if (choice == 2)
            returnClassmates();
    }

    public void returnClassmates(){
        for (int i = 0; i < classMates.size(); i++)
        {
            System.out.println("                                                     ID: " + classMates.indexOf(classMates.get(i)) + " " + classMates.get(i));
        }
        System.out.println("");
        System.out.println("                                                        1. Przydziel projekt znajomemu");
        System.out.println("                                                        0. Wyjdź");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if (choice == 1){
            int idClassmate;
            int idProject;
            System.out.println("                                                    Wprowadź ID znajomego: ");
            Scanner scan2 = new Scanner(System.in);
            idClassmate = scan2.nextInt();
            System.out.println("                                                    Wprowadź ID projektu: ");
            Scanner scan3 = new Scanner(System.in);
            idProject = scan3.nextInt();
            classMates.get(idClassmate).submitProject(toDoList.get(idProject));
            toDoList.remove(toDoList.get(idProject));
            myTime.endOfTurn();
        }
    }

    public void isWorking(int ID){                              //METODA KTÓRA REALIZUJE PROJEKT
        int IDTechnology;
        System.out.println("                                             Wpisz ID technologii nad którą chcesz popracować: ");
        Scanner scan = new Scanner(System.in);
        IDTechnology = scan.nextInt();
        if(toDoList.get(ID).projectContent.get(IDTechnology).name != "mobile") {
            if (toDoList.get(ID).projectContent.get(IDTechnology).timeNeededToComplete > 0) {
                toDoList.get(ID).projectContent.get(IDTechnology).timeNeededToComplete--;
                toDoList.get(ID).leadTime--;
                isProjectFinished(toDoList.get(ID));
                myTime.endOfTurn();
            } else System.out.println("                                        Ta część projektu jest już ukończona");
        } else System.out.println("                                            Nie potrafisz robić aplikacji mobilnych, możesz zatrudnić pracownika, lub zlecić to znajomemu ze studiów \n");
    }

    public void isProjectFinished(Project project)               //METODA SPRAWDZAJĄCA CZY PROJEKT JEST SKONCZONY
    {
        if (project.leadTime == 0)
        {
            completedProjects.add(project);

            if(toDoList.contains(project))
                toDoList.remove(project);
        }
    }

    public void checkTheStatusProject()     //METODA SPRAWDZAJĄCA STATUS WYKONANEGO PROJEKTU
    {
        int ID;
        System.out.println("                                             1. Wprowadź ID projektu: ");
        Scanner scan = new Scanner(System.in);
        ID = scan.nextInt();
        if(toDoList.get(ID) != null)
        {
            System.out.println("                                        Liczba dni do ukończenia: " + toDoList.get(ID).leadTime);
            System.out.println("");
            checkTechnologiesSignedContracts(ID);
        }
    }

    public List<Project> getToDoList() {        //METODA ZWRACA LISTE PROJEKTÓW DO ZREALIZOWANIA
        for (int i = 0; i < toDoList.size(); i++){
            System.out.println("                                       "+ "ID: " + i + " " + toDoList.get(i) + " - " + toDoList.get(i).levelOfComplexity + " Poziom zaawansowania");}
        return toDoList;
    }

    public Double getAccountBalance() {
        System.out.print("                      Stan konta: ");
        return accountBalance;
    }

    public void returnFinishedProject()
    {
        if (completedProjects.isEmpty() == false)
        {
            int choice;
            int ID;
            for (int i = 0; i < completedProjects.size(); i++)
            {
                System.out.println("                                      " + "ID: " + i + " "+ completedProjects.get(i));
            }
            System.out.println("                                                1. Zwróć projekt");
            System.out.println("                                                0. Wyjdź");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            if (choice == 1){
                System.out.println("                                       Wprowadź ID gotowego projektu: ");
                Scanner scan2 = new Scanner(System.in);
                ID = scan2.nextInt();
                accountBalance += completedProjects.get(ID).Price;
                completedProjects.remove(completedProjects.get(ID));
            }
        }
    }

    public void studentWork()           //METODA KTÓRA POZWALA NA PRACE W TLE, REALIZOWANIE PROJEKTU PRZEZ STUDENTÓW
    {
        for (int i = 0; i < classMates.size(); i++)
        {
            classMates.get(i).isWorking();
        }
    }

    public int randomBetween(int start, int end)        //METODA LOSUJĄCA RANDOMOWE LICZBY Z PRZEDZIALU
    {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2= a1 + start;
        return a2;
    }
}

