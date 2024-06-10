package com.pluralsight.services.data;

import com.pluralsight.models.data.ProductType;

import java.util.List;

public interface ProductTypesService
{
    List<ProductType> getAll();
    List<ProductType> getByCategory(String category);
    List<ProductType> getBread();
    List<ProductType> getMeat();
    List<ProductType> getCheese();
    List<ProductType> getRegularToppings();
    List<ProductType> getSauces();
    List<ProductType> getSides();
    List<ProductType> getDrinks();
    List<ProductType> getChips();
    List<ProductType> getSignature();
}
