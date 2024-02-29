import java.util.Scanner;
import  java.lang.Math;
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
            System.out.println(identifyOperation());
            System.out.println("\nVuoi eseguire un'altra operazione? \nPremi y per continuare o una qualsiasi altra cosa per uscire");
            exit = scanner.next();
        } while (exit.intern().equals("y"));
    }

    static String identifyOperation () {
        System.out.println("Inserisci l'operazione da eseguire: ");
        String operation = scanner.next();
        operation = operation.replace(" ", "");
        double num1;
        double num2;
        String[] numeri;
        for (int i = 0; i < operation.length(); i++) {
            switch (operation.charAt(i)) {
                case '+':
                    numeri = operation.split("[+]");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    return somma(num1, num2);

                case '-':
                    numeri = operation.split("-");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    return sottrazione(num1, num2);

                case '*':
                    numeri = operation.split("[*]");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    return moltiplicazione(num1, num2);

                case '/':
                    numeri = operation.split("[/]");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    return divisione(num1, num2);

                case '^':
                    numeri = operation.split("\\^");
                    num1 = Double.parseDouble(numeri[0]);
                    num2 = Double.parseDouble(numeri[1]);
                    return potenza(num1, num2);

                case '%':
                    numeri = operation.split("%");
                    num1 = Double.parseDouble(numeri[0]);
                    return oddOrEven(num1);
            }
        }
        return "Error";
    }
    public static String moltiplicazione(double num1, double num2) {
        double result = num1 * num2;
        return Double.toString(result);
    }

    public static String somma(double num1, double num2) {
        double result = num1 + num2;
        return Double.toString(result);
    }

    public static String sottrazione(double num1, double num2) {
        double result = num1 - num2;
        return Double.toString(result);
    }

    public static String divisione(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            return Double.toString(result);
        } else {
            System.out.println("Impossibile dividere per zero");
            double result = Double.NaN; // Not a Number
            return Double.toString(result);
        }
    }
    public static String oddOrEven(double num1) {
        double even = num1 % 2;
        if(even == 0) {
            return "Il numero è pari!";
        }
        else {
            return "Il numero è dispari!";
        }
    }

    public static String potenza(double num1, double num2) {
        return "" + Math.pow(num1, num2);

    }
}


