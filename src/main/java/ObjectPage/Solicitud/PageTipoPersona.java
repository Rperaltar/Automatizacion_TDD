package ObjectPage.Solicitud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageTipoPersona {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.CSS,css = "#__next > div.contedor-fixed-tab > div > div > form > div.row.my-3 > div.col-lg-6.col-md-6.col-sm-12.pl-lg-5.pl-md-5.col-xs-12.mb-sm-2.mb-xs-2 > button")
    private WebElement PFAE;
    @FindBy(how = How.CSS,css=  "")
    private WebElement PERSONA_MORAL;
    @FindBy(how = How.CSS,css = "div.contedor-fixed-tab:nth-child(4) div.contedor-solicitud div.container.p-0 form:nth-child(1) div.flex-column-center-config.pt-sm-5.pt-xs-5.pt-md-0.pt-lg-0 > button.cicle-button-blue.my-3")
    private WebElement SUBMIT;


    //Constructor
    public PageTipoPersona(WebDriver driver){
        PageTipoPersona.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement PFAE() {
        return PFAE;
    }

    public WebElement PERSONA_MORAL() {
        return PERSONA_MORAL;
    }

    public WebElement SUBMIT() {
        return SUBMIT;
    }
}
