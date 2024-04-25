package com.pluralsight;

public class SwitchStatement
{

    public static void main(String[] args)
    {
        useSwitch("teen");
    }

    public static void useIf(String ageGroup)
    {

        if(ageGroup.equalsIgnoreCase("child"))
        {
            System.out.println(9.99);
        }
        else if (ageGroup.equalsIgnoreCase("teen"))
        {
            System.out.println(29.99);
        }
        else if (ageGroup.equalsIgnoreCase("adult"))
        {
            System.out.println(19.99);
        }
        else
        {
            System.out.println(12.99);
        }
    }

    public static void useSwitch(String ageGroup)
    {
        switch(ageGroup)
        {
            case "child":
                System.out.println(9.99);
                break;
            case "teen":
                System.out.println(29.99);
                break;
            case "adult":
                System.out.println(19.99);
                break;
            default:
                System.out.println(12.99);
                break;
        }
    }
}
