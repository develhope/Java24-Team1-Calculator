import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        System.out.println("Calcolatrice Avanzata by TEAM 1\n");

        String exit;
        do {
            System.out.println("Inserisci + tra gli operandi per una somma;");
            System.out.println("Inserisci - tra gli operandi per una sottrazione;");
            System.out.println("Inserisci * tra gli operandi per una moltiplicazione;");
            System.out.println("Inserisci / tra gli operandi per una divisione;");
            System.out.println("Inserisci ^ tra gli operandi per una potenza;");
            System.out.println("Inserisci % dopo un numero per sapere se è pari o dispari;");
            System.out.println("Alla fine dell'operazione premi invio\n");
            identifyOperation();
            System.out.println("Vuoi eseguire un'altra operazione? \nPremi y per continuare o una qualsiasi altra cosa per uscire");
            exit = scanner.next();
        } while (exit.intern().equals("y"));
    }
    static void identifyOperation (){
        System.out.println("Inserisci l'operazione da eseguire: ");
        String operation = scanner.next();
        operation=operation.replace(" ","");
        double num1;
        double num2;
        String[] numeri;
        for (int i=0; i<operation.length(); i++){
            switch(operation.charAt(i)){
                case '+':
                    numeri = operation.split("[+]");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    somma(num1,num2);
                    break;
                case '-':
                    numeri = operation.split("-");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    sottrazione(num1,num2);
                    break;
                case '*':
                    numeri = operation.split("[*]");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    moltiplicazione(num1,num2);
                    break;
                case '/':
                    numeri = operation.split("[/]");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    divisione(num1,num2);
                    break;
                case '^':
                    numeri = operation.split("\\^");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    potenza(num1,num2);
                    break;
                case '%':
                    numeri = operation.split("%");
                    num1 = Double.parseDouble(numeri[0]);
                    oddOrEven(num1);
                    break;
            }
        }
    }
   /* public static void Operazioni(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Inserisci il primo numero: ");
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
                risultato = somma(num1, num2);
                break;
            case 2:
                risultato = sottrazione(num1, num2);
                break;
            case 3:
                risultato = divisione(num1, num2);
                break;
            default:
                System.out.println("Scelta non valida");
                return;
        }

        System.out.println("Risultato: " + risultato);
    }*/

    // Metodi per le operazioni
    public static double somma(double num1, double num2) {
        return num1 + num2;
    }

    public static double sottrazione(double num1, double num2) {
        return num1 - num2;
    }

    public static double divisione(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Impossibile dividere per zero");
            return Double.NaN; // Not a Number
        }
    }
}


