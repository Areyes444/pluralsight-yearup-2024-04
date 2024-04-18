package com.pluralsight;


import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {


        //declare variables

        String model, carrier, phoneNumber, owner;
        int serialNumber;

        //user input
        System.out.print("What is the serial number? ");
        serialNumber = Integer.parseInt(userInput.nextLine());

        System.out.print("What model is the phone? ");
        model = userInput.nextLine();

        System.out.print("Who is the carrier? ");
        carrier = userInput.nextLine();

        System.out.print("What is the phone number? ");
        phoneNumber = userInput.nextLine();

        System.out.print("Who is the owner of the Phone? ");
        owner = userInput.nextLine();

        //Setting Variables
        CellPhone phone = new CellPhone();
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        //Print out






    }




}




