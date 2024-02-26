
public abstract class  Astro {
	private String nombre;
	private int peso;
	
	public Astro(String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	public abstract void mostrar();
	public abstract void tieneElementos();
		
}
