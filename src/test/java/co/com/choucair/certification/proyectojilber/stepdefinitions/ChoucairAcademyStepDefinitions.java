package co.com.choucair.certification.proyectojilber.stepdefinitions;

import co.com.choucair.certification.proyectojilber.model.AcademyChoucairData;
import co.com.choucair.certification.proyectojilber.questions.Answer;
import co.com.choucair.certification.proyectojilber.tasks.Login;
import co.com.choucair.certification.proyectojilber.tasks.OpenUp;
import co.com.choucair.certification.proyectojilber.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

        @Given("^than brandon wants to learn automation at the academy Choucair$")
        public void thanbrandonwantstolearnautomationattheacademyChoucair (List<AcademyChoucairData> AcademyChourcairData) throws Exception{
           OnStage.theActorCalled("brandom").wasAbleTo(OpenUp.thePage(), Login.
                   onThePage(AcademyChourcairData.get(0).getStrUser(), AcademyChourcairData.get(0).getStrPassword()));
        }

        @When("^he search for the course (.*) on the choucair academy platform$")
        public void heSearchForTheCourseRecusosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> AcademyChourcairData) throws Exception{
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(AcademyChourcairData.get(0).getStrCourse()));
        }

        @Then("^he finds the course called resourses (.*)$")
        public void heFindsTheCourseCalledResoursesRecusosAutomatizacionBancolombia(List<AcademyChoucairData> AcademyChourcairData) throws Exception{
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(AcademyChourcairData.get(0).getStrCourse())));
        }

}
