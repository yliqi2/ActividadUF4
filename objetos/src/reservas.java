import java.util.Scanner;

public class reservas {
	private static boolean hayLibro = false;
	private static boolean hayLibroReservado = false;
	public static Scanner sc = new Scanner(System.in);
	public static void reservarLibro () throws InterruptedException {
		int aux = 0;
		int input = 0;
		if (hayLibro == true && hayLibroReservado == false) {
			for (materialL m : manejo.Biblioteca) {
				if (m instanceof libro) {
					if (((libro) m).isReservado() == false) {
						System.out.println("Los libros son: ");
						System.out.println("La posicion es: " + aux);
						m.imprimir();
						aux++;
						System.out.println();
					}
					//si no esta reservado 
					else {
						aux++;
					}
					//si no es un libro 
				} else {
					aux++;
				}	
			}
			do {
				System.out.println("Que libro quieres reservar, utiliza la posicion...");
				input = sc.nextInt();
			} while (input < 0 || input > manejo.Biblioteca.size()-1);
			
			materialL m2 = manejo.Biblioteca.get(input);
			if (m2 instanceof libro) {
				libro L = (libro) m2;
				System.out.println("Has cancelado la reserva del libro: " + L.getTitulo());
				L.setReservado(true);
				L.imprimir();
			} else {
				System.out.println("No es un libro lo que has seleccionado...");
			}
		} else {
			System.out.println("No hay libros o no hay libros para reservar...");
		}
	}
	
	public static void cancelarReservaLibro () throws InterruptedException {
		int aux = 0;
		int input = 0;
		if (hayLibro == true && hayLibroReservado == true) {
			for (materialL m : manejo.Biblioteca) {
				if (m instanceof libro) {
					if (((libro) m).isReservado() == true) {
						System.out.println("Los libros son: ");
						System.out.println("La posicion es: " + aux);
						m.imprimir();
						aux++;
						System.out.println();
					}
					//si no esta reservado 
					else {
						aux++;
					}
					//si no es un libro 
				} else {
					aux++;
				}	
			}
			do {
				System.out.println("Que libro quieres reservar, utiliza la posicion...");
				input = sc.nextInt();
			} while (input < 0 || input > manejo.Biblioteca.size()-1);
			//modificar el reservado
			materialL m2 = manejo.Biblioteca.get(input);
			if (m2 instanceof libro) {
				libro L = (libro) m2;
				System.out.println("Has reservado el libro: " + L.getTitulo());
				L.setReservado(false);
				L.imprimir();
			} else {
				System.out.println("No es un libro lo que has seleccionado...");
			}
		} else {
			System.out.println("No hay libros o no hay libros que se pueda cancelar la reserva");
		}
	}
	
	public static void comprobacionReserva () {
		for (materialL m : manejo.Biblioteca) {
			if (m instanceof libro) {
				hayLibro = true;
				if (((libro) m).isReservado() == false)  {
					hayLibroReservado = false;
					return;
				} else {
					hayLibroReservado = true;
				}
			} else {
				hayLibro = false;
			}
		}
	}
	
	public static void comprobacionCancelar () {
		for (materialL m : manejo.Biblioteca) {
			if (m instanceof libro) {
				hayLibro = true;
				if (((libro) m).isReservado() == true)  {
					hayLibroReservado = true;
					return;
				} else {
					hayLibroReservado = false;
				}
			} else {
				hayLibro = false;
			}
		}
	}
	
}
