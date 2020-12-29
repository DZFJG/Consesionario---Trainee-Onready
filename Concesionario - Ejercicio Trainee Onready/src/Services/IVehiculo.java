package Services;



import Beans.Vehiculo;

public interface IVehiculo {
	public Vehiculo vehiculoMasCaro();
	public Vehiculo vehiculoMasBarato();
	public Vehiculo modeloConLetra(String letra); 
}
