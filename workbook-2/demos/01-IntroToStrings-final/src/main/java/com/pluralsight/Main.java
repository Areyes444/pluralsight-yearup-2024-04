package com.pluralsight;

import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        commonMethods();
        readProductSku();
    }

    public static void commonMethods()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = userInput.nextLine().strip();
        System.out.println("--" + fullName  + "--");

        System.out.print("Please enter your phone number: ");
        String phone = userInput.nextLine();
        String formattedPhone = phone.replace("-", "")
                                        .replace("(", "")
                                        .replace(")", "")
                                        .replace(" ", "")
                                        .replace(".", "");

        System.out.println("Phone: " + phone);
        System.out.println("Phone: " + formattedPhone);
    }

    public static void formatPhoneNumber()
    {
        String phoneNumber = "8885551212";
        String formattedPhone;

        String areaCode = phoneNumber.substring(0,3);
        String prefix = phoneNumber.substring(3,6);
        String last4 = phoneNumber.substring(6);

        System.out.println("area code: " + areaCode);
        System.out.println("prefix: " + prefix);
        System.out.println("last 4: " + last4);

//        formattedPhone = "(" + areaCode + ") " + prefix + "-" + last4;
        formattedPhone = String.format("(%s) %s-%s", areaCode, prefix, last4);

        System.out.println(formattedPhone);
    }

    public static void readProductSku()
    {
        String sku = "A145-LRG-1299";
        String size = findSize(sku);
        String price = findPrice(sku);
        System.out.println(sku + " : " + size + " : $" + price);

        sku = "A146-SML-1299";
        size = findSize(sku);
        price = findPrice(sku);
        System.out.println(sku + " : " + size + " : $" + price);

        sku = "E51346-NA-5599";
        size = findSize(sku);
        price = findPrice(sku);
        System.out.println(sku + " : " + size + " : $" + price);
    }

    public static String findSize(String sku)
    {
        // find the positions of the
        int index = sku.indexOf("-"); // finds the position of the FIRST - in the text => 4
        int lastIndex = sku.lastIndexOf("-"); // finds the position of the LAST - in the text => 8

        String size = sku.substring(index + 1, lastIndex);
        return size;
    }

    public static String findPrice(String sku)
    {
       int priceIndex = sku.lastIndexOf("-");
       String price = sku.substring(priceIndex + 1);
       return price;
    }
}