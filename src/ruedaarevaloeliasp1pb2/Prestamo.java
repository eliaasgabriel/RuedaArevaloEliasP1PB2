package ruedaarevaloeliasp1pb2;

public class Prestamo {
	public Integer codigo = 0;
	public Prestamo librosPrestados[];
	public Libro libro = new Libro();
	public Estudiante  estudiante = new Estudiante();
	
	public Prestamo(Integer codigo, Estudiante estudiante, Libro libro) {
		this.librosPrestados = new Prestamo[10];
		this.codigo = codigo;
		this.estudiante = estudiante;
		this.libro = libro;
		
	}


	public Integer getCodigo() {
		
		return this.codigo;
	}
	
	public Integer getDniEstudiante() {
		return estudiante.getDni();
	}
	public Integer getCodigoLibro() {
		return libro.getCodigo();
	}



}
