package co.co.sofka.demoblaze.stepdefinitions;

import co.co.sofka.demoblaze.models.UserData;
import co.co.sofka.demoblaze.tasks.CreateUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;




import static co.co.sofka.demoblaze.utils.GlobalData.ACTOR;
import static co.co.sofka.demoblaze.utils.GlobalData.URL;


public class CreateUserStepDefinitions {

    @Given("the user is on the demoblaze page")
    public void theUserIsOnTheDemoblazePage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("enter credenciales")
    public void enterCredenciales(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateUser.onTheSite(UserData.setData(dataTable).get(0)));
    }

    }

