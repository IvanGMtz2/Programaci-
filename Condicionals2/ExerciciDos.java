import java.util.Scanner;

public class ExerciciDos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int edat, quota;
		double quotaFinal, descompte = 0;
		boolean estudiant;
		
		System.out.println("Edat: ");
		edat = sc.nextInt();
		
		System.out.println("Ets estudiant? (true/false): ");
		estudiant = sc.nextBoolean();
		
		if(edat >= 65) {
			quota = 30;
		} else if(edat >= 18 && edat <= 64) {
			quota = 40;
		}else {
			quota = 25;
		}
		
		if(estudiant) {
			descompte = 15;
		}
		
		quotaFinal = quota - quota*(descompte/100);
		
		System.out.println("Quota final: " + quotaFinal + "€");
		
		sc.close();
	}

}
