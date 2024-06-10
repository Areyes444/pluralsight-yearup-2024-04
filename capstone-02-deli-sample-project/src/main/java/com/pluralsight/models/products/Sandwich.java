package com.pluralsight.models.products;

import com.pluralsight.models.Sizable;
import com.pluralsight.models.enumerations.Size;
import com.pluralsight.models.toppings.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product implements Sizable
{
    private static final BigDecimal PRICE_SM = new BigDecimal("5.50");
    private static final BigDecimal PRICE_MD = new BigDecimal("7.00");
    private static final BigDecimal PRICE_LG = new BigDecimal("8.50") ;

    private String size;
    private String bread;
    private boolean isToasted;

    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(String name, String size)
    {
        super(name);

        this.size = size;
    }

    public Sandwich()
    {
        super("Custom");
        this.size = "";
    }

    @Override
    public String getSize()
    {
        return this.size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getBread()
    {
        return bread;
    }

    public void setBread(String bread)
    {
        this.bread = bread;
    }

    public boolean isToasted()
    {
        return isToasted;
    }

    public void setToasted(boolean toasted)
    {
        isToasted = toasted;
    }

    public BigDecimal getBasePrice()
    {
        return switch (this.size)
        {
            case "Small" -> PRICE_SM;
            case "Medium" -> PRICE_MD;
            default -> PRICE_LG;
        };
    }

    @Override
    public BigDecimal getPrice()
    {
        var basePrice = getBasePrice();

        return toppings.stream()
                        .map(Topping::getPrice)
                        .reduce(basePrice, BigDecimal::add);
    }

    public boolean hasMeat()
    {
        return toppings.stream().anyMatch(topping -> topping instanceof Meat);
    }

    public boolean hasCheese()
    {
        return toppings.stream().anyMatch(topping -> topping instanceof Cheese);
    }

    public boolean hasSides()
    {
        return toppings.stream().anyMatch(topping -> topping instanceof Side);
    }

    public void addTopping(Topping topping)
    {
        topping.setSize(this.size);

        if(topping instanceof Meat && hasMeat()) topping.setExtra(true);
        else if(topping instanceof Cheese && hasCheese()) topping.setExtra(true);

        toppings.add(topping);
    }

    public List<Topping> getMeatToppings()
    {
        return toppings.stream().filter(t -> t instanceof Meat).toList();
    }

    public List<Topping> getCheeseToppings()
    {
        return toppings.stream().filter(t -> t instanceof Cheese).toList();
    }

    public List<Topping> getRegularToppings()
    {
        return toppings.stream().filter(t -> !(t instanceof Cheese) && !(t instanceof Meat) && !(t instanceof Sauce) && !(t instanceof Side)).toList();
    }

    public List<Topping> getSauces()
    {
        return toppings.stream().filter(t -> t instanceof Sauce).toList();
    }

    public List<Topping> getSides()
    {
        return toppings.stream().filter(t -> t instanceof Side).toList();
    }

    public boolean hasToppings()
    {
        return !toppings.isEmpty();
    }

    public  List<Topping> getToppings()
    {
        return toppings;
    }
}
