package ejercicioHerenciaVehiculos;

public class Autobus extends Vehiculo{

	public Autobus(Persona chofer, int cant_km, Persona pasajero, int cant_pasajero) {
		super(chofer, cant_km, pasajero, cant_pasajero);
	}

	public void agregarPasajero() {
		if (super.getCant_pasajero() < 20 ) {
			super.setCant_pasajero(+1);
		}
	}
}