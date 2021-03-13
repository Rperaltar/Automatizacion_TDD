package ObjectPage.Simulador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

    private static WebDriver driver;

    //ObjectPage
    @FindBy(how = How.XPATH,xpath= "/html/body/app-root/app-login/div/div/section[2]/main/form/div[1]/div/input")
    private WebElement User;
    @FindBy(how = How.XPATH,xpath = "/html/body/app-root/app-login/div/div/section[2]/main/form/div[2]/div/input")
    private WebElement Pass;
    @FindBy(how = How.XPATH,xpath = "/html/body/app-root/app-login/div/div/section[2]/main/form/div[4]/button")
    private WebElement Ingresar;
    @FindBy(how = How.CLASS_NAME,className = "logout")
    private WebElement Salir;


    //Constructor
    public PageLogin(WebDriver driver){
        PageLogin.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement getUser() {
        return User;
    }

    public WebElement getPass() {
        return Pass;
    }

    public WebElement getIngresar() {
        return Ingresar;
    }

    public WebElement getSalir() {
        return Salir;
    }
}
