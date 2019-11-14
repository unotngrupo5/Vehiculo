package ejercicioHerenciaVehiculos;

public class Motocicleta extends Vehiculo{

	public Motocicleta(Persona chofer, int cant_km, Persona pasajero, int cant_pasajero) {
		super(chofer, cant_km, pasajero, cant_pasajero);
	}
	public void agregarPasajero() {
		if (super.getCant_pasajero() < 1 ) {
			super.setCant_pasajero(+1);
		}
	}
}
