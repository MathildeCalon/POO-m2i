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

        // TEST DES METHODES
//        System.out.println("-- LISTE DES COMPTES --");
//        jojo.getAccounts();
//
//        Operation deposit = new Operation(10, Status.DEPOSIT);
//        current.setSolde(10);
//        System.out.println("-- NOUVEAU SOLDE -- ");
//        System.out.println(current.getSolde());
//        current.setOperations(deposit);
//        current.getOperations();


        System.out.println("=== Menu Principal");
        System.out.println();
        System.out.println("1. Lister les comptes bancaires");
        System.out.println("2. Créer un compte bancaire");
        System.out.println("3. Effectuer un dépôt");
        System.out.println("4. Effectuer un retrait");
        System.out.println("5. Afficher les opérations et le solde");
        System.out.println("0. Quitter le programme");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 :
                jojo.getAccounts();
                break;
            case 2 :
                System.out.println("Quel type de compte ?");
                System.out.println("1 - Epargne");
                System.out.println("2 - Courant");
                System.out.println("3 - Payant");
                String accountType = scanner.next();
                if(accountType.equals("Epargne")){
                    new CompteEpargne(10, jojo);
                } else if (accountType.equals("Courant")){
                    new CompteCourant(10, jojo);
                } else if (accountType.equals("Payant")){
                    new ComptePayant(10, jojo);
                }
                jojo.getAccounts();
        }
    }
}
