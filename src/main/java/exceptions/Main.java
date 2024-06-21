package exceptions;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CONVERT INTO INTEGER
        Scanner scanner = new Scanner(System.in);

//            System.out.println("Saisissez les chiffres à convertir en entier");
//            String enteredChar = scanner.next();
//
//        try {
//            int converted = Integer.parseInt(enteredChar);
//            System.out.println("Voici votre chaîne convertie : " + converted);
//        } catch (NumberFormatException e){
//            System.out.println("Pas des chiffres");
//        }

        // SQUARE ROOT
        System.out.println("Saisissez un nombre entier positif pour calculer sa racine carré.");
        int enteredInt = scanner.nextInt();

        try {
            System.out.println("Racine carré : " + Math.sqrt(enteredInt));
        } catch (InputMismatchException e) {
            System.out.println("Ce n'est pas un chiffre.");
        }
    }
}
