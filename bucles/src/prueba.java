public class Solution1 {
  public static String presentar(String nombre, int edad, String ciudad) {
    return "Hola, soy " + nombre + ", tengo " + edad + " años y vivo en " + ciudad + ".";
  }

  public static int maximo(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }
  
  public static void main(String[] args) {
    System.out.println(presentar("Laura", 22, "Valencia"));
    System.out.println("Máximo: " + maximo(4, 9, 6)); // Imprimirá 9
  }
}


public class Solution13 {
	  public static int factorial(int n) {
	    // Caso base: si n == 0, devuelve 1
	    // Caso recursivo: return n * factorial(n - 1)
	    int numero;
	    for (int i = 1; i < n; i++) {
	    	numero *=i;
	    }
	    return n;
	    if (n == 0) return 1;
	  }
	  public static int sumaHasta(int n) {
	    // Caso base: si n == 0, devuelve 0
	    // Caso recursivo: return n + sumaHasta(n - 1)
	    
	  }
	  public static void main(String[] args) {
	    System.out.println("5! = " + factorial(5));
	    System.out.println("Suma 1..10 = " + sumaHasta(10));
	  }
	}