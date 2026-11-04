 

import java.util.Scanner;

public class quinCostatCarrer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=1;
		
		while(numero != 0) {
			System.out.println("Introdueix un número: ");
			numero = sc.nextInt();
			
			if(numero%2==0) {
				System.out.println("DRETA");
			}else {
				System.out.println("ESQUERRA");
			}
		}
		
		sc.close();
		
	}

}
