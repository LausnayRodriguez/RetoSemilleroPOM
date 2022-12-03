package co.corona.steps;

import co.corona.pageObjects.CategoriasProductosPageObject;
import net.thucydides.core.annotations.Step;

public class CategoriasProductosStep {

    CategoriasProductosPageObject categoriasProductosPageObject = new CategoriasProductosPageObject();

    @Step
    public void clicPisos(){
        categoriasProductosPageObject.getDriver().findElement(categoriasProductosPageObject.getImgPisos()).click();

    }
}
