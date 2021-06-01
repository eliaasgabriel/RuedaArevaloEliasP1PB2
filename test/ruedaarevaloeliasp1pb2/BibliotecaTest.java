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
		
		assertEquals(3, matematicas.getCodigo(),0.01 );
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
