package ObjectPage.Simulador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageAntiguedad {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.CSS,css = "section.section-white-relative:nth-child(3) div.simulador_simulador-container__31xjH div.simulador_simulador-container__6Pywo div.container.p-0 div.card-simple-white-shadow.p-lg-5.p-md-4.p-sm-2.p-xs-2 div.row:nth-child(4) div.col-lg-6.col-md-6.col-xs-12.col-sm-12:nth-child(1) div.row.no-gutters div.col-lg-6.col-md-5.col-xs-12.col-sm-12:nth-child(2) div.select_custom-select__1hNCL ul.select_select-items__bmpAA li:nth-child(1) > button.select_item__QYZst")
    private WebElement MAS_DOS_AÑOS;
    @FindBy(how = How.CSS, css = "")
    private WebElement MENOS_DOS_AÑOS;


    //Constructor
    public PageAntiguedad(WebDriver driver) {
        PageAntiguedad.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement MAS_DOS_AÑOS() {
        return MAS_DOS_AÑOS;
    }

    public WebElement MENOS_DOS_AÑOS() {
        return MENOS_DOS_AÑOS;
    }
}
