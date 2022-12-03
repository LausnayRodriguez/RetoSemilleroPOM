package co.corona.steps;

import co.corona.pageObjects.ResultadoBusquedaPageObject;
import net.thucydides.core.annotations.Step;

public class ResultadoBusquedaStep {

    ResultadoBusquedaPageObject resultadoBusquedaPageObject = new ResultadoBusquedaPageObject();

    //@Step
    //public void clicPisosParaExteriores(){
      //  resultadoBusquedaPageObject.getDriver().findElement(resultadoBusquedaPageObject.getBtnResultadoReferenciaProducto()).click();

    //}

    @Step
    public void clicProductoEnResultado(){
        resultadoBusquedaPageObject.getDriver().findElement(resultadoBusquedaPageObject.getBtnResultadoReferenciaProducto()).click();

    }

    //@Step
    //public void clicResultadoNombreProducto(){
     //   resultadoBusquedaPageObject.getDriver().findElement(resultadoBusquedaPageObject.getBtnResultadoNombreProducto()).click();

    //}

}
