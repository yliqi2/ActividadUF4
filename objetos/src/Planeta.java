import java.util.ArrayList;

public class Planeta extends Astro{
	private String tipo;
	private ArrayList<Satelites> arraySatelites;
	public Planeta(String nombre, int peso, String tipo) {
		super(nombre,peso);
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Satelites> getArraySatelites() {
		return arraySatelites;
	}

	public void setArraySatelites(ArrayList<Satelites> arraySatelites) {
		this.arraySatelites = arraySatelites;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void tieneElementos() {
		for (Satelites satelite : arraySatelites) {
			System.out.println(satelite.getNombre());
		}
	}
	
	public void addSatelite(Satelites s) {
		System.out.println("Se ha añadido el satelite: " + s);
		arraySatelites.add(s);
	}
	
}
