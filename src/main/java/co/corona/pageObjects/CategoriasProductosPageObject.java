package co.corona.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoriasProductosPageObject extends PageObject {

    By imgPisos = By.xpath("//h2[text()='PISOS']");

    public By getImgPisos() {
        return imgPisos;
    }
}
