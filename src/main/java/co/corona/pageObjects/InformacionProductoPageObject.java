package co.corona.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InformacionProductoPageObject extends PageObject {

    By btnAgregarACarrito = By.id("addToCartButton");
    By msjValidacionAgregadoCarrito = By.xpath("//div[contains(text(),'Agregado a tu carrito para envío')]");
    By btnContinuarComprando = By.xpath("//button[contains(text(),'Continuar comprando')]");

    //agregar producto a carrito por Barra de Busqueda
    By btnBuscar = By.className("header-icon");
    By txtBuscarProducto = By.id("js-site-search-input");


    //By btnMasScroll = By.xpath("//a[@href='#collapse-delivery']");
    //public By getBtnMasScroll() {
      //  return btnMasScroll;
    //}

    public By getBtnAgregarACarrito() {
        return btnAgregarACarrito;
    }

    public By getMsjValidacionAgregadoCarrito() {
        return msjValidacionAgregadoCarrito;
    }

    public By getBtnContinuarComprando() {
        return btnContinuarComprando;
    }
    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtBuscarProducto() {
        return txtBuscarProducto;
    }
}
