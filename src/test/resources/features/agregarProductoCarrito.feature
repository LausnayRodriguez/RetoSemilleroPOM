#language: es

  Característica: Agregar producto a carrito de compra


  Antecedentes:
    Dado que el usuario se encuentre en la pagina web

    @Categoria
    Escenario: agregar producto a carrito exitoso
      Cuando el busque un producto por categoria o por la barra de busqueda y lo agregue al carrito de compras
      Entonces el visualizara un mensaje confirmando el producto agregado

