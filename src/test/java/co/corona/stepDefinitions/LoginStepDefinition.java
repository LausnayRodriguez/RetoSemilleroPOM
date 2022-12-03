package co.corona.stepDefinitions;

import co.corona.steps.IniciarSesionStep;
import co.corona.steps.PaginaInicioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    IniciarSesionStep iniciarSesionStep;

    @Dado("^que el usuario se encuentre en la pagina web$")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        paginaInicioStep.abrirNavegador();
    }


    @Cuando("^el ingrese su usuario y clave de login$")
    public void elIngreseSuUsuarioYClaveDeLogin() throws IOException {
        paginaInicioStep.clicIngresa();
        iniciarSesionStep.ingresarCorreo();
        iniciarSesionStep.ingresarClave();
        iniciarSesionStep.clicIniciarSesion();
    }

    @Entonces("^el visualizara un mensaje de bienvenida$")
    public void elVisualizaraUnMensajeDeBienvenida() {
        paginaInicioStep.validarMsjBienvenida();
    }
}
