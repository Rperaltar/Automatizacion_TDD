package ObjectPage.Simulador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSimulador {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.LINK_TEXT,linkText= "Simulador")
    private WebElement SIMULADOR;
    @FindBy(how = How.CSS,css= "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 div.row:nth-child(3) div.col-lg-6.col-md-6.col-xs-12.col-sm-12:nth-child(1) div.row.no-gutters div.col-lg-6.col-md-4.col-xs-12.col-sm-12:nth-child(2) div.select_custom-select__1hNCL > button.select_placeholder-color__3NK0y.select_select-small-blue__3ibiY.select_indicador__1xb8e")
    private WebElement PAGAR;
    @FindBy(how = How.CSS,css = "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 div.row:nth-child(3) div.col-lg-6.col-md-6.col-xs-12.col-sm-12:nth-child(2) div.row.no-gutters div.col-lg-7.col-md-6.col-xs-12.col-sm-12 div.select_custom-select__1hNCL > button.select_placeholder-color__3NK0y.select_select-small-blue__3ibiY.select_indicador__1xb8e")
    private WebElement PLAZOS;
    @FindBy(how = How.CSS,css = "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 div.row:nth-child(4) div.col-lg-6.col-md-6.col-xs-12.col-sm-12:nth-child(1) div.row.no-gutters div.col-lg-6.col-md-5.col-xs-12.col-sm-12:nth-child(2) div.select_custom-select__1hNCL > button.select_placeholder-color__3NK0y.select_select-small-blue__3ibiY.select_indicador__1xb8e")
    private WebElement ANTIGUEDAD;
    @FindBy(how = How.CSS,css = "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 form:nth-child(1) div.row:nth-child(5) div.col-lg-6.col-md-6.col-xs-12.col-sm-12.order-lg-last.order-md-last.order-sm-first.order-xs-first.my-3:nth-child(2) div.center-second-button > button.btn-medium")
    private WebElement INGRESOS;
    @FindBy(how = How.CSS,css = "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 form:nth-child(1) div.row:nth-child(5) div.col-lg-6.col-md-6.col-xs-12.col-sm-12.order-lg-last.order-md-last.order-sm-first.order-xs-first.my-3:nth-child(2) div.center-second-button > button.btn-medium")
    private WebElement SIMULAR_CREDITO;


    //Constructor
    public PageSimulador(WebDriver driver){
        PageSimulador.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement SIMULADOR() {
        return SIMULADOR;
    }

    public WebElement PAGAR() {
        return PAGAR;
    }

    public WebElement PLAZOS() {
        return PLAZOS;
    }

    public WebElement ANTIGUEDAD() {
        return ANTIGUEDAD;
    }

    public WebElement INGRESOS() {
        return INGRESOS;
    }

    public WebElement SIMULAR_CREDITO() { return SIMULAR_CREDITO; }
}
