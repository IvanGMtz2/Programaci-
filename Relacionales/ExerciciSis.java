import java.util.Scanner;

public class ExerciciSis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double precioProducto, caro = 100, barato = 20;
		boolean esBarato = false, esCaro = false;

		System.out.println("Cuanto es el precio del producto ?:");
		precioProducto = sc.nextDouble();


		if (precioProducto > caro) {
			esCaro = true;
		}
		
		if (precioProducto < barato) {
			esBarato = true;
		}

		System.out.println("Preu (€): "+precioProducto+"\r\n"
				+ "És car: "+esCaro+"\r\n"
				+ "És barat: "+esBarato);

		sc.close();

	}

}
