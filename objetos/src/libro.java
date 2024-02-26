
public class libro extends materialL{
	private boolean reservado;

	public libro(int id, String titulo, String autor, String tematica, boolean reservado) {
		super(id, titulo, autor, tematica);
		this.reservado = reservado;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	//TODO funcion reservar
	public void reservar() {
		
	}
	
	public void cancelarReserva() {
		
	}
	
	@Override
	public void imprimir() throws InterruptedException {
		System.out.println("El id es: " + getId());
		System.out.println("El titulo es: " + getTitulo());
		System.out.println("El autor es: " + getAutor());
		System.out.println("El tema es: " + getTematica());
		System.out.println("Esta reservado: " + this.reservado);
		Thread.sleep(1000);
	}

	@Override
	public void editar() {
		super.editar();
	} 
}
