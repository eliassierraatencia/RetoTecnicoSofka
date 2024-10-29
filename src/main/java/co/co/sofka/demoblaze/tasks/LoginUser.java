package co.co.sofka.demoblaze.tasks;

import co.co.sofka.demoblaze.models.UserData;
import co.co.sofka.demoblaze.userinterfaces.LoginUserPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.co.sofka.demoblaze.userinterfaces.LoginUserPage.BTN_LOG_IN;
import static co.co.sofka.demoblaze.userinterfaces.LoginUserPage.BTN_LOGIN;

public class LoginUser implements Task {

    UserData userData;

    public LoginUser(UserData dataLoginUser){
        this.userData = dataLoginUser;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_LOG_IN),
                Enter.theValue(UserData.getUser()).into(LoginUserPage.TXT_USER_LOGIN),
                Enter.theValue(UserData.getUser()).into(LoginUserPage.TXT_PASS_LOGIN),
                JavaScriptClick.on(BTN_LOGIN)
        );

    }

    public static LoginUser onTheSite(UserData userData){
        return Instrumented.instanceOf(LoginUser.class).withProperties(userData);
    }
}
