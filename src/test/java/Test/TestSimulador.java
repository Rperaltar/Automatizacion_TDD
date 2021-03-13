package Test;

import ObjectPage.Simulador.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import implementSelenium.Actions_ScreenPlay.Implements.ModelActionsImpl;
import implementSelenium.Actions_ScreenPlay.Interfaces.ModelActions;
import implementSelenium.base.Constant;
import implementSelenium.screenShots.Ashot;
import implementSelenium.webDriver.Rdriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestSimulador extends Constant {

    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    public ModelActions actions = new ModelActionsImpl();
    public WebDriver driver;


    //SE CREA OBJETO PARA LOG
    //private static Logger log = LogManager.getLogger(TestSolicitud.class.getName());

    @BeforeMethod
    public static void setUp() {
        System.out.println("Iniciando Clase de Pruebas:" + new Object(){}.getClass().getName());
        // log.info("Iniciando Clase de Pruebas");
    }

    @AfterMethod
    public void closeTest(){
        extent.flush();
        System.out.println("Ejecucion Finalizada");
        //log.info("Ejecucion Finalizada");
    }

    @AfterClass
    public void closeBrowser(){
        actions.close(driver);
        actions.quit(driver);
    }

    @BeforeClass
    public void setUpEach() throws IOException, AWTException, IOException, AWTException {

        htmlReporter = new ExtentHtmlReporter(PATH_EXTENT_REPORT + PATH_NAME + TIME_STAMP + PATH_EXTENSION);

        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("W2A Automation Reports");
        htmlReporter.config().setReportName("Automation Test Results");
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Automation Tester", "Roberto Carlos");
        extent.setSystemInfo("Orgainzation", "Cocktail");
        extent.setSystemInfo("Build No", "W2A-1234");


        String url = "http://temporal-sta-portal-bsi-cr-pyme-web-stg.obe8.bancoppel-dev.openshiftapps.com/inicio";

        driver = Rdriver.CreateChromeDriver("C:\\Users\\Consultor\\Documents\\Py_Selenium\\Selenium_Framework\\src\\main\\java\\implementSelenium\\drivers\\",true);
        actions.getUrl(url,driver);
        actions.maximize(driver);
        Ashot.initScreenShot();
        //log.info("Ha desplegado correcatmente la Url;" + driver.getTitle());
    }

    @Test
    public void solicitud_PFAE() throws IOException, AWTException {



        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Test1 - solicitud_PFAE");

        PageSimulador simulador = new PageSimulador(driver);
        //1.-Datos de Entrada
        actions.click(simulador.SIMULADOR());
        actions.scrollDown(driver);
        //2.-Cuerpo de la Prueba
        System.out.println("Iniciando Prueba " + new Object(){}.getClass().getEnclosingMethod().getName());
        PagePagos pagos = new PagePagos(driver);
        actions.click(simulador.PAGAR());
        actions.click(pagos.MESES_12());
        PagePlazos plazos = new PagePlazos(driver);
        actions.click(simulador.PLAZOS());
        actions.click(plazos.MENSUALES());
        PageAntiguedad antiguedad = new PageAntiguedad(driver);
        actions.click(simulador.ANTIGUEDAD());
        actions.click(antiguedad.MAS_DOS_AÑOS());
        actions.sleep();
        actions.click(simulador.SIMULAR_CREDITO());
        //3.-Resultado de la Prue
        Assert.assertEquals("BanCoppel | Pymes",driver.getTitle());
        //4.-Clear de la Prueba
        Ashot.initScreenShot();
       // log.info("Test Passed");
        System.out.println("Test");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {


            String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
            test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
                    + "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
                    + " \n");

            String failureLogg = "TEST CASE FAILED";
            Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
            test.log(Status.FAIL, m);
            test.fail("Fail", MediaEntityBuilder.createScreenCaptureFromPath("Fail.png").build());


        } else if (result.getStatus() == ITestResult.SKIP) {

            String methodName = result.getMethod().getMethodName();

            String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  SKIPPED" + "</b>";

            Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
            test.skip(m);

        } else if (result.getStatus() == ITestResult.SUCCESS) {

            String methodName = result.getMethod().getMethodName();

            String logText = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  PASSED" + "</b>";

            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            test.pass(m);
            test.pass("Details", MediaEntityBuilder.createScreenCaptureFromPath("Screnshot.png").build());
        }
    }
}
