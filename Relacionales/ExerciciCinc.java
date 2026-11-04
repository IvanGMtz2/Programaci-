import java.util.Scanner;

public class ExerciciCinc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String contrasena;
		String contrasenaActual = "java2026";
		boolean mismaContra = false;

		System.out.println("Cual es la contraseña ?:");
		contrasena = sc.nextLine();


		if (contrasena.equals(contrasenaActual)) {
			mismaContra = true;
		}

		System.out.println("Contraseña correcta: " + mismaContra);

		sc.close();

	}

}
