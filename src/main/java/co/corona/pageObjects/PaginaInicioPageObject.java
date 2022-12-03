package co.corona.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://corona.co/")
public class PaginaInicioPageObject extends PageObject {

    //inicio de sesion
    By btnIngresa = By.className("account-pre-text");
    By msjBienvenida = By.xpath("//span[contains(text(),'Hola,')]");

    //agregar producto a carrito por Categoria
    By btnProductos = By.xpath("//a[@title='Productos']");





    public By getBtnIngresa() {
        return btnIngresa;
    }

    public By getMsjBienvenida() {
        return msjBienvenida;
    }

    public By getBtnProductos() {
        return btnProductos;
    }




}
