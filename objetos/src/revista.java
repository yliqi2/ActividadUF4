import java.util.Scanner;

public class revista extends materialL{
	private double precio;
	public static Scanner sc = new Scanner (System.in);
	
	public revista(int id, String titulo, String autor, String tematica, double precio) {
		super(id, titulo, autor, tematica);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void imprimir() {
		System.out.println("El id es: " + getId());
		System.out.println("El titulo es: " + getTitulo());
		System.out.println("El autor es: " + getAutor());
		System.out.println("El tema es: " + getTematica());
		System.out.println("El precio es: " + this.precio);
	}

	@Override
	public void editar() {
		super.editar();
		System.out.println("Modificara el precio: " + getPrecio());
		double precio = sc.nextDouble();
		setPrecio(precio);
		System.out.println("El precio sera: " + getPrecio());
		
	}
	
}
