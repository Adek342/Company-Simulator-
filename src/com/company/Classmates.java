package com.company;

import java.util.ArrayList;
import java.util.List;

public class Classmates {
    public String Name;
    public String lastName;
    public String levelOfAdvancement;       //POZIOM ZAAWANSOWANIA STUDENTA
    public int Price;
    public int leadTime;
    Project toDoProject;
    Company company;

    public Classmates(String Name, String lastName, String levelOfAdvancement, int Price, Company company)
    {
        this.Name = Name;
        this.lastName = lastName;
        this.levelOfAdvancement = levelOfAdvancement;
        this.Price = Price;
        this.company = company;
    }

    public void submitProject(Project project)
    {
        toDoProject = project;
        leadTime = project.leadTime;
    }

    public void isWorking()
    {
        if (toDoProject != null)
        {
            leadTime--;
            toDoProject.leadTime = leadTime;
            if (leadTime == 0) {
                company.isProjectFinished(toDoProject);
                toDoProject = null;
            }
        }
    }

    @Override
    public String toString() {
        return Name + " " + lastName + " " + levelOfAdvancement + " " + Price + "\n";
    }
}
