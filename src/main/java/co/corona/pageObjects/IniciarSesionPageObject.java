package co.corona.pageObjects;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IniciarSesionPageObject extends PageObject {

    By txtCorreo = By.id("j_username");
    By txtClave = By.id("j_password");

    By btnIniciarSesion = By.xpath("//button[@class='btn btn-primary btn-block']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
