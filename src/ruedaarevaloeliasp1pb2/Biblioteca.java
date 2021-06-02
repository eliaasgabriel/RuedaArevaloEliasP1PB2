package ruedaarevaloeliasp1pb2;

public class Biblioteca {
	public static Prestamo librosPrestados[];
	
	public Biblioteca() {
		this.librosPrestados = new Prestamo[10];
	}
	
	public void prestarLibro(Integer codigo, Estudiante nuevo, Libro matematicas) {
		Integer posicion = 0;
		
		while(librosPrestados[posicion] != null) {
			posicion++;
		}
		librosPrestados[posicion] = new Prestamo(codigo, nuevo, matematicas);
	}

	public static Prestamo getPrestamo(Integer codigo) {
		
		Integer posicion = 0;
		while(librosPrestados[posicion].getCodigo() != codigo) {
			posicion++;
		}
		return librosPrestados[posicion];
	}

	public Integer getRegistroPrestamos() {
		Integer contador = 0;
		for(Integer i = 0; i < librosPrestados.length; i++) {
			if(librosPrestados[i] != null) {
				contador++;
			}
	}
		return contador;
}

	public Integer getEstudiante(Integer codigoLibro) {
		Integer dniEstudiante = 0;
		Integer contador = 0;
		while(contador < librosPrestados.length) {
			contador ++;
			if(librosPrestados[contador].getCodigoLibro() == codigoLibro) {
				dniEstudiante = librosPrestados[contador].getDniEstudiante();
			}
		}
		return dniEstudiante;
		
	}

	/*public void imprimirLibro(Integer codigoLibro) {
		
		Integer posicion = 0;
		while(librosPrestados[posicion].getCodigoLibro() != codigoLibro) {
			posicion++;
		}
		if(librosPrestados[posicion].getTipoLibro() instance of )
		
	}*/
}
