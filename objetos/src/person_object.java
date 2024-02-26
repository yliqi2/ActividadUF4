
public class person_object {
	
	private String name;
	private String dni;
	private int age;
	
	public person_object(String new_Name, String new_Dni, int new_Age) {
		this.name = new_Name;
		this.dni = new_Dni;
		this.age = new_Age;
	}
	
	public void mostrarPerson() {
		System.out.println("Nombre: " + this.name);
		System.out.println("Dni: " + this.dni);
		System.out.println("Edad: " + this.age);
	}
	public void MayorAge() {
		if (this.age < 18) {
			System.out.println(this.name + " no es mayor de edad.");
		} else {
			System.out.println(this.name + " si es mayor de edad.");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return this.dni;
	}

	public void setCity(String dni) {
		this.dni = dni;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
