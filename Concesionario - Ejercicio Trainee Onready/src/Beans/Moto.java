package Beans;

public class Moto extends Vehiculo {
	private int cilindradas;
	
	public Moto(String marca, String modelo, int cilindradas, double precio) {
		super(marca,modelo,precio);
		this.setCilindradas(cilindradas);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindradas: " + getCilindradas() + "cc // Precio: " + getFormatoPrecio().format(getPrecio());
	}
}
