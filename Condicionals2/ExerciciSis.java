import java.util.Scanner;

public class ExerciciSis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double souBrut, impost = 0.0;
		
		System.out.print("Sou brut anual (€): ");
		souBrut = sc.nextDouble();
		
		if (souBrut > 35200) {
			
			impost = (souBrut - 35200) * 0.37 
			       + (35200 - 20200) * 0.30 
			       + (20200 - 12450) * 0.24 
			       + 12450 * 0.19;
			
		} else if (souBrut > 20200) {

			impost = (souBrut - 20200) * 0.30 
			       + (20200 - 12450) * 0.24 
			       + 12450 * 0.19;
			
		} else if (souBrut > 12450) {

			impost = (souBrut - 12450) * 0.24 
			       + 12450 * 0.19;
			
		} else if (souBrut > 0) {

			impost = souBrut * 0.19;
			
		}
		
		System.out.println("Impost total a pagar: " + impost + "€");
		
		sc.close();
	}
}