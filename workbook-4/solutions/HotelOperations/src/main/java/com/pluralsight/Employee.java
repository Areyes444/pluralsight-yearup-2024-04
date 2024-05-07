package com.pluralsight;

public class Employee
{
    private final double OVERTIME_RATE = 1.5;
    private final int REGULAR_HOURS = 40;

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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

    // derived

    public boolean isOvertime()
    {
        return hoursWorked > REGULAR_HOURS;
    }

    public double getRegularPay()
    {
        return getRegularHours() * payRate;
    }

    public double getOverTimePay()
    {
        return getOvertimeHours() * payRate * OVERTIME_RATE;
    }

    public double getTotalPay()
    {
        return getRegularPay() + getOverTimePay();
    }

    public double getRegularHours()
    {
//        if(isOvertime()){
//            return 40;
//        }
//        else {
//            return hoursWorked;
//        }

        return isOvertime()
                ? REGULAR_HOURS
                : hoursWorked;
    }

    public double getOvertimeHours()
    {
//        if(!isOvertime()){
//            return 0;
//        }
//        else {
//            return hoursWorked - 40;
//        }
        return !isOvertime() ? 0 : hoursWorked - REGULAR_HOURS;
    }

}
