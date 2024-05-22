package com.pluralsight;

import com.pluralsight.models.*;
import com.pluralsight.models.interfaces.Drivable;
import com.pluralsight.models.interfaces.PowerTool;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println();
        System.out.println("Vehicles");
        ArrayList<Drivable> drivables = new ArrayList<>();

        drivables.add(new Truck("Ford", "F250"));
        drivables.add(new Truck("Ford", "F250"));
        drivables.add(new Truck("Ford", "F250"));
        drivables.add(new Truck("Ford", "F250"));
        drivables.add(new RidingMower("Toro","ft180"));
        drivables.add(new Sedan("Ford", "Focus"));
        drivables.add(new Sedan("Chevy", "Cobalt"));
        drivables.add(new Sedan("Nissan", "Sentra"));
        drivables.add(new RidingMower("Toro","ft180"));

        for (Drivable drivable : drivables)
        {
            drivable.repair();
            drivable.turnOn();
        }


        System.out.println();
        System.out.println("Power Tools");
        ArrayList<PowerTool> powerTools = new ArrayList<>();


        powerTools.add(new RidingMower("Toro","ft180"));
        powerTools.add(new RidingMower("Toro","ft180"));
        powerTools.add(new RidingMower("Toro","ft180"));
        powerTools.add(new RidingMower("Toro","ft180"));

        for (PowerTool powerTool : powerTools)
        {
            powerTool.repair();
        }
    }
}