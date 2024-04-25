package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{
    public static void main(String[] args)
    {
        String[] languages = {"Java", "C#", "JavaScript", "Python", "SQL"};
        writeToFile(languages);
    }

    public static void writeToFile(String[] words)
    {
        File file = new File("files/programming-languages.txt");

        try(FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
        )
        {
            for(String line : words)
            {
                // writer.write only adds the text to a buffer
                bufferedWriter.write(line);
                bufferedWriter.write("\n"); // adds a new line
            }

            // bufferedWriter.close() is called automatically here
            // when the writer closes the buffer is automatically flushed
        }
        catch(IOException ex)
        {

        }
    }
}
