package ObjectPage.Simulador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePagos {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.CSS,css = "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 div.row:nth-child(3) div.col-lg-6.col-md-6.col-xs-12.col-sm-12:nth-child(1) div.row.no-gutters div.col-lg-6.col-md-4.col-xs-12.col-sm-12:nth-child(2) div.select_custom-select__1hNCL ul.select_select-items__bmpAA li:nth-child(1) > button.select_item__QYZst")
    private WebElement MESES_12;
    @FindBy(how = How.CSS,css=  "")
    private WebElement MESES_16;
    @FindBy(how = How.CSS,css = "")
    private WebElement MESES_20;
    @FindBy(how = How.CSS,css = "")
    private WebElement MESES_26;
    @FindBy(how = How.CSS,css = "")
    private WebElement MESES_30;
    @FindBy(how = How.CSS,css = "")
    private WebElement MESES_36;



    //Constructor
    public PagePagos(WebDriver driver){
        PagePagos.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement MESES_12() {
        return MESES_12;
    }

    public WebElement MESES_16(){
        return MESES_16;
    }

    public WebElement MESES_20() {
        return MESES_20;
    }

    public WebElement MESES_26() {
        return MESES_26;
    }

    public WebElement MESES_30() {
        return MESES_30;
    }

    public WebElement MESES_36() {
        return MESES_36;
    }

}
