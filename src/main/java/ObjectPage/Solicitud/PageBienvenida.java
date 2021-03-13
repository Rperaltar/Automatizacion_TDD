package ObjectPage.Solicitud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageBienvenida {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.CSS,css = "div.container.col-xs-11.col-sm-11.col-md-9.col-lg-8:nth-child(2) div.row.mx-0.mb-5.mt-2:nth-child(1) div.col-xs-12.col-sm-12.col-md-6.col-lg-6.mt-md-4.px-0:nth-child(2) div.px-md-4 div.col-md-10.col-sm-9.col-xs-8.offset-xs-2.offset-md-0.col-lg-8 div.row > button.col-md-12.simulador_solicitud-button__3ybY3.btn-medium")
    private WebElement COMIENZA_SOLICITUD;
    @FindBy(how = How.CSS,css=  "div.contedor-fixed:nth-child(2) div.contedor-solicitud div.container.p-0 div.row:nth-child(6) div.col-lg-6.col-md-6.col-xs-12.col-sm-12.order-lg-last.order-md-last.order-sm-first.order-xs-first.my-3:nth-child(2) div.center-second-button > button.btn-big")
    private WebElement COMIENZA_TU_SOLICITUD;
    @FindBy(how = How.CSS,css = "div.contedor-fixed:nth-child(2) div.contedor-solicitud div.container div.row.flex-column-start-config:nth-child(3) > button.btn-medium.flex-align-self-center.my-3")
    private WebElement COMENCEMOS;

    //Constructor
    public PageBienvenida(WebDriver driver){
        PageBienvenida.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement COMIENZA_SOLICITUD() {
        return COMIENZA_SOLICITUD;
    }

    public WebElement COMIENZA_TU_SOLICITUD() {
        return COMIENZA_TU_SOLICITUD;
    }

    public WebElement COMENCEMOS() {
        return COMENCEMOS;
    }
}
