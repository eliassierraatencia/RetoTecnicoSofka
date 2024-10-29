package co.co.sofka.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {

    public static final Target BTN_SIGN_IN = Target.the("")
            .located(By.id("signin2"));

    public static final Target TXT_USR = Target.the("")
            .located(By.xpath("//input[@id='sign-username']"));

    public static final Target TXT_PASS = Target.the("")
            .located(By.xpath("//input[@id='sign-password']"));

    public static final Target BTN_SIGN_UP = Target.the("")
            .located(By.xpath("//button[contains(text(),'Sign up')]"));


}
