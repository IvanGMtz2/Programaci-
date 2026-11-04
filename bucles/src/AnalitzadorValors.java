 

import java.util.Scanner;

public class AnalitzadorValors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombre, max=0, min=0, contadorMax=0, contadorMin=0, acumulador=0, cantidad;
		double mitjana;
		boolean apareixMesMin= false, apareixMesMax=false; 
		
		System.out.println("Quants nombres vols indtroduir: ");
		cantidad = sc.nextInt();
		
		while(cantidad <= 0) {
			System.out.println("Opció no vàlida!");
			System.out.println("Quants nombres vols indtroduir: ");
			cantidad = sc.nextInt();
		}

		for (int i = 1; i <= cantidad ; i++ ) {
			System.out.println("Introdueix el nombre "+i+": ");
			nombre = sc.nextInt();
			
			while(i==1 && min == 0) {
				min = nombre;
				max = nombre;
			}
			
			acumulador +=nombre;
			
			/* FACIL
			if(nombre>max) {
				max = nombre;
				
				
			}
			
			if(nombre<min) {
				min = nombre; 
			}
			*/
			
			if(nombre == max && i != 1 && apareixMesMax) {
				contadorMax++;
			}else if(nombre == max && contadorMax==0) {
				contadorMax++;
				apareixMesMax=true;
			}else if(nombre>max) {
				max = nombre;
				contadorMax=1;
			}
			

			if(nombre == min && i != 1 && apareixMesMin) {
				contadorMin++;
			}else if(nombre == min && contadorMin==0) {
				contadorMin++;
				apareixMesMin=true;
			}else if(nombre<min) {
				min = nombre;
				contadorMin = 1;
			}

		}
		
		mitjana = acumulador/cantidad;
		
		System.out.print("El valor màxim és: " + max);
		if(contadorMax>1) {
			System.out.println(" (apareix " + contadorMax +" vegades)");
		}
		System.out.print("El valor mínin és: " + min);
		if(contadorMin>1) {
			System.out.println(" (apareix " + contadorMin +" vegades)");
		}
		System.out.println("\r\nLa mitjana és: " + mitjana);
		sc.close();
		
	}

}
