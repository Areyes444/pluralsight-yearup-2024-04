package com.pluralsight.models;

import com.pluralsight.models.interfaces.PowerTool;

public class PushMower implements PowerTool
{
    @Override
    public void repair()
    {
        System.out.println("Repairing Push Mower");
    }
}
