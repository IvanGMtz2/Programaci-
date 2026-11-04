 

import java.util.Scanner;

public class exempleExercici {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla, factor;
		
		System.out.println("Introdueix un número: ");
		tabla = sc.nextInt();
		
		System.out.println("Fins a quin factor vols la taula?: ");
		factor = sc.nextInt();
		
		for (int i = 1; i <= factor ; i++ ) {
		    
			int operation = i*tabla;
		    System.out.println(tabla + " x " + i + " = " + operation);
		}
		
		sc.close();
		
	}

}
