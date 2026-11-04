 

public class Solution {
	  public static int factorial(int n) {
	    // Caso base: si n == 0, devuelve 1
	    // Caso recursivo: return n * factorial(n - 1)
	    int numero=1;
	    if (n == 0) return 1;
	    for (int i = 1; i <= n; i++) {
	    	numero *=i;
	    }
	    return numero;
	  }
	  public static int sumaHasta(int n) {
	    // Caso base: si n == 0, devuelve 0
	    // Caso recursivo: return n + sumaHasta(n - 1)
		    int numero=0;
		    if (n == 0) return 0;
		    for (int i = 1; i < n; i++) {
		    	numero +=i;
		    }
		    return numero;
	    
	  }
	  public static void main(String[] args) {
	    System.out.println("5! = " + factorial(5));
	    System.out.println("Suma 1..10 = " + sumaHasta(10));
	  }
}