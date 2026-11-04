import java.util.Scanner;

public class ExcerciciUno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dia, hores;
		double preu;

		System.out.println("Dia (1=dilluns...7=diumenge): ");
		dia = sc.nextInt();
		
		System.out.println("Quantes hores vas trigar: ");
		hores = sc.nextInt();
		
		if(dia >= 1 && dia <= 5) {
			if(hores > 1 && hores <= 8) {
				preu = (hores-1) *1.5 + 2;
			}else {
				preu = 12;
			}
			
			System.out.println("Preu: " + preu + "€");
			
		}else if(dia >= 6 && dia <= 7) {
			if(hores > 1 && hores <= 8) {
				preu = hores;
			}else {
				preu = 8;
			}
			
			System.out.println("Preu: " + preu + "€");
			
		}else {
			System.out.println("Dia equivocat");
		}
		
		sc.close();
	}

}
