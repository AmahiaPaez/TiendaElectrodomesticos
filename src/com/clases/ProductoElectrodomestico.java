package com.clases;

public class ProductoElectrodomestico {
	String nombre;
	double precio;
	int cantidadDisponible;
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		this.nombre= nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}
	
	public ProductoElectrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("Producto: "+ this.nombre);
		System.out.println("Precio: "+ this.precio);
		System.out.println("Cantidad: "+ this.cantidadDisponible);
	}
	
	public void realizarVenta() {
	    if (this.cantidadDisponible > 0) {
	        this.cantidadDisponible--;
	        System.out.println("Venta realizada con éxito. Quedan: " + this.cantidadDisponible + " unidades de " + this.nombre);
	    } else {
	        System.out.println("Producto agotado: " + this.nombre);
	    }
	}
	
}