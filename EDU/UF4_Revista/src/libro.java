import java.util.Scanner;

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
	
	public void agregar() {
		String reservado;
		super.agregar();
		
		do {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Introduce el disponibilidad: ");
			reservado = s2.nextLine();
		}while(!reservado.equalsIgnoreCase("True") && !reservado.equalsIgnoreCase("False"));
		
		if(reservado.equalsIgnoreCase("True")) {
			setReservado(true);
		} else {
			setReservado(false);
		}
		
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Esta reservado: " + this.reservado);
	} 
}
