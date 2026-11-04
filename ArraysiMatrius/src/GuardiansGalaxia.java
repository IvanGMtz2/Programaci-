
public class GuardiansGalaxia {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 	Star-Lord: 85, 90, 78, 92
			Gamora: 95, 88, 91, 87
			Rocket: 70, 85, 80, 88
			El programa ha de:
			1. Mostrar la taula completa de puntuacions de forma visual, indicant quin guardià és cada fila.
			2. Calcular i mostrar la puntuació total de cada guardià (suma de totes les seves missions).
			3. Trobar quina és la puntuació més alta de tota la taula i indicar qui la va aconseguir i en quina
			missió.
			4. Comptar quantes puntuacions són perfectes (90 o més punts).
		 * 
		 * */
		
		int[][] puntuacions = {
				{85, 90, 78, 92},
				{95, 88, 91, 87},
				{70, 85, 80, 88}
		};
		
		int contadorStarLord=0, contadorGamora=0, contadorRocket=0;
		int guardiaMillorPuntuacio=puntuacions[0][0], guardianMillor=0, missio=0;
		int puntacionesPerfectas=0;
		
		
		System.out.println("=== TAULA DE PUNTUACIONS ===");
		System.out.println();
		//Bucle para recorrer las columnas
		for (int i = 0; i < puntuacions.length; i++) {
			
			//Impresion de nombre correspondiente a cada guardian
			if(i==0)
				System.out.print("Star-Lord: ");
			else if(i==1)
				System.out.print("Gamora: ");
			else if(i==2)
				System.out.print("Rocket: ");
			
			//Bucle para recorrer cada fila
			for (int j = 0; j < puntuacions[i].length; j++) {
				System.out.print(puntuacions[i][j] + " ");
				//Condicion para ir guardando en cada guardian su puntuacion de manera independiente
				if(i==0)
					contadorStarLord +=puntuacions[i][j];
				else if(i==1)
					contadorGamora +=puntuacions[i][j];
				else if(i==2)
					contadorRocket +=puntuacions[i][j];
				
				//Condicional para guardar los datos de la puntuació més alta de tota la taula i indicar qui la va aconseguir i en quina missió.
				if(puntuacions[i][j]> guardiaMillorPuntuacio) {
					//Guarda la mejor puntuacion
					guardiaMillorPuntuacio=puntuacions[i][j];
					//El guardian (fila)
					guardianMillor = i;
					//La mision (columna)
					missio = j;
				}
					
				//contador de las puntuaciones perfectas
				if(puntuacions[i][j] >= 90)
					puntacionesPerfectas++;
			}
			//salto de linea para ver filas separadas
			System.out.println();
			
		}
		
		System.out.println();
		
		//Salida de puntuaciones
		System.out.println("=== PUNTUACIONS TOTALS ===");
		System.out.println("Star-Lord: " + contadorStarLord + " punts");
		System.out.println("Gamora: " + contadorGamora + " punts");
		System.out.println("Rocket: " + contadorRocket + " punts");
		
		System.out.println();
		
		//Salida de Puntacion mas altas
		System.out.println("=== PUNTUACIÓ MÉS ALTA ===");
		System.out.println("Millor puntuació: 95 punts");
		System.out.print("Guardià: ");
		if(guardianMillor==0)
			System.out.print("Star-Lord");
		else if(guardianMillor==1)
			System.out.print("Gamora");
		else if(guardianMillor==2)
			System.out.print("Rocket");
		System.out.print(" (fila "+ guardianMillor +")");
		System.out.println();
		System.out.println("Missió: " + missio);
		
		System.out.println();
		//Salida de las veces que se obtuvo puntuaciones perfectas
		System.out.println("=== PUNTUACIONS PERFECTES (>= 90) ===\r\n"
				+ "Total puntuacions perfectes: " + puntacionesPerfectas);
	}
}
