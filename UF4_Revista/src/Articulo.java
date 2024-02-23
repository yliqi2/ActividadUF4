import java.util.Scanner;

public class Articulo extends materialL {
	private boolean disponible;
	
	public Articulo(int id, String titulo, String autor, String tematica, boolean disponible) {
		super(id, titulo, autor, tematica);
		this.disponible = disponible;
	}
	
	public boolean verifyDisponible() {
		if(isDisponible() == true) {
			System.out.println("El articulo se encuentra actualmente DISPONIBLE");
			return true;
		}else {
			System.out.println("El articulo se encuentra actualmente NO DIPONIBLE");
			System.out.println("Por favor pongase en contacto con el autor para mas informacion");
			System.out.println("Autor : " + getAutor());
			return false;
		}
	}
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public void agregar() {
		String disponibilidad;
		super.agregar();
		
		do {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Introduce el disponibilidad: ");
			disponibilidad = s2.nextLine();
		}
		
		while(disponibilidad.equalsIgnoreCase("True") && disponibilidad.equalsIgnoreCase("False"));
		
		if(disponibilidad.equalsIgnoreCase("True")) {
			setDisponible(true);
		} else {
			setDisponible(false);
		}
		
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Disponibilidad: " + this.disponible);
	}
}
