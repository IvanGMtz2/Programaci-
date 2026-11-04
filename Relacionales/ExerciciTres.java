import java.util.Scanner;

public class ExerciciTres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		boolean par = true;

		System.out.println("Dame un numero:");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			par = false;
		}

		System.out.println("Es par: " + par);

		sc.close();

	}

}
