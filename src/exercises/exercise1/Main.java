package exercises.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array di partenza");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.ceil(Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        while (true) {
            try {
                System.out.println("Inserisci un numero da 1 a 10 o 0 per terminare");
                int value = Integer.parseInt(scanner.nextLine());
                if (value == 0) {
                    System.out.println("Programma terminato");
                    scanner.close();
                    break;
                }
                System.out.println("Inserisci in quale posizione vuoi inserirlo");
                int index = Integer.parseInt(scanner.nextLine());
                array[index] = value;
                System.out.println("Array aggiornato: " + Arrays.toString(array));

            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero,non una stringa");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice fuori dall'array");
            }
        }
    }
}

