package co.corona.steps;

import co.corona.pageObjects.CategoriasPisosPageObject;
import net.thucydides.core.annotations.Step;

public class CategoriasPisosStep {

    CategoriasPisosPageObject categoriasPisosPageObject = new CategoriasPisosPageObject();

    @Step
    public void clicPisosParaExteriores(){
        categoriasPisosPageObject.getDriver().findElement(categoriasPisosPageObject.getImgPisosParaExteriores()).click();

    }
}
