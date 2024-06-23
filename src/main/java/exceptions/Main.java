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
        try {
            System.out.println("Saisissez un nombre entier positif pour calculer sa racine carré.");
            int enteredInt = scanner.nextInt();
            squareRoot(enteredInt);
        } catch (NegativeNumberException e){
            System.out.println("Nombre négatif refusé");
        } catch (InputMismatchException e) {
            System.out.println("Pas un chiffre entier !");
        }
    }

        // SQUARE ROOT FUNCTION WITH EXCEPTION
        public static void squareRoot (int enteredInt) throws NegativeNumberException{
            if(enteredInt < 0){
                throw new NegativeNumberException("Nombre négatif");
            }
            System.out.println(Math.sqrt(enteredInt));
    }
}
