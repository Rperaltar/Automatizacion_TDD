package ObjectPage.Solicitud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageGiroSectorEmpresa {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.NAME,name = "nombreEmpresa")
    private WebElement NOMBRE_COMERCIAL;
    @FindBy(how = How.XPATH,xpath = "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/button[2]")
    private WebElement SECTOR;
    @FindBy(how = How.CSS, css  = "div.contedor-fixed-tab:nth-child(4) div.contedor-solicitud div.container.p-0 div.row.no-gutters:nth-child(4) div.col-lg-8.col-md-8.col-sm-12.col-xs-12.pr-lg-2.pr-md-2 div.select_custom-select__1hNCL ul.select_select-items__bmpAA li:nth-child(2) > button.select_item__QYZst.select_item-selected__msjT2")
    private WebElement COMERCIO;
    @FindBy(how = How.CSS, css  = "div.contedor-fixed-tab:nth-child(4) div.contedor-solicitud div.container.p-0 form:nth-child(1) div.row.no-gutters:nth-child(5) div.col-lg-8.col-md-8.col-sm-12.col-xs-12.pr-lg-2.pr-md-2 div.select_custom-select__1hNCL > button.select_select-big__2YtZ3.select_indicador__1xb8e")
    private WebElement GIRO;
    @FindBy(how = How.CSS,css = "div.contedor-fixed-tab:nth-child(4) div.contedor-solicitud div.container.p-0 div.row.no-gutters:nth-child(5) div.col-lg-8.col-md-8.col-sm-12.col-xs-12.pr-lg-2.pr-md-2 div.select_custom-select__1hNCL ul.select_select-items__bmpAA li:nth-child(1) > button.select_item__QYZst.select_item-selected__msjT2")
    private WebElement MAYORISTAS;
    @FindBy(how = How.NAME,name = "descripcionEmpresa")
    private WebElement PLATICANOS;
    @FindBy(how = How.CSS,css = "div.contedor-fixed-tab:nth-child(4) div.contedor-solicitud div.container.p-0 form:nth-child(1) div.flex-column-center-config.pt-sm-5.pt-xs-5.pt-md-0.pt-lg-0:nth-child(7) > button.cicle-button-blue.my-3")
    private WebElement SUBMIT;



    //Constructor
    public PageGiroSectorEmpresa(WebDriver driver){
        PageGiroSectorEmpresa.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement NOMBRE_COMERCIAL() {
        return NOMBRE_COMERCIAL;
    }
    public WebElement SECTOR() {
        return SECTOR;
    }
    public WebElement COMERCIO() {
        return COMERCIO;
    }
    public WebElement GIRO() {
        return GIRO;
    }
    public WebElement MAYORISTAS() {
        return MAYORISTAS;
    }
    public WebElement PLATICANOS() {
        return PLATICANOS;
    }
    public WebElement SUBMIT() {
        return SUBMIT;
    }
}

