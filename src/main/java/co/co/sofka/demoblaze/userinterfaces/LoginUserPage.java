package co.co.sofka.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserPage {

    public static Target BTN_LOG_IN = Target.the("")
            .located(By.id("login2"));
    public static Target TXT_USER_LOGIN = Target.the("")
            .located(By.id("loginusername"));
    public static Target TXT_PASS_LOGIN = Target.the("")
            .located(By.id("loginpassword"));
    public static Target BTN_LOGIN = Target.the("")
            .located(By.xpath("//button[contains(text(),'Log in')]"));

    public static final Target TXT_VALIDATION = Target.the("")
            .located(By.xpath("//a[contains(text(),'Welcome PRUEBAS_AUTOQA7')]"));
}
