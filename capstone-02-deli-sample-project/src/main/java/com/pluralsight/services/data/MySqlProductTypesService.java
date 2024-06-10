package com.pluralsight.services.data;

import com.pluralsight.models.data.ProductType;

import java.util.List;

public class MySqlProductTypesService implements ProductTypesService
{
    @Override
    public List<ProductType> getAll()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getByCategory(String category)
    {
        return List.of();
    }

    @Override
    public List<ProductType> getBread()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getMeat()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getCheese()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getRegularToppings()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getSauces()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getSides()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getDrinks()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getChips()
    {
        return List.of();
    }

    @Override
    public List<ProductType> getSignature()
    {
        return List.of();
    }
}
