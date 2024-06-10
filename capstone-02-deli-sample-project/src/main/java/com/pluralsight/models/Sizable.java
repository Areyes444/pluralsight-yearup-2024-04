package com.pluralsight.models;

import com.pluralsight.models.enumerations.Size;

import java.math.BigDecimal;

public interface Sizable
{
    String getSize();

    BigDecimal getPrice();
}
