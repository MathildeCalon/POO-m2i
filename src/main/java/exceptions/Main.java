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


//        // SQUARE ROOT
//        try {
//            System.out.println("Saisissez un nombre entier positif pour calculer sa racine carré.");
//            int enteredInt = scanner.nextInt();
//            squareRoot(enteredInt);
//        } catch (NegativeNumberException e){
//            System.out.println("Nombre négatif refusé");
//        } catch (InputMismatchException e) {
//            System.out.println("Pas un chiffre entier !");
//        }

        // INT ARRAY
        System.out.println("Entrez un entier");
        int nbr1 = scanner.nextInt();
        System.out.println("Entrez un entier");
        int nbr2 = scanner.nextInt();
        System.out.println("Entrez un entier");
        int nbr3 = scanner.nextInt();
        System.out.println("Entrez un entier");
        int nbr4 = scanner.nextInt();
        System.out.println("Entrez un entier");
        int nbr5 = scanner.nextInt();
        int[] intArray = {nbr1, nbr2, nbr3, nbr4, nbr5};

        try {
            indexArray(intArray, 5);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Pas d'élement à cet endroit !");
        }
    }

        // INT ARRAY WITH EXCEPTION
        public static void indexArray (int[]array, int index){
            System.out.println(array[index]);
        }

        // SQUARE ROOT FUNCTION WITH EXCEPTION
        public static void squareRoot (int enteredInt) throws NegativeNumberException{
            if(enteredInt < 0){
                throw new NegativeNumberException("Nombre négatif");
            }
            System.out.println(Math.sqrt(enteredInt));
    }
}
