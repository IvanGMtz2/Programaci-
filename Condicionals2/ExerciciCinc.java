import java.util.Scanner;

public class ExerciciCinc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double EPSILON = 0.001;
		
		double a, b, c, max, costat2, costat3;
		
		System.out.print("Costat a: ");
		a = sc.nextDouble();
		
		System.out.print("Costat b: ");
		b = sc.nextDouble();
		
		System.out.print("Costat c: ");
		c = sc.nextDouble();
		
		if (a + b > c && a + c > b && b + c > a) {

			boolean eqAB = Math.abs(a - b) < EPSILON;
			boolean eqBC = Math.abs(b - c) < EPSILON;
			boolean eqAC = Math.abs(a - c) < EPSILON;
			
			if (eqAB && eqBC) {
				System.out.println("És un triangle equilàter.");
			} else if (eqAB || eqBC || eqAC) {
				System.out.println("És un triangle isòsceles.");
			} else {
				System.out.println("És un triangle escalè.");
			}
			
			if (a >= b && a >= c) {
				max = a;
				costat2 = b;
				costat3 = c;
			} else if (b >= a && b >= c) {
				max = b;
				costat2 = a;
				costat3 = c;
			} else {
				max = c;
				costat2 = a;
				costat3 = b;
			}
			
			double quadratMax = Math.pow(max, 2);
			double sumaQuadrats = Math.pow(costat2, 2) + Math.pow(costat3, 2);
			
			if (Math.abs(quadratMax - sumaQuadrats) < EPSILON) {
				System.out.println("A més, és un triangle rectangle.");
			}
			
		} else {
			System.out.println("No formen un triangle vàlid.");
		}
		
		sc.close();
	}
}