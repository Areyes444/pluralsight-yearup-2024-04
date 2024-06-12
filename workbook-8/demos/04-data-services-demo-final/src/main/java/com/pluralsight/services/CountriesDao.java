package com.pluralsight.services;

import com.pluralsight.models.Country;

import java.util.List;

public interface CountriesDao
{
    Country getCountryByCode(String countryCode);

    List<Country> getCountriesByRegion(String region);

    List<Country> getCountriesByContinent(String continent);
}
