package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest
{

    @Test
    public void WhenPunchedOut_TimeWillBeAddedWithTheirHoursWorkedInTotal()
    {
        //arrange - setup
        Employee employee = new Employee(213,"Leo","Deli",30,45,4,false);
        double hoursWorkedToday = 8;
        double expectedTotalHoursWorkedSoFar = 53;

        //act
        employee.punchOut(hoursWorkedToday);

        //assert
        double actualTotal = employee.getRegularHours();
        assertEquals(expectedTotalHoursWorkedSoFar,actualTotal,"It should calculate a total amount of hours worked so far.");
    }


}