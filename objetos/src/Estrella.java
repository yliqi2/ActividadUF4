import java.util.ArrayList;

public class Estrella extends Astro {
	private String color;
	private ArrayList<Planeta> arrayPlanetas;

	public Estrella(String nombre, int peso, String color, ArrayList<Planeta> arrayPlanetas) {
		super(nombre, peso);
		this.color = color;
		this.arrayPlanetas = arrayPlanetas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ArrayList<Planeta> getArrayPlanetas() {
		return arrayPlanetas;
	}

	public void setArrayPlanetas(ArrayList<Planeta> arrayPlanetas) {
		this.arrayPlanetas = arrayPlanetas;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tieneElementos() { 
		//segundo planeta es nombre de variable
		for (Planeta planeta : arrayPlanetas) {
			System.out.println(planeta.getNombre());
		}
	}
	public void addPlaneta(Planeta P) {
		System.out.println("Se ha añadido el planeta: " + P);
		arrayPlanetas.add(P);
	}
	
}
