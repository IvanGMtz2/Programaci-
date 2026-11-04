import java.util.Scanner;

public class ExerciciQuatre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int edadUno, edadDos;
		boolean mismaEdad = false;

		System.out.println("Edad de la primera persona:");
		edadUno = sc.nextInt();
		
		System.out.println("Edad de la segunda persona:");
		edadDos = sc.nextInt();

		if (edadUno == edadDos) {
			mismaEdad = true;
		}

		System.out.println("Tienen la misma edad: " + mismaEdad);

		sc.close();

	}

}
