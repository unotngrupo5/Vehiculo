package ejercicioHerenciaVehiculos;

public abstract class Vehiculo {
	private Persona chofer;
	private int cant_km = 0;
	private Persona pasajero;
	private int cant_pasajero = 0;
	

	public Vehiculo(Persona chofer, int cant_km, Persona pasajero, int cant_pasajero) {
		this.setChofer(chofer);
		this.setCant_km(cant_km);
		this.setPasajero(pasajero);
		this.setCant_pasajero(cant_pasajero);
	}
	public Persona getPasajero() {
		return pasajero;
	}
	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}
	public Persona getChofer() {
		return chofer;
	}
	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}
	public int getCant_km() {
		return cant_km;
	}
	public void setCant_km(int cant_km) {
		this.cant_km = cant_km;
	}
	public int getCant_pasajero() {
		return cant_pasajero;
	}
	public void setCant_pasajero(int cant_pasajero) {
		this.cant_pasajero = cant_pasajero;
	}
	
	public void asignarChofer() {
		this.setChofer(chofer);
	}
	public void cambiarChofer(Persona Chofer) {
		this.setChofer(chofer);
	}
	public abstract void agregarPasajero();
}
