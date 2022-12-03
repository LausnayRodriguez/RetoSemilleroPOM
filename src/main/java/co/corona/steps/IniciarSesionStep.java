package co.corona.steps;

import co.corona.pageObjects.IniciarSesionPageObject;
import co.corona.utils.DataExcel;
import co.corona.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class IniciarSesionStep {

    IniciarSesionPageObject iniciarSesionPageObject = new IniciarSesionPageObject();
    DataExcel dataExcel = new DataExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Step
    public void ingresarCorreo() throws IOException {
        iniciarSesionPageObject.getDriver().findElement(iniciarSesionPageObject.getTxtCorreo()).
                sendKeys(dataExcel.leerDatosExcel("Data.xlsx", "DatosLogin",1,0));
    }

    @Step
    public void ingresarClave() throws IOException {
        iniciarSesionPageObject.getDriver().findElement(iniciarSesionPageObject.getTxtClave()).
                sendKeys(dataExcel.leerDatosExcel("Data.xlsx", "DatosLogin",1,1));
    }

    @Step
    public void clicIniciarSesion(){
        iniciarSesionPageObject.getDriver().findElement(iniciarSesionPageObject.getBtnIniciarSesion()).click();
        esperaImplicita.esperaImplicita(5);
    }


}
