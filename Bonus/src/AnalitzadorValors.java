import java.util.Scanner;

public class AnalitzadorValors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantitat;
        int nombre;
        int maxim = 0;
        int minim = 0;
        int vegadesMaxim = 0;
        int vegadesMinim = 0;
        int suma = 0;
        double mitjana;

        System.out.print("Quants nombres vols introduir? ");
        quantitat = sc.nextInt();

        while (quantitat <= 0) {
            System.out.println("Opció no vàlida!");
            System.out.print("Quants nombres vols introduir? ");
            quantitat = sc.nextInt();
        }

        for (int i = 1; i <= quantitat; i++) {
            System.out.print("Introdueix el nombre " + i + ": ");
            nombre = sc.nextInt();

            suma += nombre;

            if (i == 1) {
                // El primer nombre és alhora el màxim i el mínim
                maxim = nombre;
                minim = nombre;
                vegadesMaxim = 1;
                vegadesMinim = 1;
            } else {
                // MÀXIM: si és més gran, nou màxim i el comptador torna a 1
                if (nombre > maxim) {
                    maxim = nombre;
                    vegadesMaxim = 1;
                } else if (nombre == maxim) {
                    vegadesMaxim++;
                }

                // MÍNIM: mateixa idea al revés
                if (nombre < minim) {
                    minim = nombre;
                    vegadesMinim = 1;
                } else if (nombre == minim) {
                    vegadesMinim++;
                }
            }
        }

        // (double) evita la divisió entera: 7 / 2 = 3.5 i no 3
        mitjana = (double) suma / quantitat;
        // Arrodonim a 2 decimals amb Math.round
        mitjana = Math.round(mitjana * 100) / 100.0;

        System.out.print("El valor màxim és: " + maxim);
        if (vegadesMaxim > 1) {
            System.out.print(" (apareix " + vegadesMaxim + " vegades)");
        }
        System.out.println();

        System.out.print("El valor mínim és: " + minim);
        if (vegadesMinim > 1) {
            System.out.print(" (apareix " + vegadesMinim + " vegades)");
        }
        System.out.println();

        System.out.println("La mitjana és: " + mitjana);

        sc.close();
    }
}
