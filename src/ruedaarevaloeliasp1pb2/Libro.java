package ruedaarevaloeliasp1pb2;

public class Libro {
	Integer codigo = 0;
	String nombre = "";
	String autor = "";
	
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	public Libro() {
		
	}

	public Integer getCodigo() {
		return this.codigo;
	}
	

}
