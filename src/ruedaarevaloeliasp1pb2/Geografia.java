package ruedaarevaloeliasp1pb2;

public class Geografia extends Libro implements Fotocopiable {

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	
	public void fotocopiar() {
		System.out.println("Soy un libro de Geografia");
	}

}
