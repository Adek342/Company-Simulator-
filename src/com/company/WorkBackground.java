package com.company;

public class WorkBackground {
    Time myTime = new Time();
    Company company;
    int Day;
    int Day2;

    public WorkBackground(Company company)
    {
        this.company = company;
    }

    public void studentWork()
    {
        if (Day != myTime.Day)
            company.studentWork();
        Day = myTime.Day;
    }

    public void projectReturnDate()
    {
        if (company.toDoList.isEmpty() == false && Day2 != myTime.Day)
        {
            for (int i = 0; i < company.toDoList.size(); i++) {
                company.toDoList.get(i).projectDeliveryDeadline--;
            }
        }
        Day2 = myTime.Day;
    }
}
