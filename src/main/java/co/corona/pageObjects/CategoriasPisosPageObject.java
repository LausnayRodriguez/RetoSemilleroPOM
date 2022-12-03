package co.corona.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoriasPisosPageObject extends PageObject {

    By imgPisosParaExteriores = By.xpath("//h2[text()='PISOS PARA EXTERIORES']");

    public By getImgPisosParaExteriores() {
        return imgPisosParaExteriores;
    }
}
