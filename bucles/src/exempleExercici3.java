 

import java.util.Scanner;

public class exempleExercici3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Introdueix un número (1-100): ");
			numero = sc.nextInt();
			if(!(numero >=1 && numero<=100)) {
				System.out.println("Número fora de rang. Torna-ho a provar.");
			}
			
		}while(!(numero >=1 && numero<=100));
		
		System.out.println("Número vàlid: "+ numero);
		sc.close();
		
	}

}
