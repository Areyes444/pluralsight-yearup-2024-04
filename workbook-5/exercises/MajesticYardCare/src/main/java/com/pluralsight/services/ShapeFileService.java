package com.pluralsight.services;

import com.pluralsight.models.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeFileService
{
    public static ArrayList<Shape>loadShapes()
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("data/shapes.csv")))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] tokens = line.split("\\|");

                String shapeType = tokens[0];
                double dimension1 = Double.parseDouble(tokens[1]);
                double dimension2 = Double.parseDouble(tokens[2]);

                Shape shape;
                switch (shapeType.toLowerCase()) {
                    case "circle":
                        shape = new Circle(dimension1);
                        break;
                    case "rectangle":
                        shape = new Rectangle(dimension1, dimension2);
                        break;
                    case "square":
                        shape = new Square(dimension1);
                        break;
                    case "triangle":
                        shape = new Triangle(dimension1, dimension2);
                        break;
                    default:
                        System.out.println("Unrecognized shape type: " + shapeType);
                        continue;
                }
                shapes.add(shape);

            }
        }
        catch (IOException e)
        {

        }

        return shapes;

    }

    public static void saveShapes(ArrayList<Shape> shapes)
    {
        try(PrintWriter writer = new PrintWriter(new File("data/shapes.csv")))
        {
            // add header row
            writer.println("typeOfShape|Dimension1|Dimension2");
            for(Shape shape: shapes)
            {
                String type = shape.getName();
                double dimension1 = shape.getDimension1();
                double dimension2 = shape.getDimension2();


                writer.printf("%s|%.2f|%.2f\n", type,dimension1,dimension2);
            }
        }
        catch (IOException e)
        {
        }
    }




}
