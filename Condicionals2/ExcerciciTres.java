import java.util.Scanner;

public class ExcerciciTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int faltas;
		double nota;
		
		System.out.println("Nota: ");
		nota = sc.nextDouble();
		
		System.out.println("Faltas: ");
		faltas = sc.nextInt();
		
		if(faltas > 24) {
			System.out.println("Suspès per falte");	
		}else if(nota > 5) {
			
			if(nota >=9) {
				System.out.print("Excel·lent");
			}else if(nota >=7) {
				System.out.print("Notable");
			}else {
				System.out.print("Aprovat");
			}
			
			if(faltas > 10) {
				System.out.print(" (amb advertiment d'assistència)");
			}
			
		}else {
			System.out.println("Suspès");	
		}
		
		sc.close();
		
	}

}
