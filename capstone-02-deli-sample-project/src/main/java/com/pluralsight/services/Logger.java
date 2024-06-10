package com.pluralsight.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Logger
{
    private static final String FILE_PATH = "logs/";

    private String filePath;

    public Logger(String fileName)
    {
        filePath = FILE_PATH + fileName;
    }

    public void logMessage(Exception err, String className)
    {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        String dateString = date.format(DateTimeFormatter.ISO_DATE);
        String timeString = time.format(DateTimeFormatter.ISO_LOCAL_TIME);

        StackTraceElement stackTraceElement = Arrays.stream(err.getStackTrace()).filter(ste -> ste.getClassName().equals(className)).toList().getFirst();

        try(FileWriter fileWriter = new FileWriter(filePath, true);
            PrintWriter writer = new PrintWriter(fileWriter))
        {
            writer.printf("%s|%s|%s|%s|%s|Line %d|%s\n"
                    , dateString
                    , timeString
                    , stackTraceElement.getFileName()
                    , stackTraceElement.getClassName()
                    , stackTraceElement.getMethodName()
                    , stackTraceElement.getLineNumber()
                    , err.getMessage());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
