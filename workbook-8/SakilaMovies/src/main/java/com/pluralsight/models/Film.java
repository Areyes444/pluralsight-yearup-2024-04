package com.pluralsight.models;

import java.util.Date;
//Java Bean = DTO(Data Transfer Object)
public class Film
{
    private int id;
    private String title;
    private String description;
    private String releaseYear;
    private int languageId;
    private int originalLanguageId;
    private int rentalDuration;
    private int rentalRate;
    private int length;
    private double replacementCost;
    private String rating;
    private String specialFeatures;
    private String lastUpdate;

    public Film(int id, String title, String description, String releaseYear, int languageId, int originalLanguageId, int rentalDuration, int rentalRate, int length, double replacementCost, String rating, String specialFeatures, String lastUpdate)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.originalLanguageId = originalLanguageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length =length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.lastUpdate = lastUpdate;


    }

    public Film()
    {

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getReleaseYear()
    {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public int getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(int languageId)
    {
        this.languageId = languageId;
    }

    public int getOriginalLanguageId()
    {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(int originalLanguageId)
    {
        this.originalLanguageId = originalLanguageId;
    }

    public int getRentalDuration()
    {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration)
    {
        this.rentalDuration = rentalDuration;
    }

    public int getRentalRate()
    {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate)
    {
        this.rentalRate = rentalRate;
    }

    public double getReplacementCost()
    {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost)
    {
        this.replacementCost = replacementCost;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public String getRating()
    {
        return rating;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }

    public String getSpecialFeatures()
    {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures)
    {
        this.specialFeatures = specialFeatures;
    }

    public String getLastUpdate()
    {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate)
    {
        this.lastUpdate = lastUpdate;
    }


}
