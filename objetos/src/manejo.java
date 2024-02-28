import java.util.ArrayList;
import java.util.Scanner;

public class manejo {
	public static Scanner sc_line = new Scanner(System.in);
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<materialL> Biblioteca = new ArrayList<materialL>();
	public static int id = 0;
	private static double total = 0;
	public static void newMaterial() throws InterruptedException {
		String input;
		do {
			System.out.println("Que quieres agregar: Libro/Revista/Articulo, X para salir");
			input = sc_line.nextLine();
			if (input.equalsIgnoreCase("x")) {
				return;
			}
		} while (!input.equalsIgnoreCase("libro") && !input.equalsIgnoreCase("revista") 
				&& !input.equalsIgnoreCase("articulo") && !input.equalsIgnoreCase("x"));
		System.out.println("Inserta titulo: ");
		String titulo = sc_line.nextLine();
		System.out.println("Inserta autor: ");
		String autor = sc_line.nextLine();
		System.out.println("Inserta tematica: ");
		String tematica = sc_line.nextLine();	
		if (input.equalsIgnoreCase("libro")) {
			libro L = new libro(id, titulo, autor, tematica, false);
			System.out.println("");
			System.out.println("Se ha añadido el libro: ");
			L.imprimir();
			Biblioteca.add(L);
		} else if (input.equalsIgnoreCase("revista")) {
			double precio;
			do {
				System.out.println("Que precio es? Mayor que 0");
				precio = sc.nextDouble();
			} while (precio < 0);
			revista R = new revista(id, titulo, autor, tematica, precio);
			System.out.println("");
			System.out.println("Se ha añadido la revista: ");
			R.imprimir();
			Biblioteca.add(R);
		} else if (input.equalsIgnoreCase("articulo")) {
			String disp;
			boolean disponible = false;
			do {
				System.out.println("Esta disponible? SI/NO");
				disp = sc_line.nextLine();
			} while (!disp.equalsIgnoreCase("SI") && !disp.equalsIgnoreCase("NO"));
			if (disp.equalsIgnoreCase("si")) {
				disponible = true;
			} else if (disp.equalsIgnoreCase("no")) {
				disponible = false;
			}
			articulo A = new articulo(id, titulo, autor, tematica, disponible);
			System.out.println("");
			System.out.println("Se ha añadido el articulo: ");
			A.imprimir();
			Biblioteca.add(A);
		}
	
	}
	public static void deleteMaterial() throws InterruptedException {
		int input;
		int aux = 0;
		System.out.println("Listado del material de la biblioteca:");
		for (materialL m : Biblioteca) {
			System.out.println("La posicion es: " + aux);
			m.imprimir();
			aux++;
			System.out.println();
		}
		do {
			System.out.println("Elimina mediante la posicion del material:");
			input = sc.nextInt();
		} while (input > Biblioteca.size()-1 || input < 0);
		Biblioteca.remove(input);
		
		
	}
	
	public static void modifyMaterial() throws InterruptedException {
		int input;
		int aux = 0;
		System.out.println("Listado del material de la biblioteca:");
		for (materialL m : Biblioteca) {
			System.out.println("La posicion es: " + aux);
			m.imprimir();
			aux++;
			System.out.println();
		}
		do {
			System.out.println("Modifica mediante la posicion del material:");
			input = sc.nextInt();
		} while (input > Biblioteca.size()-1 || input < 0);
		System.out.println("Modificaras el siguiente material:");
		Biblioteca.get(input).editar();
	}
	
	public static void imprimirtodo () throws InterruptedException {
		for (materialL m : Biblioteca) {
			m.imprimir();
			System.out.println();
		}
	}
	
	public static void comprarRevista () throws InterruptedException {
		boolean hayRevista = false;
		int aux = 0 ;
		int input = 0;
		int cantidad;
		double calculo;
		for (materialL m : manejo.Biblioteca) {
			if (m instanceof revista) {
				hayRevista = true;
			} 
		}
		if (hayRevista) {
			for (materialL m : manejo.Biblioteca) {
				if (m instanceof revista) {
					System.out.println("Las revistas son: \n");
					System.out.println("La posicion es: " + aux);
						m.imprimir();
						aux++;
						System.out.println();
					} else {
						aux++;
					}
			}
			do {
				System.out.println("Que revista quieres comprar, utiliza la posicion...");
				input = sc.nextInt();
			} while (input < 0 || input > manejo.Biblioteca.size()-1);
			materialL m2 = manejo.Biblioteca.get(input) ;
			if (m2 instanceof revista) {
				System.out.println("Esta es la revista seleccionada:");
				revista R = (revista) m2;
				R.imprimir();
				double precio = R.getPrecio();
				do {
					System.out.println("Cuantos quieres comprar?");
					cantidad = sc.nextInt();
				} while (cantidad < 0);
				calculo = precio*cantidad;
				total += calculo;
				System.out.println("El precio total de todas tus compras es: " + total);
			} else {
				System.out.println("No es una revista lo que has seleccionado...");
			}
		} else {
			System.out.println("No hay revistas...");
		}
		
	}
	public static void verDisponibilidad() throws InterruptedException {
		boolean hayArticulo = false;
		int aux = 0;
		int input = 0;
		for (materialL m : manejo.Biblioteca) {
			if (m instanceof articulo) {
				hayArticulo = true;
			} 
		}
		if (hayArticulo) {
			for (materialL m : manejo.Biblioteca) {
				if (m instanceof articulo) {
					System.out.println("Las articulos son: \n");
					System.out.println("La posicion es: " + aux);
						m.imprimir();
						aux++;
						System.out.println();
					} else {
						aux++;
					}
			}
			do {
				System.out.println("Que articulo quieres ver, utiliza la posicion...");
				input = sc.nextInt();
			} while (input < 0 || input > manejo.Biblioteca.size()-1);
			materialL m2 = manejo.Biblioteca.get(input);
			articulo A = (articulo) m2;
			System.out.println("El articulo con titulo: " + A.getTitulo() + " , disponibilidad es: " + A.isDisponible());
		} else {
			System.out.println("No hay articulos...");
		}
	}
	
}