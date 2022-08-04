package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PagoEnLinea_PO extends Base_PO{

    private @FindBy(css = "gasco-input#gascoInput" ) WebElement codCliente_TextField;

    private @FindBy(xpath = "//gasco-button[@type='primary']") WebElement ingreso_Btn;


    public void setCodCliente(String cod){ sendKeys(codCliente_TextField, cod);}

    public void clickBtnIngresar(){waitForWebElementAndClick(ingreso_Btn);}

    public void validarTextoBtnIngresar(String ingresarTxt){validarTextoBtnIngresar(ingreso_Btn);}


}
