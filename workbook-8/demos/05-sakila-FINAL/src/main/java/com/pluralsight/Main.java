package com.pluralsight;

import com.pluralsight.application.ApplicationConfiguration;
import com.pluralsight.application.SakilaMoviesApplication;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationConfiguration config = new ApplicationConfiguration();

        // the Application needs controllers and views
        SakilaMoviesApplication app = new SakilaMoviesApplication(config);
        app.run();

    }



}