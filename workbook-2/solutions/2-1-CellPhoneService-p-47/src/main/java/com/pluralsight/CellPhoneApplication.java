package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println();
        CellPhone phone1 = createPhoneWithSetters();
        System.out.println();
        CellPhone phone2 = createPhoneWithConstructor();

        System.out.println();
        display(phone1);
        display(phone2);

        System.out.println();
        System.out.println("Dialing Phones");
        System.out.println("--------------------------------------------");
        phone1.dial("888-555-1212");
        phone2.dial(phone1);
    }

    public static CellPhone createPhoneWithSetters()
    {
        int serialNumber = Integer.parseInt(getUserInput("What is the serial number? "));
        String model = getUserInput("What is the model? ");
        String carrier = getUserInput("Who is the carrier? ");
        String phoneNumber = getUserInput("What is the phone number? ");
        String owner = getUserInput("Who is the owner? ");

        CellPhone phone = new CellPhone();
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        return phone;
    }

    public static CellPhone createPhoneWithConstructor()
    {
        int serialNumber = Integer.parseInt(getUserInput("What is the serial number? "));
        String model = getUserInput("What is the model? ");
        String carrier = getUserInput("Who is the carrier? ");
        String phoneNumber = getUserInput("What is the phone number? ");
        String owner = getUserInput("Who is the owner? ");

        CellPhone phone = new CellPhone(serialNumber, model,carrier, phoneNumber, owner);

        return phone;
    }

    private static String getUserInput(String message)
    {
        System.out.print(message);
        return userInput.nextLine().strip();
    }

    private static void display(CellPhone phone)
    {
        System.out.println();
        System.out.println("Cell Phone Info");
        System.out.println("-----------------------------------");
        System.out.printf("Serial Number: %d \n", phone.getSerialNumber());
        System.out.printf("Model:         %s \n", phone.getModel());
        System.out.printf("Carrier:       %s \n", phone.getCarrier());
        System.out.printf("Phone Number:  %s \n", phone.getPhoneNumber());
        System.out.printf("Owner:         %s \n", phone.getOwner());
    }
}