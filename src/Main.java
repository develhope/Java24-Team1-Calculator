import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        System.out.println("Calcolatrice");
        identifyOperation();
    }
    static void identifyOperation (){
        System.out.println("Inserisci l'operazione da eseguire: ");
        String operation = scanner.next();
        operation=operation.replace(" ","");
        double num1;
        double num2;
        String[] numeri;
        System.out.println(operation);
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

            }
        }
    }
}

