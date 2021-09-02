package co.com.choucair.certification.proyectojilber.tasks;

import co.com.choucair.certification.proyectojilber.userinterface.ChoucareLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucareLoginPage choucareLoginPage;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(Open.browserOn(choucareLoginPage));

    }
}
