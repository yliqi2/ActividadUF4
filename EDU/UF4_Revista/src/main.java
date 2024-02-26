import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static ArrayList<materialL> Biblioteca = new ArrayList<materialL>();
	private static Scanner s2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		System.out.println("1. Añadir.");
		System.out.println("2. Eliminar.");
		System.out.println("3. Modificar.");
		System.out.println("4. Buscar.");
		System.out.println("5. Reservar.");
		System.out.println("6. Salir.");
		
		String opcion = s2.nextLine();
		
		switch (opcion) {
		case "1":
			menu_1();
			menu();
			break;
		case "2":
			menu_2();
			menu();
			break;
		case "3":
			menu_3();
			menu();
			break;
		case "4":
			
			menu();
			break;
		case "5":
			
			menu();
			break;
		case "6":
			System.exit(0);
			break;
		default:
			menu();
			
			break;
		}

	}
	
	public static void menu_1() {
		System.out.println("Que quieres añadir?");
		System.out.println("1. Libro.");
		System.out.println("2. Articulo.");
		System.out.println("3. Revista.");
		System.out.println("4. Salir.");
		
		String opcion = s2.nextLine();
		
		switch (opcion) {
		case "1":
			manejo.añadir_libro();
			menu_1();
			break;
		case "2":
			manejo.añadir_articulo();
			menu_1();
			break;
		case "3":
			manejo.añadir_revistas();
			menu_1();
			break;
		case "4":
			menu();
			break;
		default:
			menu_1();			
			break;
		}
	}

	public static void menu_2() {
		System.out.println("Que quieres borrar?");
		System.out.println("1. Libro.");
		System.out.println("2. Articulo.");
		System.out.println("3. Revista.");
		System.out.println("4. Salir.");
		
		String opcion = s2.nextLine();
		
		switch (opcion) {
		case "1":
			manejo.menu_borrar();
			break;
		case "2":
			manejo.menu_borrar();
			break;
		case "3":
			manejo.menu_borrar();
			break;
		case "4":
			menu();
			break;
		default:
			menu_2();			
			break;
		}
	}
	public static void menu_3() {
		System.out.println("Seguro quieres modificar un material?");
		System.out.println("1. Si.");
		System.out.println("2. No.");
		
		String opcion = s2.nextLine();
		
		switch (opcion) {
		case "1":
			manejo.menu_modificar();
			break;
		case "2":
			menu();
			break;
		default:
			menu_3();			
			break;
		}
	}
}