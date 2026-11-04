 

import java.util.Scanner;

public class RadarTram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int distancia, velocitatMaxima, temps;
		
		do {
			System.out.print("Introdueix distància (m), velocitat màxima (km/h) i temps (s): ");
			distancia = sc.nextInt();
			velocitatMaxima = sc.nextInt();
			temps = sc.nextInt();
			
			while (distancia <= 0 && (distancia != 0 || velocitatMaxima != 0 || temps != 0)) {
				System.out.println("ERROR (La distància ha de ser superior a 0). Torna-ho a provar:");
				distancia = sc.nextInt();
			}
			
			while (velocitatMaxima <= 0 && (distancia != 0 || velocitatMaxima != 0 || temps != 0)) {
				System.out.println("ERROR (La velocitat ha de ser superior a 0). Torna-ho a provar:");
				velocitatMaxima = sc.nextInt();
			}
			
			while (temps <= 0 && (distancia != 0 || velocitatMaxima != 0 || temps != 0)) {
				System.out.println("ERROR (El temps ha de ser superior a 0). Torna-ho a provar:");
				temps = sc.nextInt();
			}
			
			if (distancia != 0 || velocitatMaxima != 0 || temps != 0) {
				
				double distanciaKm = distancia / 1000.0;
				double tempsHores = temps / 3600.0;
				double velocitatMitjana = distanciaKm / tempsHores;
				
				double llindarPunts = velocitatMaxima * 1.20;
				
				if (velocitatMitjana <= velocitatMaxima) {
					System.out.println("OK");
				} else if (velocitatMitjana < llindarPunts) {
					System.out.println("MULTA");
				} else {
					System.out.println("PUNTOS");
				}
			}
			
		} while (distancia != 0 || velocitatMaxima != 0 || temps != 0);
		
		System.out.println("Programa finalitzat.");
		sc.close();
	}
}
