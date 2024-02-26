import java.util.ArrayList;
import java.util.Scanner;

public class manejo {
	public static Scanner sc_line = new Scanner(System.in);
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<materialL> Biblioteca = new ArrayList<materialL>();
	public static int id = 0;
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
			String res;
			boolean reserva = false;
			do {
				System.out.println("Esta reservado? SI/NO");
				res = sc_line.nextLine();
			} while (!res.equalsIgnoreCase("SI") && !res.equalsIgnoreCase("NO"));
			if (res.equalsIgnoreCase("si")) {
				reserva = true;
			} else if (res.equalsIgnoreCase("no")) {
				reserva = false;
			}
			libro L = new libro(id, titulo, autor, tematica, reserva);
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
			System.out.println("Se ha añadido la revista: ");
			R.imprimir();
			Biblioteca.add(R);
		} else {
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
			System.out.println("Se ha añadido el articulo: ");
			A.imprimir();
			Biblioteca.add(A);
		}
	
	}
	public static void deleteMaterial() throws InterruptedException {
		int input;
		System.out.println("Listado del material de la biblioteca:");
		for (materialL m : Biblioteca) {
			m.imprimir();
			System.out.println();
		}
		do {
			System.out.println("Elimina mediante la posicion del material:");
			input = sc.nextInt();
		} while (input > Biblioteca.size());
		Biblioteca.remove(input);
		
		
	}
}
