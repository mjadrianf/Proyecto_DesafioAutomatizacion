package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.PagoEnLinea_PO;
import pageObjects.ResultadoEnLinea_PO;
import utils.Global_Vars;

public class PagoEnLinea_Steps extends Base_PO {

 PagoEnLinea_PO pago = new PagoEnLinea_PO();
 ResultadoEnLinea_PO resultado = new ResultadoEnLinea_PO();

        @Given("Ingreso a la pagina de pago en linea")
        public void ingreso_pago_en_linea(){
          navigateTo_URL(Global_Vars.WEBDRIVER_GASCO_QA + "/pagos/#/pagoenlinea/paso1");
        }
        @When("Ingreso el numero de cliente correcto {string}")
        public void ingreso_numero_cliente(String cod){
            //input para n° cliente
                pago.setCodCliente(cod);
        }
        @And("Hacer click en el boton")
        public void hacer_click_boton_ingresar() {
                //hacer click btn ingresar
                pago.clickBtnIngresar();
        }
        @Then("Validar texto boton {string}")
        public void validar_texto_btn(String btnIngresar){
                //validacion del texto del boton

        }
        @Then("Validar texto incorrecto {string}")
        public void validar_texto_incorrecto_btn(String btnIncorrecto){
                //validar texto incorrecto del boton
        }
        @Then("Validar el correcto despliegue del listado de pago ")
        public void validar_correcto_despliegue(){
                //validar despliegue de informacion
        }
        @Then("Validar mensaje de cliente sin deudas")
        public void validar_mensaje_cliente_sin_deudas(){
                //validar msj cliente sin deeudas
        }






}
