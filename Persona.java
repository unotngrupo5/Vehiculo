package ejercicioHerenciaVehiculos;

public class Persona {
	private String apellido;
	private Integer DNI;
	private Integer edad;

	public Persona(String apellido, int DNI, int edad) {
		this.setApellido(apellido);
		this.setDNI(DNI);
		this.setEdad(edad);
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}
	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
	public int getDNI() {
		return DNI;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
}
