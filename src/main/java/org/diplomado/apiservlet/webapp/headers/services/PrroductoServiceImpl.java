package org.diplomado.apiservlet.webapp.headers.services;

import org.diplomado.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;

public class PrroductoServiceImpl implements ProductoService{
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computación", 175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computación", 40000));
    }
}
