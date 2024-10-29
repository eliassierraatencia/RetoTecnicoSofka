package co.co.sofka.demoblaze.stepdefinitions;


import co.co.sofka.demoblaze.models.UserData;
import co.co.sofka.demoblaze.tasks.LoginUser;
import co.co.sofka.demoblaze.questions.ValiateTexT;
import static org.hamcrest.CoreMatchers.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.co.sofka.demoblaze.userinterfaces.LoginUserPage.TXT_VALIDATION;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefinitions {
    @When("user enters credentials")
    public void userEntersCredentials(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginUser.onTheSite(UserData.setData(dataTable).get(0)));

    }
       @Then("user should see a message {string}")
    public void userShouldSeeAMessage(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValiateTexT.of(TXT_VALIDATION), containsString(text)));

    }


}
