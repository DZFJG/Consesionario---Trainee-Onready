package Services;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Beans.*;

public class IVehiculoImpl implements IVehiculo{
	private List<Vehiculo> listaVehiculos;	
	
	public void cargarVehiculos() {
		this.listaVehiculos = Arrays.asList(new Automovil("Peugeot","206",4,200000.00), new Moto("Honda","Titan",125,60000.00), new Automovil("Peugeot","208",5,250000.00),new Moto("Yamaha","YBR",160,80500.50));
	}
	
	public void ordenarVehiculosPorPrecio() {
		Collections.sort(this.listaVehiculos, (v1,v2) -> Double.valueOf(v2.getPrecio()).compareTo(Double.valueOf(v1.getPrecio())));
	}
	
	
	@Override
	public Vehiculo vehiculoMasCaro() {
		// TODO Auto-generated method stub
		Vehiculo max = new Vehiculo();
		max.setPrecio(0);
		for(Vehiculo v : listaVehiculos) {
			if(v.getPrecio()>max.getPrecio()) {
				max = v;
			}
		}
		return max;
	}

	@Override
	public Vehiculo vehiculoMasBarato() {
		// TODO Auto-generated method stub
		Vehiculo min = new Vehiculo();
		min.setPrecio(listaVehiculos.get(0).getPrecio());
		for(Vehiculo v : listaVehiculos) {
			if(v.getPrecio()<min.getPrecio()) {
				min = v;
			}
		}
		return min;
	}

	@Override
	public Vehiculo modeloConLetra(String letra) {
		// TODO Auto-generated method stub
		Vehiculo vContieneLetra = new Vehiculo();
		for(Vehiculo v : listaVehiculos) {
			if(v.getModelo().contains(letra)) {
				vContieneLetra = v;
			}
		}
		return vContieneLetra;
	}

	
	public void descripcion() {
		this.cargarVehiculos();
		this.listaVehiculos.forEach(v -> System.out.println(v.toString()));
		System.out.println("=============================");
		System.out.println("vehiculo más caro: " + this.vehiculoMasCaro().getMarca() + " " + this.vehiculoMasCaro().getModelo());
		System.out.println("vehiculo más barato: " + this.vehiculoMasBarato().getMarca() + " " + this.vehiculoMasBarato().getModelo());
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + this.modeloConLetra("Y").getMarca() + " " + this.modeloConLetra("Y").getModelo() + " " + new DecimalFormat("$#,###.00").format(this.modeloConLetra("Y").getPrecio()));
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precio de mayor a menor");
		this.ordenarVehiculosPorPrecio();
		this.listaVehiculos.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
	}
}
