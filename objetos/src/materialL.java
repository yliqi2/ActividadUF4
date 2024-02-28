import java.util.Scanner;

public abstract class materialL {
	private int id;
	private String titulo;
	private String autor;
	private String tematica;
	public static Scanner sc = new Scanner (System.in);
	public static Scanner sc_line = new Scanner (System.in);
	
	public materialL(int id, String titulo, String autor, String tematica) {
		this.id = id;
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
	
	public abstract void imprimir() throws InterruptedException;
	
	public void editar() {
		System.out.println("Modificara el titulo: " + getTitulo());
		String titulo = sc_line.nextLine();
		setTitulo(titulo);
		System.out.println("EL nuevo titulo sera: " + getTitulo());
		System.out.println("Modificara el autor: " + getAutor());
		String autor = sc_line.nextLine();
		setAutor(autor);
		System.out.println("EL nuevo autor sera: " + getAutor());
		System.out.println("Modificara la tematica: " + getTematica());
		String tematica = sc_line.nextLine();
		setTematica(tematica);
		System.out.println("EL nuevo autor sera: " + getTematica());
	}
	public void agregar() {
		
	}
}
