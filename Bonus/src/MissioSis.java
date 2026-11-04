import java.util.Random;
import java.util.Scanner;

public class MissioSis {

    // Constants del joc (valors que no canvien mai)
    static final int ENERGIA_INICIAL = 100;
    static final int ENERGIA_EXTRA_TRAMPA = 10;
    static final int RANG_MINIM = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int dificultat;
        int rangMaxim = 0;
        int intentsInicials = 0;

        System.out.println("Benvingut, pirata! Busques el tresor de Gol D. Code!");

        // MENÚ: do/while perquè el menú s'ha de mostrar com a mínim una vegada
        do {
            System.out.println("Tria la dificultat:");
            System.out.println("  1. Fàcil   (1-30, 7 intents)");
            System.out.println("  2. Normal  (1-50, 5 intents)");
            System.out.println("  3. Difícil (1-100, 4 intents)");
            System.out.print("Opció: ");
            dificultat = sc.nextInt();
        } while (dificultat < 1 || dificultat > 3);

        switch (dificultat) {
            case 1:
                rangMaxim = 30;
                intentsInicials = 7;
                break;
            case 2:
                rangMaxim = 50;
                intentsInicials = 5;
                break;
            case 3:
                rangMaxim = 100;
                intentsInicials = 4;
                break;
        }

        // El tresor es genera DESPRÉS de saber el rang de l'illa
        // nextInt(rangMaxim) dona de 0 a rangMaxim-1, i amb +1 queda de 1 a rangMaxim
        int posicioTresor = random.nextInt(rangMaxim) + 1;

        // L'energia per error es calcula amb els intents INICIALS (no canvia durant la partida)
        int energiaPerError = ENERGIA_INICIAL / intentsInicials;

        int energia = ENERGIA_INICIAL;
        int intentsRestants = intentsInicials;
        int intentsFets = 0;
        boolean trobat = false;
        int posicio;
        int diferencia;

        System.out.println("Tens " + intentsInicials + " intents i " + energia + " punts d'energia. Bona sort!");

        // BUCLE DEL JOC
        while (intentsRestants > 0 && energia > 0 && !trobat) {

            System.out.print("On vols cavar (" + RANG_MINIM + "-" + rangMaxim + ")? ");
            posicio = sc.nextInt();

            // Si la posició no és vàlida, tornem a preguntar sense gastar l'intent
            while (posicio < RANG_MINIM || posicio > rangMaxim) {
                System.out.println("Aquesta posició no és de l'illa!");
                System.out.print("On vols cavar (" + RANG_MINIM + "-" + rangMaxim + ")? ");
                posicio = sc.nextInt();
            }

            intentsFets++;   // comptem cada cop que el pirata cava de veritat

            diferencia = Math.abs(posicioTresor - posicio);

            if (diferencia == 0) {
                System.out.println("Has trobat el tresor!");
                trobat = true;
            } else {
                if (diferencia <= 5) {
                    System.out.println("Estàs molt a prop!");
                    energia -= energiaPerError;
                    intentsRestants -= 1;
                } else if (diferencia <= 15) {
                    System.out.println("Et mous pel bon camí...");
                    energia -= energiaPerError;
                    intentsRestants -= 1;
                } else {
                    System.out.println("Has caigut en una trampa i perds energia extra!");
                    energia -= energiaPerError + ENERGIA_EXTRA_TRAMPA;
                    intentsRestants -= 2;
                }

                // Ni l'energia ni els intents poden baixar de 0
                energia = Math.max(0, energia);
                intentsRestants = Math.max(0, intentsRestants);

                System.out.println("Energia " + barraEnergia(energia) + " " + energia
                        + "% │ Intents restants: " + intentsRestants);
            }
        }

        // Si ha perdut, SEMPRE revelem on era el tresor
        if (!trobat) {
            System.out.println("No has trobat el tresor... estava a la posició " + posicioTresor + ".");
        }

        // RESUM FINAL
        System.out.println();
        System.out.println("── Resum ──");
        System.out.println("Intents fets: " + intentsFets + " · Energia final: " + energia + "%");

        if (trobat && intentsFets == 1) {
            System.out.println("Ets digne del barret de palla!");
        } else if (trobat && energia >= 50) {
            System.out.println("Mariner de primera!");
        } else if (trobat) {
            System.out.println("Per un pèl, pirata!");
        } else {
            System.out.println("La marea t'ha guanyat...");
        }

        System.out.println("Fi de la partida.");

        sc.close();
    }

    // Retorna una barra de 10 caselles: un # per cada 10% d'energia i la resta amb -
    static String barraEnergia(int energia) {
        int casellesPlenes = energia / 10;
        String barra = "[";

        for (int i = 1; i <= 10; i++) {
            if (i <= casellesPlenes) {
                barra += "#";
            } else {
                barra += "-";
            }
        }

        barra += "]";
        return barra;
    }
}
