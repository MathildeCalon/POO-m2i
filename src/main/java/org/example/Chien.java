package org.example;

public class Chien {
    // Attributs
    private String name ;
    private int age;
    private String race = "berger allemand"; // par défaut

    // Constructeur
    public Chien(String nom, int age, String race){
        this.name = nom;
        this.age = age;
        this.race = race;
    }

    // Méthodes
    public void aboyer(){
        System.out.println(this.name + " fait Waf !");
    }

    // GETTER
    public int getAge(){
        return this.age;
    }
    //SETTER
    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getRace() {
        return this.race;
    }
    public void setRace(String race) {
        this.race = race;
    }
}
