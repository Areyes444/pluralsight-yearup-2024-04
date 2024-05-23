package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Asset>assetsobject = new ArrayList<>();
        assetsobject.add(new House("Yellow","2014",1500000,"1700 truffle street",1,600,700));
        assetsobject.add(new House("Orange","2024",1800000,"8700 truffle street",3,800,800));
        assetsobject.add(new Vehicle("white","2016",6000,"Honda",2018,1900));
        assetsobject.add(new Vehicle("red","2024",77000,"GMC",2024,0));

        for(Asset asset: assetsobject)
        {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Value paid originally: $ " + asset.getOriginalCost());
            System.out.println("Current Value: $ " + asset.getValue());
            System.out.println();
        }
    }
}