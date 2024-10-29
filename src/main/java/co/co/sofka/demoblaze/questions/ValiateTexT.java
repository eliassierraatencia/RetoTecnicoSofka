package co.co.sofka.demoblaze.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValiateTexT implements Question<String> {

    Target element;

    public ValiateTexT(Target element) {
        this.element = element;

    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();

    }
    public static ValiateTexT of(Target element){
        return Instrumented.instanceOf(ValiateTexT.class).withProperties(element);
    }
}
