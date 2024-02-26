
public class articulo extends materialL{
	private boolean disponible;

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
	public void imprimir() {
		System.out.println("El id es: " + getId());
		System.out.println("El titulo es: " + getTitulo());
		System.out.println("El autor es: " + getAutor());
		System.out.println("El tema es: " + getTematica());
		System.out.println("Disponibilidad: " + this.disponible);
		
	}
	
}
