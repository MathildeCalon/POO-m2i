package org.example;

public class Arbre extends Plante {
    private int trunkCircumference;

    public Arbre(String name, int height, String leafColour, int trunkCircumference) {
        super(name, height, leafColour);
        this.trunkCircumference = trunkCircumference;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJe suis un arbre, la circonférence de mon tronc est de " + this.trunkCircumference;
    }
}
