package com.lambdaschool.solution;

public class MyApplication implements Processor {

    private AthleteCreator atl;

    public MyApplication(AthleteCreator atl) {this.atl = atl;}



    @Override
    public void displayAthlete(String athlete, String met){
        athlete =  "\n ***** eyes only ******\n" + athlete  + " "+ met + "\n***********\n";
        atl.printAthlete(athlete, met);
    }


}
