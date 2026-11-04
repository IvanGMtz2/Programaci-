import java.util.Random;
import java.util.Scanner;

public class HuevosCaiman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ivan Jesus Garces Martinez */
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numeroHuevos, huevosMacho=0, huevosHembra=0;
		double temperatura, presionAtmosferica;

		
		System.out.print("Numero de huevos: ");
		numeroHuevos = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Temperatura[ºC]: ");
		temperatura = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Presión Atmosférica[hPa]: ");
		presionAtmosferica = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Huevos del caimán:");
		
		//Condiciones para saber el sexo		
		if((temperatura>=28 && temperatura <=30) && (presionAtmosferica> 1010)) { //Condiciones Para Machos
			huevosMacho=numeroHuevos;	
			
			for (int i = 1; i <= numeroHuevos; i++) {
				System.out.print("[M]");
				if(i%10==0) {
					System.out.println();
				}
			}
		}else if((temperatura>=31 && temperatura <=33) && (presionAtmosferica <= 1010)) { //Condiciones Para Hembra
			huevosHembra = numeroHuevos;
			
			for (int i = 1; i <= numeroHuevos; i++) {
				System.out.print("[H]");
				if(i%10==0) {
					System.out.println();
				}
			}
			
		}else {
			//Si no cumplen las dos condiciones anteriores entonces se decide de manera aleatoria
			for (int i = 1; i <= numeroHuevos; i++) {
				int aleatorio = random.nextInt(2); //Coloco rango de 0 a 1 para darle aleatoridad de 50%
				
				//Condicional en caso de ser el valor 1 es macho sino sera hembra 
				if(aleatorio == 1) {
					huevosMacho++;
					
					System.out.print("[M]");
					if(i%10==0) {
						System.out.println();
					}
					
				}else {
					huevosHembra++;
					
					System.out.print("[H]");
					if(i%10==0) {
						System.out.println();
					}
					
				}
			}
			
		}
		
		System.out.println();
		
		System.out.println("Total Machos:" + huevosMacho);
		System.out.println("Total Hembra:" + huevosHembra);
		
		sc.close();
	
	}

}
