package Beans;

import java.text.DecimalFormat;

public class Vehiculo {
	private String marca;
	private String modelo;
	private double precio;
	private static final DecimalFormat FORMATO_PRECIO = new DecimalFormat("$#,###.00");
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPrecio(precio);
	}
	public Vehiculo() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public static DecimalFormat getFormatoPrecio() {
		return FORMATO_PRECIO;
	}

	@Override
	public String toString() {
		return this.getMarca() + " " + this.getModelo();
	}
}
