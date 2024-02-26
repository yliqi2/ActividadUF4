import java.util.Scanner;

public class revistas extends materialL{
	private double precio;
	public double comprado = 0;
	public Scanner s1 = new Scanner(System.in);
	public Scanner s2 = new Scanner(System.in);

	public revistas(int id, String titulo, String autor, String tematica, double precio) {
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
		super.imprimir();
		System.out.println("Precio: " + this.precio);
		
	}
	
	public void agregar() {
		String disponibilidad;
		super.agregar();
		
		System.out.println("Introduce el precio: ");
		int preciofinal = s2.nextInt();
		setPrecio(preciofinal);
		
	}
	
	public void comprar() {
		
		String comprado_final = s1.nextLine();
		System.out.println("Quieres Comprarlo? Y/N");
		
		if (comprado_final.equalsIgnoreCase("Y")) {

			comprado = s2.nextInt();
			imprimir();
			
		} else if (comprado_final.equalsIgnoreCase("N")) {
			
			
			
		} else {
			System.out.println("Se te redireccionara a la pagina de compra otra vez... (Introduce una respuesta valida!)");
			comprar();		
		}
	}
	
}
