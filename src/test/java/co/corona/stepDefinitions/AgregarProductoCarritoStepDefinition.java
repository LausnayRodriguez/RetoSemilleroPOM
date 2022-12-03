package co.corona.stepDefinitions;

import co.corona.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarProductoCarritoStepDefinition {
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    CategoriasProductosStep categoriasProductosStep;
    @Steps
    CategoriasPisosStep categoriasPisosStep;
    @Steps
    ResultadoBusquedaStep resultadoBusquedaStep;
    @Steps
    InformacionProductoStep informacionProductoStep;

    @Cuando("^el busque un producto por categoria o por la barra de busqueda y lo agregue al carrito de compras$")
    public void elBusqueUnProductoPorCategoriaOPorLaBarraDeBusquedaYLoAgregueAlCarritoDeCompras() throws IOException {
        paginaInicioStep.clicProductos();
        categoriasProductosStep.clicPisos();
        categoriasPisosStep.clicPisosParaExteriores();
        resultadoBusquedaStep.clicProductoEnResultado();
        informacionProductoStep.clicAgregarACarrito();
        informacionProductoStep.clicContinuarComprando();
        informacionProductoStep.clicBuscar();
        informacionProductoStep.ingresarNombreProducto();
        resultadoBusquedaStep.clicProductoEnResultado();
        informacionProductoStep.clicAgregarACarrito();
    }
    @Entonces("^el visualizara un mensaje confirmando el producto agregado$")
    public void elVisualizaraUnMensajeConfirmandoElProductoAgregado() {
        informacionProductoStep.validarAgregadoCarrito();
    }

}
