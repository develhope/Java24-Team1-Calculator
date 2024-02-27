import java.util.Scanner;

public class Operatori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Scegli l'operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Divisione");

        int scelta = scanner.nextInt();

        double risultato = 0;

        switch (scelta) {
            case 1:
                risultato = somma(numero1, numero2);
                break;
            case 2:
                risultato = sottrazione(numero1, numero2);
                break;
            case 3:
                risultato = divisione(numero1, numero2);
                break;
            default:
                System.out.println("Scelta non valida");
                return;
        }

        System.out.println("Risultato: " + risultato);
    }

    // Metodi per le operazioni
    public static double somma(double a, double b) {
        return a + b;
    }

    public static double sottrazione(double a, double b) {
        return a - b;
    }

    public static double divisione(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Impossibile dividere per zero");
            return Double.NaN; // Not a Number
        }
    }
}