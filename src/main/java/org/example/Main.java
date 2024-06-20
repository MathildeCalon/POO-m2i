package org.example;

// PSVM = création de Main rapidement
public class Main {
    public static void main(String[] args) {
//        Chien titus = new Chien("Titus", 12, "Batard");
//        System.out.println(titus.getAge());
//
//        Chien booba = new Chien("Boobinou", 10, "Griffon");
//        Chien vasco = new Chien ("Vasco", 8, "Bouledogue");
//        Chien ruby = new Chien ("Ruby", 3, "Bichon");
//
//        System.out.println(booba.getName() + " a " + booba.getAge() + " ans.");
//        System.out.println(vasco.getName()  + " a " + vasco.getAge() + " ans.");
//        System.out.println(ruby.getName()  + " a " + ruby.getAge() + " ans.");
//        booba.aboyer();
//
//        ruby.setAge(0);
//        System.out.println(ruby.getAge());
//
//        //CHAISE
//        Chaise tabouret = new Chaise(3, "bois", "marron");
//        Chaise chaise = new Chaise(4, "carton", "beige");
//        Chaise chaise2 = new Chaise(1, "métal", "orange");
//        System.out.println(tabouret.toString());
//        System.out.println(chaise.toString());
//        System.out.println(chaise2.toString());
//
//        //FILM
//        Film viceVersa = new Film("Vice Versa", "toto", 2024, "Famille");
//        Film truman = new Film("Truman Show", "tata", 2000, "Drame");
//
//        System.out.println(viceVersa.toString());
//        System.out.println(truman.toString());
//
//        //JOUEUR
//        Joueur tilly = new Joueur("Tilly", 1, 95);
//        System.out.println(tilly.getLevel());
//        System.out.println(tilly.getXp());
//        tilly.finishQuest();
//        System.out.println(tilly.getLevel());
//        System.out.println(tilly.getXp());
//
//        // WATERTANK
//        WaterTank watertank1 = new WaterTank(10, 20, 10);
//        WaterTank watertank2 = new WaterTank(10, 10, 5);
//
//        System.out.println("Poids total de la citerne 1 : " + watertank1.totalTank());
//        System.out.println("Poids total de la citerne 2 : " + watertank2.totalTank());
//
//        System.out.println("----------------------");
//
//        System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getFilling());
//        watertank1.affichageCiterne();
//        System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getFilling());
//        watertank2.affichageCiterne();
//        System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalFilling());
//
//        System.out.println("----------------------");
//
//        double excessWater = watertank1.fill(11);
//        System.out.println("Quantité d'eau dans la citerne 1 après ajout de 11 litres: " + watertank1.getFilling() + "/" + watertank1.getMaxCapacity());
//        System.out.println("Excès d'eau récupéré : " + excessWater);
//
//        double waterTaken = watertank2.empty(11);
//        System.out.println("Quantité d'eau dans la citerne 2 après tentative de retrait de 11 litres: " + watertank2.getFilling() + "/" + watertank2.getMaxCapacity());
//        System.out.println("Quantité d'eau récupérée : " + waterTaken);
//
//        System.out.println("----------------------");
//
//        System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getFilling());
//        watertank1.affichageCiterne();
//        System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getFilling());
//        watertank2.affichageCiterne();
//        System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalFilling());

    // THERMOMETER
//        Thermometer home = new Thermometer(25, "celsius");
//        System.out.println(home.getTemperatureInKelvin());
//
//        Thermometer garden = new Thermometer(25, "fahrenheit");
//        System.out.println(garden.getTemperatureInKelvin());
//
//        home.setTemperatureKelvin(25, "celsius");
//        System.out.println(garden.getTemperatureInKelvin());

        // PLANTE
        Arbre cerisier = new Arbre("cerisier", 3, "vertes", 3);
        System.out.println(cerisier);

        Plante fleur = new Plante("tournesol", 1, "jaune");
        System.out.println(fleur);
    }
}