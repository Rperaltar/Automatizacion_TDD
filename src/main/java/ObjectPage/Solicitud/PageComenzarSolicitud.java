package ObjectPage.Solicitud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageComenzarSolicitud {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.NAME,name = "primerNombre")
    private WebElement PRIMER_NOMBRE;
    @FindBy(how = How.NAME,name=  "segundoNombre")
    private WebElement SEGUNDO_NOMBRE;
    @FindBy(how = How.NAME,name = "primerApellido")
    private WebElement PRIMER_APELLIDO;
    @FindBy(how = How.NAME,name = "segundoApellido")
    private WebElement SEGUNDO_APELLIDO;
    @FindBy(how = How.CSS,css = "div.contedor-fixed-tab:nth-child(4) div.contedor-solicitud div.container.p-0 form:nth-child(1) div.flex-column-center-config.pt-sm-5.pt-xs-5.pt-md-0.pt-lg-0:nth-child(6) > button.cicle-button-blue.my-3")
    private WebElement SUBMIT;



    //Constructor
    public PageComenzarSolicitud(WebDriver driver){
        PageComenzarSolicitud.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement PRIMER_NOMBRE() {
        return PRIMER_NOMBRE;
    }

    public WebElement SEGUNDO_NOMBRE() {
        return SEGUNDO_NOMBRE;
    }

    public WebElement PRIMER_APELLIDO() {
        return PRIMER_APELLIDO;
    }

    public WebElement SEGUNDO_APELLIDO() {
        return SEGUNDO_APELLIDO;
    }

    public WebElement SUBMIT() {
        return SUBMIT;
    }
}

