
public class TemperaturesSetmanals {

	public static void main(String[] args) {
		
		int[] temperatures = { 23, 19, 25, 22, 18, 21, 24 };
		String[] dias = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge" };
		int totalTemp = 0, max=temperatures[0], min=temperatures[0];
		int mayorA22=0, menorA20=0;
		double mitjana=0;
		
		//Recorro el array de temperaturas
		for (int i = 0; i < temperatures.length; i++) {
			totalTemp += temperatures[i];
			
			if(temperatures[i]>max)
				max = temperatures[i];
			
			if(temperatures[i]<min)
				min = temperatures[i];
			
			if(temperatures[i]>22)
				mayorA22++;
			
			if(temperatures[i]<20)
				menorA20++;
						
		}
		
		mitjana = (double) totalTemp / temperatures.length;
		
		System.out.println("=== ANÀLISI DE TEMPERATURES SETMANALS ===");
		
		System.out.println();
		
		System.out.println("Total de dies analitzats:"+ temperatures.length +"\r\n"
				+ "Temperatura mitjana: "+ mitjana +"°C\r\n"
				+ "Temperatura màxima: "+ max +"°C\r\n"
				+ "Temperatura mínima: "+ min +"°C\r\n");
		
		System.out.println("--- Temperatures per dia ---");
		
		System.out.println();
		
		for (int i = 0; i < temperatures.length; i++) {
			
			System.out.println(dias[i] + ": " + temperatures[i] + "°C");
			
		}
		

		System.out.println();
		
		System.out.println("Dies amb temperatura > 22°C: "+mayorA22+"\r\n"
				+ "Dies amb temperatura < 20°C: "+menorA20);
		
		System.out.println();
		
		
		//Agrego la el nuevo valor de Dimarts, ademas hay que modificar la mitjana asi que restamos el valor inicial y despues sumamos el nuevo valor
		mitjana -= temperatures[1] / temperatures.length;
		temperatures[1] = 20;
		
		System.out.println("--- Després de la correcció ---");
		System.out.println("Dimarts corregit a:" + temperatures[1]);
		
		mitjana += temperatures[1] / temperatures.length;
		int diaAtipic = 0;
		double diferencia;
		//Nuevo array para guardar las diferencias
		double[] diferencias = new double[7];
		double mesAtipic = diferencias[0];
		
		for (int i = 0; i < diferencias.length; i++) {
			diferencia = Math.abs(mitjana - temperatures[i]);
			diferencias[i] = diferencia;
		}
		
		for (int i = 0; i < diferencias.length; i++) {
			if(diferencias[i]>mesAtipic) {
				mesAtipic=diferencias[i];
				diaAtipic = i;
			}
		}
				
		System.out.printf("Dia més atípic: %s (diferència de %.2f °C respecte la mitjana)%n", dias[diaAtipic], diferencias[diaAtipic]);
		
		/*
		 * %s (Comodín de texto)
		 * %.2f (Comodín de número con dos decimales)
		 * %n (Salto de línea)
		 * */
		
	}
}
