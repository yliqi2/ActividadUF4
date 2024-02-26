
public abstract class materialL {
	private int id;
	private String titulo;
	private String autor;
	private String tematica;
	
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
	
	public void agregar() {
		
	}
}

