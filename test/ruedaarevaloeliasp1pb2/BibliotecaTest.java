package ruedaarevaloeliasp1pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queSePuedaCrearUnLibroDeHistoria() {
		Libro historia = new Historia((Integer)1, "Libro de historia", "Autor");
		
		assertNotNull(historia);
		assertEquals(1, historia.getCodigo(),0.01 );
	}
	
	@Test
	public void queSePuedaCrearUnLibroDeGeografia() {
		Libro geografia = new Geografia((Integer)2, "Libro de geografia", "Autor");
		
		assertNotNull(geografia);
		assertEquals(2, geografia.getCodigo(),0.01 );
	}
	
	@Test
	public void queSePuedaCrearUnLibroDeMatematicas() {
		Libro matematicas = new Matematicas((Integer)3, "Libro de matematicas", "Autor");
		
		assertNotNull(matematicas);
		assertEquals(3, matematicas.getCodigo(),0.01 );
	}
	
	@Test
	public void queSePuedaCrearUnEstudiante() {
		Estudiante nuevo = new Estudiante((Integer) 45998381, "Rueda Arévalo", "Elías");
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaCrearUnPrestamo() {
		Estudiante nuevo = new Estudiante((Integer) 45998381, "Rueda Arévalo", "Elías");
		Libro matematicas = new Matematicas((Integer)3, "Libro de matematicas", "Autor");
		
		Prestamo prestamo = new Prestamo((Integer) 1, nuevo, matematicas);
		assertNotNull(prestamo);
	}
	

	@Test
	public void queSePuedaPrestarUnLibro() {
		Estudiante nuevo = new Estudiante((Integer) 45998381, "Rueda Arévalo", "Elías");
		Libro matematicas = new Matematicas((Integer)3, "Libro de matematicas", "Autor");
	
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.prestarLibro((Integer) 1, nuevo, matematicas);
		
		assertNotNull(biblioteca.getPrestamo(1));
	}
	
	@Test
	public void queSeLleveUnRegistroDeLosPrestamos() {
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.prestarLibro(1, new Estudiante(1, "", ""), new Geografia (2, "", ""));
		biblioteca.prestarLibro(2, new Estudiante(2, "", ""), new Historia (5, "", ""));
		
		assertEquals((Integer)2, biblioteca.getRegistroPrestamos());
	}
	
	
	@Test
	public void queSeTengaUnRegistroDeAQueEstudianteSeLePrestoElLibro() {
		Estudiante nuevo = new Estudiante((Integer) 45998381, "Rueda Arévalo", "Elías");
		Libro matematicas = new Matematicas((Integer)3, "Libro de matematicas", "Autor");
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.prestarLibro((Integer) 1, nuevo, matematicas);
		
		assertEquals(biblioteca.getEstudiante(3), nuevo.getDni());
	}
	
	@Test
	public void queSePuedaImprimirLosLibrosImprimibles() {
		Estudiante nuevo = new Estudiante((Integer) 45998381, "Rueda Arévalo", "Elías");
		Libro matematicas = new Matematicas((Integer)3, "Libro de matematicas", "Autor");
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.imprimirLibro(3);
		
	}

}
