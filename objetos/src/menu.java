import java.util.ArrayList;
import java.util.Scanner;
public class menu {
	
	public static Scanner sc_line = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		String eleccion = "0";
		while (!eleccion.equals("9")) {
			System.out.println("---------MENU---------");
			System.out.println("1.Agregar");
			System.out.println("2.Eliminar");
			System.out.println("3.Modificar");
			System.out.println("4.Buscar por titulo");
			System.out.println("5.Buscar por autor");
			System.out.println("6.Buscar por tematica");
			System.out.println("7.Reservar");
			System.out.println("8.Cancelar reserva");
			System.out.println("9.Salir");
			System.out.println("---------MENU---------");
			eleccion = sc_line.nextLine();
			switch (eleccion) {
			case "1":
				manejo.newMaterial();
				manejo.id++;
				break;
			case "2":
				manejo.deleteMaterial();
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				System.out.println("Saliendo...");
				break;
			}
		}	
	}
	
	
	
	
}


