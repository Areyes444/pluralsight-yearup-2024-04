package com.pluralsight;

import com.pluralsight.models.Shape;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        // load all shapes into the arraylist

        // then print the toString() of each shape
        for (Shape shape: shapes)
        {
            System.out.println(shape);
        }
    }
}