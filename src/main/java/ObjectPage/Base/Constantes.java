package ObjectPage.Base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constantes {

    public static String BANCOPPEL_PYME = "http://temporal-sta-portal-bsi-cr-pyme-web-stg.obe8.bancoppel-dev.openshiftapps.com/inicio";
    public static String CHROME_DRIVER_PATH = "C:\\Users\\Consultor\\Documents\\Py_Selenium\\Selenium_Framework\\src\\main\\java\\implementSelenium\\drivers\\";


    //TimeStamp
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    //Extent Report
    public static String PATH_EXTENT_REPORT = "C:\\TestRepoSelenium\\cocktailCoppelPyme_TestNG\\src\\Reports\\htmlReport\\";
    public static String PATH_NAME = "extentReport_";
    public static String PATH_EXTENSION = ".html";

    //Inputs Formulario Solictud Datos Personales
    public static String  PRIMER_NOMBRE    = "TestPRIMER_NOMBRE";
    public static String  SEGUNDO_NOMBRE   = "TestSEGUNDO_NOMBRE";
    public static String  PRIMER_APELLIDO  = "TestPRIMER_APELLIDO";
    public static String  SEGUNDO_APELLIDO = "TestSEGUNDO_APELLIDO";
    public static String  NOMBRE_EMPRESA   = "TestNOMBRE_EMPRESA";
    public static String  PLATICANOS       = "TestPLATICANOS";

}
