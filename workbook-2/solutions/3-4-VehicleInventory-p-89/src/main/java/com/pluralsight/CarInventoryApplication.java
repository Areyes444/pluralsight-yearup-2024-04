package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class CarInventoryApplication
{
    private Scanner userInput = new Scanner(System.in);

    private Car[] inventory = {
            new Car(101121,"Ford Explorer","Red",45000,13500),
            new Car(101122,"Toyota Camry","Blue",60000,11000),
            new Car(101123,"Chevrolet Malibu","Black",50000,9700),
            new Car(101124,"Honda Civic","White",70000,7500),
            new Car(101125,"Subaru Outback","Green",55000,14500),
            new Car(101126,"Jeep Wrangler","Yellow",30000,16000)
    };

    public void run()
    {
        while(true)
        {
            int choice = getHomeScreenSelection();

            switch(choice)
            {
                case 1:
                    listAllCars();
                    break;
                case 2:
                    searchByMakeModel();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    searchByColor();
                    break;
                case 5:
                    addCar();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Please make a valid selection");
                    break;
            }

            System.out.println();
            System.out.print("Press ENTER to continue...");
            userInput.nextLine();
        }
    }

    private void listAllCars()
    {
        System.out.println();
        System.out.println("All Cars");
        System.out.println("-".repeat(59));

        printCarHeader();
        for(Car car: inventory)
        {
            printCar(car);
        }
    }

    private void searchByMakeModel()
    {
        System.out.println();
        System.out.println("Search by Make/Model");
        System.out.println("-".repeat(59));

        System.out.print("Enter the make/model: ");
        String makeModel = userInput.nextLine().strip().toLowerCase();
        System.out.println();

        printCarHeader();
        for(Car car: inventory)
        {
            if(car.getMakeModel().toLowerCase().contains(makeModel))
            {
                printCar(car);
            }
        }
    }

    private void searchByPriceRange()
    {
        System.out.println();
        System.out.println("Search by Price Range");
        System.out.println("-".repeat(59));

        System.out.print("Enter the min price: ");
        double min = Double.parseDouble(userInput.nextLine().strip());
        System.out.print("Enter the max price: ");
        double max = Double.parseDouble(userInput.nextLine().strip());
        System.out.println();

        printCarHeader();
        for(Car car: inventory)
        {
            if(car.getPrice() >= min && car.getPrice() <= max)
            {
                printCar(car);
            }
        }
    }

    private void searchByColor()
    {
        System.out.println();
        System.out.println("Search by Color");
        System.out.println("-".repeat(59));

        System.out.print("Enter the color: ");
        String color = userInput.nextLine().strip().toLowerCase();
        System.out.println();

        printCarHeader();
        for(Car car: inventory)
        {
            if(car.getColor().toLowerCase().contains(color))
            {
                printCar(car);
            }
        }
    }

    private void printCarHeader()
    {
        System.out.printf("%-6s %-20s %-10s %-7s %s \n","Id","Make/Model","Color","Miles","Price");
        System.out.printf("%-6s %-20s %-10s %-7s %s \n","-".repeat(6),"-".repeat(20),"-".repeat(10),"-".repeat(7),"-".repeat(12));
    }

    private void printCar(Car car)
    {
        System.out.printf("%-6d %-20s %-10s %7d $ %.2f\n", car.getVehicleId(), car.getMakeModel(), car.getColor(), car.getOdometerReading(), car.getPrice());
    }

    private void addCar()
    {
        System.out.println();
        System.out.println("Add a car");
        System.out.println("-".repeat(59));

        System.out.print("Enter the vin: ");
        int vin = Integer.parseInt(userInput.nextLine().strip());

        System.out.print("Enter the make and model: ");
        String makeModel = userInput.nextLine().strip();

        System.out.print("Enter the color: ");
        String color = userInput.nextLine().strip();

        System.out.print("Enter the miles: ");
        int miles = Integer.parseInt(userInput.nextLine().strip());

        System.out.print("Enter the price: ");
        double price = Double.parseDouble(userInput.nextLine().strip());

        Car car = new Car(vin, makeModel, color, miles, price);

        Car[] temp = new Car[inventory.length + 1];
        System.arraycopy(inventory, 0, temp, 0,inventory.length);
        temp[inventory.length] = car;
        inventory = temp;
    }

    public int getHomeScreenSelection()
    {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println();
        System.out.println("1 - List all cars");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 - Search by color");
        System.out.println("5 - Add a car");
        System.out.println("6 - Quit");
        System.out.println();
        System.out.print("Enter your command: ");
        return Integer.parseInt(userInput.nextLine().strip());
    }
}
