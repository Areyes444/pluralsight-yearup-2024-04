package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static final Scanner userInput = new Scanner(System.in);

    private static final double BASE_PRICE = 29.99;
    private static final double UNDERAGE_SURCHARGE_PERCENT = .3;
    private static final double FEE_TOLL = 3.95;
    private static final double FEE_GPS = 2.95;
    private static final double FEE_ROADSIDE = 3.95;

    public static void main(String[] args)
    {
        System.out.println();

        String pickupDate = selectPickupDate();
        int totalDays = selectNumberOfDays();
        boolean hasToll = selectTollTag();
        boolean hasGPS = selectGPS();
        boolean hasRoadside = selectRoadSideAssistance();
        int age = selectCurrentAge();
        boolean isUnderage = age < 25;

        double basePrice = BASE_PRICE * totalDays;
        double tollPrice = hasToll ? FEE_TOLL * totalDays : 0;
        double gpsPrice = hasGPS ? FEE_GPS * totalDays : 0;
        double roadsidePrice = hasRoadside ? FEE_ROADSIDE * totalDays : 0;
        double subTotal = basePrice + tollPrice + gpsPrice + roadsidePrice;
        double underageCharge = isUnderage ? subTotal * UNDERAGE_SURCHARGE_PERCENT : 0;
        double total = subTotal + underageCharge;

        System.out.println();
        System.out.printf("Pickup date:   %s \n", pickupDate);
        System.out.printf("Total days:    %d \n", totalDays);
        System.out.println("-----------------------------------");
        System.out.printf("Base price:             $ %.2f \n",basePrice);
        System.out.printf("Toll Charge:            $ %.2f \n",tollPrice);
        System.out.printf("GPS Fee:                $ %.2f \n",gpsPrice);
        System.out.printf("Roadside Assistance:    $ %.2f \n",roadsidePrice);
        System.out.println("-----------------------------------");
        System.out.printf("SubTotal:               $ %.2f \n",subTotal);
        System.out.printf("Underage Fee:           $ %.2f \n",underageCharge);
        System.out.printf("Total price:            $ %.2f \n",total);
        System.out.println();
    }

    public static String selectPickupDate()
    {
        System.out.print("Enter the pick-up date: ");
        return userInput.nextLine().strip();
    }

    public static int selectNumberOfDays()
    {
        System.out.print("Enter the number of rental days: ");
        return Integer.parseInt(userInput.nextLine().strip());
    }

    public static boolean selectTollTag()
    {
        System.out.print("Would you like a toll tag for $3.95/ day (yes/no): ");
        String selection = userInput.nextLine().strip();

        return selection.equalsIgnoreCase("yes");
    }

    public static boolean selectGPS()
    {
        System.out.print("Would you like GPS for $2.95/ day (yes/no): ");
        String selection = userInput.nextLine().strip();

        return selection.equalsIgnoreCase("yes");
    }

    public static boolean selectRoadSideAssistance()
    {
        System.out.print("Would you like roadside assistance for $3.95/ day (yes/no): ");
        String selection = userInput.nextLine().strip();

        return selection.equalsIgnoreCase("yes");
    }

    public static int selectCurrentAge()
    {
        System.out.print("Enter your current age: ");
        return Integer.parseInt(userInput.nextLine().strip());
    }
}