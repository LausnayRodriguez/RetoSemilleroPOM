package co.corona.steps;

import co.corona.pageObjects.PaginaInicioPageObject;
import co.corona.utils.DataExcel;
import co.corona.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Step
    public void abrirNavegador(){
        paginaInicioPageObject.open();
    }

    @Step
    public void clicIngresa(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIngresa()).click();
    }

    @Step
    public void validarMsjBienvenida(){
        Assert.assertThat(paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.
                getMsjBienvenida()).isDisplayed(), Matchers.is(true));
    }

    //agregar producto a carrito por Categoria
    @Step
    public void clicProductos(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnProductos()).click();
        esperaImplicita.esperaImplicita(5);
    }




}
