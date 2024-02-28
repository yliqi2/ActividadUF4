
import java.util.Scanner;

public class buscar {
	public static Scanner sc_line = new Scanner(System.in);
	public static Scanner sc = new Scanner(System.in);
	public static String input;
	public static int contador=0;
	
	public static void BuscarXtitulo() throws InterruptedException {
		System.out.println("Inserta el titulo: utiliza X para salir");
		String titulo = sc_line.nextLine();
		if(titulo.equalsIgnoreCase("x")) {
			return;
		}
		for (materialL m : manejo.Biblioteca) {
			if(m.getTitulo().equalsIgnoreCase(titulo)) {
				m.imprimir();
				System.out.println("");
				contador++;
			} 
			
		}
		if (contador == 0) {
			System.out.println("No existe...");
		}
		contador = 0;
}
//				if(m instanceof libro) {
//					m.getTitulo();
//					libro l = (libro) m;
//					l.isReservado();
//				}
	
	public static void BuscarXautor() throws InterruptedException {
		System.out.println("Inserta el autor: ");
		String autor = sc_line.nextLine();
		if(autor.equalsIgnoreCase("x")) {
			return;
		}
		for (materialL m : manejo.Biblioteca) {
			if(m.getAutor().equals(autor)) {
				m.imprimir();
				System.out.println("");
				contador++;
			} 
			
		}
		if (contador == 0) {
			System.out.println("No existe...");
		}
		contador = 0;
}
	
	public static void BuscarXtematica() throws InterruptedException {
		System.out.println("Inserta la tematica: ");
		String tematica = sc_line.nextLine();
		if(tematica.equalsIgnoreCase("x")) {
			return;
		}
			for (materialL m : manejo.Biblioteca) {
				if(m.getTematica().equals(tematica)) {
					m.imprimir();
					System.out.println("");
					contador++;
				} 
				
			}
			if (contador == 0) {
				System.out.println("No existe...");
			}
			contador = 0;
	}
}