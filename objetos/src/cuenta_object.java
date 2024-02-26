
public class cuenta_object {
	public cuenta_object(String nombre, double cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void mostrarInfo() {
		System.out.println(this.nombre + " tiene: " + this.cantidad);
	}
	private String nombre;
	private double cantidad;
}
