package com.pluralsight;


import java.time.LocalTime;

public class Employee
{
    private String name;
    private double payRate;
    private double hoursWorked;

    // 10:30 -> 10.5
    private double timeIn;

    public Employee(String name, double payRate, double hoursWorked)
    {
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public void punchIn(double timeIn)
    {
        this.timeIn = timeIn;
    }

    public void punchIn()
    {
        LocalTime currentTime = LocalTime.now();

        int hours = currentTime.getHour();
        double minutes = currentTime.getMinute() / 60.0;

        timeIn = hours + minutes;
    }


    public void punchOut(double timeOut)
    {
        this.hoursWorked += timeOut - timeIn;
    }

    public void punchOut()
    {
        LocalTime currentTime = LocalTime.now();

        int hours = currentTime.getHour();
        double minutes = currentTime.getMinute() / 60.0;
        double timeOut = hours + minutes;

        double timeWorked = timeOut - timeIn;
        hoursWorked += timeWorked;

    }
}
