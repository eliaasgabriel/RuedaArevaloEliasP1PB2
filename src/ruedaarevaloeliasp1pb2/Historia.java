package ruedaarevaloeliasp1pb2;

public class Historia extends Libro implements Fotocopiable {

	
	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}


	public void fotocopiar() {
		System.out.println("Soy un libro de Historia");
		
	}

}
