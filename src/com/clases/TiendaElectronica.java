package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    ArrayList<ProductoElectrodomestico> listaDeProducto;

    public TiendaElectronica() {
        listaDeProducto = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProducto.add(producto);
    }

    public void mostrarProductos() {
        if (listaDeProducto.isEmpty()) {
            System.out.println("La lista de productos está vacía.");
        } else {
            for (ProductoElectrodomestico i : listaDeProducto) {
                i.mostrarInformacion();
                System.out.println("..................................");
            }
        }
    }

    public void buscarPorNombre(String nombreBuscado) {
        boolean encontrado = false;
        for (ProductoElectrodomestico i : listaDeProducto) {
            if (i.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Producto encontrado:");
                i.mostrarInformacion();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el producto con nombre: " + nombreBuscado);
        }
    }
}

