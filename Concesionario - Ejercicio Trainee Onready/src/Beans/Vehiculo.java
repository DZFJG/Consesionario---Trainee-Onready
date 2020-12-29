package Beans;



public class Vehiculo {
	private String marca;
	private String modelo;
	private double precio;
	
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

	@Override
	public String toString() {
		return this.getMarca() + " " + this.getModelo();
	}
}
