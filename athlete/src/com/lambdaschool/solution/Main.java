package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;
//////
//        app = injector.getProcess();
//        app.displayAthlete();

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete( "track", "Runner");

//         Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Hockey", "Goalie");


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Rugby", "Athlete");

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Baseball", "Athlete");

    }
}
