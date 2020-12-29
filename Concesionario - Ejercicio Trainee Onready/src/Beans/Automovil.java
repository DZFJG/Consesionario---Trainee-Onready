package Beans;

public class Automovil extends Vehiculo {
	private int puertas;
	
	public Automovil(String marca, String modelo, int puertas, double precio) {
		super(marca,modelo,precio);
		this.setPuertas(puertas);
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + getPuertas() + " // Precio: $" + getPrecio();
	}
}
