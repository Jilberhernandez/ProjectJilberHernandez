package co.com.choucair.certification.proyectojilber.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https:operacion.choucaretesting.com/academy/login/index.php")
public class ChoucareLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the( "button that shows uns tehe form to loging")
            .located(By.xpath("//div[@class ='d-none d-lg-black']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the( "Where do we write the user")
            .located(By.id("Username"));
    public static final Target INPUT_PASSWORD = Target.the( "Where do we write the Password")
            .located(By.id("Password"));
    public static final Target ENTER_BUTTON = Target.the( "Button to confirm login")
            .located(By.id("//button[contains(@class, 'bnt bnt-prymary')]"));
}