package deberes;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static ArrayList<materialL> Biblioteca = new ArrayList<materialL>();
	private static Scanner s2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		String bucle = "S";
		while(bucle == "S") {
//			materialL materialL = new materialL(0, null, null, null);
//			materialL.agregar();
			Articulo articulo = new Articulo(0, null, null, null,false);
			articulo.agregar();
			Articulo sd = new Articulo(articulo.getId(),articulo.getTitulo(), articulo.getAutor(), articulo.getTematica(),articulo.isDisponible());	
			Biblioteca.add(sd);
//			materialL m1 = new materialL(materialL.getId(),materialL.getTitulo(), materialL.getAutor(), materialL.getTematica());	
//			Biblioteca.add(m1);
			
			
			System.out.println("Quieres salir? S/N");
			bucle = s2.nextLine();
			
			
			if(bucle.equalsIgnoreCase("n")) {
				bucle = "S";
			}else {
				bucle = "N";
			}
		}
		for (materialL sd : Biblioteca) {
			System.out.println("---------------------------------------------------------------------");
			if (sd instanceof Articulo) {
				sd.imprimir();
			}

		}

	}

}
