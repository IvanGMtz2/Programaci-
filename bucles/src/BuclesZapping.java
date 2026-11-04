 

import java.util.Scanner;

public class BuclesZapping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int canalActual, canalDesitjat, limitSuperior = 99, limitInferior = 1;
		
		do {
			System.out.print("Introdueix canal actual i canal desitjat (Ex: 2 5): ");
			canalActual = sc.nextInt();
			canalDesitjat = sc.nextInt();
						
			while ((canalActual < limitInferior || canalActual > limitSuperior) && (canalActual == 0 && canalDesitjat != 0)) {
				System.out.println("Canal actual no vàlid (ha de ser entre "+limitInferior+" i "+limitSuperior+"). Torna-ho a provar:");
				canalActual = sc.nextInt();
			}
			
			while ((canalDesitjat < limitInferior || canalDesitjat > limitSuperior) && (canalActual != 0 && canalDesitjat == 0)) {
				System.out.println("Canal desitjat no vàlid (ha de ser entre "+limitInferior+" i "+limitSuperior+"). Torna-ho a provar:");
				canalDesitjat = sc.nextInt();
			}
			
			if (canalActual != 0 && canalDesitjat != 0) {
				int distanciaDirecta = Math.abs(canalActual - canalDesitjat);
				int distanciaCircular = limitSuperior - distanciaDirecta;
				int passosMinims = Math.min(distanciaDirecta, distanciaCircular);
				
				System.out.println(passosMinims);
			}
			
		} while (canalActual != 0 && canalDesitjat != 0); 
		
		System.out.println("Programa finalitzat.");
		sc.close();
	}
}
