package com.pluralsight.application;

import com.pluralsight.models.*;

public class FinancialPlanner
{
    Portfolio portfolio = new Portfolio("Investments", "Barton");

    public void run()
    {
        PreciousMetals gold = new PreciousMetals("Gold", 2404.70,16);
        PreciousMetals silver = new PreciousMetals("Silver", 31.55,36);
        BankAccount savings = new BankAccount("High Yield Savings","HY12345", 515342.37);
        House home = new House("Home", 250, 1000, 2);
        CreditCard homeLoan = new CreditCard("Home Loan", "HL-97531", 125000.00);

        portfolio.add(gold);
        portfolio.add(silver);
        portfolio.add(savings);
        portfolio.add(home);
        portfolio.add(homeLoan);

        System.out.println("Gold value: " + gold.getValue());
        System.out.println("Silver value: " + silver.getValue());
        System.out.println("Savings value: " + savings.getValue());
        System.out.println("Home value: " + home.getValue());
        System.out.println("Home Loan: " + homeLoan.getValue());

        System.out.println("---------------------------------------------");
        System.out.println("Total Portfolio worth: " + portfolio.getValue());
    }
}
