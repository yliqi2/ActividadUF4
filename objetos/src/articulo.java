import java.util.Scanner;

public class articulo extends materialL{
	private boolean disponible;
	public static Scanner sc = new Scanner (System.in);
	
	public articulo(int id, String titulo, String autor, String tematica, boolean disponible) {
		super(id, titulo, autor, tematica);
		this.disponible = disponible;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public void imprimir() throws InterruptedException {
		System.out.println("El id es: " + getId());
		System.out.println("El titulo es: " + getTitulo());
		System.out.println("El autor es: " + getAutor());
		System.out.println("El tema es: " + getTematica());
		System.out.println("Disponibilidad: " + this.disponible);
		Thread.sleep(1000);
	}

	@Override
	public void editar() {
		super.editar();
		String disp;
		boolean disponible = false;
		System.out.println("Modificara el titulo: " + isDisponible());
		do {
			System.out.println("Esta disponible? SI/NO");
			disp = sc_line.nextLine();
		} while (!disp.equalsIgnoreCase("SI") && !disp.equalsIgnoreCase("NO"));
		if (disp.equalsIgnoreCase("si")) {
			disponible = true;
		} else if (disp.equalsIgnoreCase("no")) {
			disponible = false;
		}
		setDisponible(disponible);
	}
	
}