package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    String marca;
    int memoriaRam;
    int numeroSerie;

    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRam, int numeroSerie) {
        super(nombre, precio, cantidadDisponible); 
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("----- Información de la Computadora Portátil -----");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Cantidad disponible: " + this.cantidadDisponible);
        System.out.println("Marca: " + this.marca);
        System.out.println("Memoria RAM: " + this.memoriaRam + " GB");
        System.out.println("Número de serie: " + this.numeroSerie);
        System.out.println("--------------------------------------------------");
    }
}
