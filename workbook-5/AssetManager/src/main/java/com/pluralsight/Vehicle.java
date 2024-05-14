package com.pluralsight;

public class Vehicle extends Asset
{
    private String makeModel;
    private int year;
    private int odometer;
    private int currentYear;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer)
    {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
        this.currentYear = java.time.Year.now().getValue();
    }

    public String getMakeModel()
    {
        return makeModel;
    }

    public void setMakeModel(String makeModel)
    {
        this.makeModel = makeModel;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getOdometer()
    {
        return odometer;
    }

    public void setOdometer(int odometer)
    {
        this.odometer = odometer;
    }

    @Override
    public double getValue()
    {
        double originalCost = getOriginalCost();

        //Having a boolean to check if make is a Honda or toyota

        boolean isHondaOrToyota = makeModel.toUpperCase().contains("Honda") || makeModel.toUpperCase().contains("Toyota");

        //set the reduceCarValue to zero so we can implement percentages once we know the year of car
        double reduceCarValue = 0.0;

        if(!isHondaOrToyota)
        {
            int carYear = currentYear - year;
            if(carYear >= 0 && carYear <= 3 )
            {
                reduceCarValue = carYear * 0.03 *originalCost;
            } else if (carYear >= 4 && carYear <= 6) {
                reduceCarValue = carYear * 0.06 * originalCost;
            } else if (carYear >=7 && carYear <= 10) {
                reduceCarValue = carYear *0.08 * originalCost;
            }else{
                reduceCarValue = 1000.0;
            }

        }

        double totalValue = originalCost - reduceCarValue;

        return totalValue;

    }

}
