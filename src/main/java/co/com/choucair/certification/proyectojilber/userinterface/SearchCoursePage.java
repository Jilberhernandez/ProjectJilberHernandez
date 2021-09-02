package co.com.choucair.certification.proyectojilber.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {

    public static final Target LOGIN_UC = Target.the( "Selecciona la universidad Choucair")
            .located(By.xpath("//div[@id ='universidad']//strong')]"));
    public static final Target INPUT_COURSE = Target.the( "Busca el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the( "Click para buscar el curso")
            .located(By.id("//button[@class= 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the( "Click para buscar el curso")
            .located(By.id("//h4[contains(text(), 'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the( "Extrae el nombre del curso")
            .located(By.id("//h1[contains(text(), 'Recursos Automatización Bancolombia')]"));
}
