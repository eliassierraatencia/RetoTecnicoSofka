package co.co.sofka.demoblaze.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.co.sofka.demoblaze.userinterfaces.AddProductCart.*;

public class AddProductCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(SELECT_PRODUCT),
                JavaScriptClick.on(BTN_ADD),
                JavaScriptClick.on(PRODUCT_CART)
        );

    }

    public static AddProductCart addProductCart(){
        return Instrumented.instanceOf(AddProductCart.class).withProperties();
        }

    }

