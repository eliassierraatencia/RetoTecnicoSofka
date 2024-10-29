package co.co.sofka.demoblaze.tasks;

import co.co.sofka.demoblaze.models.UserData;
import co.co.sofka.demoblaze.userinterfaces.CreateUserPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import static co.co.sofka.demoblaze.userinterfaces.CreateUserPage.BTN_SIGN_IN;
import static co.co.sofka.demoblaze.userinterfaces.CreateUserPage.BTN_SIGN_UP;

public class CreateUser implements Task {

     UserData userData;

     public CreateUser(UserData userData){
         this.userData = userData;
     }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 JavaScriptClick.on(BTN_SIGN_IN),
                 Enter.theValue(UserData.getUser()).into(CreateUserPage.TXT_USR),
                 Enter.theValue(UserData.getPass()).into(CreateUserPage.TXT_PASS),
                 JavaScriptClick.on(BTN_SIGN_UP)

         );

    }
    public static CreateUser onTheSite(UserData userData){
         return Instrumented.instanceOf(CreateUser.class).withProperties(userData);
    }
}
