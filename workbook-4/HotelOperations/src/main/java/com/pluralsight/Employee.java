package com.pluralsight;

public class Employee
{
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double shiftStartTime;
    private boolean overTime;
    private double punchInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double shiftStartTime, boolean overTime)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.shiftStartTime = shiftStartTime;
        this.overTime = hoursWorked > 40;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
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

    public double getShiftStartTime()
    {
        return shiftStartTime;
    }

    public void setShiftStartTime(double shiftStartTime)
    {
        this.shiftStartTime = shiftStartTime;
    }

    public boolean isOverTime()
    {
        return overTime;
    }

    public double getRegularHours()
    {
        if(hoursWorked <= 40 || isOverTime())
        {
            return hoursWorked;
        } else{
            return 40;
        }
    }

    public double getOverTimeHours()
    {
        if(hoursWorked <= 40 || !isOverTime())
        {
            return 0;
        } else{
            return hoursWorked - 40;
        }
    }

    public double getTotalPay()
    {
        double regularPay = getRegularHours() * getPayRate();
        double overTimePay = getOverTimeHours() * getPayRate() *1.5;
        return regularPay + overTimePay;
    }

    public void punchIn(double time)
    {
        punchInTime = time;
    }

    public void punchOut(double time)
    {
        double hoursWorkedToday = time - punchInTime;
        hoursWorked += hoursWorkedToday;
        punchInTime = 0;
    }
}
