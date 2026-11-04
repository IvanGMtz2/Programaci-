 

import java.util.Random;
import java.util.Scanner;

public class pedraPaperTisora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		
		int victoriesJugador=0, victoriesMaquina=0;
		int opcioJugador,opcioMaquina;
		
		System.out.println("=== JOC: PEDRA (1), PAPER (2), TISORA (3) ===\r\n" + "El primer que arribi a 5 victòries guanya!");
		
		do {
			opcioMaquina = random.nextInt(3) + 1;
			
			
			System.out.println("Tria (1=Pedra, 2=Paper, 3=Tisora): ");
			opcioJugador = sc.nextInt();
			            
			while(opcioJugador<1 || opcioJugador>3) {
				System.out.println("Opció no vàlida! Torna-ho a provar.");
				System.out.println("Tria (1=Pedra, 2=Paper, 3=Tisora): ");
				opcioJugador = sc.nextInt();
			}
			
			if(opcioJugador==opcioMaquina) {
				System.out.println("Empat!");
			}else if ((opcioJugador == 1 && opcioMaquina == 3) || 
				    (opcioJugador == 2 && opcioMaquina == 1) || 
				    (opcioJugador == 3 && opcioMaquina == 2)) {
				    
				    System.out.println("Has guanyat esta ronda!");
				    victoriesJugador++;
			}else {
				 System.out.println("Has perdut esta ronda!");
				 victoriesMaquina++;
			}
			
			System.out.println("Marcador -> Tu: "+victoriesJugador+" | Màquina: "+victoriesMaquina+"\r\n" + "------------------------------------");
		}while(victoriesJugador < 5 && victoriesMaquina < 5);

		if(victoriesJugador == 5) {
			System.out.println("Has guanyat la partida!");
		}else {
			System.out.println("Has perdut la partida!");
		}
		sc.close();
		
	}

}
