package bancaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client jojo = new Client("Jojo", "Toto", 0602030405, 1);
        CompteCourant current = new CompteCourant(10, jojo);
        CompteEpargne savings = new CompteEpargne(10, jojo);
        ComptePayant pay = new ComptePayant(10, jojo);

        jojo.setAccounts(current);
        jojo.setAccounts(savings);
        jojo.setAccounts(pay);
        System.out.println("-- LISTE DES COMPTES --");
        jojo.getAccounts();

        Operation deposit = new Operation(10, Status.DEPOSIT);
        current.setSolde(10);
        System.out.println("-- NOUVEAU SOLDE -- ");
        System.out.println(current.getSolde());
        current.setOperations(deposit);
        current.getOperations();



//        System.out.println("=== Menu Principal");
//        System.out.println();
//        System.out.println("1. Lister les comptes bancaires");
//        System.out.println("2. Créer un compte bancaire");
//        System.out.println("3. Effectuer un dépôt");
//        System.out.println("4. Effectuer un retrait");
//        System.out.println("5. Afficher les opérations et le solde");
//        System.out.println("0. Quitter le programme");
//        int choice = scanner.nextInt();

    }
}
