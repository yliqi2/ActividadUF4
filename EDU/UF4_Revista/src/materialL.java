
import java.util.Scanner;

public class materialL{
	private int id;
	private String titulo;
	private String autor;
	private String tematica;
	private	int id_scan;
	private String titulo_scan;
	private String autor_scan;
	private String tematica_scan;
	public static int id_auto = 0;
	
	public materialL(int id, String titulo, String autor, String tematica) {
		this.id = id_auto;
		this.titulo = titulo;
		this.autor = autor;
		this.tematica = tematica;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTematica() {
		return tematica;
	}
	
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	public void agregar() {
		
			setId(id_auto);
			id_auto++;

			Scanner s2 = new Scanner(System.in);
			System.out.println("Introduce el titulo: ");
			titulo_scan = s2.nextLine();
			setTitulo(titulo_scan);
			
			System.out.println("Introduce el autor: ");
			autor_scan = s2.nextLine();
			setAutor(autor_scan);
			
			System.out.println("Introduce el tematica: ");
			tematica_scan = s2.nextLine();
			setTematica(tematica_scan);
	}
	
	public void imprimir() {
		System.out.println("ID: " + getId());
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Tematica: " + this.tematica);
		
	}
	
}
