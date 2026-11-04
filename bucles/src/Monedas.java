 

import java.util.Random;
import java.util.Scanner;

public class Monedas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		
		int victoriesJugador = 0, victoriesMaquina = 0;
		int opcioJugador, opcioMaquina, sumaOpcio, apostaJugador, apostaMaquina;
		
		System.out.println("=== JOC: SUMAS MONEDAS ===\r\n" + "El primer que arribi a 5 victòries guanya!");
		
		do {
			opcioMaquina = random.nextInt(4); 
					
			System.out.println("Tria quantes monedes treus (0, 1, 2, 3): ");
			opcioJugador = sc.nextInt();
		
			while(opcioJugador < 0 || opcioJugador > 3) {
				System.out.println("Opció no vàlida! Torna-ho a provar.");
				System.out.println("Tria (0, 1, 2, 3): ");
				opcioJugador = sc.nextInt();
			}
			
			sumaOpcio = opcioJugador + opcioMaquina;
			
			// Demanar aposta al jugador
			System.out.println("Fes la teva aposta de la suma total (" + opcioJugador + " - 6): ");
			apostaJugador = sc.nextInt();
			            
			// Validar l'aposta del jugador
			while(apostaJugador < opcioJugador || apostaJugador > 6) {
				System.out.println("Opció no vàlida! Torna-ho a provar.");
				System.out.println("Fes la teva aposta de la suma total (" + opcioJugador + " - 6): ");
				apostaJugador = sc.nextInt();
			}

			do {
				apostaMaquina = opcioMaquina + random.nextInt(4); 
			} while(apostaJugador == apostaMaquina);
			
			// Mostrar què ha triat cadascú per fer el joc transparent
			System.out.println("-> Tu has tret " + opcioJugador + " monedes i la màquina " + opcioMaquina + " (Suma real = " + sumaOpcio + ")");
			System.out.println("-> La teva aposta: " + apostaJugador + " | Aposta màquina: " + apostaMaquina);
			
			// Comprovar guanyador de la ronda
			if (apostaJugador == sumaOpcio) {
				System.out.println("Has guanyat esta ronda!");
				victoriesJugador++;
			} else if (apostaMaquina == sumaOpcio) {
				System.out.println("Has perdut esta ronda!");
				victoriesMaquina++;
			} else {
				System.out.println("Empat! Ningú ha encertat la suma.");
			}
			
			// Mostrar marcador
			System.out.println("Marcador -> Tu: " + victoriesJugador + " | Màquina: " + victoriesMaquina + "\r\n" + "------------------------------------");
			
		} while(victoriesJugador < 5 && victoriesMaquina < 5);

		// Fi de la partida
		if(victoriesJugador == 5) {
			System.out.println("¡FELICITATS! Has guanyat la partida!");
		} else {
			System.out.println("¡OH NO! Has perdut la partida!");
		}
		
		sc.close();
	}
}
