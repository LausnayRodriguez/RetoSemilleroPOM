package co.corona.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ResultadoBusquedaPageObject extends PageObject {

    By btnResultadoReferenciaProducto = By.xpath("(//a[@class='reference'])[1]");

    //By btnResultadoReferenciaProducto = By.xpath("//a[contains(text(),'REF 568052031')]");
    //By btnResultadoNombreProducto = By.xpath("(//a[@href='/productos/lavamanos/lavamanos-vento/p/O75401001'])[3]");


    public By getBtnResultadoReferenciaProducto() {
        return btnResultadoReferenciaProducto;
    }

    //public By getBtnResultadoNombreProducto() {
      //  return btnResultadoNombreProducto;
    //}
}
