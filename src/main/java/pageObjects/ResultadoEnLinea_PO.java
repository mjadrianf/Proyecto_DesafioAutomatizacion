package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultadoEnLinea_PO extends Base_PO{

    private @FindBy(css = ".clientNumber_number_detail" ) WebElement numeroClienteDetail_Text;

    private @FindBy(xpath = "paso2-sin-deuda  .text") WebElement sinDeudas_Text;


    public void validateNClienteDetail(String nCliente){ waitForElement_And_Validate(numeroClienteDetail_Text, nCliente);}

    public void validateSinDeudaText(String sinDeudaText){waitForElement_And_Validate(sinDeudas_Text, sinDeudaText);}


}
