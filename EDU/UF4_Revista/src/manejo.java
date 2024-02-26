import java.util.Scanner;

public class manejo {
	private static Scanner s1 = new Scanner(System.in);
	private static Scanner s2 = new Scanner(System.in);
	private static Scanner s3 = new Scanner(System.in);
	public static void añadir_articulo() {
		String bucle = "S";
		while(bucle == "S") {
			Articulo articulo = new Articulo(0, null, null, null, false);
			articulo.agregar();
			articulo = new Articulo(articulo.getId(),articulo.getTitulo(), articulo.getAutor(), articulo.getTematica(),articulo.isDisponible());	
			main.Biblioteca.add(articulo);
			
			System.out.println();
			System.out.println("Quieres salir? S/N");
			bucle = s2.nextLine();
			System.out.println();
			
			if(bucle.equalsIgnoreCase("n")) {
				bucle = "S";
			}else {
				bucle = "N";
			}
		}
		mirar_biblioteca();
	}
	
	public static void añadir_revistas() {
		String bucle = "S";
		while(bucle == "S") {
			revistas revistas = new revistas(0, bucle, bucle, bucle, 0);
			revistas.agregar();
			revistas = new revistas(revistas.getId(),revistas.getTitulo(), revistas.getAutor(), revistas.getTematica(),revistas.getPrecio());	
			main.Biblioteca.add(revistas);
			
			System.out.println();
			System.out.println("Quieres salir? S/N");
			bucle = s2.nextLine();
			System.out.println();
			
			if(bucle.equalsIgnoreCase("n")) {
				bucle = "S";
			}else {
				bucle = "N";
			}
		}
		mirar_biblioteca();
	}
	
	public static void añadir_libro() {
		String bucle = "S";
		while(bucle == "S") {
			libro libro = new libro(0, bucle, bucle, bucle, false);
			libro.agregar();
			libro = new libro(libro.getId(),libro.getTitulo(), libro.getAutor(), libro.getTematica(),libro.isReservado());	
			main.Biblioteca.add(libro);
			
			System.out.println();
			System.out.println("Quieres salir? S/N");
			bucle = s2.nextLine();
			System.out.println();
			
			if(bucle.equalsIgnoreCase("n")) {
				bucle = "S";
			}else {
				bucle = "N";
			}
		}
		mirar_biblioteca();
	}
	
	public static void mirar_biblioteca() {
		for (materialL sd : main.Biblioteca) {
			System.out.println("---------------------------------------------------------------------");
			if (sd instanceof Articulo) {
				sd.imprimir();
			}else if (sd instanceof revistas) {
				sd.imprimir();
			}else if (sd instanceof libro) {
				sd.imprimir();
			}
			System.out.println("---------------------------------------------------------------------");
		}
	}
	
	public static void borrar(int id,String titulo,String autor,String tematica) {

		for (materialL sd : main.Biblioteca) {
			if(sd.getId() == id && sd.getTitulo().equalsIgnoreCase(titulo) && sd.getAutor().equalsIgnoreCase(autor) && sd.getTematica().equalsIgnoreCase(tematica)) {
				if (sd instanceof Articulo) {
					main.Biblioteca.remove(sd);
					System.out.println("Material Borrado Correctamente!!!\\n");
					return;
				}else if (sd instanceof revistas) {
					main.Biblioteca.remove(sd);
					System.out.println("Material Borrado Correctamente!!!\\n");
					return;
				}else if (sd instanceof libro) {
					main.Biblioteca.remove(sd);
					System.out.println("Material Borrado Correctamente!!!\\n");
					return;
				}
			}

		}
		System.out.println("ERROR");
	}
	
	public static void menu_borrar() {
		System.out.println("Dime el id.");
			int id = s1.nextInt();
		System.out.println("Dime el titulo.");
			String titulo = s2.nextLine();
		System.out.println("Dime el autor.");
			String autor = s2.nextLine();
		System.out.println("Dime la tematica.");
			String tematica = s2.nextLine();
		
			borrar(id, titulo, autor, tematica);
	}
	
	public static void menu_modificar() {
		System.out.println("Dime el id.");
			int id = s1.nextInt();
		System.out.println("Dime el titulo.");
			String titulo = s2.nextLine();
		System.out.println("Dime el autor.");
			String autor = s2.nextLine();
		System.out.println("Dime la tematica.");
			String tematica = s2.nextLine();
		
			modificar(id, titulo, autor, tematica);
	}
	
	public static void modificar(int id,String titulo,String autor,String tematica) {

		for (materialL sd : main.Biblioteca) {
			if(sd.getId() == id && sd.getTitulo().equalsIgnoreCase(titulo) && sd.getAutor().equalsIgnoreCase(autor) && sd.getTematica().equalsIgnoreCase(tematica)) {
				if (sd instanceof Articulo) {
					System.out.println();
					sd.agregar();
					System.out.println("Material Modificado Correctamente!!!\\n");
					return;
				}else if (sd instanceof revistas) {
					System.out.println();
					sd.agregar();
					System.out.println("Material Modificado Correctamente!!!\\n");
					return;
				}else if (sd instanceof libro) {
					System.out.println();
					sd.agregar();
					System.out.println("Material Modificado Correctamente!!!\n");
					return;
				}
			}

		}
		System.out.println("ERROR");
	}
}
