package com.clases;

public class Televisor extends ProductoElectrodomestico {
    double tamanioPantalla;
    double resolucion;

    public Televisor(String nombre, double precio, int cantidadProducto, double tamanioPantalla, double resolucion) {
        super(nombre, precio, cantidadProducto);
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Información del Televisor ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad disponible: " + this.cantidadDisponible);
        System.out.println("Tamaño de pantalla: " + this.tamanioPantalla + " pulgadas");
        System.out.println("Resolución: " + this.resolucion);
        System.out.println("-----------------------------------");
    }
}
