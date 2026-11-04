import java.util.Scanner;

public class ExerciciDos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota;
		boolean aprobado = false;

		System.out.println("Cual es tu nota?:");
		nota = sc.nextDouble();

		if (nota >= 5) {
			aprobado = true;
		}

		System.out.println("Has aprobado: " + aprobado);

		sc.close();

	}

}
