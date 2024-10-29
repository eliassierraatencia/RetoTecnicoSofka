package co.co.sofka.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProductCart {

    public static Target  SELECT_PRODUCT = Target.the("")
            .located(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
    public static Target  BTN_ADD = Target.the("")
            .located(By.xpath("//a[normalize-space()='Add to cart']"));
    public static Target  PRODUCT_CART = Target.the("")
            .located(By.xpath("//a[@id='cartur']"));


}
