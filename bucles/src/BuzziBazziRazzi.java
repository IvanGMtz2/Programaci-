 

import java.util.Scanner;

public class BuzziBazziRazzi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int numero, contadorBuzzi = 0, contadorBazzi = 0, contadorRazzi = 0;
		
		System.out.print("Introdueix un número: ");
		numero = sc.nextInt();
		
		while (numero >= 0) {
			
			if (numero % 2 == 0 || numero % 3 == 0) {
				System.out.println(numero + " -> Buzzi");
				contadorBuzzi++;
			}
			
			if (numero % 3 == 0 && numero % 7 == 0) {
				System.out.println(numero + " -> Bazzi");
				contadorBazzi++;
			}
			
			if ((numero % 2 == 0 && numero % 5 == 0) || numero % 11 == 0) {
				System.out.println(numero + " -> Razzi");
				contadorRazzi++;
			}
			
			numero--;
		}
		
		System.out.println("----- RESULTATS FINALS -----");
		System.out.println("Buzzi trobats: " + contadorBuzzi);
		System.out.println("Bazzi trobats: " + contadorBazzi);
		System.out.println("Razzi trobats: " + contadorRazzi);
		
		sc.close();
		
	}

}