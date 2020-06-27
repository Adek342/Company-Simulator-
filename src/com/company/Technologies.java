package com.company;

public class Technologies {
    public String name;
    public int timeNeededToComplete;

    public static final int DEFAULT_FRONT_END_TIME = 3;
    public static final int DEFAULT_BACK_END_TIME = 4;
    public static final int DEFAULT_DATA_BASE_TIME = 4;
    public static final int DEFAULT_MOBILE_TIME = 6;
    public static final int DEFAULT_WORDPRESS_TIME = 3;
    public static final int DEFAULT_PRESTASHOP_TIME = 3;

    public Technologies(String name)
    {
        this.name = name;
        if (name == "front-end")
            timeNeededToComplete = DEFAULT_FRONT_END_TIME;
        if (name == "back-end")
            timeNeededToComplete = DEFAULT_BACK_END_TIME;
        if (name == "baza-danych")
            timeNeededToComplete = DEFAULT_DATA_BASE_TIME;
        if (name == "mobile")
            timeNeededToComplete = DEFAULT_MOBILE_TIME;
        if (name == "wordpress")
            timeNeededToComplete = DEFAULT_WORDPRESS_TIME;
        if (name == "prestashop")
            timeNeededToComplete = DEFAULT_PRESTASHOP_TIME;
    }
}
