
import java.util.Scanner;
public class menu {
	
	public static Scanner sc_line = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		String eleccion = "0";
		boolean stockMaterial = false;
		while (!eleccion.equals("12")) {
			System.out.println("---------------MENU---------------");
			System.out.println("1.Agregar");
			System.out.println("2.Eliminar");
			System.out.println("3.Modificar");
			System.out.println("4.Buscar por titulo");
			System.out.println("5.Buscar por autor");
			System.out.println("6.Buscar por tematica");
			System.out.println("7.Reservar libros");
			System.out.println("8.Cancelar reserva libros");
			System.out.println("9.Mostrar Biblioteca");
			System.out.println("10.Comprar revista");
			System.out.println("11.Ver disponibilidad del articulo");
			System.out.println("12.Salir");
			System.out.println("---------------MENU---------------");
			eleccion = sc_line.nextLine();
			switch (eleccion) {
			case "1":
				manejo.newMaterial();
				manejo.id++;
				System.out.println();
				if (manejo.Biblioteca.size() != 0) {
					stockMaterial = true;
				}
				break;
			case "2":
				if (stockMaterial == true) {
					manejo.deleteMaterial();
					if (manejo.Biblioteca.size() == 0) {
						stockMaterial = false;
					}
					break;
				} else {
					System.out.println("No hay valores");
					break;
				}
			case "3":
				if (stockMaterial == true) {
					manejo.modifyMaterial();
					break;
				} else {
					System.out.println("No hay valores");
					break;
				}
			case "4":
				if (stockMaterial == true) {
					buscar.BuscarXtitulo();
					break;
				} else {
					System.out.println("No hay valores");
					break;
				}
			case "5":
				if (stockMaterial == true) {
					buscar.BuscarXautor();
					break;
				} else {
					System.out.println("No hay valores");
					break;
				}
			case "6":
				if (stockMaterial == true) {
					buscar.BuscarXtematica();
					break;
				} else {
					System.out.println("No hay valores");
					break;
				}
			case "7":
				reservas.reservarLibro();
				break;
			case "8":
				reservas.cancelarReservaLibro();
				break;
			case "9":
				if (stockMaterial == true) {
					manejo.imprimirtodo();
					break;
				} else {
					System.out.println("No hay valores");
					break;
				}
			case "10":
				break;
			case "11":
				break;
			case "12":
				System.out.println("Saliendo...");
				System.exit(0);
			}
		}	
	}
	
	
	
	
}

