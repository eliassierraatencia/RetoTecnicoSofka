package co.co.sofka.demoblaze.stepdefinitions;

import co.co.sofka.demoblaze.tasks.AddProductCart;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class CartStepDefinitions {

    @Then("the user searches for specific product")
    public void theUserSearchesForSpecificProduct() {
    OnStage.theActorInTheSpotlight().wasAbleTo(AddProductCart.addProductCart());

    }
    @Then("the user clicks dd to Cart")
    public void theUserClicksDdToCart() {

    }
    @Then("Enter the shopping cart option")
    public void enterTheShoppingCartOption() {

    }
    @Then("the product should be in the shopping cart {string}")
    public void theProductShouldBeInTheShoppingCart(String string) {

    }

}
