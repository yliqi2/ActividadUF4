import java.util.ArrayList;
import java.util.Scanner;

public class buscar {
	public static Scanner sc_line = new Scanner(System.in);
	public static Scanner sc = new Scanner(System.in);
	public static String input;
	
	public static void BuscarXtitulo() throws InterruptedException {
		do {
			System.out.println("Que quieres buscar: Libro/Revista/Articulo, X para salir");
			input = sc_line.nextLine();
			if (input.equalsIgnoreCase("x")) {
				return;
			}
		} while (!input.equalsIgnoreCase("libro") && !input.equalsIgnoreCase("revista") 
				&& !input.equalsIgnoreCase("articulo") && !input.equalsIgnoreCase("x"));
		System.out.println("Inserta el titulo: ");
		String titulo = sc_line.nextLine();
		if (input.equalsIgnoreCase("libro")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(titulo)) {
					m.imprimir();
				}
//				if(m instanceof libro) {
//					m.getTitulo();
//					libro l = (libro) m;
//					l.isReservado();
//				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
		} else if (input.equalsIgnoreCase("revista")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(titulo)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
		} else if (input.equalsIgnoreCase("articulo")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(titulo)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
			}
	}
	
	public static void BuscarXautor() throws InterruptedException {
		do {
			System.out.println("Que quieres buscar: Libro/Revista/Articulo, X para salir");
			input = sc_line.nextLine();
			if (input.equalsIgnoreCase("x")) {
				return;
			}
		} while (!input.equalsIgnoreCase("libro") && !input.equalsIgnoreCase("revista") 
				&& !input.equalsIgnoreCase("articulo") && !input.equalsIgnoreCase("x"));
		System.out.println("Inserta el autor: ");
		String autor = sc_line.nextLine();
		if (input.equalsIgnoreCase("libro")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(autor)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
		} else if (input.equalsIgnoreCase("revista")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(autor)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
		} else if (input.equalsIgnoreCase("articulo")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(autor)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
			}
	}
	
	public static void BuscarXtematica() throws InterruptedException {
		do {
			System.out.println("Que quieres buscar: Libro/Revista/Articulo, X para salir");
			input = sc_line.nextLine();
			if (input.equalsIgnoreCase("x")) {
				return;
			}
		} while (!input.equalsIgnoreCase("libro") && !input.equalsIgnoreCase("revista") 
				&& !input.equalsIgnoreCase("articulo") && !input.equalsIgnoreCase("x"));
		System.out.println("Inserta el autor: ");
		String tematica = sc_line.nextLine();
		if (input.equalsIgnoreCase("libro")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(tematica)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
		} else if (input.equalsIgnoreCase("revista")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(tematica)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
		} else if (input.equalsIgnoreCase("articulo")) {
			for (materialL m : manejo.Biblioteca) {
				if(m.getTitulo().equals(tematica)) {
					m.imprimir();
				}
			}
			
			System.out.println("");
			Thread.sleep(1000);
			}
	}
}
