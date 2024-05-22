package com.pluralsight.models;

import com.pluralsight.models.interfaces.PowerTool;

public class RidingMower extends Vehicle implements PowerTool
{
    public RidingMower(String make, String model)
    {
        super(make, model);
    }

    @Override
    public void repair()
    {
        System.out.println("repairing RidingMower ... overrides Vehicle and PowerTool contracts");
    }
}
