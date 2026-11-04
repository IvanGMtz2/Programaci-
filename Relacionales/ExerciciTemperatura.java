import java.util.Scanner;

//Tengo un colega que esta estudiando fisica y estan estudiando los diferentes unidades de temperatura
// crea un aplicativo que entre grados en donde equivalen en celcius y kelvin

public class ExerciciTemperatura {

	public static void main(String[] args) {

		double gradosCelcius, gradosKelvin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la temperatura en ºC: ");
		gradosCelcius = sc.nextDouble();
		
		gradosKelvin = gradosCelcius + 273.5;
		
		System.out.println("La temperatura en ºK es: " + gradosKelvin);
		
		sc.close();

	}

}
