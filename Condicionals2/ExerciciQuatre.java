import java.util.Scanner;

public class ExerciciQuatre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1, y1; 
		double x2, y2; 
		double px, py;
		
		System.out.print("Cantonada inferior esquerra (x1 y1): ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.print("Cantonada superior dreta (x2 y2): ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		System.out.print("Coordenades del punt (px py): ");
		px = sc.nextDouble();
		py = sc.nextDouble();
		
		if (px > x1 && px < x2 && py > y1 && py < y2) {
			
			System.out.println("El punt està dins del rectangle.");
			
		} else if (((px == x1 || px == x2) && (py >= y1 && py <= y2)) || 
		           ((py == y1 || py == y2) && (px >= x1 && px <= x2))) {
			
			System.out.println("El punt està a la vora del rectangle.");
			
		} else {
			
			System.out.println("El punt està fora del rectangle.");
			
		}
		
		sc.close();
	}
}