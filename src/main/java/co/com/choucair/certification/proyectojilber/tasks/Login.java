package co.com.choucair.certification.proyectojilber.tasks;

import co.com.choucair.certification.proyectojilber.userinterface.ChoucareLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage(Search strUser, Search strPassword) {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucareLoginPage.LOGIN_BUTTON),
            Enter.theValue("IngresaTuUsuario").into(ChoucareLoginPage.INPUT_USER),
            Enter.theValue("IngresaTuContraseña").into(ChoucareLoginPage.INPUT_PASSWORD),
            Click.on(ChoucareLoginPage.ENTER_BUTTON)
        );
    }
}
