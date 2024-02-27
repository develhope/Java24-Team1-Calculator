import  java.lang.Math;
public class Main {

    public static void main(String[] args) {
    }

    public static void moltiplicazione(double num1, double num2) {
        System.out.println("Il risultato della moltiplicazione è: " + num1 * num2);
    }

    public static void potenza(double base, double esponente) {
        System.out.println("Il risultato della potenza è: " + Math.pow(base, esponente));
    }

    //Se il numero è pari ritorna true, altrimenti false
    public static void oddOrEven(double num) {
        double odd = num % 2;
        if(odd == 0) {
            System.out.println("Il inserito numero è pari!");
        }
        else {
            System.out.println("Il inserito numero è dispari!");
        }
    }

}