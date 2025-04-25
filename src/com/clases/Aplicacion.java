package com.clases;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        ComputadoraPortatil computadora1 = new ComputadoraPortatil("Computadora 1", 120000.0, 8, "Lenovo", 5, 17);
        ComputadoraPortatil computadora2 = new ComputadoraPortatil("Computadora 2", 200000.0, 4, "Mac", 7, 10);

        Televisor tele1 = new Televisor("Tele1", 350000.0, 3, 56.0, 1080.0);
        Televisor tele2 = new Televisor("Tele2", 240000.0, 5, 80.0, 1200.0);

        tienda.agregarProducto(computadora1);
        tienda.agregarProducto(computadora2);
        tienda.agregarProducto(tele1);
        tienda.agregarProducto(tele2);

        System.out.println("--- Inventario antes ---");
        tienda.mostrarProductos();

     
        computadora1.realizarVenta();
        computadora2.realizarVenta();
        tele1.realizarVenta();
        tele2.realizarVenta();

        System.out.println("--- Inventario después de ventas ---");
        tienda.mostrarProductos();
    }
}

