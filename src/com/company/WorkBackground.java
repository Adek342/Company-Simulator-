package com.company;

public class WorkBackground {
    Time myTime = new Time();
    Company company;
    int Day;

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
}
