 

import java.util.Random;
import java.util.Scanner;

public class exempleEndevinaElNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		int numeroR = random.nextInt(100) + 1;
		int numero=0, contador=1;
		boolean acertado=false;
		
		System.out.println("Endevina el número (entre 1 i 100). Tens 10 intents");
		
		/*
		while(numero != numeroR && contador<=10 ) {
			
			System.out.println("Intent "+contador+": ");
			numero = sc.nextInt();
			
			if(numero < numeroR) {
				System.out.println("El número és més gran.");
			}else{
				System.out.println("El número és més petit.");
			}
			
			contador++;
		}
		
		if(contador<=10) {
			System.out.println("Correcte! Has encertat en: "+contador+" intents!");
		}else {
			System.out.println("Has fracassat");
		}
		*/
		
		for(int i = 1; i<=10 && !acertado;i++) {
			System.out.println("Intent "+i+": ");
			numero = sc.nextInt();
			
			if(numero < numeroR) {
				System.out.println("El número és més gran.");
			}else{
				System.out.println("El número és més petit.");
			}
			
			if(numero==numeroR) {
				System.out.println("Correcte! Has encertat en: "+ i +" intents!");
				acertado=true;
			}
		}
		sc.close();
		
	}

}
