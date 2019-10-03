package com.lambdaschool.solution;

public class MyApplication implements Processor {

    private Athlete atl;

    public MyApplication(Athlete atl) {this.atl = atl;}



    @Override
    public void displayAthlete(String athlete){
        athlete =  "\n *** eyes only ******" + athlete  + "\n***********";
        atl.displayAthlete(athlete);
    }


}
