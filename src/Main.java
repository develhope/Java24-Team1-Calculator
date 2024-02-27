import  java.lang.Math;
public class Main {

    public static void main(String[] args) {
    }

    public static double moltiplicazione(double num1, double num2) {
        return num1 * num2;
    }

    public static double potenza(double base, double esponente) {
        return Math.pow(base, esponente);
    }

    //Se il numero è pari ritorna true, altrimenti false
    public static boolean oddOrEven(double num) {
        double odd = num % 2;
        return odd == 0;
    }

}