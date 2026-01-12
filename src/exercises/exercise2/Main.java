package exercises.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*while (true) {

            try {
                System.out.println("Inserisci i km percorsi");
                int km = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci i litri di carburante consumati");
                int l = Integer.parseInt(scanner.nextLine());
                int kmAlLitro = km / l;
                System.out.println("Km percorsi con un litro di carburante: " + kmAlLitro);
            } catch (ArithmeticException e) {
                System.out.println("Divisione per 0 impossibile");
            } catch (NumberFormatException e) {
                System.out.println("Valore inserito diverso da numero intero, quindi non valido");
            }
        }*/

        while (true) {
            try {
                System.out.println("Inserisci i km percorsi");
                double km = Double.parseDouble(scanner.nextLine());
                System.out.println("Inserisci i litri di carburante consumati");
                double l = Double.parseDouble(scanner.nextLine());
                double kmAlLitro = km / l;
                System.out.println("Km percorsi con un litro di carburante: " + kmAlLitro);
            } catch (NumberFormatException e) {
                System.out.println("Valore inserito diverso da double, quindi non valido");
            }
        }
    }
}
