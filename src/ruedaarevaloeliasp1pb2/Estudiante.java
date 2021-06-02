package ruedaarevaloeliasp1pb2;

public class Estudiante {
	
	Integer dni = 0;
	String apellido = "";
	String nombre = "";
	
	public Estudiante(Integer dni, String apellido, String nombre) {
		
	}
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	public Integer getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
