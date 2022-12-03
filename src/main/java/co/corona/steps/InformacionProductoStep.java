package co.corona.steps;

import co.corona.pageObjects.InformacionProductoPageObject;
import co.corona.utils.DataExcel;
import co.corona.utils.EsperaImplicita;
import co.corona.utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class InformacionProductoStep {

    InformacionProductoPageObject informacionProductoPageObject = new InformacionProductoPageObject();
    DataExcel dataExcel = new DataExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll = new Scroll();
    @Step
    public void clicAgregarACarrito(){
        //scroll.scrollElemento(informacionProductoPageObject.getDriver(), informacionProductoPageObject.getBtnMasScroll());
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getBtnAgregarACarrito()).click();
        esperaImplicita.esperaImplicita(5);
    }

    @Step
    public void validarAgregadoCarrito(){
        Assert.assertThat(informacionProductoPageObject.getDriver().
                findElement(informacionProductoPageObject.getMsjValidacionAgregadoCarrito()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clicContinuarComprando(){
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getBtnContinuarComprando()).click();

    }


    //agregar producto a carrito por Barra de Busqueda
    @Step
    public void clicBuscar(){
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getBtnBuscar()).click();
    }

    @Step
    public void ingresarNombreProducto() throws IOException {
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getTxtBuscarProducto()).
                sendKeys(dataExcel.leerDatosExcel("Data.xlsx", "ProductoABuscar",0,1)+ Keys.ENTER);
    }

}
