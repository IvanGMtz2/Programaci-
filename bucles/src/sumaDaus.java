 

import java.util.Random;
import java.util.Scanner;

public class sumaDaus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		
		int sumaDaus, numTiros, dau1, dau2, mitjana, contador=0, acumulador=0;
		
		
		System.out.println("Quants llançaments vols fer?");
		numTiros = sc.nextInt();

		
		for (int i = 1; i <= numTiros ; i++ ) {
			
			dau1 = random.nextInt(7)+1;
			dau2 = random.nextInt(7)+1;
			sumaDaus = dau1 + dau2;
			System.out.println("Tirada "+i+": dau1="+dau1+", dau2="+dau2+" → suma="+sumaDaus);
		    
			if(sumaDaus % 7 == 0) {
				contador++;
			}
			
			acumulador +=sumaDaus;
			
		}
		
		mitjana = acumulador/numTiros;
		
		System.out.println("--------------------\r\n" + "Suma = 7 ha sortit "+contador+" vegades.\r\n" + "Mitjana de les sumes: "+ mitjana);
		
		sc.close();
		
	}

}
