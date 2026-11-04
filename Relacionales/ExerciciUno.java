import java.util.Scanner;

public class ExerciciUno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int edad;
		boolean esMayor = false;
		
		System.out.println("Cual es tu edad?:");
		edad = sc.nextInt();
		
		if(edad >= 18) {
			esMayor = true;
		}
		
		System.out.println("Eres mayor de edad: " + esMayor);
		
		sc.close();

	}

}
