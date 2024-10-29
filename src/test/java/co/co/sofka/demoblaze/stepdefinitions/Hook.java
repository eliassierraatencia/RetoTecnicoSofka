package co.co.sofka.demoblaze.stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hook {
   @Before
    public void setup(){
       OnStage.setTheStage(new OnlineCast());
   }

}


