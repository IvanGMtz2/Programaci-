import java.util.Random;
import java.util.Scanner;

public class CorreCorre {

	public static void main(String[] args) {
		// Ivan Jesus Garces Martinez
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();		
		
		int numeroToros, velocidadToro, velocidadCorredor, velocidadMaximaToro=0;
		//Coloco el rango maximo y minimo dado en el ejercicio
		int rangoMaximo = 180, rangoMinimo=25;
		
		
		do {
			System.out.println("¿Número de Toros?");
			numeroToros = sc.nextInt();
			
			//Bucle con una cantidad definida de toros e imprimir cada vez su velocidad, si toma valores menores a 1 entonces finaliza
			for (int i = 1; i <= numeroToros; i++) {
				
				//La velocidad del toro es aleatoria pero con el rango definido
				velocidadToro = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
				
				//Para saber cual sera el valor de referencia busco el valor Maximo de las velocidades de los toros
				if(i==1) {
					velocidadMaximaToro = velocidadToro;
				}else {
					if(velocidadToro>velocidadMaximaToro) {
						velocidadMaximaToro = velocidadToro;
					}
				}

				System.out.println("Velocidad toro "+i+":"+velocidadToro);
			}
			
			if(numeroToros>0) {
				//Viendo los ejemplos, siempre toman la velocidad maxima + 1 para conservar la distancia "emocionante"
				velocidadCorredor = velocidadMaximaToro + 1;
				
				System.out.println();
				
				System.out.println("El corredor irá a "+velocidadCorredor+"km/h");
				
				System.out.println();
			}
			
			
		}while(numeroToros > 0);
		
		System.out.println("Finaliza el programa");
		
		sc.close();

	}

}
