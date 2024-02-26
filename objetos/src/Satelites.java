
public class Satelites extends Astro {
	private boolean artificial;

	public Satelites(String nombre, int peso, boolean artificial) {
		super(nombre, peso);
		this.artificial = artificial;
	}
	
	public boolean isArtificial() {
		return artificial;
	}

	public void setArtificial(boolean artificial) {
		this.artificial = artificial;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tieneElementos() {
		// TODO Auto-generated method stub
		
	}
	
	public void esArtificial() {
		if (this.artificial == true) {
			System.out.println("Artificial = " + this.artificial);
		} else {
			System.out.println("Artificial = " + this.artificial);
		}
	}
	
}
