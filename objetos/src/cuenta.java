import java.util.ArrayList;
public class cuenta {

	public static void main(String[] args) {
		cuenta_object C1 = new cuenta_object("Liqi", 123232.22);
		cuenta_object C2 = new cuenta_object("Loco", 232.22);
		cuenta_object C3 = new cuenta_object("Paco", 1222332.22);
		ArrayList<cuenta_object> cuentas = new ArrayList<cuenta_object>(); 
		cuentas.add(C1);
		cuentas.add(C2);
		cuentas.add(C3);
		for (cuenta_object cuenta_object: cuentas) {
			cuentas.forEach(System.out::println);
		}
	}

}
