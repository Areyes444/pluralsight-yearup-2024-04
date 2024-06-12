package com.pluralsight.models;

public class Country
{
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer independenceYear;
    private Integer population;
    private Double lifeExpectancy;;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capitalCityId;
    private String twoLetterCode;

    public Country(String code, String name, String continent, String region, Double surfaceArea, Integer independenceYear, Integer population, Double lifeExpectancy, Double gnp, Double gnpOld, String localName, String governmentForm, String headOfState, Integer capitalCityId, String twoLetterCode)
    {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.independenceYear = independenceYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capitalCityId = capitalCityId;
        this.twoLetterCode = twoLetterCode;
    }

    public Country()
    {
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public Double getSurfaceArea()
    {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea)
    {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndependenceYear()
    {
        return independenceYear;
    }

    public void setIndependenceYear(Integer independenceYear)
    {
        this.independenceYear = independenceYear;
    }

    public Integer getPopulation()
    {
        return population;
    }

    public void setPopulation(Integer population)
    {
        this.population = population;
    }

    public Double getLifeExpectancy()
    {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy)
    {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Double getGnp()
    {
        return gnp;
    }

    public void setGnp(Double gnp)
    {
        this.gnp = gnp;
    }

    public Double getGnpOld()
    {
        return gnpOld;
    }

    public void setGnpOld(Double gnpOld)
    {
        this.gnpOld = gnpOld;
    }

    public String getLocalName()
    {
        return localName;
    }

    public void setLocalName(String localName)
    {
        this.localName = localName;
    }

    public String getGovernmentForm()
    {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm)
    {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState()
    {
        return headOfState;
    }

    public void setHeadOfState(String headOfState)
    {
        this.headOfState = headOfState;
    }

    public Integer getCapitalCityId()
    {
        return capitalCityId;
    }

    public void setCapitalCityId(Integer capitalCityId)
    {
        this.capitalCityId = capitalCityId;
    }

    public String getTwoLetterCode()
    {
        return twoLetterCode;
    }

    public void setTwoLetterCode(String twoLetterCode)
    {
        this.twoLetterCode = twoLetterCode;
    }
}
