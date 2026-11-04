 

import java.util.Scanner;

public class exempleExercici2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, contador=0, acumulador=0;
		
		System.out.println("Introdueix un número (0 per acabar): ");
		numero = sc.nextInt();
		
		while(numero != 0) {
			contador++;
			acumulador +=numero; 
			System.out.println("Introdueix un número (0 per acabar): ");
			numero = sc.nextInt();
		}
		
		System.out.println("Números introduïts: "+ contador +"\r\n" + "Suma total: " + acumulador);
		sc.close();
		
	}

}
