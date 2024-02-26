import java.util.ArrayList;
import java.util.Scanner;

public class person {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		person_object P = new person_object("Pepito", "X12345678", 20);		
		person_object P2 = new person_object("Manolo", "X12312312", 18);	
		person_object P3 = new person_object("Pedro", "X23123222", 12);
		ArrayList<person_object> array_P = new ArrayList<person_object>(); 
		array_P.add(P);
		array_P.add(P2);
		array_P.add(P3);
		for (int i = 0; i < array_P.size(); i++) {
			array_P.get(i).mostrarPerson();
			array_P.get(i).MayorAge();
			System.out.println();
		}
	}

}
